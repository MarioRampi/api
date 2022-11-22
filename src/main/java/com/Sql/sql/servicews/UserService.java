/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sql.sql.servicews;

import com.Sql.sql.Repository.RepoGeneric;

import com.Sql.sql.models.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mario
 */
@Service
public class UserService { //implements IService<Users> {
    @Autowired
    private RepoGeneric repo;

//    @Override
    public List<Users> get() {
        return repo.findAll();
    }

//    @Override
    public Users get(Integer id) {
        return repo.findById(id).orElse(null);
    }

//    @Override
    public boolean add(Users entity) {
        repo.save(entity);
        
        return true;
    }

//    @Override
    public boolean remove(Users entity) {
         repo.delete(entity);
         
         return true;
    }

//    @Override
    public boolean remove(Integer id) {
        repo.deleteById(id);
         
         return true;
    }
}
