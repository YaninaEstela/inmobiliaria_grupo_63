
package GUI.Componentes;

import AccesoDatos.PropiedadData;
import Entidades.Propiedad;
import GUI.PanelLateral;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;



public class TemaPanelCentral {
    
    PropiedadData propiedadData = new PropiedadData();
    Propiedad propiedad = new Propiedad();
    private int multiplicador;

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
    
    
    
    // CREACIÓN DE PANELES
    public void panelAutomaticCreation(JPanel panelPrincipal, ArrayList <Propiedad> listaProp){
      
       ArrayList <Propiedad> listaPropiedades = listaProp;
       
       multiplicador = listaProp.size();
       
       panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
     
       JPanel gap = createPanelGap(Color.decode("#ffffff"), 900, 30);
       
       panelPrincipal.add(gap);
       
       panelPrincipal.removeAll();
       
       // PARA EL CONTENEDOR QUE TIENE LA IMAGEN Y LA DESCRIPCIÓN DE CADA PROPIEDAD
       for (Propiedad propiedad : listaPropiedades) {
           
            JPanel cabeceraPanel = createPanel(Color.decode("#ffffff"), 900, 50);
            JPanel panelCompleto = createPanel(Color.decode("#DFC6A5"), 900, 200);
            JPanel panelGap = createPanelGap(Color.decode("#ffffff"), 900, 10);
            
            // COLOR FONT
            Color textColorWhite = Color.decode("#ffffff");
            Color textColorBlack = Color.decode("#000000");
            
            // LABEL IMAGE
            Font imgFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 10);
            JLabel labelImg = createLabel(Color.decode("#F8F1E8"), 200, 200, imgFont, textColorBlack, lista(), SwingConstants.CENTER, SwingConstants.CENTER );
            panelCompleto.add(labelImg);
            
            // LABEL ID PROPIEDAD
            Font idPropiedadFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelIdPropiedad = createLabel(Color.decode("#F8F1E8"), 130, 50, idPropiedadFont, textColorBlack, "COD: "+propiedad.getIdPropiedad(), SwingConstants.CENTER, SwingConstants.CENTER );
            cabeceraPanel.add(labelIdPropiedad);
            
            // LABEL TIPO PROPIEDAD
            Font tipoPropiedadFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelTipoPropiedad = createLabel(Color.decode("#F8F1E8"), 130, 50, tipoPropiedadFont, textColorBlack, "Tipo: "+propiedad.getTipoPropiedad(), SwingConstants.CENTER, SwingConstants.CENTER );
            cabeceraPanel.add(labelTipoPropiedad);
            
            // LABEL PRECIO PROPIEDAD
            Font precioTasadoPropiedadFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelPrecioTasadoPropiedad = createLabel(Color.decode("#F8F1E8"), 130, 50, precioTasadoPropiedadFont, textColorBlack, "Precio: "+propiedad.getPrecioTasadoPropiedad() , SwingConstants.CENTER, SwingConstants.CENTER );
            cabeceraPanel.add(labelPrecioTasadoPropiedad);
            
            // LABEL AMBIENTES
            Font cantidadAmbientesFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelAmbientes = createLabel(Color.decode("#F8F1E8"), 130, 50, cantidadAmbientesFont, textColorBlack, "Ambientes: "+propiedad.getCantidadAmbientes(), SwingConstants.CENTER, SwingConstants.CENTER );
            cabeceraPanel.add(labelAmbientes);
            
            // LABEL BANIOS
            Font baniosFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelBanios = createLabel(Color.decode("#F8F1E8"), 130, 50, baniosFont, textColorBlack, "Baños: "+propiedad.getCantidadBanios(), SwingConstants.CENTER, SwingConstants.CENTER );
            cabeceraPanel.add(labelBanios);
            
            // LABEL ZONA
            Font zonaFont =  new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelZona = createLabel(Color.decode("#F8F1E8"), 130, 50, zonaFont, textColorBlack, "Zona: "+propiedad.getZonaPropiedad(), SwingConstants.CENTER, SwingConstants.CENTER );
            cabeceraPanel.add(labelZona);
            
            // LABEL SUPERFICIE
            Font superficieFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelSuperficie = createLabel(Color.decode("#F8F1E8"), 130, 50, superficieFont, textColorBlack, "Superficie: "+propiedad.getSuperficiePropiedad(), SwingConstants.CENTER, SwingConstants.CENTER );
            cabeceraPanel.add(labelSuperficie);  
            
            // LABEL AMUEBLADO
            Font amuebladoFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelAmueblado = createLabel(Color.decode("#F8F1E8"), 130, 50, amuebladoFont, textColorBlack, "Amueblado: "+propiedad.isAmueblado(), SwingConstants.CENTER, SwingConstants.CENTER);
            cabeceraPanel.add(labelSuperficie);
            
            // LABEL DIRECCION
            Font direccionFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelDireccion = createLabel(Color.decode("#F8F1E8"), 130, 50, direccionFont, textColorBlack, "Dirección: "+propiedad.getDireccionPropiedad(), SwingConstants.CENTER, SwingConstants.CENTER);
            cabeceraPanel.add(labelDireccion);
            
            // LABEL DISPONIBILIDAD
            Font disponibilidadFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelDisponibilidad = createLabel(Color.decode("#F8F1E8"), 130, 50, disponibilidadFont, textColorBlack, "Disponible: "+propiedad.isDisponibilidadPropiedad(), SwingConstants.CENTER, SwingConstants.CENTER);
            cabeceraPanel.add(labelDisponibilidad);   
            
            // LABEL DESCRIPCIÓN
            Font descripcionFont = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
            JLabel labelDescripcion = createLabel(Color.decode("#F8F1E8"), 800, 200, descripcionFont, textColorBlack, "Descripción: "+propiedad.getDescripcionPropiedad(), SwingConstants.LEFT, SwingConstants.TOP);
            panelCompleto.add(labelDescripcion);
            
            // AGREGA PANELES AL PANEL PRINCIPAL
            panelPrincipal.add(cabeceraPanel);
            panelPrincipal.add(panelCompleto);
            panelPrincipal.add(panelGap);
       }
       
        Iterator<Propiedad> iterador = listaPropiedades.iterator();
        while (iterador.hasNext()) {
            iterador.next();
            iterador.remove();
        }

       
    }
    
    
    // CREADOR DE LABELS
    // VAN PARÁMETROS DE ETIQUETAS
     private JLabel createLabel(Color color, int width, int height, Font font, Color textColor, Object object, int horizonalAlignment, int verticalAlignment) {
       JLabel label = new JLabel("<html>"+object+"</html>");
       label.setBackground(color);
       label.setForeground(textColor);
       label.setPreferredSize(new Dimension(width, height));
       label.setMaximumSize(new Dimension(width, height));
       label.setBorder(new LineBorder(Color.decode("#ffffff"), 4));
       label.setOpaque(true);
       label.setFont(font);
       label.setHorizontalAlignment(horizonalAlignment);
       label.setVerticalAlignment(verticalAlignment);
       return label;
    }
    
     private JPanel createPanel(Color color, int width, int height){
         
         JPanel panel = new JPanel();
         panel.setBackground(color);
         panel.setMaximumSize(new Dimension(width, height));
         panel.setBorder(new LineBorder(Color.decode("#836F50"), 2));
         panel.setOpaque(true);
         panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
         return panel;
     }
     
     private JPanel createPanelGap (Color color, int width, int height){
         
         JPanel panel = new JPanel();
         panel.setBackground(color);
         panel.setMaximumSize(new Dimension(width, height));
         panel.setBorder(new LineBorder(Color.decode("#ffffff"), 2));
         panel.setOpaque(true);
         panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
         return panel;
     }
    
     
    public String lista(){
    return "aca va el texto de la casa";
}
   
    
}
