package com.example.Pokedex.Model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EntrenadoresRepository extends MongoRepository<Entrenadores, String> {
    Optional<Entrenadores> findByEmail(String email);
}
