package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion ofertaValidacion;

    @BeforeEach

    public void setUp (){
        this.ofertaValidacion = new OfertaValidacion();
    }
    @Test
    public void validarTituloOfertaCorrecto (){

        String tituloCorrecto= "Venta de bolsos y reposteria";

        Assertions.assertDoesNotThrow(()->ofertaValidacion.validarCaracteres(tituloCorrecto));
    }

    @Test
    public void validarTituloOfertaIncorrecto (){

        String tituloIncorrecto = "Eventoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
       Exception exception = Assertions.assertThrows(Exception.class,()->ofertaValidacion.validarCaracteres(tituloIncorrecto));
       Assertions.assertEquals(Mensajes.CARACTERES_OFERTA.getMensaje(),exception.getMessage());
    }

}