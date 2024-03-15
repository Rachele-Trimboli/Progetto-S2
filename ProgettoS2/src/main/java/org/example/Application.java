package org.example;

import com.github.javafaker.Faker;

import org.apache.commons.io.FileUtils;
import org.example.entities.ElementoEditoriale;
import org.example.entities.Libro;
import org.example.entities.Periodicità;
import org.example.entities.Rivista;
import java.io.File;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class Application {

    public static void main(String[] args) {

        Faker faker = new Faker(Locale.ITALY);
        Scanner scanner = new Scanner(System.in);

        //CREAZIONE LIBRI
        Libro l1 = new Libro(faker.book().title(), 2024, 1000, faker.book().author(), faker.book().genre());
        Libro l2 = new Libro(faker.book().title(), 2015, 200, faker.book().author(), faker.book().genre());
        Libro l3 = new Libro(faker.book().title(), 2020, 500, faker.book().author(), faker.book().genre());
        Libro l4 = new Libro(faker.book().title(), 2004, 400, faker.book().author(), faker.book().genre());
        Libro l5 = new Libro(faker.book().title(), 2003, 371, faker.book().author(), faker.book().genre());
        Libro l6 = new Libro(faker.book().title(), 2000, 375, faker.book().author(), faker.book().genre());
        Libro l7 = new Libro(faker.book().title(), 1980, 402, "Mario Rossi", faker.book().genre());

        //CREAZIONE RIVISTE
        Rivista r1 = new Rivista("ELLE DECOR Italia", 2010, 201, Periodicità.SEMESTRALE);
        Rivista r2 = new Rivista("MARIE CLAIRE Italia", 2011, 202, Periodicità.SETTIMANALE);
        Rivista r3 = new Rivista("Icon", 2015, 404, Periodicità.MENSILE);
        Rivista r4 = new Rivista("Grazia", 2022, 403, Periodicità.MENSILE);
        Rivista r5 = new Rivista("COSMOPOLITAN Italia", 2003, 308, Periodicità.MENSILE);
        Rivista r6 = new Rivista("ESQUIRE Italia", 2004, 402, Periodicità.SETTIMANALE);
        Rivista r7 = new Rivista("Time Magazine Europe", 2024, 808, Periodicità.SEMESTRALE);

        //CREAZIONE DI UN ARCHIVIO
        List<ElementoEditoriale> archivio = new ArrayList<>();

        //AGGIUNTA ELEMENTI NELL'ARCHIVIO
        archivio.add(l1);
        archivio.add(l2);
        archivio.add(l3);
        archivio.add(l4);
        archivio.add(l5);
        archivio.add(l6);
        archivio.add(l7);
        archivio.add(r1);
        archivio.add(r2);
        archivio.add(r3);
        archivio.add(r4);
        archivio.add(r5);
        archivio.add(r6);
        archivio.add(r7);
        System.out.println(archivio);


        // INSERIRE UN LIBRO CON INPUT
//        System.out.println("Inserisci nell'archivio un libro, digita il titolo");
//        String titolo = scanner.nextLine();
//        System.out.println("Inserisci la data di pubblicazione");
//        try {
//            LocalDate data = LocalDate.parse(scanner.nextLine());
//            System.out.println("Inserisci il nome dell'autore");
//            String autore = scanner.nextLine();
//            System.out.println("Inserisci il genere del libro");
//            String genere = scanner.nextLine();
//            Libro libroInput = new Libro(titolo,data,autore,genere);
//            System.out.println(libroInput);
//            archivio.add(libroInput);
//        } catch (DateTimeParseException e) {
//            System.out.println("Formato data non valido. Inserisci la data nel formato corretto (AAAA-MM-GG).");
//        }
//        finally {
//            scanner.close();
//        }

        rimozionePerISBN(archivio, 308);
        System.out.println(archivio);

        ricercaPerIsbn(archivio, 200);

        ricercaPerAnno(archivio, 2000);

        ricercaPerAutore(archivio, "Mario Rossi");



        //CREAZIONE FILE DI TESTO
        File file = new File("src/output.txt");
        try {

            for (int i =0;i<archivio.size();i++){
                FileUtils.writeStringToFile(file, archivio.get(i) + System.lineSeparator(), StandardCharsets.UTF_8, true);
            }

            String contenuto = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println("CONTENUTO FILE");
            System.out.println(contenuto);

        } catch (IOException e) {
            System.err.println("Errore durante la gestione del file: " + e.getMessage());
            e.printStackTrace();
        }

        //RIPESCAGGIO CONTENUTO DAL FILE DI TESTO
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }


            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    //METODI
    public static void rimozionePerISBN(List<ElementoEditoriale> archivio, int ISBN) {
        archivio.stream()
                .map(elementoEditoriale->elementoEditoriale.getISBN())
                .filter(isbn -> isbn == ISBN)
                .findFirst()
                .ifPresent(isbn -> archivio.removeIf(elemento -> elemento.getISBN() == isbn));
    }

    public static void ricercaPerIsbn(List<ElementoEditoriale> archivio, int ISBN) {
        archivio.stream()
                .filter(elemento -> elemento.getISBN() == ISBN)
                .forEach(System.out::println);
    }
    public static void ricercaPerAnno(List<ElementoEditoriale> archivio, int anno) {
        archivio.stream()
                .filter(elemento -> elemento.getAnnoPublicazione() == anno)
                .forEach(System.out::println);
    }
    public static void ricercaPerAutore(List<ElementoEditoriale> archivio, String autore) {
        archivio.stream()
                .filter(elementoEditoriale -> elementoEditoriale instanceof Libro)
                .map(elemento -> (Libro) elemento)
                .filter(libro -> libro.getAutore().equals(autore))
                .forEach(System.out::println);
    }



}


