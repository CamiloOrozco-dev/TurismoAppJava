package org.example.validaciones;

import org.example.utilidades.Util;


public class UsuarioValidacion {

    protected Util util = new Util();
    public UsuarioValidacion() {}

    //Metodos ordinarios para validar datos
    public Boolean validarNombre(String nombres) throws Exception {
        String expresionRegular = "^[a-zA-Z]+$";
        if (!util.buscarCoincidencia(expresionRegular, nombres)) {
            throw new Exception("Señor Usuario su nombre solo puede tener letras");
        } else if (nombres.length() < 10) {
            throw new Exception("Señor Usuario revisa la cantidad de caracteres, debe ser mayor o igual a 10 caracteres");

        } else {
            return true;
        }
    }
    public Boolean validarCorreoElectronico (String correoElectronico) throws Exception{
        String expresionRegular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!util.buscarCoincidencia (expresionRegular, correoElectronico)){
            throw new Exception (" El correo electronico que ingresaste no es valido ");
        } else {
            return true;
        }

    }
    public Boolean validarUbicacion (Integer ubicacion) throws  Exception{
        if (ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)){
            return true;
        } else {
        throw new Exception("la sona ingresada no es valida ");
        }
    }
}

