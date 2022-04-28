/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.microcoregenesis.repository;

import com.avbravo.microcoregenesis.model.Animal;
import com.jmoordbcoregenesis.annotations.QueryResult;
import com.jmoordbcoregenesis.annotations.Repository;

/**
 *
 * @author avbravo
 */
@Repository
public interface AnimalQueryResultEntityRepository {
    QueryResult<Animal> findById(Long id);
    QueryResult<Animal> findByName(String name);
}
