/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Sql.sql.Repository;

import com.Sql.sql.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mario
 */
public interface RepoGeneric extends JpaRepository<Users, Integer> {
    
}
