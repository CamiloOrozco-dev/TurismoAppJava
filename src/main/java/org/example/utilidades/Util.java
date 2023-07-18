package org.example.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    private static final String formatoPredeterminado = "dd/MM/yyyy";
    public static Boolean buscarCoincidencia(String expresionRegular, String cadena){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher emparejador = patron.matcher(cadena);
        if (emparejador.matches()) {
            return true;
        } else {
            return false;
        }
    }
    //TODO:: Terminar el metodo para cambiar formato de fecha
    public static String formatearFecha (String fecha, String formatoEntrada, String formatoSalida) throws ParseException {
        SimpleDateFormat entradaFormatoFecha = new SimpleDateFormat(formatoEntrada);
        SimpleDateFormat salidaFormatoFecha = new SimpleDateFormat(formatoSalida);
        Date formatoFecha = entradaFormatoFecha.parse(fecha);
        return salidaFormatoFecha.format(formatoFecha);

    }
}
