package ar.edu.utn.frba.dds;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIpokemon {
    private static APIpokemon instancia = null;
    private static final String urlApi = "https://pokeapi.co/api/v2/pokemon/";
    private final Retrofit retrofit;

    private APIpokemon(){
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlApi)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static APIpokemon getInstancia() {
        if (instancia == null) {
            instancia = new APIpokemon();
        }
        return instancia;
    }

    public ListadoDePokemones listadoDePokemones() throws IOException{
        PokemonAPI pokemonAPI = this.retrofit.create(PokemonAPI.class);
        Call<ListadoDePokemones> listadoPokemones = pokemonAPI.results();
        Response<ListadoDePokemones> respuestaPokemones = listadoPokemones.execute();
        return respuestaPokemones.body();
    }
}


