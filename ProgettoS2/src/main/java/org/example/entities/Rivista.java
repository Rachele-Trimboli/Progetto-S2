package org.example.entities;

import java.time.LocalDate;

public class Rivista extends ElementoEditoriale {

    private Periodicità periodicità;
    public Rivista(String titolo, int annoPublicazione, int ISBN, Periodicità periodicità) {
        super(titolo, annoPublicazione, ISBN);
        this.periodicità=periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    @Override
    public int getAnnoPublicazione() {
        return super.getAnnoPublicazione();
    }

    @Override
    public String getTitolo() {
        return super.getTitolo();
    }

    @Override
    public int getISBN() {
        return super.getISBN();
    }

    @Override
    public int getPagine() {
        return super.getPagine();
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicità=" + periodicità +
                ", ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", pagine=" + pagine +
                '}';
    }
}
