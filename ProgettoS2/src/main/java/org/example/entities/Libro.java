package org.example.entities;

import java.time.LocalDate;

public class Libro extends ElementoEditoriale {

    private String autore;
    private String genere;
    public Libro(String titolo, LocalDate annoPublicazione, String autore, String genere) {
        super(titolo, annoPublicazione);
        this.autore=autore;
        this.genere=genere;

    }

    @Override
    public int getISBN() {
        return super.getISBN();
    }

    @Override
    public LocalDate getAnnoPublicazione() {
        return super.getAnnoPublicazione();
    }

    @Override
    public int getPagine() {
        return super.getPagine();
    }

    @Override
    public String getTitolo() {
        return super.getTitolo();
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
