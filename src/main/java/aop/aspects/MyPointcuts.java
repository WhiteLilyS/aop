package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* qwe*(..))") // * add*(..)
    public void AllAddMethod(){}

    @Pointcut("execution(* qwe*(..))") // * get*(..)
    public void AllGetMethod(){}

    @Pointcut("execution(* getStudents(..))")
    public void AllGetStudentMethod(){}
}
