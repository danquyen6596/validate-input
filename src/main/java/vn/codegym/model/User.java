package vn.codegym.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.*;

public class User{

    @Size(min = 2, max = 30)
    private String name;


    @Min(18)
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
