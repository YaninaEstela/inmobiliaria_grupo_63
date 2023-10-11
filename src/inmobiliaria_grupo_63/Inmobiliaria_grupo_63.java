
package inmobiliaria_grupo_63;

import AccesoDatos.ContratoData;
import AccesoDatos.InquilinoData;
import AccesoDatos.PropiedadData;
import AccesoDatos.PropietarioData;
import Entidades.Contrato;
import Entidades.Inquilino;
import Entidades.Propiedad;
import Entidades.Propietario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Inmobiliaria_grupo_63 {

    public static void main(String[] args) {
        
        InquilinoData inquilinoData = new InquilinoData();
        
        PropietarioData propietarioData = new PropietarioData();
        
        PropiedadData propiedadData = new PropiedadData();
        
        ContratoData contratoData = new ContratoData();
        
        Inquilino inquilino = new Inquilino();
        
        Propietario propietario = new Propietario();
        
        Propiedad propiedad = new Propiedad();
        
        Contrato contrato = new Contrato();
        
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
        
        propietario.setNombrePropietario("Francisco");
        propietario.setApellidoPropietario("Martínez");
        propietario.setDniPropietario(9987);
        propietario.setDomicilioPropietario("José M. Moreno 1444");
        propietario.setTelefonoPropietario(888555);
        propietario.setEstadoPropietario(true);
        
        propietarioData.guardarPropietario(propietario);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO MODIFICAR PROPIETARIO
        
        /*
        
        propietario.setIdPropietario(4);
        propietario.setNombrePropietario("Alberto");
        propietario.setApellidoPropietario("Taylor");
        propietario.setDniPropietario(6682);
        propietario.setDomicilioPropietario("Rivadavia 226");
        propietario.setTelefonoPropietario(114562);
        
        propietarioData.modificarPropietario(propietario);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO CAMBIAR ESTADO PROPIETARIO
        
        /*
        
        propietario.setIdPropietario(4);
        
        propietarioData.cambiarEstadoPropietario(4);
        
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
        
        // MÉTODO LISTAR PROPIEDADES POR PROPIETARIO
    
        /*
        
        for (Propiedad propi: propiedadData.listarPropiedadesPorPropietario(1)) {
            System.out.println(propi.toString());
        }
        
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO GUARDAR CONTRATO
        
        /*
        
        contrato.setInquilino(inquilinoData.buscarInquilinoPorId(1));
        contrato.setPropiedad(propiedadData.buscarPropiedadPorId(3));
        contrato.setFechaInicio(LocalDate.of(2023, 10, 20));
        contrato.setFechaFinal(LocalDate.parse("2023-12-20"));
        contrato.setFechaRealizacion(LocalDate.now());
        contrato.setEstadoContrato(true);
        
        contratoData.guardarContrato(contrato);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO MODIFICAR CONTRATO
        
        /*
        
        contrato.setIdContrato(5);
        contrato.setInquilino(inquilinoData.buscarInquilinoPorId(1));
        contrato.setPropiedad(propiedadData.buscarPropiedadPorId(3));
        contrato.setFechaInicio(LocalDate.of(2023, 10, 20));
        contrato.setFechaFinal(LocalDate.of(2024, 01, 20));
        contrato.setFechaRealizacion(LocalDate.now());
        contrato.setEstadoContrato(true);
        
        contratoData.modificarContrato(contrato);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO CAMBIAR ESTADO CONTRATO
        
        /*
        
        //contrato.setIdContrato(5);
        
        contrato = contratoData.buscarContratoPorId(5);
        
        contratoData.cambiarEstadoContrato(5);
        
        */

        //-------------------------------------------------------------
        
        // MÉTODO BUSCAR CONTRATO POR ID
        
        /*
        
        if (contratoData.buscarContratoPorId(5)!=null) {
            System.out.println(contratoData.buscarContratoPorId(5).toString());
        }
        
        */
        
        //-------------------------------------------------------------
        
        // MÉTODO LISTAR CONTRATOS
        
        
        /*
        
        for (Contrato cont: contratoData.listarContratos()) {
            System.out.println(cont.toString());
        }
        
        */
        
        /*
        
        for (Contrato cont: contratoData.listarContratos()) {
            if (cont.getInquilino().getIdInquilino()==2) {
                System.out.println(cont.toString());
            }
        }
        
        */

        //-------------------------------------------------------------

        // MÉTODO LISTAR CONTRATOS POR INQUILINO
        
        /*
        
        for (Contrato cont: contratoData.listarContratosPorInquilino(2)) {
            System.out.println(cont.toString());
        }

        */

        //-------------------------------------------------------------
        
        // MÉTODO LISTAR CONTRATOS POR PROPIEDAD
        
        /*
        
        for (Contrato cont: contratoData.listarContratosPorPropiedad(5)) {
            System.out.println(cont.toString());
        }
        
        */
        
        //-------------------------------------------------------------
        
    }
    
}
