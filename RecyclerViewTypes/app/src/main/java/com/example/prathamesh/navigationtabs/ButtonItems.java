package com.example.prathamesh.navigationtabs;

import android.widget.Button;

/**
 * Created by PRATHAMESH on 24-02-2018.
 */

public class ButtonItems {

    private int Img;
    private String Namebutton;


    public ButtonItems(){

    }

    public ButtonItems(int img, String namebutton) {
        Img = img;
        Namebutton = namebutton;

    }

    public int getImg() {
        return Img;
    }

    public String getNamebutton() {
        return Namebutton;
    }



    public void setImg(int img) {
        Img = img;
    }

    public void setNamebutton(String namebutton) {
        Namebutton = namebutton;
    }


}
