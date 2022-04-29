/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.javadriver;

import com.avbravo.microcoregenesis.interfacerepository.InterfaceController;
import com.avbravo.microcoregenesis.model.Country;
import com.avbravo.microcoregenesis.javadriver.JavaDriverRepository;
import com.jmoordbcoregenesis.util.ClassUtil;
import com.jmoordbcoregenesis.util.FacesMessagesUtil;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author avbravo
 */
@Named
@ViewScoped
@Data
public class JavaDriverController implements Serializable{
    // <editor-fold defaultstate="collapsed" desc="fields()">
      private static final Logger LOG = LoggerFactory.getLogger(InterfaceController.class);
      Country country = new Country();
      List<Country> countryList = new ArrayList<>();
    
    // </editor-fold>
      
      // <editor-fold defaultstate="collapsed" desc="@Inject">
     @Inject
     JavaDriverRepository javaDriverRepository;
    // </editor-fold>
      
      @PostConstruct
    public void init() {
        try {
           
        } catch (Exception e) {
            LOG.error("error invoking getter method");
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

    }
      @PreDestroy
    public void preDestroy() {
        try {
           
        } catch (Exception e) {
            LOG.error("error invoking getter method");
            FacesMessagesUtil.showInfo(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }

    }
    
    
      // <editor-fold defaultstate="collapsed" desc="String findById()">
/**
 * Busca en el repository mediante el Id
 * 
 * @return 
 */
    public String findById() {
        try {
            Optional<Country> countryOptional = javaDriverRepository.findById(country.getId());
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
    
    
}
