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
}
