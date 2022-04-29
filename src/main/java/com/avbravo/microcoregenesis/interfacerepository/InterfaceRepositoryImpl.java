/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.interfacerepository;

import com.jmoordbcoregenesis.util.ClassUtil;
import com.jmoordbcoregenesis.util.FacesMessagesUtil;
import com.avbravo.microcoregenesis.model.Country;
import com.jmoordbcoregenesis.annotations.Query;
import com.jmoordbcoregenesis.producer.mongodb.MongoClientManagerProducer;
import com.jmoordbcoregenesis.util.AnnotationUtil;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author avbravo
 */
//@ApplicationScoped
@Stateless
public class InterfaceRepositoryImpl implements InterfaceRepository {
//
    @Inject
    MongoClient mongoClient;
    private static final Logger LOG = LoggerFactory.getLogger(InterfaceRepositoryImpl.class);
    // <editor-fold defaultstate="collapsed" desc="Optional<Country> findById(String id)">
    @Override
    public Optional<Country> findById(String id) {
        try {
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(InterfaceRepository.class, ClassUtil.nameOfMethod());
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
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(InterfaceRepository.class, ClassUtil.nameOfMethod());
            if (queryOptional.isPresent()) {
                Query query = queryOptional.get();
                System.out.println("query es " + query.value() + " !!");
            } else {
                System.out.println("No se encontro la anotacion ");
            }
          
        } catch (Exception e) {
            LOG.error(e.getLocalizedMessage());
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
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(InterfaceRepository.class, ClassUtil.nameOfMethod());
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
