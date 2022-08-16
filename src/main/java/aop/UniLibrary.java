package aop;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary  {

//    public void getBook(Book book){
//        System.out.println("get UniBook " + book.getName());
//    }

    public void getBook() {
        System.out.println("get UniBook");
    }
    public void addBook(){
        System.out.println("add Book");
    }

    public void getJournal() {
        System.out.println("get UniJournal");
    }

    //    public void getNewspaper(int count){
//        System.out.println("get UniNewspaper " + count);
//    }
    public void getNewspaper() {
        System.out.println("get UniNewspaper ");
    }

    public void returnBook() {
        System.out.println("return UniBook");
    }

    public void returnJournal() {
        System.out.println("return UniJournal");
    }

    public void returnNewspaper() {
        System.out.println("return UniNewspaper");
    }
}
