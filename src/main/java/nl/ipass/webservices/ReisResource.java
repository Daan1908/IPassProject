package nl.ipass.webservices;

import nl.ipass.model.Reis;
import nl.ipass.model.MijnReizen;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URL;
import java.util.List;

@Path("reizen")
public class ReisResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReizen() {
        MijnReizen myReis = MijnReizen.getAlleReizen();
        List<Reis> reizen = MijnReizen.getAlleReizen().getAllCountries();
        return Response.ok(reizen).build();
    }
    @Path("nieuwereis")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Reis createReis(@FormParam("reisNaam") String reisNaam,
                             @FormParam("aantalPersonen") int aantalPersonen,
                             @FormParam("continent") String continent,
                             @FormParam("aantalDagen") int aantalDagen) {
        Reis reis = new Reis(reisNaam, aantalPersonen, continent, aantalDagen);
        MijnReizen.voegToeAanLijst(reis);
/*
        JsonArrayBuilder jab = Json.createArrayBuilder();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("reisNaam", reisNaam);
        job.add("aantalPersonen", aantalPersonen);
        job.add("continent", continent);
        job.add("aantalDagen", aantalDagen);
        jab.add(job);
        JsonArray array = jab.build();
*/
        return reis;
    }

    @Path("verwijderreis")
    @GET
    public void deleteReis(@QueryParam("id") int id) {
//      System.out.println("Header parameter id : " + id);
        MijnReizen.verwijderVanLijst(id);
    }

    @Path("updatereis")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Reis updateReis(@FormParam("id") int id,
                           @FormParam("reisNaam") String reisNaam,
                           @FormParam("aantalPersonen") int aantalPersonen,
                           @FormParam("continent") String continent,
                           @FormParam("aantalDagen") int aantalDagen) {

        Reis reis = new Reis(reisNaam, aantalPersonen, continent, aantalDagen);
        MijnReizen.muteerInLijst(id, reis);
        return reis;
    }


}