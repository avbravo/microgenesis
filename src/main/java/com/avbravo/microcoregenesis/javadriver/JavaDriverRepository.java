/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.microcoregenesis.javadriver;

import com.avbravo.microcoregenesis.model.Country;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */

public interface JavaDriverRepository {
    
    public Optional<Country> findById(String id);
    public List<Country> findAll();
}
