package com.example.Pokedex.Controller;

import com.example.Pokedex.Model.Entrenadores;
import com.example.Pokedex.Service.EntrenadoresService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pokedex/entrenadores")
public class EntrenadoresController {
    private final EntrenadoresService entrenadoresService;

    @GetMapping
    public List<Entrenadores> getAll(){
        try{
            return entrenadoresService.getAll();
        }catch (Exception e){
            String error = e.getMessage();
            return null;
        }
    }

    @PostMapping
    public String create(@RequestBody Entrenadores entrenadores){
        String response = "Error: ";
        try {
            if(entrenadoresService.createEntrenador(entrenadores)){
                response = "Entrenador registrado con éxito.";
            }else {
                throw new Exception("Entrenador no registrado.");
            }
        }catch (Exception e){
            String error = e.getMessage();
            response += error;
        }
        return response;
    }

    @DeleteMapping(path = "{_id}")
    public String delete(@PathVariable("_id") String _id){
        String response = "Error: ";
        try{
            if(entrenadoresService.deleteEntrenador(_id)) {
                response = "Entrenador eliminado con éxito.";
            }else{
                throw new Exception("Usuario no encontrado.");
            }
        }catch (Exception e){
            String error = e.getMessage();
            response += error;
        }
        return response;
    }

    @PutMapping
    public String update(@RequestBody Entrenadores entrenadores){
        String response = "Error: ";
        try{
            if(entrenadoresService.updateEntrenador(entrenadores)){
                response = "Entrenador actualizado con éxito.";
            } else {
                throw new Exception("Usuario no actualizado.");
            }
        }catch (Exception e){
            String error = e.getMessage();
            response += error;
        }
        return response;
    }
}
