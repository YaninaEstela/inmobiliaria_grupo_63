/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Contrato {
    
    private int idContrato;
    private Inquilino inquilino;
    private Propiedad propiedad;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalDate fechaRealizacion;

    public Contrato() {
    }

    public Contrato(int idContrato, Inquilino inquilino, Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaRealizacion) {
        this.idContrato = idContrato;
        this.inquilino = inquilino;
        this.propiedad = propiedad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRealizacion = fechaRealizacion;
    }

    public Contrato(Inquilino inquilino, Propiedad propiedad, LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaRealizacion) {
        this.inquilino = inquilino;
        this.propiedad = propiedad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRealizacion = fechaRealizacion;
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

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", inquilino=" + inquilino + ", propiedad=" + propiedad + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", fechaRealizacion=" + fechaRealizacion + '}';
    }
    
    
    
    
}
