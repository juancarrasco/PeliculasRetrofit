package com.example.juan_andres.peliculasretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by juan-andres on 27/06/17.
 */

 interface PeliculasService {
    @GET("peliculas")
    Call<List<Peliculas>> getListPeliculas();
}
