package org.example;

public class Human {
    String name;
    int age;

    Human(String name,int  age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
