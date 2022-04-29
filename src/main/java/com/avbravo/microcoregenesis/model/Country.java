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
public class Country {

    @Id
    private String id;
    private String country;
//    @Embedded
//    private String planeta;
//    @Referenced(field = "idgalaxy", collection = "galaxia", repository = "GalaxiaRepository")
//    private String galaxia;

    public Country() {
    }

//    public Country(String id, String country, String planeta, String galaxia) {
//        this.id = id;
//        this.country = country;
//        this.planeta = planeta;
//        this.galaxia = galaxia;
//    }

    
    
    public Country(String id, String country) {
        this.id = id;
        this.country = country;
    }

}
