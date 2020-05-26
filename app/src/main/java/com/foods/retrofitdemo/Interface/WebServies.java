package com.foods.retrofitdemo.Interface;

import com.foods.retrofitdemo.Model.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface WebServies {

    String BASE_URL="https://chartbuster.000webhostapp.com/Colories%20in%20Food/";
    String FEED_URL="test.json";


    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    //DOA Data Access Object
    @GET(FEED_URL)
    Call<List<Model>>getItems();


}
