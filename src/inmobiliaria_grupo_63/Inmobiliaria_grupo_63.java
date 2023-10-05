/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria_grupo_63;

import AccesoDatos.InquilinoData;
import Entidades.Inquilino;

/**
 *
 * @author USUARIO
 */
public class Inmobiliaria_grupo_63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        InquilinoData inquilinoData = new InquilinoData();
        
        Inquilino inquilino = new Inquilino ();
        
        //-------------------------------------------------------------
        
        /*
        
        // MÉTODO GUARDAR INQUILINO
        
        inquilino.setNombreInquilino("Cristian");
        inquilino.setApellidoInquilino("Ridao");
        inquilino.setDniInquilino(1111);
        inquilino.setDetalleInquilino("");
        inquilino.setTipoInquilino("");
        inquilino.setEstadoInquilino(true);
        
        inquilinoData.guardarInquilino(inquilino);
    
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO MODIFICAR INQUILINO
        
        /*
        
        inquilino.setIdInquilino(1);
        inquilino.setNombreInquilino("Carlos");
        inquilino.setApellidoInquilino("Ridao");
        inquilino.setDniInquilino(1111);
        inquilino.setDetalleInquilino("");
        inquilino.setTipoInquilino("");
        
        inquilinoData.modificarInquilino(inquilino);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO CAMBIAR ESTADO INQUILINO
        
        /*
        
        inquilino.setIdInquilino(1);
        
        inquilinoData.cambiarEstadoInquilino(1);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO BUSCAR INQUILINO POR ID
        
        /*
       
        System.out.println(inquilinoData.buscarInquilinoPorId(2).toString());
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO LISTAR INQUILINOS
        
        /*
        
        for (Inquilino inq: inquilinoData.listarInquilinos()) {
            System.out.println(inq.toString());
        }
           
        */
        
        //-------------------------------------------------------------
        
        
    }
    
}
