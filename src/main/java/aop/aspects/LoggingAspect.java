package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(public void aop.UniLibrary.getBook())") // указали вызов aspect только для метода getBook в классу UniLibrary
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: try getBook");
//    }

//    @Before("execution(public void aop.UniLibrary.*(..))") // все методы с любым количеством параметро
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: try getBook");
//    }

//    @Before("execution(public * aop.UniLibrary.returnBook())") // использование любого типа
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: try returnBook");
//    }

//    @Before("execution(public void getBook(aop.Book))") // все методы с любым количеством параметро
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: try getBook ");
//    }
    @Pointcut("execution(* get*(..))")
    public void AllGetMethod(){

    }
    @Before("AllGetMethod()") // все методы с любым количеством параметро
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice: try getBook ");
    }
    @Before("AllGetMethod()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка на получении " + "книги/журнала");
    }

    @Before("execution(* returnBook())") // использование любого типа причина патерны не обязательны
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: try returnBook");
    }
}
