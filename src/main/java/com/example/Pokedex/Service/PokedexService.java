package com.example.Pokedex.Service;

import com.example.Pokedex.Model.Pokedex;
import com.example.Pokedex.Model.PokedexRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PokedexService {
    private final PokedexRepository repository;

    public List<Pokedex> getAllPokemones() {
        return repository.findAll();
    }
}
