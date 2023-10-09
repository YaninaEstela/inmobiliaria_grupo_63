
package inmobiliaria_grupo_63;

import AccesoDatos.InquilinoData;
import AccesoDatos.PropiedadData;
import AccesoDatos.PropietarioData;
import Entidades.Inquilino;
import Entidades.Propiedad;
import Entidades.Propietario;


public class Inmobiliaria_grupo_63 {

    public static void main(String[] args) {
        
        InquilinoData inquilinoData = new InquilinoData();
        
        PropietarioData propietarioData = new PropietarioData();
        
        PropiedadData propiedadData = new PropiedadData();
        
        Inquilino inquilino = new Inquilino();
        
        Propietario propietario = new Propietario();
        
        Propiedad propiedad = new Propiedad();
        
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
        
        /*
        
        propiedad.setPropietario(propietarioData.buscarPropietarioPorId(1));
        propiedad.setTipoPropiedad("Casa");
        propiedad.setPrecioTasadoPropiedad(80000);
        propiedad.setZonaPropiedad("Casco urbano");
        propiedad.setSuperficiePropiedad(300);
        propiedad.setDireccionPropiedad("Mitre 666");
        propiedad.setDisponibilidadPropiedad(true);
        propiedad.setCantidadAmbientes(4);
        propiedad.setCantidadBanios(1);
        propiedad.setAmueblado(true);
        propiedad.setDescripcionPropiedad("Amplia");
        propiedad.setEstadoPropiedad(true);
        
        
        propiedadData.guardarPropiedad(propiedad);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO MODIFICAR PROPIEDAD
        
        /*
        
        propiedad.setIdPropiedad(3);
        propiedad.setPropietario(propietarioData.buscarPropietarioPorId(1));
        propiedad.setInquilino(inquilinoData.buscarInquilinoPorId(1));
        propiedad.setTipoPropiedad("Departamento");
        propiedad.setPrecioTasadoPropiedad(80000);
        propiedad.setZonaPropiedad("Casco urbano");
        propiedad.setSuperficiePropiedad(300);
        propiedad.setDireccionPropiedad("Mitre 666");
        propiedad.setDisponibilidadPropiedad(true);
        propiedad.setCantidadAmbientes(4);
        propiedad.setCantidadBanios(1);
        propiedad.setAmueblado(true);
        propiedad.setDescripcionPropiedad("Amplia");
        propiedad.setEstadoPropiedad(true);
        
        propiedadData.modificarPropiedad(propiedad);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO CAMBIAR ESTADO PROPIEDAD
        
        //propiedad.setIdPropiedad(3);
        
        /*
        
        propiedad = propiedadData.buscarPropiedadPorId(3);
        
        propiedadData.cambiarEstadoPropiedad(3);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO BUSCAR PROPIEDAD POR ID
        
        /*
        
        System.out.println(propiedadData.buscarPropiedadPorId(3).toString());
        
        */

        //-------------------------------------------------------------
       
        // MÉTODO LISTAR PROPIEDADES
        
        /*
        
        for (Propiedad propi: propiedadData.listarPropiedades()) {
            System.out.println(propi.toString());
        }
        
        */

        //-------------------------------------------------------------
        
        
    }
    
}
