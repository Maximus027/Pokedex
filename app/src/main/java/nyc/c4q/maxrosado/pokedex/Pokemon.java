package nyc.c4q.maxrosado.pokedex;

/**
 * Created by maxrosado on 10/27/16.
 */

public class Pokemon {
    private int pokemonNumber;
    private Integer imageid;
    private String pokemonName;
    private String pokemonInfo;

    Pokemon(int pokemonNumber, Integer imageid, String pokemonName, String pokemonInfo) {
        this.imageid = imageid;
        this.pokemonName = pokemonName;
        this.pokemonNumber = pokemonNumber;
        this.pokemonInfo = pokemonInfo;
    }

    public int getPokemonNumber() {
        return pokemonNumber;
    }

    public Integer getImageid() {
        return imageid;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getPokemonInfo() {
        return pokemonInfo;
    }
}
