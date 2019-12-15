package com.example.moviedatabase;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET("comingSoon")
    Call<Post> getPost(
            @Query("token") String token,
            @Query("format") String format,
            @Query("language") String language,
            @Query("date") String date
    );

//    @GET("posts/{id}/comments")
//    Call<List<Comment>> getComment(@Path("id") int postId);
//
//    @GET
//    Call<List<Comment>> getComment(@Url String Url);
}