package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
        private  Usuario usuario;

        @BeforeEach
    public void setUp (){
            this.usuario = new Usuario();
        };

        @Test

    public void setCorrectoNombres (){
            String nombreValido = "Geronimo Garcia"; //Preparando
            this.usuario.setNombres(nombreValido); //Probando
            Assertions.assertEquals(nombreValido,usuario.getNombres());
            Assertions.assertNotNull(usuario.getNombres());
        }

    @Test

    public void setIncorrectoNombres (){
            String nombreInvalido = "Juanjo123 gallego";
            this.usuario.setNombres(nombreInvalido);
            Assertions.assertNotEquals(nombreInvalido, usuario.getNombres());

    }

    //TODO::   Terminar validaciones de el resto de clases y metodos   


}