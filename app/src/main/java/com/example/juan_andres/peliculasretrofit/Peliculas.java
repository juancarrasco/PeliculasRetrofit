package com.example.juan_andres.peliculasretrofit;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by juan-andres on 27/06/17.
 */

public class Peliculas {
    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", trailer='" + trailer + '\'' +
                ", image='" + image + '\'' +
                ", rated='" + rated + '\'' +
                ", genero='" + genero + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @SerializedName("titulo")
    private String titulo;

            @SerializedName("sinopsis")
    private String sinopsis;

    @SerializedName("trailer")
    private String trailer;

      @SerializedName("image")
    private String image;

      @SerializedName("rated")
    private String rated;

         @SerializedName("genero")
    private String   genero;

    @SerializedName("createdAt")
    private String createdAt;

        @SerializedName("updatedAt")
    private String    updatedAt;

     @SerializedName("id")
    private String id;
}
