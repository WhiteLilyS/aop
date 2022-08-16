package aop;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary extends  AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("get UniBook");
    }

    public void getJournal(){
        System.out.println("get UniJournal");
    }
    public void getNewspaper(){
        System.out.println("get UniNewspaper");
    }
    String returnBook(){
        System.out.println("return UniBook");
        return "OK";
    }
}
