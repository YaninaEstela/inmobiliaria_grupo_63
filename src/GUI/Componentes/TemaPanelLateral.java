
package GUI.Componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.util.Locale.filter;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TemaPanelLateral {
   
    public void aplicarPanel(JPanel panelLateral, 
            JLabel title,
            JLabel filtroTipoPropiedad, 
            JLabel filtroCantAmbientes, 
            JLabel filtroCantBanios,
            JLabel filtroZona, 
            JLabel filtroSuperficie, 
            JLabel filtroAmueblado, 
            JLabel filtroCochera,
            JLabel filtroPrecio, 
            JLabel filtroPrecioDesde, 
            JLabel filtroPrecioHasta,
            JTextField textFieldTipoPropiedad, 
            JTextField textFieldCantAmbientes,
            JTextField textFieldCantBanios,
            JTextField textFieldZona,
            JTextField textFieldSuperficie,
            JTextField textFieldPrecioDesde,
            JTextField textFieldPrecioHasta,
            JLabel buttonAplicarFiltros,
            JCheckBox checkBoxAmueblado,
            JCheckBox checkBoxCochera
            ){
        
        setPanelBackground(panelLateral, Color.decode("#ffffff"));
        setTitleFontType(title);
        
        setFiltersFontType(filtroTipoPropiedad, "TIPO DE PROPIEDAD");
        setFiltersFontType(filtroCantAmbientes, "CANTIDAD DE AMBIENTES");
        setFiltersFontType(filtroCantBanios, "CANTIDAD DE BAÑOS");
        setFiltersFontType(filtroZona, "ZONA");
        setFiltersFontType(filtroSuperficie, "SUPERFICIE (m²)");
        setFiltersFontType(filtroAmueblado, "AMUEBLADO");
        setFiltersFontType(filtroCochera, "COCHERA");
        setFiltersFontType(filtroPrecio, "PRECIO");
        setFiltersFontType(filtroPrecioDesde, "DESDE");
        setFiltersFontType(filtroPrecioHasta, "HASTA");
        
        
        textFieldType(textFieldTipoPropiedad,Color.decode("#CCAB7A"),80,30);
        textFieldType(textFieldCantAmbientes,Color.decode("#CCAB7A"),80,30);
        textFieldType(textFieldCantBanios,Color.decode("#CCAB7A"),80,30);
        textFieldType(textFieldZona,Color.decode("#CCAB7A"),80,30);
        textFieldType(textFieldSuperficie,Color.decode("#CCAB7A"),80,30);
        textFieldType(textFieldPrecioDesde,Color.decode("#CCAB7A"),80,30);
        textFieldType(textFieldPrecioHasta,Color.decode("#CCAB7A"),80,30);
        
        
        setButtonFontType (buttonAplicarFiltros);
        setButtonStyles(buttonAplicarFiltros, "APLICAR FILTROS");
        setButtonTextPosition(buttonAplicarFiltros, SwingConstants.CENTER, SwingConstants.CENTER);       
        
        setCheckBox(checkBoxAmueblado, Color.decode("#CCAB7A"));
        setCheckBox(checkBoxCochera, Color.decode("#CCAB7A"));
        
    }
    
    private void setPanelBackground(JPanel panelLateral, Color color) {
        panelLateral.setBackground(color);
    }
    // LETRA Y COLOR PARA "FILTROS RESULTADOS"
     private void setTitleFontType(JLabel title){
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.BOLD, 20);
        title.setFont(font);
        title.setForeground(Color.decode("#000000"));
    }
    // LETRA Y COLOR PARA LOS FILTROS
      private void setFiltersFontType(JLabel filter, String text){
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 15);
        filter.setFont(font);
        filter.setForeground(Color.decode("#000000"));
        filter.setText(text);
      } 
      // SE LE AGREGA COLOR A UN TextField
      private void textFieldType(JTextField field,Color color,int width, int height){
      field.setBackground(color);
      field.setBorder(null);
      field.setPreferredSize(new Dimension(width, height));
      }
      
      
      
      // ESTILO DEL BOTÓN "APLICAR FILTROS"
      
      private void setButtonFontType(JLabel button){
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.PLAIN, 20);
        button.setFont(font);
    }
    
    private void setButtonStyles(JLabel button, String text) {
        button.setOpaque(true);
        button.setBackground(Color.decode("#000000"));
        button.setForeground(Color.decode("#ffffff"));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // SE CARGA EN EL EVENTO, EL MÉTODO
                button.setBackground(Color.decode("#836F50"));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.decode("#000000"));
                
            }
        });

        button.setText(text);
    }
    
    private void setButtonTextPosition(JLabel button, int horizontalAlignment, int verticalAlignment) {
        button.setHorizontalAlignment(horizontalAlignment);
        button.setVerticalAlignment(verticalAlignment);
    }
     
    
    // PARA CHECKBOXS DE AMUEBLADO Y COCHERA
    
    private void setCheckBox(JCheckBox checkBox, Color color) {
        checkBox.setForeground(color);
    }
    
}
