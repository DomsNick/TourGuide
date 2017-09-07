package com.codetribe.tourguide;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by CodeTribe on 2017/08/15.
 */

public class CardCategory implements Serializable{
    private String name;
    private int images;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
