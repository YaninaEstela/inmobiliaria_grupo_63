
package inmobiliaria_grupo_63;

import AccesoDatos.InquilinoData;
import AccesoDatos.PropietarioData;
import Entidades.Inquilino;
import Entidades.Propietario;


public class Inmobiliaria_grupo_63 {

    public static void main(String[] args) {
        
        InquilinoData inquilinoData = new InquilinoData();
        
        PropietarioData propietarioData = new PropietarioData();
        
        Inquilino inquilino = new Inquilino();
        
        Propietario propietario = new Propietario();
        
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
        
        
        // MÉTODO GUARDAR PROPIETARIO
        
        /*
        
        propietario.setNombrePropietario("Carlos");
        propietario.setApellidoPropietario("Estela");
        propietario.setDniPropietario(1234);
        propietario.setDomicilioPropietario("Uriburu 684");
        propietario.setTelefonoPropietario(562458);
        propietario.setEstadoPropietario(true);
        
        propietarioData.guardarPropietario(propietario);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO MODIFICAR PROPIETARIO
        
        /*
        
        propietario.setIdPropietario(1);
        propietario.setNombrePropietario("Rodrigo");
        propietario.setApellidoPropietario("Estela");
        propietario.setDniPropietario(1234);
        propietario.setDomicilioPropietario("Uriburu 684");
        propietario.setTelefonoPropietario(562458);
        
        propietarioData.modificarPropietario(propietario);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO CAMBIAR ESTADO PROPIETARIO
        
        /*
        
        propietario.setIdPropietario(1);
        
        propietarioData.cambiarEstadoPropietario(1);
        
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO BUSCAR PROPIETARIO POR ID
        
        /*
        
        System.out.println(propietarioData.buscarPropietarioPorId(2).toString());
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO LISTAR PROPIETARIOS
        
        /*
        
        for (Propietario prop: propietarioData.listarPropietarios()) {
            System.out.println(prop.toString());
        }
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO GUARDAR PROPIEDAD
        
        
        
        //-------------------------------------------------------------
    }
    
}
