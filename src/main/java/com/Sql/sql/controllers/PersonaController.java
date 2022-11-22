/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sql.sql.controllers;

import com.Sql.sql.models.Users;
import com.Sql.sql.servicews.IService;
import com.Sql.sql.servicews.UserService;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mario
 */
@RestController
public class PersonaController {
    @Autowired
    private UserService service;
//    private IService<Users> service;
    
    @GetMapping("/persona")
    public List<Users> listarPersonas(
//            @RequestParam String nombre,
//            @RequestParam int dni
    ) {
//        List<Users> list = new ArrayList();
        return service.get();
//          return list;
    }
    
    @GetMapping("/persona/{nombre}")
    public Users listarPersona(@PathVariable Integer nombre) {
        
        return service.get(nombre);
    }
 
    
    @PostMapping("/persona")
    public boolean agregarPersona(@RequestBody Users persona) {
        
        return service.add(persona);
    }
    
    @DeleteMapping("/persona/{id}")
    public boolean borrar(@PathVariable Integer id) {
        
        return service.remove(id);
    }
    
    @PutMapping("/persona")
    public boolean modificar(@RequestBody Users persona) {
        
        return service.add(persona);
    }
}
