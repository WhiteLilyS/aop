package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(public void aop.UniLibrary.getBook())") // указали вызов aspect только для метода getBook в классу UniLibrary
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: try getBook");
//    }

    @Before("execution(public void aop.UniLibrary.get*())") // указали вызов aspect для всех методов начинающихся на get в классе UniLibrary
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: try getBook");
    }

//    @Before("execution(public * aop.UniLibrary.returnBook())") // использование любого типа
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: try returnBook");
//    }

    @Before("execution(* returnBook())") // использование любого типа причина патерны не обязательны
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: try returnBook");
    }
}
