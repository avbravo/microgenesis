/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.repository;

import com.avbravo.microcoregenesis.model.Animal;
import com.jmoordbcoregenesis.annotations.Repository;
import com.jmoordbcoregenesis.repository.EntityRepository;

/**
 *
 * @author avbravo
 */
@Repository 
public interface AnimalEntityInterfaceRepository extends EntityRepository<Animal, Long>{
    
}
