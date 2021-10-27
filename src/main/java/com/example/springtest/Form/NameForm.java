package com.example.springtest.Form;

import java.util.ArrayList;

public class NameForm {
    String firstName;
    String surname;

    public NameForm(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public static void printArray(ArrayList<NameForm> names) {
        for (NameForm s: names) {
            System.out.println(s.getFirstName() + s.getSurname());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
