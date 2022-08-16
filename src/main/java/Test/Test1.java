package Test;

import Configuration.MyConfig;
import aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("libraryBean", UniLibrary.class);
        library.getBook();

        context.close();
    }
}
