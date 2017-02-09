package com.example.brian.myapp.api.StarkHollows;

import com.example.brian.myapp.model.StarkHollows.Test;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by brian on 04/02/2017.
 */

public interface IStarkHollows {
    @GET("/test")
    @Headers("Accept: application/json")
    Observable<Test> test();
}
