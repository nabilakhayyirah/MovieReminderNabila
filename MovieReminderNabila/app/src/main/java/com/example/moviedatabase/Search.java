package com.example.moviedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Search extends AppCompatActivity {
    ListView listView;
    private List<MovieItem> movieItemList;
//    private String query;
//    private String KEY_QUERY = "TONY STARK";

    private JsonPlaceHolderApi jsonPlaceHolderApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView = findViewById(R.id.listView);
        movieItemList = new ArrayList<>();

//        Bundle getData = getIntent().getExtras();
//        query = getData.getString("KEY_QUERY");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.myapifilms.com/imdb/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        getPost();
//        getComment();
    }

    private void getPost() {

        Call<Post> call = jsonPlaceHolderApi.getPost("71ca17e1-a4fc-411e-bb91-1d821d05cbe3","json","en-us","2020-01");

        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
//                if(!response.isSuccessful()) {
//                    textViewResult.setText("Code :" + response.code());
//                    return;
//                }

                Post post = response.body();
                Data data = post.getData();
                List<ComingSoon> comingsoonlist = data.getComingSoon();
                 for(ComingSoon comingson :comingsoonlist) {
                      List<Movie> movielist = comingson.getMovies();
                      for(Movie movie:movielist) {
                          MovieItem movieItem = new MovieItem(
                                  "Title Movie : " + movie.getTitle(),
                                  "Year : " + movie.getYear(),
                                  "Release Date : " + movie.getReleaseDate(),
                                  "Url Imdb : " + movie.getUrlIMDB());

                          movieItemList.add(movieItem);
                      }
                 }

                ListViewAdapter adapter = new ListViewAdapter(movieItemList, getApplicationContext());
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
//                textViewResult.setText(t.getMessage());
            }
        });
    }
}