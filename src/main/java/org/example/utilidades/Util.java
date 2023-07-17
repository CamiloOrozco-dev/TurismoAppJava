package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public static Boolean buscarCoincidencia(String expresionRegular, String cadena){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher emparejador = patron.matcher(cadena);
        if (emparejador.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
