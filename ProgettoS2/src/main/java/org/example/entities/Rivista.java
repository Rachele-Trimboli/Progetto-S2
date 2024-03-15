package org.example.entities;

import java.time.LocalDate;

public class Rivista extends ElementoEditoriale {

    private Periodicità periodicità;
    public Rivista(String titolo, LocalDate annoPublicazione, Periodicità periodicità) {
        super(titolo, annoPublicazione);
        this.periodicità=periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    @Override
    public LocalDate getAnnoPublicazione() {
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
}
