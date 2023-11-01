/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class LoginData {

    PreparedStatement ps = null; // SE COMUNICA CON LA BASE DATOS

    private Connection con = null; // GENERA CONEXIÓN CON LA BASE DE DATOS

    public LoginData() {
        con = Conexion.getConexion(); // LAMA AL MÉTODO PARA HACER LA CONEXIÓN
    }

    public void guardarLogin(Login login) {

        String sql = "INSERT INTO login(usuario, contrasenia) "
                + "VALUES(?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, login.getUsuario());
            ps.setInt(2, login.getContrasenia());
            ps.executeUpdate(); // EJECUTA LA SENTENCIA
            ResultSet rs = ps.getGeneratedKeys(); // TRAE DE ESA EJECUCIÓN LAS CLAVES GENERADAS Y LAS GUARDA EN rs
            if (rs.next()) {
                login.setIdUsuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Logeado con Exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Login");
        }
        //JOptionPane.showMessageDialog(null, "El id generado para la materia es: "+materia.getIdMateria());
    }

    // MÉTODO MODIFICAR MATERIA
    public void modificarUsuario(Login login) {

        String sql = "UPDATE login SET usuario=?, contrasenia=? "
                + "WHERE idUsuario=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, login.getUsuario());
            ps.setInt(2, login.getContrasenia());
            ps.setInt(3, login.getIdUsuario());

            int exito = ps.executeUpdate(); // SE RETORNAN MODIFICACIONES HECHA A MATERIA Y SE DEVUELVE EN UNA VARIABLE LLAMADA exito

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Usuario modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Login");
        }
    }

    public Login compararLogin(String usuario, int contrasenia) {

        String sql = "SELECT idUsuario, usuario,contrasenia FROM login WHERE usuario = ? AND contrasenia=? ";

        Login login = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, usuario);
            ps.setInt(2, contrasenia);
            ResultSet resultado = ps.executeQuery();
            
            if (resultado.next()) {

                login = new Login();

                int idUsuario = resultado.getInt("idUsuario");
                String usuarioDB = resultado.getString("usuario");
                int contraseniaDB = resultado.getInt("contrasenia");
                if (usuario.equals(usuarioDB) && contrasenia == contraseniaDB) {
                login.setIdUsuario(idUsuario);
                login.setUsuario(usuarioDB);
                login.setContrasenia(contraseniaDB);
//                JOptionPane.showMessageDialog(null, "Ingreso al Sistema");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña Incorrecta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña Incorrecta");
            
        }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla login");
        }
        return login;
    }

}
