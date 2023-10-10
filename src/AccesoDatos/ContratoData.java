package AccesoDatos;

import Entidades.Contrato;
import Entidades.Inquilino;
import Entidades.Propiedad;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ContratoData {

    PreparedStatement ps = null;

    private Connection con = null;

    public ContratoData() {
        con = Conexion.getConexion();
    }

    InquilinoData inquilinoData = new InquilinoData();
    PropiedadData propiedadData = new PropiedadData();
    
    // MÉTODO ACTUALIZAR PRECIO 
    
    private double actualizarPrecio (double aumento, Contrato contrato){
        
        double precioNuevo;
        
        precioNuevo = contrato.getPropiedad().getPrecioTasadoPropiedad()*aumento;
        
        return precioNuevo;
    }
    
    // MÉTODO GUARDAR CONTRATO
    
    public void guardarContrato(Contrato contrato){
        
        String sql = "INSERT INTO contrato (idInquilino, idPropiedad,"
                + "fechaInicio, fechaFinal, fechaRealizacion)"
                + "VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
             ps.setInt(1, contrato.getInquilino().getIdInquilino());
             ps.setInt(2, contrato.getPropiedad().getIdPropiedad());
             ps.setDate(3,Date.valueOf(contrato.getFechaInicio()));
             ps.setDate(4, Date.valueOf(contrato.getFechaFinal()));
             ps.setDate(5, Date.valueOf(contrato.getFechaRealizacion()));
             
            
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys(); 
             
             if(rs.next()){ 
                contrato.setIdContrato(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Contrato guardado");
              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
        }  
    }
    
    // MÉTODO MODIFICAR CONTRATO
    
    public void modificarContrato(Contrato contrato){
        
        String sql = "UPDATE contrato SET idInquilino=?, idPropiedad=?, "
                + "fechaInicio=?, fechaFinal=?, fechaRealizacion=? "
                + "WHERE idContrato=? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, contrato.getInquilino().getIdInquilino());
            ps.setInt(2, contrato.getPropiedad().getIdPropiedad());
            ps.setDate(3, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(4, Date.valueOf(contrato.getFechaFinal()));
            ps.setDate(5, Date.valueOf(contrato.getFechaRealizacion()));
            ps.setInt(6, contrato.getIdContrato());
            
            int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null,"Contrato modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
        } 
    }
    
    // MÉTODO CAMBIAR ESTADO CONTRATO
    
    public void cambiarEstadoContrato(int idContrato) {
         
         String sql = "UPDATE contrato SET estadoContrato=? WHERE idContrato=? ";
         
         Contrato contrato = buscarContratoPorId(idContrato);
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setBoolean(1, !contrato.isEstadoContrato());
            ps.setInt(2, idContrato);
             
            int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                if(contrato.isEstadoContrato()){
                    JOptionPane.showMessageDialog(null,"Contrato desactivado");
                }else{
                    JOptionPane.showMessageDialog(null,"Contrato activado");
                }
            }      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
        }  
     }
    
    // MÉTODO BUSCAR CONTRATO POR ID
    
    public void buscarContratoPorId(int idContrato){
        
        String sql = "SELECT idInquilino, idPropiedad,"
                 + " fechaInicio, fechaFinal, fechaRealizacion"
                 + " FROM contrato"
                 + " WHERE idContrato=?";
        
        Contrato contrato = null;
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ps.setInt(1, idContrato);
             
             ResultSet resultado = ps.executeQuery();
             
             if (resultado.next()) {
                 contrato = new Contrato();
                 contrato.setIdContrato(idContrato);
                 contrato.setInquilino((Inquilino)inquilinoData.buscarInquilinoPorId(resultado.getInt("idInquilino")));
                 contrato.setPropiedad((Propiedad)propiedadData.buscarPropiedadPorId(resultado.getInt("idPropiedad")));
                 contrato.setFechaInicio(Date.valueOf(contrato.getFechaInicio("fechaInicio")));
                 contrato.setFechaFinal(Date.valueOf(contrato.getFechaFinal("fechaFinal")));
                 contrato.setFechaRealizacion(Date.valueOf(contrato.getFechaRealizacion("fechaRealizacion")));
                 
                 
             }else{
                JOptionPane.showMessageDialog(null,"No existe un contrato con ese id");
            }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
         }
        return contrato;  
    }
    
}
