package com.demo;

public class User {

    private int age;
    private String name;
    private String description;
    
    public User() {
        super();
    }

    public User(int age, String name, String description) {
        super();
        this.age = age;
        this.name = name;
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + ", description=" + description + "]";
    }
   
}
