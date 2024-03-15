package org.example;

import com.github.javafaker.Faker;
import org.example.entities.ElementoEditoriale;
import org.example.entities.Libro;
import org.example.entities.Periodicità;
import org.example.entities.Rivista;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Application {

    public static void main(String[] args) {

        Faker faker= new Faker(Locale.ITALY);
        Scanner scanner = new Scanner(System.in);

        //CREAZIONE LIBRI
        Libro l1 = new Libro(faker.book().title(), LocalDate.of(2024, 2, 15 ),1000, faker.book().author(),faker.book().genre());
        Libro l2 = new Libro(faker.book().title(), LocalDate.of(2015,1,13),200, faker.book().author(),faker.book().genre());
        Libro l3 = new Libro(faker.book().title(), LocalDate.of(2020,11,1),500, faker.book().author(),faker.book().genre());
        Libro l4 = new Libro(faker.book().title(), LocalDate.of(2004,5,10),400, faker.book().author(),faker.book().genre());
        Libro l5 = new Libro(faker.book().title(), LocalDate.of(2003,6,9),371, faker.book().author(),faker.book().genre());
        Libro l6 = new Libro(faker.book().title(), LocalDate.of(2000,11,14),375, faker.book().author(),faker.book().genre());
        Libro l7 = new Libro(faker.book().title(), LocalDate.of(1980,3,8),402, faker.book().author(),faker.book().genre());

        //CREAZIONE RIVISTE
        Rivista r1 = new Rivista("ELLE DECOR Italia",LocalDate.of(2010, 1, 1),201, Periodicità.SEMESTRALE);
        Rivista r2 = new Rivista("MARIE CLAIRE Italia",LocalDate.of(2010, 1, 1),202, Periodicità.SETTIMANALE);
        Rivista r3 = new Rivista("Icon",LocalDate.of(2010, 1, 1),404, Periodicità.MENSILE);
        Rivista r4 = new Rivista("Grazia",LocalDate.of(2010, 1, 1),403, Periodicità.MENSILE);
        Rivista r5 = new Rivista("COSMOPOLITAN Italia",LocalDate.of(2010, 1, 1),308, Periodicità.MENSILE);
        Rivista r6 = new Rivista("ESQUIRE Italia",LocalDate.of(2010, 1, 1),402, Periodicità.SETTIMANALE);
        Rivista r7 = new Rivista("Time Magazine Europe",LocalDate.of(2010, 1, 1), 808,Periodicità.SEMESTRALE);

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

        rimozionePerISBN(archivio,308);

    }


    public static void rimozionePerISBN(List<ElementoEditoriale> archivio, int ISBN) {
        archivio.stream().map(elemento->elemento.getISBN()).forEach((elem)-> System.out.println());
    }

}
