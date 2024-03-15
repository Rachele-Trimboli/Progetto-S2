package org.example.entities;


import java.util.Random;

public abstract class ElementoEditoriale {

    protected int ISBN;
    protected String titolo;
    protected int annoPublicazione;
    protected int pagine;

    public ElementoEditoriale(String titolo, int annoPublicazione, int ISBN){
        this.ISBN=ISBN;
        this.titolo=titolo;
        this.annoPublicazione=annoPublicazione;
        this.pagine=generatePagine();
    }

    public int getISBN() {
        return ISBN;
    }

    public int getAnnoPublicazione() {
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
