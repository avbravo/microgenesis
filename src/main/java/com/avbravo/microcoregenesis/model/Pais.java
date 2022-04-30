/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.model;

import com.jmoordbcoregenesis.annotations.entity.Id;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Data
public class Pais {
    @Id
    private String id;
    private String name;
}
