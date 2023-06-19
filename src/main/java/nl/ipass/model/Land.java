package nl.ipass.model;

public class Land {
    private String code;
    private String iso3;
    private String name;
    private String capital;
    private String continent;
    private String region;
    private int population;
    private String government;
    public Land(String code, String iso3, String nm, String cap, String ct, String reg, int pop, String gov) {
        this.code = code;
        this.iso3 = iso3;
        this.name = nm;
        this.capital = cap;
        this.continent = ct;
        this.region = reg;
        this.population = pop;
        this.government = gov;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public String getGovernment() {
        return government;
    }

}
