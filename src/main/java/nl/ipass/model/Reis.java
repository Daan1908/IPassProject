package nl.ipass.model;

public class Reis {
    private String reisNaam;
    private String continent;
    private int aantalPersonen;
    private int aantalDagen;

    public Reis(String nm, int aanprs, String cont, int aandg) {
        this.reisNaam = nm;
        this.continent = cont;
        this.aantalPersonen = aanprs;
        this.aantalDagen = aandg;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public String getNaam() {
        return reisNaam;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }
    public String getContintent() {
        return continent;
    }

}
