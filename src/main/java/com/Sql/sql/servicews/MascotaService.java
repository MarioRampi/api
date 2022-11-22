/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sql.sql.servicews;

import com.Sql.sql.Repository.RepoMascota;
import com.Sql.sql.models.Mascota;
import com.Sql.sql.models.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mario
 */
@Service
public class MascotaService implements IService<Mascota> {
    @Autowired
    private RepoMascota repoMascota;
    
    @Override
    public List<Mascota> get() {
        return repoMascota.findAll();
    }

    @Override
    public Mascota get(Integer id) {
        return repoMascota.findById(id).orElse(null);
    }

    @Override
    public boolean add(Mascota entity) {
        
        repoMascota.save(entity);
        
        return true;
    }

    @Override
    public boolean remove(Mascota entity) {
        
        repoMascota.delete(entity);
        
        return true;
    }

    @Override
    public boolean remove(Integer id) {
        repoMascota.deleteById(id);
        
        return true;
    }
    
}
