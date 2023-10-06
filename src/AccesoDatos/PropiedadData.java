/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Propiedad;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class PropiedadData {
    
    InquilinoData inquilinodata = new InquilinoData();
    PropietarioData propietariodata = new PropietarioData();
    
    PreparedStatement ps=null;
     
     private Connection con = null;
     
     public PropiedadData() {
         con = Conexion.getConexion();
     }
     
     // MÉTODO GUARDAR PROPIEDAD
     
     public void guardarPropiedad(Propiedad propiedad){
         
         String sql = "INSERT INTO propiedad (idPropietario, tipoPropiedad, precioTasadoPropiedad, zonaPropiedad,"
                 + " superficiePropiedad, direccionPropiedad, disponibilidadPropiedad,"
                 + " cantidadAmbientes, cantidadBanios, amueblado, descripcionPropiedad, estadoPropiedad)"
                 + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
         
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
            // propietario ES UN ATRIBUTO DE LA CLASE Propiedad POR ESO VA propiedad.getPropietario() Y DE AHÍ EXTRAE EL ID
            ps.setString(2, propiedad.getTipoPropiedad());
            ps.setDouble(3, propiedad.getPrecioTasadoPropiedad());
            ps.setString(4, propiedad.getZonaPropiedad());
            ps.setDouble(5, propiedad.getSuperficiePropiedad());
            ps.setString(6, propiedad.getDireccionPropiedad());
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
        }
         
         
         
                
     }
     
}
