package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

    @SerializedName("data")
    private Data data;
    @SerializedName("about")
    private About about;

    public Data getData() {
        return data;
    }

    public About getAbout() {
        return about;
    }


}
