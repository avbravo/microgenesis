/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.model;

import com.jmoordbcoregenesis.annotations.entity.Id;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Data
@Builder
public class Animal {
   @Id
   private Long id;
   private String name;

    public Animal() {
    }

    public Animal(Long id, String name) {
        this.id = id;
        this.name = name;
    }
   
   
   
}
