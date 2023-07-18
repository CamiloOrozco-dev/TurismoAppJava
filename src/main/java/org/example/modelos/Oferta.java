package org.example.modelos;

import org.example.validaciones.OfertaValidacion;

import java.util.Date;

public class Oferta {
   private Integer id;
    private  String titulo;
    private  String descripcion;
    private  Date fechaInicio;
    private  Date fechaFin;
    private  Double costoTotal;
    private Integer idLocal ;

    private OfertaValidacion validacion = new OfertaValidacion();
    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, Date fechaInicio, Date fechaFin, Double costoTotal, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoTotal = costoTotal;
        this.idLocal = idLocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {

        try {
            this.validacion.validarCaracteres(titulo);
            this.titulo = titulo;

        } catch (Exception error){
            System.out.print(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    //-DUDA-
    // Es necesario poner el try catch en las dos fechas?

    public void setFechaInicio(Date fechaInicio) {
        try{
            this.validacion.validarFecha(fechaInicio, fechaInicio);
            this.fechaInicio = fechaInicio;
        } catch (Exception error){
            System.out.print(error.getMessage());
        }

    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {

       try {
           this.validacion.validarCosto(costoTotal);
           this.costoTotal = costoTotal;
       }catch (Exception error){
           System.out.print(error.getMessage());
       }
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoTotal=" + costoTotal +
                ", idLocal=" + idLocal +
                ", validacion=" + validacion +
                '}';
    }
}