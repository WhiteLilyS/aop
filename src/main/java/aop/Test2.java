package aop;

import Configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        try{
            university.addStudents();
            List<Student> studentList = university.getStudents();
        }catch (Exception e){
            System.out.println("Exception: " +e);
        }

        context.close();
    }
}
