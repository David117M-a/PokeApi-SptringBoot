package com.example.Pokedex.Service;

import com.example.Pokedex.Model.Entrenadores;
import com.example.Pokedex.Model.EntrenadoresRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EntrenadoresService {
    private final EntrenadoresRepository repository;

    public List<Entrenadores> getAll() {
        return repository.findAll();
    }

    public boolean createEntrenador(Entrenadores entrenadores) {
        boolean response = false;
        try{
            repository.insert(entrenadores);
            response = true;
        }catch (Exception e){
            String error = e.getMessage();
        }
        return response;
    }

    public boolean deleteEntrenador(String _id) {
        boolean response = false;
        try{
            if(repository.existsById(_id)){
                repository.deleteById(_id);
                response = true;
            }
        }catch (Exception e){
            String error = e.getMessage();
        }
        return response;
    }

    public boolean updateEntrenador(Entrenadores entrenadores) {
        boolean response = false;
        try {
            repository.save(entrenadores);
            response = true;
        }catch (Exception e){
            String error = e.getMessage();
        }
        return response;
    }

    public boolean entrenadorExists(Entrenadores entrenadores){
        boolean response = false;
        try{
            //repository.findByEmail(entrenadores.email);
            response = true;
        }catch (Exception e){
            String error = e.getMessage();
        }
        return response;
    }
}
