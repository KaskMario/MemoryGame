package com.example.fxmemorygame;

import javafx.scene.image.Image;

public class Card {

    String name;
    String imgURL;
    Image image;

    public Card (String name,Image image){
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImgURL() {
        return imgURL;
    }
}
