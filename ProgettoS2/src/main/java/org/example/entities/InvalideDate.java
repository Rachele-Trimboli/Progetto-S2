package org.example.entities;

import java.time.LocalDate;

public class InvalideDate extends Exception{
    public InvalideDate(LocalDate date){
        super("Il formato inserito non è una data " + date);
    }
}
