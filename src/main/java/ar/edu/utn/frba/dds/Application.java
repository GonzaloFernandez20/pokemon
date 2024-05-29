package ar.edu.utn.frba.dds;
import java.io.IOException;

public class Application {
    // ---------------------------------------- FUNCIONALIDADES ---------------------------------------- //
    public static void main(String[] args) throws IOException {
        try {
            APIRequester apiPokemon = APIRequester.getInstancia();

            apiPokemon.obtenerPokemonPorNombre("pikachu-rock-star");
            apiPokemon.listadoDePokemosPorMovimiento("nuzzle");

        } catch (IOException e) {
            System.out.println("Error al conectarse a la API de Pokémon: " + e.getMessage());
        }
    }
}
