package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

public class Director {

    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String id;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


}
