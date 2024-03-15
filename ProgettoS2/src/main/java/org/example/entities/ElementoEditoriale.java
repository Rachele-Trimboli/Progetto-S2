package org.example.entities;

import java.time.LocalDate;
import java.util.Random;

abstract class ElementoEditoriale {

    private int ISBN;
    private String titolo;
    private LocalDate annoPublicazione;
    private int pagine;

    public ElementoEditoriale(String titolo, LocalDate annoPublicazione){
        this.ISBN=generateIsbn();
        this.titolo=titolo;
        this.annoPublicazione=annoPublicazione;
        this.pagine=generatePagine();
    }

    public int getISBN() {
        return ISBN;
    }

    public LocalDate getAnnoPublicazione() {
        return annoPublicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getPagine() {
        return pagine;
    }

    public int generateIsbn(){
        Random random = new Random();
        return random.nextInt(400,1000);

    }

    public int generatePagine(){
        Random random = new Random();
        return random.nextInt(10,400);

    }

    @Override
    public String toString() {
        return "ElementoEditoriale{" +
                "ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", pagine=" + pagine +
                '}';
    }
}
