/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.microcoregenesis.interfacerepository;

import com.avbravo.microcoregenesis.model.Country;
import com.avbravo.microcoregenesis.model.Persona;
import com.jmoordbcoregenesis.annotations.Query;
import com.jmoordbcoregenesis.annotations.Repository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@Repository(forEntity = Country.class)
public interface InterfaceRepository {
    
    public void save(Country country);

    public void delete(String id);
    
    public void update(Country country);
    public long count();
        
    @Query ("select * from Country where id= :id")
    public Optional<Country> findById(String id);
    
    @Query(value="select * from Country")
    public List<Country> findAll();
    
    @Query(value="select * from Country where country = :country")
    public List<Country> findByCountry(String country);
    
}
