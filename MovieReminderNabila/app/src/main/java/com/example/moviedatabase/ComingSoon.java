package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComingSoon {

    @SerializedName("date")
    private String date;
    @SerializedName("movies")
    private List<Movie> movies = null;

    public String getDate() {
        return date;
    }

    public List<Movie> getMovies() {
        return movies;
    }

}
