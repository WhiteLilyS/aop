package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointcuts.AllAddMethod()")
    public void beforeExceptionHandlingAspect(){
        System.out.println("beforeExceptionHandlingAspect: get/handle " + "exception try get book/journal");
        System.out.println("------------------------");
    }
//    @Before("aop.aspects.MyPointcuts.AllGetMethod()")
//    public void beforeExceptionHandlingAspect(){
//        System.out.println("beforeExceptionHandlingAspect: get/handle " + "exception try get book/journal");
//        System.out.println("------------------------");
//    }
}
