/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microcoregenesis.controller;

//import jakarta.annotation.PostConstruct;
import com.jmoordbcoregenesis.util.ClassUtil;
import com.jmoordbcoregenesis.util.FacesMessagesUtil;
import com.avbravo.microcoregenesis.model.Country;
import com.jmoordbcoregenesis.annotations.Query;
import com.jmoordbcoregenesis.util.AnnotationUtil;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.avbravo.microcoregenesis.repository.CountryInterfaceRepository;

/**
 *
 * @author avbravo
 */
@Named(value = "countryController")
@SessionScoped
@Data
public class CountryInterfaceController implements Serializable {

    // <editor-fold defaultstate="collapsed" desc="field">
    private static final Logger LOG = LoggerFactory.getLogger(CountryInterfaceController.class);
    private List<Country> countryList = new ArrayList<>();
    private Country country = new Country();
    private static final long serialVersionUID = 1L;
    private String mensaje = "";
    
    List<String> fieldsWithIdList = new ArrayList<>();
    List<String> fieldsWithEmbeddedList = new ArrayList<>();
    List<String> fieldsWithReferencedList = new ArrayList<>();
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="@Inject">

    @Inject
    CountryInterfaceRepository countryRepository;
//    @Inject
//    AdrressRepo adreessRepo;
    // </editor-fold>

    /**
     * Creates a new instance of IndexController
     */
    public CountryInterfaceController() {
    }

    @PostConstruct
    public void init() {
        try {
            mensaje = "";
            System.out.println("Init....");
            countryList = new ArrayList<>();
            fieldsWithIdList = new ArrayList<>();
        } catch (Exception e) {
            LOG.error("error invoking getter method");
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

    }

    @PreDestroy
    private void cleanup() {
        // Close the connection to the DataSource.
// 
    }

    public String findAll() {

        try {
            countryList = countryRepository.findAll();
            if (countryList == null || countryList.isEmpty()) {
                    FacesMessagesUtil.showWarn("No hay registros", "Advertencia");
             
            } else {
               FacesMessagesUtil.showInfo("Si encontro registro", "Mensaje");
            }
        } catch (Exception e) {
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }
//  

    // <editor-fold defaultstate="collapsed" desc="String findById()">
/**
 * Busca en el repository mediante el Id
 * 
 * @return 
 */
    public String findById() {
        try {
            Optional<Country> countryOptional = countryRepository.findById("pa");
            if (countryOptional.isPresent()) {
                country = countryOptional.get();
                FacesMessagesUtil.showInfo("Si encontro registro", "Mensaje");
            } else {
                FacesMessagesUtil.showWarn("No existe country con ese id", "Advertencia");
            }
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }
        // </editor-fold>
    public String findByCountry() {
        try {
             countryList = countryRepository.findByCountry("panama");
            if (countryList == null || countryList.isEmpty()) {
                FacesMessagesUtil.showInfo("Si encontro registro", "Mensaje");
            } else {
                FacesMessagesUtil.showWarn("No hay registros", "Advertencia");
            }
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }
    
    // <editor-fold defaultstate="collapsed" desc="String fieldsWithId()">

    public String fieldsWithId() {
        try {
            System.out.println("llego a fieldsWithId");
           fieldsWithIdList = AnnotationUtil.fieldWithIdAnnotation(Country.class);
            if (fieldsWithIdList == null || fieldsWithIdList.isEmpty()) {
                   FacesMessagesUtil.showWarn("No hay campos con  @Id", "Advertencia");
           
            } else {
                  FacesMessagesUtil.showInfo("Encontro campos con  @Id", "Mensaje");
                  System.out.println(" Fiels With  @Id");
                  fieldsWithIdList.forEach(s -> {
                      System.out.println(s);
               });
            }
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="String fieldsWithEmbbedded() ">

    public String fieldsWithEmbbedded() {
        try {
           fieldsWithIdList = AnnotationUtil.fieldWithEmbeddedAnnotation(Country.class);
            if (fieldsWithIdList == null || fieldsWithIdList.isEmpty()) {
                   FacesMessagesUtil.showWarn("No hay campos con  @Embbedded", "Advertencia");
           
            } else {
                  FacesMessagesUtil.showInfo("Encontro campos con  @Embbedded", "Mensaje");
                  System.out.println(" Fiels With  @Id");
                  fieldsWithIdList.forEach(s -> {
                      System.out.println(s);
               });
            }
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="String fieldsWithReferenced()">

    public String fieldsWithReferenced() {
        try {
           fieldsWithIdList = AnnotationUtil.fieldWithReferencedAnnotation(Country.class);
            if (fieldsWithIdList == null || fieldsWithIdList.isEmpty()) {
                   FacesMessagesUtil.showWarn("No hay campos con  @Referemced", "Advertencia");
           
            } else {
                  FacesMessagesUtil.showInfo("Encontro campos con  @Referemced", "Mensaje");
                  System.out.println(" Fiels With  @Id");
                  fieldsWithIdList.forEach(s -> {
                      System.out.println(s);
               });
            }
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return "";
    }
    // </editor-fold>
    
    /**
     * Aqui debo usar el mismo nombre del metodo que deseo validar
     * si estoy en el repositorio no seria necesario
     * Muestra como se lee el valor de una anotacion
     * @return 
     */
    
     public String readQueryOfQueryAnnotation() {
        try {
            Optional<Query> queryOptional = AnnotationUtil.queryAnnotationReader(CountryInterfaceRepository.class, ClassUtil.nameOfMethod());
            if(queryOptional.isPresent()){
                Query query = queryOptional.get();
                  FacesMessagesUtil.showInfo(query.value(), "Query");
               
                 
            }else {
                
                 FacesMessagesUtil.showWarn("No se leyo el valor de la anotacion", "Query");
            }
        
        } catch (Exception e) {
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

        return "";
    }
   
}
