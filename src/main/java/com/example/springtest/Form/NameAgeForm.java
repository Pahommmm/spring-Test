package com.example.springtest.Form;

import java.util.ArrayList;

public class NameAgeForm {
    String firstName;
    String surname;
    int age;

    public NameAgeForm(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public static void printAnotherArray(ArrayList<NameAgeForm> namesAndAge) {
        for (NameAgeForm s: namesAndAge) {
            System.out.println(s.getFirstName() + s.getSurname() + s.getAge());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
