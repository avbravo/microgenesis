/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microcoregenesis.controller;

import com.avbravo.microcoregenesis.model.Animal;
import com.avbravo.microcoregenesis.repository.AnimalAbstractEntityRepository;
import com.jmoordbcoregenesis.util.ClassUtil;
import com.jmoordbcoregenesis.util.FacesMessagesUtil;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author avbravo
 */
@Named(value = "animalController")
@ViewScoped
public class AnimalAbstractEntityController implements Serializable {

    @Inject
    AnimalAbstractEntityRepository animalAbstractEntityRepository;

    /**
     * Creates a new instance of AnimalController
     */
    public AnimalAbstractEntityController() {
    }

    // <editor-fold defaultstate="collapsed" desc="List<Animal> findByName(String name)">
    public List<Animal> findByName(String name) {
        List<Animal> animalList = new ArrayList<>();
        try {
            animalList = animalAbstractEntityRepository.findByName(name);
        } catch (Exception e) {
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return animalList;
    }
    // </editor-fold>
}
