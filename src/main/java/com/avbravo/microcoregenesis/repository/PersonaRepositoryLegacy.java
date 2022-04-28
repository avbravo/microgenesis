/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.repository;

import com.avbravo.microcoregenesis.model.Persona;
import com.jmoordbcoregenesis.legacy.RepositoryDecoratorLegacy;
import jakarta.enterprise.context.ApplicationScoped;

//import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

/**
 *
 * @author avbravo
 */
@ApplicationScoped
@Named

public class PersonaRepositoryLegacy extends RepositoryDecoratorLegacy<Persona, String>{

    

  
    
}