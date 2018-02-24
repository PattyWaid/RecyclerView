package com.example.prathamesh.navigationtabs;

/**
 * Created by PRATHAMESH on 17-02-2018.
 */

public class Contact {

    private String Name;
    private String Number;
    private int Photo;

    public Contact() {
    }

    public Contact(String name, String number, int photo) {
        Name = name;
        Number = number;
        Photo = photo;
    }




    //Getter


    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public int getPhoto() {
        return Photo;
    }

    //Setter


    public void setName(String name) {
        Name = name;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}

