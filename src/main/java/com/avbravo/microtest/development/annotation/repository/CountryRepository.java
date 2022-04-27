/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.microtest.development.annotation.repository;

import com.avbravo.microtest.development.annotation.model.Country;
import com.avbravo.microtest.legacy.model.Persona;
import com.jmoordbcoregenesis.annotations.Query;
import com.jmoordbcoregenesis.annotations.Repository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@Repository(forEntity = Country.class)
public interface CountryRepository {
    @Query ("select * from Country where id= :id")
    public Optional<Country> findById(String id);
    
    @Query(value="select * from Country")
    public List<Country> findAll();
    
    @Query(value="select * from Country where country = :country")
    public List<Country> findByCountry(String country);
    
}
