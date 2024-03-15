package org.example.entities;

import java.time.LocalDate;
import java.util.Random;

public abstract class ElementoEditoriale {

    protected int ISBN;
    protected String titolo;
    protected LocalDate annoPublicazione;
    protected int pagine;

    public ElementoEditoriale(String titolo, LocalDate annoPublicazione, int ISBN){
        this.ISBN=ISBN;
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
