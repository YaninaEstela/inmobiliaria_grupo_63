/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author USUARIO
 */
public class Propietario {
    
    private int idPropietario;
    private String nombrePropietario;
    private String apellidoPropietario;
    private int dniPropietario;
    private String domicilioPropietario;
    private int telefonoPropietario;
    private boolean estadoPropietario;

    public Propietario() {
    }

    public Propietario(int idPropietario, String nombrePropietario, String apellidoPropietario, int dniPropietario, String domicilioPropietario, int telefonoPropietario, boolean estadoPropietario) {
        this.idPropietario = idPropietario;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.dniPropietario = dniPropietario;
        this.domicilioPropietario = domicilioPropietario;
        this.telefonoPropietario = telefonoPropietario;
        this.estadoPropietario = estadoPropietario;
    }

    public Propietario(String nombrePropietario, String apellidoPropietario, int dniPropietario, String domicilioPropietario, int telefonoPropietario, boolean estadoPropietario) {
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.dniPropietario = dniPropietario;
        this.domicilioPropietario = domicilioPropietario;
        this.telefonoPropietario = telefonoPropietario;
        this.estadoPropietario = estadoPropietario;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public int getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(int dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public String getDomicilioPropietario() {
        return domicilioPropietario;
    }

    public void setDomicilioPropietario(String domicilioPropietario) {
        this.domicilioPropietario = domicilioPropietario;
    }

    public int getTelefonoPropietario() {
        return telefonoPropietario;
    }

    public void setTelefonoPropietario(int telefonoPropietario) {
        this.telefonoPropietario = telefonoPropietario;
    }

    public boolean isEstadoPropietario() {
        return estadoPropietario;
    }

    public void setEstadoPropietario(boolean estadoPropietario) {
        this.estadoPropietario = estadoPropietario;
    }

    @Override
    public String toString() {
        return "Propietario{" + "idPropietario=" + idPropietario + ", nombrePropietario=" + nombrePropietario + ", apellidoPropietario=" + apellidoPropietario + ", dniPropietario=" + dniPropietario + ", domicilioPropietario=" + domicilioPropietario + ", telefonoPropietario=" + telefonoPropietario + ", estadoPropietario=" + estadoPropietario + '}';
    }
    
    
    
    
    
}
