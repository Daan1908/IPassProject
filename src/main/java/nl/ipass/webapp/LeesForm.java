package nl.ipass.webapp;

import nl.ipass.model.FormData;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

public class LeesForm {
    @POST
    @Path("/ReisToevoegen.html")
    @Produces("application/json")
    public Response leesData(FormData formData) {
        String reisNaam = formData.getName();
        String reisOmschrijving = formData.getReisOmschrijving();
        return Response.ok("Form data received successfully").build();
    }

}
