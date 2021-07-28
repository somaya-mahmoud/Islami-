package com.example.islami;
import java.util.List;
import com.google.gson.annotations.SerializedName;
public class RadiosResponse {

    @SerializedName("radios")
    private List<RadioItems> radios;

    public void setRadios(List<RadioItems> radios){
        this.radios = radios;
    }

    public List<RadioItems> getRadios(){
        return radios;
    }

    @Override
    public String toString(){
        return
                "RadiosResponse{" +
                        "radios = '" + radios + '\'' +
                        "}";
    }

}
