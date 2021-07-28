package com.example.islami;
import com.example.islami.RadiosResponse;

import retrofit2.Call;
import retrofit2.http.GET;
public interface WebServices {


    @GET("radio_arabic.json")
    Call<RadiosResponse> getRadioChannels();


}