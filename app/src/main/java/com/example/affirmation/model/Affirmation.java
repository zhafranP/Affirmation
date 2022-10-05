package com.example.affirmation.model;

import android.graphics.drawable.Drawable;

public class Affirmation {
    public String stringResourceId;
    public Drawable imageResourceId;

    public Affirmation(String stringResourceId, Drawable imageResourceId){
        this.stringResourceId = stringResourceId;
        this.imageResourceId = imageResourceId;
    }

}
