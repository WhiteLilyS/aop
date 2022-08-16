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
}
