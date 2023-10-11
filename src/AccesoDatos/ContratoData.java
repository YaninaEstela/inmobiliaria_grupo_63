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
import java.time.LocalDate;
import java.util.ArrayList;
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
                + "fechaInicio, fechaFinal, fechaRealizacion, estadoContrato)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
             ps.setInt(1, contrato.getInquilino().getIdInquilino());
             ps.setInt(2, contrato.getPropiedad().getIdPropiedad());
             ps.setDate(3,Date.valueOf(contrato.getFechaInicio()));
             ps.setDate(4, Date.valueOf(contrato.getFechaFinal()));
             ps.setDate(5, Date.valueOf(contrato.getFechaRealizacion()));
             ps.setBoolean(6, contrato.isEstadoContrato());
            
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
                + "fechaInicio=?, fechaFinal=?, fechaRealizacion=?, estadoContrato=? "
                + "WHERE idContrato=? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, contrato.getInquilino().getIdInquilino());
            ps.setInt(2, contrato.getPropiedad().getIdPropiedad());
            ps.setDate(3, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(4, Date.valueOf(contrato.getFechaFinal()));
            ps.setDate(5, Date.valueOf(contrato.getFechaRealizacion()));
            ps.setBoolean(6, contrato.isEstadoContrato());
            ps.setInt(7, contrato.getIdContrato());
            
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
    
    public Contrato buscarContratoPorId(int idContrato){
        
        String sql = "SELECT idInquilino, idPropiedad,"
                 + " fechaInicio, fechaFinal, fechaRealizacion, estadoContrato"
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
                 contrato.setFechaInicio((resultado.getDate("fechaInicio").toLocalDate()));
                 contrato.setFechaFinal((resultado.getDate("fechaFinal").toLocalDate()));
                 contrato.setFechaRealizacion((resultado.getDate("fechaRealizacion").toLocalDate()));
                 contrato.setEstadoContrato(resultado.getBoolean("estadoContrato"));
                 
             }else{
                JOptionPane.showMessageDialog(null,"No existe un contrato con ese id");
            }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
         }
        return contrato;  
    }
    
    // MÉTODO LISTAR CONTRATOS
    
    public ArrayList<Contrato> listarContratos() {
        
        String sql = "SELECT * FROM contrato" ;
        
        ArrayList<Contrato> listaContratos = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){ 
                Contrato contrato = new Contrato();
                contrato.setIdContrato(resultado.getInt("idContrato"));
                contrato.setInquilino(inquilinoData.buscarInquilinoPorId(resultado.getInt("idInquilino")));
                contrato.setPropiedad(propiedadData.buscarPropiedadPorId(resultado.getInt("idPropiedad")));
                contrato.setFechaInicio((resultado.getDate("fechaInicio").toLocalDate()));
                contrato.setFechaFinal((resultado.getDate("fechaFinal").toLocalDate()));
                contrato.setFechaRealizacion((resultado.getDate("fechaRealizacion").toLocalDate()));
                contrato.setEstadoContrato(resultado.getBoolean("estadoContrato"));
             
                listaContratos.add(contrato);   
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
        }
        return listaContratos;
    }
    
    // MÉTODO LISTAR CONTRATOS POR INQUILINO
    
    public ArrayList<Contrato> listarContratosPorInquilino(int idInquilino){
        
        String sql = "SELECT * FROM contrato WHERE idInquilino=?" ;
        
        ArrayList<Contrato> listaContratosPorInquilino = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idInquilino);
            
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){ 
                Contrato contrato = new Contrato();
                contrato.setIdContrato(resultado.getInt("idContrato"));
                contrato.setInquilino(inquilinoData.buscarInquilinoPorId(resultado.getInt("idInquilino")));
                contrato.setPropiedad(propiedadData.buscarPropiedadPorId(resultado.getInt("idPropiedad")));
                contrato.setFechaInicio((resultado.getDate("fechaInicio").toLocalDate()));
                contrato.setFechaFinal((resultado.getDate("fechaFinal").toLocalDate()));
                contrato.setFechaRealizacion((resultado.getDate("fechaRealizacion").toLocalDate()));
                contrato.setEstadoContrato(resultado.getBoolean("estadoContrato"));
             
                listaContratosPorInquilino.add(contrato);   
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
        }
        return listaContratosPorInquilino;
    }
    
    // MÉTODO LISTAR CONTRATOS POR PROPIEDAD
    
    public ArrayList<Contrato> listarContratosPorPropiedad(int idPropiedad) {
        
        String sql = "SELECT * FROM contrato WHERE idPropiedad=?" ;
        
        ArrayList<Contrato> listaContratosPorPropiedad = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idPropiedad);
            
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){ 
                Contrato contrato = new Contrato();
                contrato.setIdContrato(resultado.getInt("idContrato"));
                contrato.setInquilino(inquilinoData.buscarInquilinoPorId(resultado.getInt("idInquilino")));
                contrato.setPropiedad(propiedadData.buscarPropiedadPorId(resultado.getInt("idPropiedad")));
                contrato.setFechaInicio((resultado.getDate("fechaInicio").toLocalDate()));
                contrato.setFechaFinal((resultado.getDate("fechaFinal").toLocalDate()));
                contrato.setFechaRealizacion((resultado.getDate("fechaRealizacion").toLocalDate()));
                contrato.setEstadoContrato(resultado.getBoolean("estadoContrato"));
             
                listaContratosPorPropiedad.add(contrato);   
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato");
        }
      return listaContratosPorPropiedad;  
    }
        
        
        
    
    
    
}
