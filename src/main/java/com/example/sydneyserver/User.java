package com.example.sydneyserver;

//import org.springframework.stereotype.Component;
//
//@Component
public class User {
    private int ID;
    private String name;
    private int age;
    private String country;

    public User() {
    }

    public User(int ID, String name, int age, String country) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
