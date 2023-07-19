package org.example.utilidades;

public enum Mensajes {

    NOMBRE_SOLO_LETRAS ("Señor usuario, este campo solo recibe letras"),
    NOMBRE_MUY_CORTO ("Señor Usuario, el nombre es demasiado corto debe tener al menos 10 caracteres"),
    CORREO_INVALIDO ("Señor Usuario el correo ingresado no es valido"),
    CARACTERES_EMPRESA ("Señor Usuario el nombre de la empresa no puede sobrepasar los 30 caracteres"),
    NUMEROS_ENTEROS ("Señor Usuario solo se permiten numero enteros en este campo"),
    NIT_MUY_CORTO ("El numero de nit debe ser mayor a diez digitos"),
    CARACTERES_OFERTA ("Señor Usuario el numero de caracteres para la oferta debe ser menor a 20"),
    COHERENCIA_FECHAS ("Señor Usuario, la fecha de inicio no puede ser mayor a la fecha de fin "),
    CANTIDAD_PERSONAS ("La cantidad de personas por reserva debe ser menor a 4 personas"),
    VALOR_COSTO ("El valor del costo por persona no puede ser negativo"),
    FORMATO_FECHA_INVALIDO ("El formato de fecha no es valido"),
    ZONA_INVALIDA  ("Señor Usuario la zona no es valida, debe ser del 1 al 4");



    private String mensaje;

    Mensajes (String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
