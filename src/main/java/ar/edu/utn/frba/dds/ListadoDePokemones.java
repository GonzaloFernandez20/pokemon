package ar.edu.utn.frba.dds;
import java.util.List;

public class ListadoDePokemones {
    public List<Pokemon> results;
    public String next;
    //public List<Pokemon> buscarPokemonsQueRealizan(Movimiento movimiento) {
    
    public List<Pokemon> getPokemonList(){return results;}
}

class Movimiento {
    public String name;
    public String url;
}

class Image {
    public String url;
}