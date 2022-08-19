package aop.aspects;

import Configuration.MyConfig;
import aop.Student;
import aop.UniLibrary;
import aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary",UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("In library return book " + bookName);
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: finish " + (end - begin) + " millisecond");
        context.close();
        System.out.println("Method main ends");
    }
}
