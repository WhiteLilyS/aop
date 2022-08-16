package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.AllGetMethod()") // все методы с любым количеством параметро
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: check have user access to rights ");
    }

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    public void allMethodFromUniLibrary(){}
//    @Pointcut("execution(* aop.UniLibrary.returnNewspaper())")
//    public void returnNewspaperFromUniLibrary(){}
//
//    @Pointcut("allMethodFromUniLibrary() && !returnNewspaperFromUniLibrary()")
//    public void allMethodsExceptReturnNewspaperFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnNewspaperFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnNewspaperFromUniLibrary(){
//        System.out.println("allMethodsExceptReturnNewspaperFromUniLibrary: try");

//    }


//    --------
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    public void  allGetMethodFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    public void  allReturnMethodFromUniLibrary(){
//    }
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    public void allGetAndReturnMethodFromUniLibrary(){
//
//    }
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");

//    }

//    -------

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

//    ---------------


//    ----------------------

}
