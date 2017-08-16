package com.example.retrofitrecylcer;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ninesol on 4/6/2017.
 */

public interface PizzaRetrofitInterface {


    @GET("/webservices/getData.php?")
   /* Call<List<PizzaModelClass>> call= getPizzaJsonData();
    Call<PizzaModelClass> example(@Query("tableName") String finder) call = getPizzaJsonData();*/
    Call<Example> listRepos(@Query("tableName") String user);
}
