package aop;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary extends  AbstractLibrary{

//    public void getBook(Book book){
//        System.out.println("get UniBook " + book.getName());
//    }

    public void getBook(){
        System.out.println("get UniBook");
    }
    public void getJournal(){
        System.out.println("get UniJournal");
    }
    public void getNewspaper(int count){
        System.out.println("get UniNewspaper " + count);
    }
    String returnBook(){
        System.out.println("return UniBook");
        return "OK";
    }
}
