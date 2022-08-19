package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public  class UniversityLoggingAspects {

    @Before("aop.aspects.MyPointcuts.AllGetStudentMethod()")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: logging get " + "list student before student method");

    }


    @AfterThrowing(pointcut = "aop.aspects.MyPointcuts.AllGetStudentMethod()",
    throwing = "exception")
    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception) {

        System.out.println("AfterThrowingGetStudentsLoggingAdvice: logging blowout " + exception);
    }
//    @AfterReturning(pointcut = "aop.aspects.MyPointcuts.AllGetStudentMethod()",
//    returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getName();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setName(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade += 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningStudentsLoggingAdvice: logging get" + "list student after student method");
//    }
}
