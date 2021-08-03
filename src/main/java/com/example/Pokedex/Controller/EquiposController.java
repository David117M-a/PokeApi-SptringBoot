package com.example.Pokedex.Controller;

import com.example.Pokedex.Model.Entrenadores;
import com.example.Pokedex.Model.Equipos;
import com.example.Pokedex.Service.EquiposService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pokedex/equipos")
public class EquiposController {
    private final EquiposService equiposService;

    @GetMapping
    public List<Equipos> getAll(){
        try{
            return equiposService.getALlEquipos();
        }catch (Exception e){
            String error = e.getMessage();
            return null;
        }
    }

    @PostMapping
    public String create(@RequestBody Equipos equipos){
        String response = "Error: ";
        try{
            if(equiposService.createEquipo(equipos)){
                response = "Equipo creado con éxito.";
            } else {
                throw new Exception("No pudo crearse el equipo.");
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
        try {
            if(equiposService.deleteEquipo(_id)){
                response = "Equipo eliminado con éxito.";
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
    public String update(@RequestBody Equipos equipos){
        String response = "Error: ";
        try{
            if(equiposService.updateEquipo(equipos)){
                response = "Equipo actualizado con éxito";
            } else {
                throw new Exception("El equipo no se ha podido actualizar.");
            }
        }catch (Exception e){
            String error = e.getMessage();
            response += error;
        }
        return response;
    }
}
