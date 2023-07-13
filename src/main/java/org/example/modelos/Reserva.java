package org.example.modelos;

public class Reserva {

   private Integer id;
    private Integer idUsuario;
    private   Integer idOferta;
    private  Double fechaReserva;

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.fechaReserva = fechaReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Double fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}