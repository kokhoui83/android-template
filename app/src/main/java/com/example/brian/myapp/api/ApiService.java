package com.example.brian.myapp.api;

import com.example.brian.myapp.api.StarkHollows.IStarkHollows;
import com.example.brian.myapp.model.StarkHollows.Test;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by brian on 04/02/2017.
 */

public class ApiService {
    private IStarkHollows starkHollows;

    public ApiService() {
        starkHollows = new Retrofit.Builder()
                .baseUrl("https://stark-hollows-98503.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(IStarkHollows.class);
    }

    public Observable<Test> test() {
        return starkHollows.test();
    }
}
