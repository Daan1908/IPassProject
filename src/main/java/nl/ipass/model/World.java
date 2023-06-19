package nl.ipass.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class World {
    private List<Land> allCountries = new ArrayList<Land>();

    private static World my_world = new World();

    public static World getWorld() {
        return my_world;
    }

    public static void setWorld(World world) {
        my_world = world;
    }

    private World() {
        allCountries.add(new Land("CN", "CHN", "China", "Beijing", "Asia", "Eastern Asia",1277558000, "People'sRepublic"));
        allCountries.add(new Land("IN", "IND", "India", "New Delhi", "Asia", "Southern and Central Asia", 1013662000, "Federal Republic"));
        allCountries.add(new Land("US", "USA", "United States", "Washington DC", "North America", "North America",  278357000, "Federal Republic"));
        allCountries.add(new Land("ID", "IDN", "Indonesia", "Jakarta", "Asia", "Southeast Asia",  212107000, "Republic"));
        allCountries.add(new Land("BR", "BRA", "Brazil", "Brasilia", "South America", "South America", 170115000, "Federal Republic"));
        allCountries.add(new Land("PK", "PAK", "Pakistan", "Islamabad", "Asia", "Southern and Central Asia", 156483000, "Republic"));
        allCountries.add(new Land("RU", "RUS", "Russian Federation", "Moscow", "Europe", "Eastern Europe", 146934000, "Federal Republic"));
        allCountries.add(new Land("BD", "BGD", "Bangladesh", "Dhaka", "Asia", "Southern and Central Asia", 129155000, "Republic"));
        allCountries.add(new Land("JP", "JPN", "Japan", "Tokyo", "Asia", "Eastern Asia", 126714000, "Constitutional Monarchy"));
        allCountries.add(new Land("NG", "NGA", "Nigeria", "Abuja", "Africa", "Western Africa", 111506000, "Federal Republic"));
        allCountries.add(new Land("AQ", "ATA", "Antarctica", "Antarctica", "Antarctica", "Antarctica", 0, "Co-administrated"));
        allCountries.add(new Land("NL", "NLD", "The Netherlands", "Amsterdam", "Europe", "West-Europe", 17100475, "Constitutional Monarchy, Unitary parliamentary"));
        allCountries.add(new Land("CA", "CAN", "Canada", "Ottawa", "North America", "North America",31147000, "Constitutional Monarchy, Federation"));
        allCountries.add(new Land("AU", "AUS", "Australia", "Canberra", "Oceania", "Australia and New Zealand", 18886000, "Constitutional Monarchy, Federation"));
        allCountries.add(new Land("AR", "ARG", "Argentina", "Buenos Aires", "South America", "South America", 37032000, "Federal Republic"));
        allCountries.add(new Land("KZ", "KAZ", "Kazakstan", "Astana", "Asia", "Southern and Central Asia",  16223000, "Republic"));
    }

    public List<Land> getAllCountries() {
        return allCountries;
    }
}