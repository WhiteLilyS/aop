package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> studentsList = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Baurzhan Adil" , 4,2.4);
        Student st2 = new Student("Rest Pullover" , 1,2.1);
        Student st3 = new Student("Oliver Zhan-ar" , 2,1.9);
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Start work method getStudent");
        System.out.println(studentsList.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(studentsList);
        return studentsList;
    }
}
