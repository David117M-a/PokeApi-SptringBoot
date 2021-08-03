package com.example.Pokedex.Model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PokedexRepository extends MongoRepository<Pokedex, Integer> {

}
