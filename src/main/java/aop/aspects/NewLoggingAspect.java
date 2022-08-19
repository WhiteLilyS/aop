package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("aop.aspects.MyPointcuts.returnBookMethod()")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice: library try return book");

        Object targetMethodResult = null;
        // It's better not to handle exceptions, but to promote them.
//        try{
//            targetMethodResult = proceedingJoinPoint.proceed();
//        }catch (Exception e){
//            System.out.println("aroundReturnBookLoggingAdvice:" + e);
//            targetMethodResult = "Not book with this name";
//        }
//        targetMethodResult = "Girls and Home"; // I can change the target
//-----------------------------------------
        // Better fo it like this
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice:" + e);
            targetMethodResult = "Not book with this name";
            throw e;
//        }
        }
        return targetMethodResult;
    }
}