
package GUI.Componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.util.Locale.filter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TemaPanelLateral {
   
    public void aplicarPanel(JPanel panelLateral, JLabel title, JLabel filtroTipoPropiedad, JLabel filtroCantAmbientes, JLabel filtroCantBanios,JTextField textTipoPropiedad){
        setPanelBackground(panelLateral, Color.decode("#ffffff"));
        setTitleFontType(title);
        setFiltersFontType(filtroTipoPropiedad, "TIPO DE PROPIEDAD");
        setFiltersFontType(filtroCantAmbientes, "CANTIDAD DE AMBIENTES");
        setFiltersFontType(filtroCantBanios, "CANTIDAD DE BAÑOS");
        
        textFieldType(textTipoPropiedad,Color.decode("#CCAB7A"),80,30);
    }
    
    private void setPanelBackground(JPanel panelLateral, Color color) {
        panelLateral.setBackground(color);
    }
    
     private void setTitleFontType(JLabel title){
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.BOLD, 20);
        title.setFont(font);
        title.setForeground(Color.decode("#000000"));
    }
    
      private void setFiltersFontType(JLabel filter, String text){
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 15);
        filter.setFont(font);
        filter.setForeground(Color.decode("#000000"));
        filter.setText(text);
      } 
      private void textFieldType(JTextField field,Color color,int width, int height){
      field.setBackground(color);
      field.setBorder(null);
      field.setPreferredSize(new Dimension(width, height));
      }
}
