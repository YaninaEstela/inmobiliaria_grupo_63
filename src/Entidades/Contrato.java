
package Entidades;

import java.time.LocalDate;


public class Contrato {
    
    private int idContrato;
    private Inquilino inquilino;
    private Propiedad propiedad;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalDate fechaRealizacion;
    private boolean estadoContrato;

    public Contrato() {
    }

    public Contrato(Inquilino inquilino, Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaRealizacion, boolean estadoContrato) {
        this.inquilino = inquilino;
        this.propiedad = propiedad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRealizacion = fechaRealizacion;
        this.estadoContrato = estadoContrato;
    }

    public Contrato(int idContrato, Inquilino inquilino, Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaRealizacion, boolean estadoContrato) {
        this.idContrato = idContrato;
        this.inquilino = inquilino;
        this.propiedad = propiedad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRealizacion = fechaRealizacion;
        this.estadoContrato = estadoContrato;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public boolean isEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(boolean estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", inquilino=" + inquilino + ", propiedad=" + propiedad + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", fechaRealizacion=" + fechaRealizacion + ", estadoContrato=" + estadoContrato + '}';
    }

    
    
    
}
