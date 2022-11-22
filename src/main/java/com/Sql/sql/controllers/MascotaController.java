/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sql.sql.controllers;

import com.Sql.sql.models.Mascota;
import com.Sql.sql.models.Users;
import com.Sql.sql.servicews.MascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mario
 */
@RestController
public class MascotaController {
    @Autowired
    MascotaService servicio;
    
    @GetMapping("/mascota")
    public List<Mascota> traerTodos() {
        
        return servicio.get();
    }
    
    @GetMapping("/mascota/{id}")
    public Mascota traerUno(@PathVariable int id, @RequestParam String nombre) {
        
        return servicio.get(id);
    }
    
    @PostMapping("/mascota")
    public boolean cargar(@RequestBody Mascota entity) {
        
        return servicio.add(entity);
    }
    
    @PutMapping("/mascota")
    public boolean modificar(@RequestBody Mascota entity) {
        
        return servicio.add(entity);
    }
    
    @DeleteMapping("/mascota/{id}")
    public boolean borrar(@PathVariable int id) {
        
        return servicio.remove(id);
    }
}
