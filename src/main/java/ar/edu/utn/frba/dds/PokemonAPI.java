package ar.edu.utn.frba.dds;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokemonAPI {
    @GET("results")
    Call<ListadoDePokemones> results();

    @GET("results")
    Call<ListadoDePokemones> results2(@Query("name") String name, @Query("url") String utl);
    //Call<Mundo> results(@Query("url") String url);

    //@GET("results")
}
