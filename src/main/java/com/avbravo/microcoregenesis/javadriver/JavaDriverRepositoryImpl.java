/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microcoregenesis.javadriver;

import com.avbravo.microcoregenesis.model.Country;
import com.avbravo.microcoregenesis.interfacerepository.InterfaceRepositoryImpl;
import com.jmoordbcoregenesis.util.ClassUtil;
import com.jmoordbcoregenesis.util.FacesMessagesUtil;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
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
@Stateless
public class JavaDriverRepositoryImpl implements JavaDriverRepository {

    // <editor-fold defaultstate="collapsed" desc="@Inject">
    @Inject
    MongoClient mongoClient;
    // </editor-fold>
// <editor-fold defaultstate="collapsed" desc="fields">
    private static final Logger LOG = LoggerFactory.getLogger(InterfaceRepositoryImpl.class);
    // </editor-fold>

    @Override
    public Optional<Country> findById(String id) {
        Country country = new Country();
        try {
            System.out.println("id = "+id);
            MongoDatabase database = mongoClient.getDatabase("microgenesis");
            System.out.println("database.....");
            MongoCollection<Document> collection = database.getCollection("country");
            System.out.println("collecction....");
            Document doc = collection.find(eq("id", id)).first();
            System.out.println("Document .....");
            if (doc == null) {
                System.out.println("Document is null");
                   System.out.println(doc.toJson());
            } else {
                // Podemos convertirlo a JSON
                System.out.println("encontrado....");
                System.out.println(doc.toJson());
                Jsonb jsonb = JsonbBuilder.create();
                country = jsonb.fromJson(doc.toJson(), Country.class);
                return Optional.of(country);
            }

        } catch (Exception e) {
            LOG.error(e.getLocalizedMessage());
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return Optional.empty();
    }

    @Override
    public List<Country> findAll() {
      List<Country> countryList = new ArrayList<>();
        try {

            MongoDatabase database = mongoClient.getDatabase("microgenesis");

            MongoCollection<Document> collection = database.getCollection("country");

//            Document doc = collection.find({});
//            if (doc == null) {
//
//            } else {
//                // Podemos convertirlo a JSON
//                System.out.println(doc.toJson());
//                Jsonb jsonb = JsonbBuilder.create();
//                country = jsonb.fromJson(doc.toJson(), Country.class);
//                return Optional.of(country);
//            }

        } catch (Exception e) {
            LOG.error(e.getLocalizedMessage());
            FacesMessagesUtil.showError(e.getLocalizedMessage(), ClassUtil.nameOfClassAndMethod());
        }
        return countryList;
    }

}
