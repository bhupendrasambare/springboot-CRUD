package com.demo.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int age;
    private String name;
    private String email;
    private String number;

    public students(long id, int age, String name, String email, String number) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
        this.number = number;
    }
    public students() {
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
