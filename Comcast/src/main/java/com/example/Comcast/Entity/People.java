package com.example.Comcast.Entity;

public class People {
    private String name;
    private String address;
    private int age;
    private int id; 

    public People (String name, String address, int age, int id){
        this.name = name;
        this.address = address;
        this.age = age;
        this.id = id;
    }

    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    public int getID() {
        return this.id;
    }
}
