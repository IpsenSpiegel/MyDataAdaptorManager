package com.example.ipsenspiegel.mydataadaptormanager;

import android.content.ClipData;

/**
 * Created by A5Alumno on 29/11/2016.
 */

public class Item {
    private String mImage;
    private String mTitle;
    private String mBody;

    public Item(String imgRef, String aTitle, String aBody) {
        this.mImage = imgRef;
        this.mTitle = aTitle;
        this.mBody = aBody;
    }

    public String getmImage() {
        return mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmBody() {
        return mBody;
    }
}