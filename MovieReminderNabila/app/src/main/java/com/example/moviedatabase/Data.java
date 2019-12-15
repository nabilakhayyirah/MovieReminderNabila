package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("comingSoon")
    private List<ComingSoon> comingSoon = null;

    public List<ComingSoon> getComingSoon() {
        return comingSoon;
    }

}
