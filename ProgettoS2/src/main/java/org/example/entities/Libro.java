package org.example.entities;

import java.time.LocalDate;

public class Libro extends ElementoEditoriale {


    private String autore;



    private String genere;
    public Libro(String titolo, int annoPublicazione,int ISBN, String autore, String genere) {
        super(titolo, annoPublicazione, ISBN);
        this.autore=autore;
        this.genere=genere;


    }

    @Override
    public int getISBN() {
        return super.getISBN();
    }

    @Override
    public int getAnnoPublicazione() {
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
                ", ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", pagine=" + pagine +
                '}';
    }
}
