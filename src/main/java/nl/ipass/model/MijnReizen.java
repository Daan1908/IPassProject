package nl.ipass.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MijnReizen {
    private static List<Reis> alleReizen = new ArrayList<>();

    private static MijnReizen my_reis = new MijnReizen();

    public static MijnReizen getAlleReizen() {
        return my_reis;
    }

    public static void setWorld(MijnReizen reis) {
        my_reis = reis;
    }

    private MijnReizen() {
        alleReizen.add(new Reis("Thailand", 26, "Azie", 21));
        alleReizen.add(new Reis("Indonesie", 24, "Azie", 21));
        alleReizen.add(new Reis("Panama/Costarica", 22, "Noord-Amerika", 21));
        alleReizen.add(new Reis("Cuba", 22, "Noord-Amerika", 21));
        alleReizen.add(new Reis("Noorwegen", 3, "Europa", 21));
    }

    public static void voegToeAanLijst1(Reis reis) {
        alleReizen.add(reis);
    }

    public List<Reis> getAllCountries() {
        return alleReizen;
    }

    public static void voegToeAanLijst(String naam, int aantalPersonen, String continent, int aantalDagen) {
        alleReizen.add(new Reis(naam, aantalPersonen, continent, aantalDagen));
    }
}
