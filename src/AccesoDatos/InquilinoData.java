/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Inquilino;
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
public class InquilinoData {
    
     PreparedStatement ps=null;
     
     private Connection con = null;
     
     public InquilinoData() {
         con = Conexion.getConexion();
     }
     
     // MÉTODO GUARDAR INQUILINO
     
     public void guardarInquilino(Inquilino inquilino){
         String sql = "INSERT INTO inquilino (nombreInquilino, apellidoInquilino, dniInquilino, detalleInquilino, tipoInquilino, estadoInquilino) "
                 + "VALUES(?, ?, ?, ?, ?, ?)";
         
         try {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             ps.setString(1, inquilino.getNombreInquilino());
             ps.setString(2, inquilino.getApellidoInquilino());
             ps.setInt(3, inquilino.getDniInquilino());
             ps.setString(4, inquilino.getDetalleInquilino());
             ps.setString(5, inquilino.getTipoInquilino());
             ps.setBoolean(6, inquilino.isEstadoInquilino());
             
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys(); 
             
              if(rs.next()){ 
                inquilino.setIdInquilino(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Inquilino guardado");
            }
            ps.close();
             
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
         }
     }
     
     // MÉTODO MODIFICAR INQUILINO
     
     public void modificarInquilino (Inquilino inquilino) {
         
          String sql = "UPDATE inquilino SET nombreInquilino=?, apellidoInquilino=?, dniInquilino=?, detalleInquilino=?, tipoInquilino=? "
           + "WHERE idInquilino=?";      
         
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ps.setString(1, inquilino.getNombreInquilino());
             ps.setString(2, inquilino.getApellidoInquilino());
             ps.setInt(3, inquilino.getDniInquilino());
             ps.setString(4, inquilino.getDetalleInquilino());
             ps.setString(5, inquilino.getTipoInquilino());
             ps.setInt(6, inquilino.getIdInquilino());
             
             int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null,"Inquilino modificado");
            }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
         }  
     }
     
     // MÉTODO CAMBIAR ESTADO INQUILINO
     
     public void cambiarEstadoInquilino(int idInquilino){
         
         String sql = "UPDATE inquilino SET estadoInquilino=? WHERE idInquilino=? ";
         
         Inquilino inquilino = buscarInquilinoPorId(idInquilino);
         
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ps.setBoolean(1, !inquilino.isEstadoInquilino());
             ps.setInt(2, idInquilino);
             
             int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                if(inquilino.isEstadoInquilino()){
                    JOptionPane.showMessageDialog(null,"Inquilino desactivado");
                }else{
                    JOptionPane.showMessageDialog(null,"Inquilino activado");
                }
            } 
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
         }
         
     }

     // MÉTODO BUSCAR INQUILINO POR ID
 
    public Inquilino buscarInquilinoPorId(int idInquilino) {
        
        String sql = "SELECT nombreInquilino, apellidoInquilino, dniInquilino, detalleInquilino, tipoInquilino, estadoInquilino FROM inquilino WHERE idInquilino=?" ;
        
        Inquilino inquilino = null;
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ps.setInt(1, idInquilino);
             
             ResultSet resultado = ps.executeQuery();
             
             if (resultado.next()) {
                 inquilino = new Inquilino();
                 inquilino.setIdInquilino(idInquilino);
                 inquilino.setNombreInquilino(resultado.getString("nombreInquilino"));
                 inquilino.setApellidoInquilino(resultado.getString("apellidoInquilino"));
                 inquilino.setDniInquilino(resultado.getInt("dniInquilino"));
                 inquilino.setDetalleInquilino(resultado.getString("detalleInquilino"));
                 inquilino.setTipoInquilino(resultado.getString("tipoInquilino"));
                 inquilino.setEstadoInquilino(resultado.getBoolean("estadoInquilino"));
             }else {
                //JOptionPane.showMessageDialog(null,"No existe un inquilino con ese id");
             }
            ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
         }
        return inquilino;
    }
     
    // MÉTODO LISTAR INQUILINOS
    
    public ArrayList<Inquilino> listarInquilinos(){
        
        String sql = "SELECT * FROM inquilino" ;
        
        ArrayList<Inquilino> listaInquilinos = new ArrayList<>();
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){ 
                Inquilino inquilino = new Inquilino(); 
                inquilino.setIdInquilino(rs.getInt("idInquilino"));
                inquilino.setNombreInquilino(rs.getString("nombreInquilino"));
                inquilino.setApellidoInquilino(rs.getString("apellidoInquilino"));
                inquilino.setDniInquilino(rs.getInt("dniInquilino"));
                inquilino.setDetalleInquilino(rs.getString("detalleInquilino"));
                inquilino.setTipoInquilino(rs.getString("tipoInquilino"));
                inquilino.setEstadoInquilino(rs.getBoolean("estadoInquilino"));
                
                listaInquilinos.add(inquilino); 
            }
            
            ps.close(); 
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
         }
        return listaInquilinos;
    }
    
    
     
}
