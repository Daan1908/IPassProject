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
import java.io.FileWriter;
import java.io.IOException;
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
    public Reis createReis(@FormParam("reisNaam") String name,
                             @FormParam("aantalPersonen") int aantalPersonen,
                             @FormParam("continent") String continent,
                             @FormParam("aantalDagen") int aantalDagen) {
        Reis reis = new Reis(name, aantalPersonen, continent, aantalDagen);
        MijnReizen.voegToeAanLijst1(reis);

        JsonArrayBuilder jab = Json.createArrayBuilder();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("reisnaam", name);
        job.add("AantalPersonen", aantalPersonen);
        job.add("Continent", continent);
        job.add("AantalDagen", aantalDagen);
        jab.add(job);
        JsonArray array = jab.build();

        try {
            FileWriter file = new FileWriter("C:/Users/Daan/IdeaProjects/IPass/src/main/java/nl/ipass/Reizen.json");
            file.write(array.toString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return reis;
    }

}