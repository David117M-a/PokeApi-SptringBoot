package com.example.Pokedex.Service;

import com.example.Pokedex.Model.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EquiposService {
    private final EquiposRepository repository;
    private final EntrenadoresRepository entrenadoresRepository;
    private final PokedexRepository pokedexRepository;

    public List<Equipos> getALlEquipos() {
        try{
            return repository.findAll();
        }catch (Exception e){
            String error = e.getMessage();
            return null;
        }
    }

    public boolean createEquipo(Equipos equipos) {
        boolean response = false;
        try {
            if(entrenadoresRepository.existsById(equipos.getEntrenador()) && pokedexRepository.existsById(equipos.getPrimerPokemon())
            && pokedexRepository.existsById(equipos.getSegundoPokemon()) && pokedexRepository.existsById(equipos.getTercerPokemon())
            && pokedexRepository.existsById(equipos.getCuartoPokemon()) && pokedexRepository.existsById(equipos.getQuintoPokemon())
            && pokedexRepository.existsById(equipos.getSextoPokemon())){
                repository.insert(equipos);
                response = true;
            }
        }catch (Exception e){
            String error = e.getMessage();
        }
        return response;
    }

    public boolean deleteEquipo(String _id) {
        boolean response = false;
        try {
            if(repository.existsById(_id)){
                repository.deleteById(_id);
                response = true;
            }
        }catch (Exception e){
            String error = e.getMessage();
        }
        return response;
    }

    public boolean updateEquipo(Equipos equipos) {
        boolean response = false;
        try {
            if(entrenadoresRepository.existsById(equipos.getEntrenador()) && pokedexRepository.existsById(equipos.getPrimerPokemon())
                    && pokedexRepository.existsById(equipos.getSegundoPokemon()) && pokedexRepository.existsById(equipos.getTercerPokemon())
                    && pokedexRepository.existsById(equipos.getCuartoPokemon()) && pokedexRepository.existsById(equipos.getQuintoPokemon())
                    && pokedexRepository.existsById(equipos.getSextoPokemon())){
                repository.save(equipos);
                response = true;
            }
        }catch (Exception e){
            String error = e.getMessage();
        }
        return response;
    }
}
