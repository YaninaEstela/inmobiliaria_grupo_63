
package AccesoDatos;

import Entidades.Inquilino;
import Entidades.Propiedad;
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


public class PropiedadData {
    
    InquilinoData inquilinoData = new InquilinoData();
    PropietarioData propietarioData = new PropietarioData();
    
    PreparedStatement ps=null;
     
     private Connection con = null;
     
     public PropiedadData() {
         con = Conexion.getConexion();
     }
     
     // MÉTODO GUARDAR PROPIEDAD
     
//     public void guardarPropiedad(Propiedad propiedad){
//         
//         String sql = "INSERT INTO propiedad (idPropietario, tipoPropiedad, precioTasadoPropiedad, zonaPropiedad,"
//                 + " superficiePropiedad, direccionPropiedad, disponibilidadPropiedad,"
//                 + " cantidadAmbientes, cantidadBanios, amueblado, descripcionPropiedad, estadoPropiedad)"
//                 + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
//         
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            
//            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
//            // propietario ES UN ATRIBUTO DE LA CLASE Propiedad POR ESO VA propiedad.getPropietario() Y DE AHÍ EXTRAE EL ID
//            ps.setString(2, propiedad.getTipoPropiedad());
//            ps.setDouble(3, propiedad.getPrecioTasadoPropiedad());
//            ps.setString(4, propiedad.getZonaPropiedad());
//            ps.setDouble(5, propiedad.getSuperficiePropiedad());
//            ps.setString(6, propiedad.getDireccionPropiedad());
//            ps.setBoolean(7, propiedad.isDisponibilidadPropiedad());
//            ps.setInt(8, propiedad.getCantidadAmbientes());
//            ps.setInt(9, propiedad.getCantidadBanios());
//            ps.setBoolean(10, propiedad.isAmueblado());
//            ps.setString(11, propiedad.getDescripcionPropiedad());
//            ps.setBoolean(12, propiedad.isEstadoPropiedad());
//            
//            ps.executeUpdate();
//             
//            ResultSet rs = ps.getGeneratedKeys(); 
//             
//            if(rs.next()){ 
//                propiedad.setIdPropiedad(rs.getInt(1)); 
//                JOptionPane.showMessageDialog(null, "Propiedad guardada");
//            }
//            ps.close();
//            
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
//        }          
//     }
//     
    
   public void guardarPropiedad(Propiedad propiedad) {
    String sql = "INSERT INTO propiedad (idPropietario, tipoPropiedad, precioTasadoPropiedad, zonaPropiedad,"
            + " superficiePropiedad, direccionPropiedad, disponibilidadPropiedad,"
            + " cantidadAmbientes, cantidadBanios, amueblado, descripcionPropiedad, estadoPropiedad)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        if (propiedad.getPropietario() != null) {
            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
        } else {
            // Trata el caso en que el propietario sea null (puede ser una excepción o un valor predeterminado)
            // ps.setInt(1, valorPredeterminado);
        }
        
        ps.setString(2, propiedad.getTipoPropiedad());
        ps.setDouble(3, propiedad.getPrecioTasadoPropiedad());
        ps.setString(4, propiedad.getZonaPropiedad());
        ps.setDouble(5, propiedad.getSuperficiePropiedad());
        ps.setString(6, propiedad.getDireccionPropiedad());
        ps.setBoolean(7, propiedad.isDisponibilidadPropiedad());
        ps.setInt(8, propiedad.getCantidadAmbientes());
        ps.setInt(9, propiedad.getCantidadBanios());
        ps.setBoolean(10, propiedad.isAmueblado());
        ps.setString(11, propiedad.getDescripcionPropiedad());
        ps.setBoolean(12, propiedad.isEstadoPropiedad());

        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            propiedad.setIdPropiedad(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Propiedad guardada");
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
    }
}  


// MÉTODO MODIFICAR PROPIEDAD
     
     public void modificarPropiedad(Propiedad propiedad){
         
         String sql = "UPDATE propiedad SET idPropietario=?, idInquilino=?, tipoPropiedad=?, "
                 + "precioTasadoPropiedad=?, zonaPropiedad=?,"
                 + " superficiePropiedad=?, direccionPropiedad=?, disponibilidadPropiedad=?,"
                 + " cantidadAmbientes=?, cantidadBanios=?, amueblado=?,"
                 + " descripcionPropiedad=?, estadoPropiedad=? "
                 + "WHERE idPropiedad=?"; 
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, propiedad.getPropietario().getIdPropietario());
            ps.setInt(2, propiedad.getInquilino().getIdInquilino());
            ps.setString(3, propiedad.getTipoPropiedad());
            ps.setDouble(4, propiedad.getPrecioTasadoPropiedad());
            ps.setString(5, propiedad.getZonaPropiedad());
            ps.setDouble(6, propiedad.getSuperficiePropiedad());
            ps.setString(7, propiedad.getDireccionPropiedad());
            ps.setBoolean(8, propiedad.isDisponibilidadPropiedad());
            ps.setInt(9, propiedad.getCantidadAmbientes());
            ps.setInt(10, propiedad.getCantidadBanios());
            ps.setBoolean(11, propiedad.isAmueblado());
            ps.setString(12, propiedad.getDescripcionPropiedad());
            ps.setBoolean(13, propiedad.isEstadoPropiedad());
            ps.setInt(14, propiedad.getIdPropiedad());
            
            int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null,"Propiedad modificada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
        }
     }
     
     // MÉTODO CAMBIAR ESTADO PROPIEDAD
     
     public void cambiarEstadoPropiedad(int idPropiedad) {
         
         String sql = "UPDATE propiedad SET estadoPropiedad=? WHERE idPropiedad=? ";
         
         Propiedad propiedad = buscarPropiedadPorId(idPropiedad);
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setBoolean(1, !propiedad.isEstadoPropiedad());
            ps.setInt(2, idPropiedad);
             
            int exito = ps.executeUpdate(); 
            
            if (exito==1) {
                if(propiedad.isEstadoPropiedad()){
                    JOptionPane.showMessageDialog(null,"Propiedad desactivada");
                }else{
                    JOptionPane.showMessageDialog(null,"Propiedad activada");
                }
            }      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
        }
         
     }
     
     // MÉTODO BUSCAR PROPIEDAD POR ID
     
     public Propiedad buscarPropiedadPorId(int idPropiedad){
         
        String sql = "SELECT idPropietario, idInquilino, tipoPropiedad, precioTasadoPropiedad, zonaPropiedad,"
                 + " superficiePropiedad, direccionPropiedad, disponibilidadPropiedad,"
                 + " cantidadAmbientes, cantidadBanios, amueblado, descripcionPropiedad, estadoPropiedad"
                 + " FROM propiedad"
                 + " WHERE idPropiedad=?" ;
        
        Propiedad propiedad = null;
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             
             ps.setInt(1, idPropiedad);
             
             ResultSet resultado = ps.executeQuery();
             
             if (resultado.next()) {
                 propiedad = new Propiedad();
                 propiedad.setIdPropiedad(idPropiedad);
                 propiedad.setPropietario((Propietario)propietarioData.buscarPropietarioPorId(resultado.getInt("idPropietario")));
                 propiedad.setInquilino((Inquilino)inquilinoData.buscarInquilinoPorId(resultado.getInt("idInquilino")));
                 propiedad.setTipoPropiedad(resultado.getString("tipoPropiedad"));
                 propiedad.setPrecioTasadoPropiedad(resultado.getDouble("precioTasadoPropiedad"));
                 propiedad.setZonaPropiedad(resultado.getString("zonaPropiedad"));
                 propiedad.setSuperficiePropiedad(resultado.getDouble("superficiePropiedad"));
                 propiedad.setDireccionPropiedad(resultado.getString("direccionPropiedad"));
                 propiedad.setDisponibilidadPropiedad(resultado.getBoolean("disponibilidadPropiedad"));
                 propiedad.setCantidadAmbientes(resultado.getInt("cantidadAmbientes"));
                 propiedad.setCantidadBanios(resultado.getInt("cantidadBanios"));
                 propiedad.setAmueblado(resultado.getBoolean("amueblado"));
                 propiedad.setDescripcionPropiedad(resultado.getString("descripcionPropiedad"));
                 propiedad.setEstadoPropiedad(resultado.getBoolean("estadoPropiedad"));
                 
             }else {
                JOptionPane.showMessageDialog(null,"No existe una propiedad con ese id");
            }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
         }
        return propiedad;  
     }
     
     // MÉTODO LISTAR PROPIEDADES
     
     public ArrayList<Propiedad> listarPropiedades(){
         
        String sql = "SELECT * FROM propiedad" ;
        
        ArrayList<Propiedad> listaPropiedades = new ArrayList<>();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();
             
            while(resultado.next()){ 
                 Propiedad propiedad = new Propiedad();
                 propiedad.setIdPropiedad(resultado.getInt("idPropiedad"));
                 propiedad.setPropietario((Propietario)propietarioData.buscarPropietarioPorId(resultado.getInt("idPropietario")));
                 propiedad.setInquilino((Inquilino)inquilinoData.buscarInquilinoPorId(resultado.getInt("idInquilino")));
                 propiedad.setTipoPropiedad(resultado.getString("tipoPropiedad"));
                 propiedad.setPrecioTasadoPropiedad(resultado.getDouble("precioTasadoPropiedad"));
                 propiedad.setZonaPropiedad(resultado.getString("zonaPropiedad"));
                 propiedad.setSuperficiePropiedad(resultado.getDouble("superficiePropiedad"));
                 propiedad.setDireccionPropiedad(resultado.getString("direccionPropiedad"));
                 propiedad.setDisponibilidadPropiedad(resultado.getBoolean("disponibilidadPropiedad"));
                 propiedad.setCantidadAmbientes(resultado.getInt("cantidadAmbientes"));
                 propiedad.setCantidadBanios(resultado.getInt("cantidadBanios"));
                 propiedad.setAmueblado(resultado.getBoolean("amueblado"));
                 propiedad.setDescripcionPropiedad(resultado.getString("descripcionPropiedad"));
                 propiedad.setEstadoPropiedad(resultado.getBoolean("estadoPropiedad"));
             
                 
                listaPropiedades.add(propiedad); 
            }
            ps.close(); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
        }
        return listaPropiedades;
     }
     
     // MÉTODO LISTAR PROPIEDADES POR PROPIETARIO
     
     public ArrayList<Propiedad> listarPropiedadesPorPropietario(int idPropietario){
     
         String sql = "SELECT * FROM propiedad WHERE idPropietario=?";
         
         ArrayList <Propiedad> listaPropiedadesPorPropietario = new ArrayList<>();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPropietario);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()){
                Propiedad propiedad = new Propiedad();
                 propiedad.setIdPropiedad(resultado.getInt("idPropiedad"));
                 propiedad.setPropietario(propietarioData.buscarPropietarioPorId(idPropietario));
                 propiedad.setInquilino((Inquilino)inquilinoData.buscarInquilinoPorId(resultado.getInt("idInquilino")));
                 propiedad.setTipoPropiedad(resultado.getString("tipoPropiedad"));
                 propiedad.setPrecioTasadoPropiedad(resultado.getDouble("precioTasadoPropiedad"));
                 propiedad.setZonaPropiedad(resultado.getString("zonaPropiedad"));
                 propiedad.setSuperficiePropiedad(resultado.getDouble("superficiePropiedad"));
                 propiedad.setDireccionPropiedad(resultado.getString("direccionPropiedad"));
                 propiedad.setDisponibilidadPropiedad(resultado.getBoolean("disponibilidadPropiedad"));
                 propiedad.setCantidadAmbientes(resultado.getInt("cantidadAmbientes"));
                 propiedad.setCantidadBanios(resultado.getInt("cantidadBanios"));
                 propiedad.setAmueblado(resultado.getBoolean("amueblado"));
                 propiedad.setDescripcionPropiedad(resultado.getString("descripcionPropiedad"));
                 propiedad.setEstadoPropiedad(resultado.getBoolean("estadoPropiedad"));
                
                listaPropiedadesPorPropietario.add(propiedad);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad");
        }
        return listaPropiedadesPorPropietario;
     }
}
