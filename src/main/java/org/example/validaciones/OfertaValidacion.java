package org.example.validaciones;

import org.example.utilidades.Util;

import java.util.Date;

public class OfertaValidacion {

    protected Util util = new Util();

    public OfertaValidacion (){}

    public Boolean validarCaracteres (String titulo ) throws  Exception{
        String expresionRegular = "^[a-zA-ZñÑ ]+$";
        if (!Util.buscarCoincidencia(expresionRegular, titulo)){
            throw new Exception("Señor Usuario solo se permiten letras en este campo");
        } else if (titulo.length() < 20 ) {
            throw new Exception("Señor Usuario el numero de caracteres para la oferta debe ser menor a 20");
        }

        return true;
    }

    public boolean validarFecha (Date fechaInicio, Date fechaFin) throws Exception{
        if (fechaInicio.after(fechaFin)) {
            throw new Exception("Señor Usuario, la fecha de inicio no puede ser mayor a la fecha de fin ");
        }
        //-DUDA-
        //Es necesario crear validacion para las dos fechas (fechaInicio, fechaFin)?
        return true;
    }

    public Boolean validarCosto (Double costoTotal) throws Exception {
        //TODO:: Consultar con el profe otro posble metodo para validar el Double
        if (costoTotal <0 ){
            throw new Exception("El valor del costo por persona no puede ser negativo");
        }
        return true;
    }
}




//- Todas las fechas deben tener el formato (DD/MM/YYYY)
