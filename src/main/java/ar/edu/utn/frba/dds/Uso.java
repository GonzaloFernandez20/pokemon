package ar.edu.utn.frba.dds;
import java.io.IOException;

public class Uso {
    public static void main(String[] args) throws IOException {
        try {
            APIpokemon apiPokemon = APIpokemon.getInstancia();
            
            ListadoDePokemones listadoPokemones = apiPokemon.listadoDePokemones();

            // Imprimir un par de Pokémon con sus URLs
            imprimirPokemones(listadoPokemones, 2); // Cambia este número si quieres imprimir más o menos Pokémon
        } catch (IOException e) {
            System.out.println("Error al conectarse a la API de Pokémon: " + e.getMessage());
        }
    }
    private static void imprimirPokemones(ListadoDePokemones listadoPokemones, int cantidad) {
        if (listadoPokemones != null && listadoPokemones.results != null) {
            int contador = 0;
            for (Pokemon unPokemon : listadoPokemones.results) {
                System.out.println("Nombre: " + unPokemon.name);
                System.out.println("URL: " + unPokemon.url);
                System.out.println();

                contador++;
                if (contador >= cantidad) {
                    break;
                }
            }
        } else {
            System.out.println("No se pudo obtener el listado de Pokémon.");
        }
    }
}
