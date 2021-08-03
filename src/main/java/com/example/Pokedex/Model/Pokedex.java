package com.example.Pokedex.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

public class Pokedex {
    public int _id;
    public String nombrePokemon;
    public float alturaMetros;
    public String categoria;
    public float pesoKg;
    public String habilidad;
    public String sexo;
    public String tipo;
    public String debilidad;
}
