/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author USUARIO
 */
public class Propiedad {
    
    private int idPropiedad;
    private Propietario propietario;
    private Inquilino inquilino;
    private String tipoPropiedad;
    private double precioTasadoPropiedad;
    private String zonaPropiedad;
    private double superficiePropiedad;
    private String direccionPropiedad;
    private boolean disponibilidadPropiedad;
    private int cantidadAmbientes;
    private int cantidadBanios;
    private boolean amueblado;
    private String descripcionPropiedad;
    private boolean estadoPropiedad;

    public Propiedad() {
    }

    public Propiedad(int idPropiedad, Propietario propietario, Inquilino inquilino, String tipoPropiedad, double precioTasadoPropiedad, String zonaPropiedad, double superficiePropiedad, String direccionPropiedad, boolean disponibilidadPropiedad, int cantidadAmbientes, int cantidadBanios, boolean amueblado, String descripcionPropiedad, boolean estadoPropiedad) {
        this.idPropiedad = idPropiedad;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.tipoPropiedad = tipoPropiedad;
        this.precioTasadoPropiedad = precioTasadoPropiedad;
        this.zonaPropiedad = zonaPropiedad;
        this.superficiePropiedad = superficiePropiedad;
        this.direccionPropiedad = direccionPropiedad;
        this.disponibilidadPropiedad = disponibilidadPropiedad;
        this.cantidadAmbientes = cantidadAmbientes;
        this.cantidadBanios = cantidadBanios;
        this.amueblado = amueblado;
        this.descripcionPropiedad = descripcionPropiedad;
        this.estadoPropiedad = estadoPropiedad;
    }

    public Propiedad(Propietario propietario, Inquilino inquilino, String tipoPropiedad, double precioTasadoPropiedad, String zonaPropiedad, double superficiePropiedad, String direccionPropiedad, boolean disponibilidadPropiedad, int cantidadAmbientes, int cantidadBanios, boolean amueblado, String descripcionPropiedad, boolean estadoPropiedad) {
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.tipoPropiedad = tipoPropiedad;
        this.precioTasadoPropiedad = precioTasadoPropiedad;
        this.zonaPropiedad = zonaPropiedad;
        this.superficiePropiedad = superficiePropiedad;
        this.direccionPropiedad = direccionPropiedad;
        this.disponibilidadPropiedad = disponibilidadPropiedad;
        this.cantidadAmbientes = cantidadAmbientes;
        this.cantidadBanios = cantidadBanios;
        this.amueblado = amueblado;
        this.descripcionPropiedad = descripcionPropiedad;
        this.estadoPropiedad = estadoPropiedad;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public double getPrecioTasadoPropiedad() {
        return precioTasadoPropiedad;
    }

    public void setPrecioTasadoPropiedad(double precioTasadoPropiedad) {
        this.precioTasadoPropiedad = precioTasadoPropiedad;
    }

    public String getZonaPropiedad() {
        return zonaPropiedad;
    }

    public void setZonaPropiedad(String zonaPropiedad) {
        this.zonaPropiedad = zonaPropiedad;
    }

    public double getSuperficiePropiedad() {
        return superficiePropiedad;
    }

    public void setSuperficiePropiedad(double superficiePropiedad) {
        this.superficiePropiedad = superficiePropiedad;
    }

    public String getDireccionPropiedad() {
        return direccionPropiedad;
    }

    public void setDireccionPropiedad(String direccionPropiedad) {
        this.direccionPropiedad = direccionPropiedad;
    }

    public boolean isDisponibilidadPropiedad() {
        return disponibilidadPropiedad;
    }

    public void setDisponibilidadPropiedad(boolean disponibilidadPropiedad) {
        this.disponibilidadPropiedad = disponibilidadPropiedad;
    }

    public int getCantidadAmbientes() {
        return cantidadAmbientes;
    }

    public void setCantidadAmbientes(int cantidadAmbientes) {
        this.cantidadAmbientes = cantidadAmbientes;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isAmueblado() {
        return amueblado;
    }

    public void setAmueblado(boolean amueblado) {
        this.amueblado = amueblado;
    }

    public String getDescripcionPropiedad() {
        return descripcionPropiedad;
    }

    public void setDescripcionPropiedad(String descripcionPropiedad) {
        this.descripcionPropiedad = descripcionPropiedad;
    }

    public boolean isEstadoPropiedad() {
        return estadoPropiedad;
    }

    public void setEstadoPropiedad(boolean estadoPropiedad) {
        this.estadoPropiedad = estadoPropiedad;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "idPropiedad=" + idPropiedad + ", propietario=" + propietario + ", inquilino=" + inquilino + ", tipoPropiedad=" + tipoPropiedad + ", precioTasadoPropiedad=" + precioTasadoPropiedad + ", zonaPropiedad=" + zonaPropiedad + ", superficiePropiedad=" + superficiePropiedad + ", direccionPropiedad=" + direccionPropiedad + ", disponibilidadPropiedad=" + disponibilidadPropiedad + ", cantidadAmbientes=" + cantidadAmbientes + ", cantidadBanios=" + cantidadBanios + ", amueblado=" + amueblado + ", descripcionPropiedad=" + descripcionPropiedad + ", estadoPropiedad=" + estadoPropiedad + '}';
    }
    
    
    

   
    
    
    
    
    
}
