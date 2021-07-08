package com.example.cityguide.Adapter;

import android.graphics.drawable.GradientDrawable;

public class Category {

    int image;
    GradientDrawable background;
    String title;

    public Category(int image, GradientDrawable background, String title) {
        this.image = image;
        this.title = title;
        this.background = background;
    }

    public int getImage() {
        return image;
    }

    public GradientDrawable getBackground() {
        return background;
    }

    public String getTitle() {
        return title;
    }

}
