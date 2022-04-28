/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microcoregenesis.controller;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author avbravo
 */
@Named(value = "animalQueryResultEntityController")
@ViewScoped
public class AnimalQueryResultEntityController implements Serializable{

    /**
     * Creates a new instance of AnimalQueryResultEntityController
     */
    public AnimalQueryResultEntityController() {
    }
    
//    
//    // Sorting
//personRepository.findByAge(age)
//    .sortAsc(Person_.lastName)
//    .getResultList();
// 
//QueryResult<Person> result = personRepository.findByAge(age)
//    .sortDesc("lastName");
//result.changeOrder(Person_.lastName)
//    .getResultList();
// 
//// Dynamic Query Options
//personRepository.findBySSN(ssn)
//    .lockMode(LockModeType.WRITE)
//    .hint("org.hibernate.timeout", Integer.valueOf(10))
//    .getSingleResult();
// 
//// Count
//long total = personRepository.findByAge(age).count();
// 
//// Pagination
//// Query API style
//QueryResult<Person> paged = personRepository.findByAge(age)
//    .maxResults(10)
//    .firstResult(50);
// 
//// or paging style
//QueryResult<Person> paged = personRepository.findByAge(age)
//    .withPageSize(10) // equivalent to maxResults
//    .toPage(5);
// 
//int totalPages = paged.countPages();
    
}
