package com.avbravo.microcoregenesis.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("jakartaee9")
public class JakartaEE9Resource {
//    @Inject
//   AdrressRepo adreessRepo;
//    
    @GET
    public Response ping(){
        String value="";
//        try {
//             Optional<Persona> persona=adreessRepo.findById("aris");
//             value= persona.get().getName();
//        } catch (Exception e) {
//        }
        
       
        return Response
                .ok("ping Jakarta EE" + value)
                .build();
    }
}
