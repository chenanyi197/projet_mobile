package com.example.recycleview;

import retrofit2.Call;
import retrofit2.http.GET;

    public interface PokemonRestApi {
        //On définit notre interface
        //Avec une méthod getListPokemon() qui retourne un objet
        //Call<RestPokemonResponse>
        @GET("pokemon")
        Call<RestPokemonResponse> getListPokemon();
       // @GET("sprites")
       // Call<RestPokemonResponse> getListSprites();
        //  @GET("/abilities")
        //  Call<RestPokemonResponse> getListAbilities();
    }

