package com.gdgkazan.summer_school_2017.lesson_3.api;

import com.gdgkazan.summer_school_2017.lesson_3.models.Beer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Timur Valiev
 */
public interface BeerService {

    @GET("beers/random")
    Call<List<Beer>> getRandomBeer();

}
