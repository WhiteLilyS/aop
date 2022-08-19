package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.AllAddMethod()") // все методы с любым количеством параметро
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature.getMethod: " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType: " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName: " + methodSignature.getName());
        System.out.println("------------------------");
        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println(" Information about book: name - " + myBook.getName() + ", author " + myBook.getAuthor() + ", yearOfPublication " + myBook.getYearsOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("In library add book " + obj);
                }
            }

        }
    }
    @Before("aop.aspects.MyPointcuts.AllGetMethod()") // все методы с любым количеством параметро
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: check have user access to rights ");
        System.out.println("------------------------");
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
