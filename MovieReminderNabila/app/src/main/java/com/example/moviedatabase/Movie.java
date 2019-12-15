package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {

    @SerializedName("title")
    private String title;
    @SerializedName("year")
    private String year;
    @SerializedName("releaseDate")
    private String releaseDate;
    @SerializedName("countries")
    private List<String> countries = null;
    @SerializedName("languages")
    private List<String> languages = null;
    @SerializedName("genres")
    private List<String> genres = null;
    @SerializedName("idIMDB")
    private String idIMDB;
    @SerializedName("urlIMDB")
    private String urlIMDB;
    @SerializedName("type")
    private String type;
    @SerializedName("directors")
    private List<Director> directors = null;
    @SerializedName("writers")
    private List<Writer> writers = null;
    @SerializedName("runtime")
    private String runtime;
    @SerializedName("urlPoster")
    private String urlPoster;
    @SerializedName("plot")
    private String plot;
    @SerializedName("simplePlot")
    private String simplePlot;
    @SerializedName("rated")
    private String rated;
    @SerializedName("rating")
    private String rating;
    @SerializedName("votes")
    private String votes;

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<String> getCountries() {
        return countries;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getIdIMDB() {
        return idIMDB;
    }

    public String getUrlIMDB() {
        return urlIMDB;
    }

    public String getType() {
        return type;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public List<Writer> getWriters() {
        return writers;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getUrlPoster() {
        return urlPoster;
    }

    public String getPlot() {
        return plot;
    }

    public String getSimplePlot() {
        return simplePlot;
    }

    public String getRated() {
        return rated;
    }

    public String getRating() {
        return rating;
    }

    public String getVotes() {
        return votes;
    }

}
