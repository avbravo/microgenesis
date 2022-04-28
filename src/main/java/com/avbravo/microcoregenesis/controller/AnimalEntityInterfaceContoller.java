/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microcoregenesis.controller;

import com.avbravo.microcoregenesis.repository.AnimalEntityInterfaceRepository;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author avbravo
 */
@Named(value = "animalEntityInterfaceContoller")
@ViewScoped
public class AnimalEntityInterfaceContoller implements Serializable {
@Inject
AnimalEntityInterfaceRepository animalEntityInterfaceRepository;
    /**
     * Creates a new instance of AnimalEntityInterfaceContoller
     */
    public AnimalEntityInterfaceContoller() {
    }
    
}
