package org.example.validaciones;

import org.example.utilidades.Util;

import java.util.concurrent.ExecutionException;

public class ReservaValidacion {

    protected Util util = new Util();

    public ReservaValidacion(){}

    public Boolean validarCantidadReserva (Integer cantidadUsuariosReserva) throws Exception {
        if (cantidadUsuariosReserva > 4 ){
            throw new Exception("La cantidad de personas por reserva debe ser menor a 4 personas");
        }
        return true;
    }
}
