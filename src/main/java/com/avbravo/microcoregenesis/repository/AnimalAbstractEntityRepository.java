/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.repository;

import com.avbravo.microcoregenesis.model.Animal;
import com.jmoordbcoregenesis.repository.AbstractEntityRepository;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import static org.apache.commons.lang.StringUtils.isEmpty;

/**
 *
 * @author avbravo
 */
@Stateless
//se lo puse alli no estoy seguro
public abstract class AnimalAbstractEntityRepository extends AbstractEntityRepository<Animal, Long>{
    
    // <editor-fold defaultstate="collapsed" desc="@Inject()">
//    @Inject
//    MongoClient mongoClient;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="List<Animal> findByName(String name)">


    public List<Animal> findByName(String name)
    {
        List<Animal> animalList = new ArrayList<>();
        try {
       String jpql = "select * from Animal a where a.name = :";
        if (!isEmpty(name))
        {
            jpql += "a.name = :name";
        }
      //return consulta
//        return getEntityManager().createQuery(jpql) ..            
        } catch (Exception e) {
        }

return animalList;
    }
      // </editor-fold>
}
