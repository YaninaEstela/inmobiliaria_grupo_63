/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author USUARIO
 */
public class Inquilino {
    
    private int idInquilino;
    private String nombreInquilino;
    private String apellidoInquilino;
    private int dniInquilino;
    private String detalleInquilino;
    private String tipoInquilino;
    private boolean estadoInquilino;

    public Inquilino() {
    }

    public Inquilino(int idInquilino, String nombreInquilino, String apellidoInquilino, int dniInquilino, String detalleInquilino, String tipoInquilino, boolean estadoInquilino) {
        this.idInquilino = idInquilino;
        this.nombreInquilino = nombreInquilino;
        this.apellidoInquilino = apellidoInquilino;
        this.dniInquilino = dniInquilino;
        this.detalleInquilino = detalleInquilino;
        this.tipoInquilino = tipoInquilino;
        this.estadoInquilino = estadoInquilino;
    }

    public Inquilino(String nombreInquilino, String apellidoInquilino, int dniInquilino, String detalleInquilino, String tipoInquilino, boolean estadoInquilino) {
        this.nombreInquilino = nombreInquilino;
        this.apellidoInquilino = apellidoInquilino;
        this.dniInquilino = dniInquilino;
        this.detalleInquilino = detalleInquilino;
        this.tipoInquilino = tipoInquilino;
        this.estadoInquilino = estadoInquilino;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public String getNombreInquilino() {
        return nombreInquilino;
    }

    public void setNombreInquilino(String nombreInquilino) {
        this.nombreInquilino = nombreInquilino;
    }

    public String getApellidoInquilino() {
        return apellidoInquilino;
    }

    public void setApellidoInquilino(String apellidoInquilino) {
        this.apellidoInquilino = apellidoInquilino;
    }

    public int getDniInquilino() {
        return dniInquilino;
    }

    public void setDniInquilino(int dniInquilino) {
        this.dniInquilino = dniInquilino;
    }

    public String getDetalleInquilino() {
        return detalleInquilino;
    }

    public void setDetalleInquilino(String detalleInquilino) {
        this.detalleInquilino = detalleInquilino;
    }

    public String getTipoInquilino() {
        return tipoInquilino;
    }

    public void setTipoInquilino(String tipoInquilino) {
        this.tipoInquilino = tipoInquilino;
    }

    public boolean isEstadoInquilino() {
        return estadoInquilino;
    }

    public void setEstadoInquilino(boolean estadoInquilino) {
        this.estadoInquilino = estadoInquilino;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "idInquilino=" + idInquilino + ", nombreInquilino=" + nombreInquilino + ", apellidoInquilino=" + apellidoInquilino + ", dniInquilino=" + dniInquilino + ", detalleInquilino=" + detalleInquilino + ", tipoInquilino=" + tipoInquilino + ", estadoInquilino=" + estadoInquilino + '}';
    }
    
    
    
}
