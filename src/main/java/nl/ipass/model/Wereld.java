package nl.ipass.model;

import java.util.ArrayList;
import java.util.List;

public class Wereld {
    private ArrayList<Land> alleLanden = new ArrayList<Land>();

    Wereld() {
        alleLanden.add(new Land("Nederland", "Amsterdam", 17.5, "NLD"));
        alleLanden.add(new Land("België", "Brussel", 11.6, "BLG"));
        alleLanden.add(new Land("Luxemburg", "Luxemburg", 0.5, "LUX"));
        alleLanden.add(new Land("Duitsland", "Berlijn", 83.2, "DEU"));
        alleLanden.add(new Land("Denemarken", "Kopenhagen", 5.5, "DNK"));
        alleLanden.add(new Land("Frankrijk", "Parijs", 67.7, "FRA"));
        alleLanden.add(new Land("Spanje", "Madrid", 47.2, "ESP"));
        alleLanden.add(new Land("Engeland", "Londen", 56.0, "ENG"));
        alleLanden.add(new Land("Zwitserland", "Zurich", 8.7, "CHE"));
        alleLanden.add(new Land("Oostenrijk", "Wenen", 8.0, "AUT"));

    }

    public ArrayList<Land> getAlleLanden() {
        return alleLanden;
    }

}
