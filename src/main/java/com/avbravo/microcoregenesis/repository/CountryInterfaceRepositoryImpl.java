/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.repository;

import com.avbravo.microcoregenesis.repository.CountryInterfaceRepository;
import com.jmoordbcoregenesis.util.ClassUtil;
import com.jmoordbcoregenesis.util.FacesMessagesUtil;
import com.avbravo.microcoregenesis.model.Country;
import com.jmoordbcoregenesis.annotations.Query;
import com.jmoordbcoregenesis.util.AnnotationUtil;
import com.mongodb.client.MongoClient;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
//@ApplicationScoped
@Stateless
public class CountryInterfaceRepositoryImpl implements CountryInterfaceRepository {

//    @Inject
//    MongoClient mongoClient;
    
    // <editor-fold defaultstate="collapsed" desc="Optional<Country> findById(String id)">
    @Override
    public Optional<Country> findById(String id) {
        try {
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(CountryInterfaceRepository.class, ClassUtil.nameOfMethod());
            if (queryOptional.isPresent()) {
                Query query = queryOptional.get();
                System.out.println("query es " + query.value() + " ");
            } else {
                System.out.println("No se encontro la anotacion ");
            }

        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

        return Optional.empty();
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="List<Country> findAll()">

    @Override
    public List<Country> findAll() {
        List<Country> list = new ArrayList<>();
        try {
//             Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(this.getClass(), ClassUtil.nameOfMethod());
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(CountryInterfaceRepository.class, ClassUtil.nameOfMethod());
            if (queryOptional.isPresent()) {
                Query query = queryOptional.get();
                System.out.println("query es " + query.value() + " !!");
            } else {
                System.out.println("No se encontro la anotacion ");
            }
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

        return list;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="List<Country> findByCountry(String country) ">

    @Override
    public List<Country> findByCountry(String country) {
        List<Country> list = new ArrayList<>();
        try {
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(CountryInterfaceRepository.class, ClassUtil.nameOfMethod());
            if (queryOptional.isPresent()) {
                Query query = queryOptional.get();
                System.out.println("query es " + query.value() + " !!");
            } else {
                System.out.println("No se encontro la anotacion ");
            }

        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

        return list;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="void save(Country country)">
    @Override
    public void save(Country country) {
        try {
//
              } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="void delete(Country country)">
    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="void update(Country country) ">
    @Override
    public void update(Country country) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="long count()">
    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // </editor-fold>
}
