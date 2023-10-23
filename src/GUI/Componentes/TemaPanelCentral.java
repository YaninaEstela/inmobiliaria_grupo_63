
package GUI.Componentes;

import AccesoDatos.PropiedadData;
import Entidades.Propiedad;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;



public class TemaPanelCentral {
    
    PropiedadData propiedadData = new PropiedadData();
    Propiedad propiedad = new Propiedad();
    
    // CREACIÓN DE PANELES
    public void panelAutomaticCreation(JPanel panelPrincipal){
      
       ArrayList <Propiedad> listaPropiedades = propiedadData.listarPropiedades();
       
       panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
     
       JPanel gap = createPanelGap(Color.decode("#ffffff"), 900, 30);
       
       panelPrincipal.add(gap);
       
       for (Propiedad prop : listaPropiedades) {
            JPanel cabeceraPanel = createPanel(Color.decode("#ffffff"), 900, 50);
        }
       
    }
    
    
    // CREADOR DE LABELS
    // VAN PARÁMETROS DE ETIQUETAS
     private JLabel createLabel(Color color, int width, int height, Font font, Color textColor, Object object, int horizonalAlignment, int verticalAlignment) {
       JLabel label = new JLabel("<html>"+object+"</html>");
       label.setBackground(color);
       label.setForeground(color);
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
   
    public int cantidad(){
        return 4;
    }
    
}
