package com.example.pokemonsef;

import android.net.Uri;

import java.io.IOException;

public class pokeAPI {

    private final String BASE_URL = "https://pokeapi.co/api/v2/";
    private final String API_KEY = "<api-key>";




    String getPokemonPorTipo(String tipo){

        Uri buildUri = Uri.parse(BASE_URL)
        .buildUpon()
        .appendPath("tipo")
        .appendPath("pokemon")
        .appendQueryParameter("tipo", tipo)
        .appendQueryParameter("api_key", API_KEY)
        .build();

        String url = buildUri.toString();

        return doCall(url);

    }

    private String doCall(String url) {
        try {
            String JsonResponse = HttpUtils.get(url);
            return JsonResponse;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
