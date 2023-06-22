package nl.ipass.webservices;

import nl.ipass.model.Reis;
import nl.ipass.model.MijnReizen;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("reizen")
public class ReisResource {
//    @GET
//    @Produces("text/plain")
//    public String getFormData(@QueryParam("reisNaam") String reisNaam,
//                              @QueryParam("reisOmschrijving") String reisOmschrijving,
//                              @QueryParam("beginDatum") String beginDatum,
//                              @QueryParam("eindDatum") String eindDatum) {
//        // Process the form data as needed
//        // Example: Return a concatenated string with the form data
//        String formData = "Reisnaam: " + reisNaam +
//                ", Omschrijving: " + reisOmschrijving +
//                ", Begindatum: " + beginDatum +
//                ", Einddatum: " + eindDatum;
//
//        return formData;
//    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReizen() {
        MijnReizen myReis = MijnReizen.getAlleReizen();
        List<Reis> reizen = MijnReizen.getAlleReizen().getAllCountries();
        return Response.ok(reizen).build();
    }

}