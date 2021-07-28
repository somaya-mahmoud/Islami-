package com.example.islami;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {
    private static Retrofit retrofit;
    private static Retrofit getInstance(){
        if(retrofit==null)
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.mp3quran.net/radios/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        return retrofit;

    }

    public static WebServices getApis(){
        return  getInstance().create(WebServices.class);
    }


}
