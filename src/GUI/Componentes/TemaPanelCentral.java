
package GUI.Componentes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TemaPanelCentral {
    
    // CREACIÓN DE PANELES
    public void panelAutomaticCreation(JPanel panelPrincipal){
        int cant= cantidad();
        for(int i=0; i<cant; i++ ){
        labelImage(panelPrincipal, Color.decode("#F8F1E8"));
        labelPrincipal(panelPrincipal, Color.decode("#DFC6A5")); 
        }
    }
    
     private void labelImage(JPanel panelPrincipal, Color color) {
        JLabel labelText = new JLabel(lista());
        labelText.setBackground(color);
        labelText.setPreferredSize(new Dimension(200, 200));
        //labelText.setLocation(x, y);
        labelText.setOpaque(true);
        panelPrincipal.add(labelText);    
    }
    
    private void labelPrincipal(JPanel panelPrincipal, Color color) {
        JLabel labelText = new JLabel(lista());
        labelText.setBackground(color);
        labelText.setPreferredSize(new Dimension(800, 200));
        //labelText.setLocation(x, y);
        labelText.setOpaque(true);
        panelPrincipal.add(labelText);    
    }
    
    public String lista(){
    return "aca va el texto de la casa";
}
   
    public int cantidad(){
        return 4;
    }
    
}
