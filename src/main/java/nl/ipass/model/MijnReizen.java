package nl.ipass.model;

import nl.ipass.FileManager;

import java.util.ArrayList;

public class MijnReizen implements java.io.Serializable {
    private static ArrayList<Reis> alleReizen = new ArrayList<>();

    private static MijnReizen my_reis = new MijnReizen();

    public static MijnReizen getAlleReizen() {
        return my_reis;
    }

    public static void setWorld(MijnReizen reis) {
        my_reis = reis;
    }

    private MijnReizen() {
          alleReizen = FileManager.ReadReis();
/*        alleReizen.add(new Reis("Thailand 2", 26, "Azie", 21));
       alleReizen.add(new Reis("Indonesie", 24, "Azie", 21));
      alleReizen.add(new Reis("Panama/Costarica", 22, "Noord-Amerika", 21));
        alleReizen.add(new Reis("Cuba", 22, "Noord-Amerika", 21));
        alleReizen.add(new Reis("Noorwegen 2", 3, "Europa", 21));
*/
    }

    public static void voegToeAanLijst(Reis reis) {
        if (alleReizen == null)
        {
            alleReizen = new ArrayList<>();
        }
        alleReizen.add(reis);
    }

    public ArrayList<Reis> getAllCountries() {
        return alleReizen;
    }
}
