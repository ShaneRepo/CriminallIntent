package com.example.shane.criminallintent;

import java.util.UUID;

/**
 * Created by Shane on 12/25/2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        // Generic unique id
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
