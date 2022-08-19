package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("BL")
    private String name;
    @Value("Rim Chai")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }

    public void setYearsOfPublication(int yearsOfPublication) {
        this.yearsOfPublication = yearsOfPublication;
    }

    @Value("2011")
    private int yearsOfPublication;
}
