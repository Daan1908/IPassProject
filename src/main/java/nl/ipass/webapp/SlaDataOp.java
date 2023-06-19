package nl.ipass.webapp;


import nl.ipass.webapp.LeesForm;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SlaDataOp {
    public static void main(String[] args) {
        // Collect the form data
        String reisNaam = args.length > 0 ? args[0] : "";
        String reisOmschrijving = args.length > 1 ? args[1] : "";

        // Create a JSON object
        JsonObject jsonObject = createJsonObject(reisNaam, reisOmschrijving);

        // Write the JSON object to an object file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            JsonWriter jsonWriter = Json.createWriter(objectOutputStream);
            jsonWriter.writeObject(jsonObject);
            jsonWriter.close();

            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("JSON object stored in data.obj");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JsonObject createJsonObject(String reisNaam, String reisOmschrijving) {
        return Json.createObjectBuilder()
                .add("reisNaam", reisNaam)
                .add("reisOmschrijving", reisOmschrijving)
                .build();
    }
}