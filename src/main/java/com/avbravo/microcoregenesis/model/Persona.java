/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.model;

import com.jmoordbcoregenesis.annotations.entity.Id;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Data
@Builder
public class Persona implements Serializable {
    @Id
    private String name;
    private String id;

    public Persona(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Persona() {
    }

  
    
    
}
