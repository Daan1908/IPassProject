package nl.ipass.model;

public class FormData {
    private String reisNaam;
    private String reisOmschrijving;

    public String getName() {
        return reisNaam;
    }

    public void setName(String nm) {
        this.reisNaam = nm;
    }

    public String getReisOmschrijving() {
        return reisOmschrijving;
    }

    public void setReisOmschrijving(String reisOmschrijving) {
        this.reisOmschrijving = reisOmschrijving;
    }
}