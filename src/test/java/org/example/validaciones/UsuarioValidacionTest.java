package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class UsuarioValidacionTest {

    //1. PREPARANDO
    //Provando el objeto UsuarioValidación

   private UsuarioValidacion usuarioValidacion;

  @BeforeEach
   public void setUp(){
      this.usuarioValidacion = new UsuarioValidacion();

   }
   @Test

   public void validarNombreUsuarioCorrecto (){
         String nombreValido = "Juan Jose Gallego Mesa"; // preparando
      //2 y 3 Ejecutar y verificar
     Assertions.assertDoesNotThrow(()->usuarioValidacion.validarNombre(nombreValido));
   }

   @Test

   public void validarNombreUsuarioIncorrecto () {

      String nombreInvalido =" Juan 1203 Gallego Mesa "; //Preparando
       //Ejecuto y verifico
       Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombre(nombreInvalido));
       Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(),exception.getMessage());

   }
}