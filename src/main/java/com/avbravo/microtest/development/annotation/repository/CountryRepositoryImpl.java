/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microtest.development.annotation.repository;

import com.jmoordbcoregenesis.util.ClassUtil;
import com.jmoordbcoregenesis.util.FacesMessagesUtil;
import com.avbravo.microtest.development.annotation.model.Country;
import com.jmoordbcoregenesis.annotations.Query;
import com.jmoordbcoregenesis.util.AnnotationUtil;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@ApplicationScoped

public class CountryRepositoryImpl implements CountryRepository {

    @Override
    public Optional<Country> findById(String id) {
        try {
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(CountryRepository.class, ClassUtil.nameOfMethod());
            if(queryOptional.isPresent()){
                Query query = queryOptional.get();
                 System.out.println("query es " + query.value() + " ");
            }else {
                System.out.println("No se encontro la anotacion ");
            }
        
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

        return Optional.empty();
    }
   
    @Override
    public List<Country> findAll() {
        List<Country> list = new ArrayList<>();
        try {
//             Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(this.getClass(), ClassUtil.nameOfMethod());
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(CountryRepository.class, ClassUtil.nameOfMethod());
            if(queryOptional.isPresent()){
                Query query = queryOptional.get();
                 System.out.println("query es " + query.value() + " !!");
            }else {
                System.out.println("No se encontro la anotacion ");
            }
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

        return list;
    }

    @Override
    public List<Country> findByCountry(String country) {
        List<Country> list = new ArrayList<>();
        try {
             Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(CountryRepository.class, ClassUtil.nameOfMethod());
            if(queryOptional.isPresent()){
                Query query = queryOptional.get();
                 System.out.println("query es " + query.value() + " !!");
            }else {
                System.out.println("No se encontro la anotacion ");
            }

        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

        return list;
    }

}
