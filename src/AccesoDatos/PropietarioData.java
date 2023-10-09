/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class PropietarioData {
    
    PreparedStatement ps=null;
     
     private Connection con = null;
     
     public PropietarioData() {
         con = Conexion.getConexion();
     }
    
     // MÉTODO GUARDAR PROPIETARIO
     
     public void guardarPropietario(Propietario propietario){
         String sql = "INSERT INTO propietario (nombrePropietario, apellidoPropietario, dniPropietario, domicilioPropietario, telefonoPropietario, estadoPropietario) "
                 + "VALUES(?, ?, ?, ?, ?, ?)";
         
         try {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, propietario.getNombrePropietario());
             ps.setString(2, propietario.getApellidoPropietario());
             ps.setInt(3, propietario.getDniPropietario());
             ps.setString(4, propietario.getDomicilioPropietario());
             ps.setInt(5, propietario.getTelefonoPropietario());
             ps.setBoolean(6, propietario.isEstadoPropietario());
             
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys(); 
             
              if(rs.next()){ 
                propietario.setIdPropietario(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Propietario guardado");
            }
            ps.close();
             
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
         }
     }
     
     // MÉTODO MODIFICAR PROPIETARIO
     
     public void modificarPropietario(Propietario propietario){
         
         String sql = "UPDATE propietario SET nombrePropietario=?, apellidoPropietario=?, dniPropietario=?, domicilioPropietario=?, telefonoPropietario=? "
           + "WHERE idPropietario=?";  
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, propietario.getNombrePropietario());
            ps.setString(2, propietario.getApellidoPropietario());
            ps.setInt(3, propietario.getDniPropietario());
            ps.setString(4, propietario.getDomicilioPropietario());
            ps.setInt(5, propietario.getTelefonoPropietario());
            ps.setInt(6, propietario.getIdPropietario());
            
            int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null,"Propietario modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        }
     }
     
     // MÉTODO CAMBIAR ESTADO PROPIETARIO
     
     public void cambiarEstadoPropietario (int idPropietario){
         
         String sql = "UPDATE propietario SET estadoPropietario=? WHERE idPropietario=? ";
         
         Propietario propietario = buscarPropietarioPorId(idPropietario);
          
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setBoolean(1, !propietario.isEstadoPropietario());
            ps.setInt(2, idPropietario);
             
            int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                if(propietario.isEstadoPropietario()){
                    JOptionPane.showMessageDialog(null,"Propietario desactivado");
                }else{
                    JOptionPane.showMessageDialog(null,"Propietario activado");
                }
            }       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        } 
     }
     
     // MÉTODO BUSCAR PROPIETARIO POR ID
     
     public Propietario buscarPropietarioPorId(int idPropietario){
         
        String sql = "SELECT nombrePropietario, apellidoPropietario, dniPropietario, domicilioPropietario, telefonoPropietario, estadoPropietario FROM propietario WHERE idPropietario=?" ;
        
        Propietario propietario = null;
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ps.setInt(1, idPropietario);
             
             ResultSet resultado = ps.executeQuery();
             
             if (resultado.next()) {
                 propietario = new Propietario();
                 propietario.setIdPropietario(idPropietario);
                 propietario.setNombrePropietario(resultado.getString("nombrePropietario"));
                 propietario.setApellidoPropietario(resultado.getString("apellidoPropietario"));
                 propietario.setDniPropietario(resultado.getInt("dniPropietario"));
                 propietario.setDomicilioPropietario(resultado.getString("domicilioPropietario"));
                 propietario.setTelefonoPropietario(resultado.getInt("telefonoPropietario")); 
                 propietario.setEstadoPropietario(resultado.getBoolean("estadoPropietario"));
             }else {
                JOptionPane.showMessageDialog(null,"No existe un propietario con ese id");
            }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
         }
        return propietario;  
     }
    
     // MÉTODO LISTAR PROPIETARIOS
     
     public ArrayList<Propietario> listarPropietarios(){
        
        String sql = "SELECT * FROM propietario" ;
        
        ArrayList<Propietario> listaPropietarios = new ArrayList<>();
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){ 
                Propietario propietario = new Propietario(); 
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombrePropietario(rs.getString("nombrePropietario"));
                propietario.setApellidoPropietario(rs.getString("apellidoPropietario"));
                propietario.setDniPropietario(rs.getInt("dniPropietario"));
                propietario.setDomicilioPropietario(rs.getString("domicilioPropietario"));
                propietario.setTelefonoPropietario(rs.getInt("telefonoPropietario")); 
                propietario.setEstadoPropietario(rs.getBoolean("estadoPropietario"));
                
                listaPropietarios.add(propietario); 
            }
            ps.close(); 
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
         }
        return listaPropietarios;
    }
     
     
     
}
