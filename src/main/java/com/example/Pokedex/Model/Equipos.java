package com.example.Pokedex.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Equipos {
    @Id
    private String _id;
    @Indexed(unique = true)
    private String nombreEquipo;
    private String entrenador;
    private int primerPokemon;
    private int segundoPokemon;
    private int tercerPokemon;
    private int cuartoPokemon;
    private int quintoPokemon;
    private int sextoPokemon;

    public Equipos(String nombreEquipo, String entrenador, int primerPokemon, int segundoPokemon, int tercerPokemon, int cuartoPokemon, int quintoPokemon, int sextoPokemon) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
        this.primerPokemon = primerPokemon;
        this.segundoPokemon = segundoPokemon;
        this.tercerPokemon = tercerPokemon;
        this.cuartoPokemon = cuartoPokemon;
        this.quintoPokemon = quintoPokemon;
        this.sextoPokemon = sextoPokemon;
    }
}
