package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")

public class UniLibrary {
    public void getBook(){
        System.out.println("get Book");
    }
}
