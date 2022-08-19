package aop;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary  {

//    public void getBook(Book book){
//        System.out.println("get UniBook " + book.getName());
//    }

    public void getBook() {
        System.out.println("get UniBook");
        System.out.println("------------------------");
    }
    public void addBook(String personName, Book book){

        System.out.println("add Book");
        System.out.println("------------------------");
    }

    public void addJournal(){
        System.out.println("addJournal");
        System.out.println("------------------------");
    }
    public void getJournal() {
        System.out.println("get UniJournal");
        System.out.println("------------------------");
    }

    //    public void getNewspaper(int count){
//        System.out.println("get UniNewspaper " + count);
//    }
    public void getNewspaper() {
        System.out.println("get UniNewspaper ");
        System.out.println("------------------------");
    }

    public void returnBook() {
        System.out.println("return UniBook");
        System.out.println("------------------------");
    }

    public void returnJournal() {
        System.out.println("return UniJournal");
        System.out.println("------------------------");
    }

    public void returnNewspaper() {
        System.out.println("return UniNewspaper");
        System.out.println("------------------------");
    }
}
