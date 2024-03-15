package org.example.entities;

public class InvalidString extends Exception{

        public InvalidString(String stringa){
            super("Il dato inserito non è una stringa" + stringa);
        }
}
