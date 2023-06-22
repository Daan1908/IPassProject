package nl.ipass.model;

public class Reis {
    private String naam;
    private int aantalPersonen;
    private String continent;
    private int aantalDagen;

    public Reis(String nm, int aanprs, String cont, int aandg) {
        this.naam = nm;
        this.aantalPersonen = aanprs;
        this.continent = cont;
        this.aantalDagen = aandg;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }
    public String getContintent() {
        return continent;
    }

}
