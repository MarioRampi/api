/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Sql.sql.servicews;

import java.util.List;

/**
 *
 * @author Mario
 */
public interface IService<T> {
    public List<T> get();
    public T get(Integer id);
    public boolean add(T entity);
    public boolean remove(T entity);
    public boolean remove(Integer id);
}
