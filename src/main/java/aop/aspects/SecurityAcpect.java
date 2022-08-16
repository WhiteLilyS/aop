package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAcpect {

    @Before("aop.aspects.MyPointcuts.AllGetMethod()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: "+"logging " +"try book/journal");
    }

}
