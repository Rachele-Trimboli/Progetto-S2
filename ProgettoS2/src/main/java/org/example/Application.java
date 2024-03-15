package org.example;

import com.github.javafaker.Faker;
import org.example.entities.Libro;
import org.example.entities.Periodicità;
import org.example.entities.Rivista;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Faker faker= new Faker(Locale.ITALY);
        Scanner scanner = new Scanner(System.in);

        //CREAZIONE LIBRI
        Libro l1 = new Libro(faker.book().title(), LocalDate.of(2024, 2, 15 ), faker.book().author(),faker.book().genre());
        Libro l2 = new Libro(faker.book().title(), LocalDate.of(2015,1,13), faker.book().author(),faker.book().genre());
        Libro l3 = new Libro(faker.book().title(), LocalDate.of(2020,11,1), faker.book().author(),faker.book().genre());
        Libro l4 = new Libro(faker.book().title(), LocalDate.of(2004,5,10), faker.book().author(),faker.book().genre());
        Libro l5 = new Libro(faker.book().title(), LocalDate.of(2003,6,9), faker.book().author(),faker.book().genre());
        Libro l6 = new Libro(faker.book().title(), LocalDate.of(2000,11,14), faker.book().author(),faker.book().genre());
        Libro l7 = new Libro(faker.book().title(), LocalDate.of(1980,3,8), faker.book().author(),faker.book().genre());

        //CREAZIONE RIVISTE
        Rivista r1 = new Rivista("ELLE DECOR Italia",LocalDate.of(2010, 1, 1), Periodicità.SEMESTRALE);
        Rivista r2 = new Rivista("MARIE CLAIRE Italia",LocalDate.of(2010, 1, 1), Periodicità.SETTIMANALE);
        Rivista r3 = new Rivista("Icon",LocalDate.of(2010, 1, 1), Periodicità.MENSILE);
        Rivista r4 = new Rivista("Grazia",LocalDate.of(2010, 1, 1), Periodicità.MENSILE);
        Rivista r5 = new Rivista("COSMOPOLITAN Italia",LocalDate.of(2010, 1, 1), Periodicità.MENSILE);
        Rivista r6 = new Rivista("ESQUIRE Italia",LocalDate.of(2010, 1, 1), Periodicità.SETTIMANALE);
        Rivista r7 = new Rivista("Time Magazine Europe",LocalDate.of(2010, 1, 1), Periodicità.SEMESTRALE);
    }
}
