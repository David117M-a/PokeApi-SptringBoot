package com.example.Pokedex.Controller;

import com.example.Pokedex.Model.Pokedex;
import com.example.Pokedex.Service.PokedexService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pokedex/pokemones")
public class PokemonController {
    private final PokedexService pokemonService;

    @GetMapping
    public List<Pokedex> getAll(){
        return pokemonService.getAllPokemones();
    }
}
