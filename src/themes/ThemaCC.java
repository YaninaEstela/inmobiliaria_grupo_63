/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author crist
 */
public class ThemaCC {
    //---------------------------------------------------------------------------- 

    // COMIENZO THEMA CIEN_BLUE   
    
    public void CobreTheme(JPanel panelPrincipal, JLabel btnFiltros, JPanel separador, JLabel btnGestionPropiedad, JLabel btnGestionPropietario,JLabel btnGestionInquilino, JLabel btnGestionContratos) {
        setPanelBackground(panelPrincipal, Color.decode("#f6f6f6"));
//      setPanelBackground(panelMenu, Color.decode("#6a462d"));
        setSeparatorBackground(separador, Color.decode("#ffffff"));
        setButtonStyles(btnFiltros, "Menu");
        setButtonStyles(btnGestionPropiedad, "Gestion Propiedad");
         setButtonStyles(btnGestionPropietario, "Gestion Propietario");
        setButtonStyles(btnGestionInquilino, "  Gestion Inquilino");
        setButtonStyles(btnGestionContratos, " Gestion Contratos");
        
        setButtonTextPosition(btnFiltros, SwingConstants.CENTER, SwingConstants.CENTER);
        setButtonTextPosition(btnGestionPropiedad, SwingConstants.LEFT, SwingConstants.CENTER);
         setButtonTextPosition(btnGestionPropietario, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonTextPosition(btnGestionInquilino, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonTextPosition(btnGestionContratos, SwingConstants.LEFT, SwingConstants.CENTER);
        
        setButtonFontType(btnFiltros);
        setButtonFontType(btnGestionPropiedad);
        setButtonFontType(btnGestionPropietario);
        setButtonFontType(btnGestionInquilino);
        setButtonFontType(btnGestionContratos);
        
        setButtonMovement(btnFiltros);
        setButtonMovement(btnGestionPropiedad);
        setButtonMovement(btnGestionPropietario);
        setButtonMovement(btnGestionInquilino);
        setButtonMovement(btnGestionContratos);
      
    }
 private void setPanelBackground(JPanel panel, Color color) {
        panel.setBackground(color);
    }
 private void setSeparatorBackground(JPanel separator, Color color) {
        separator.setBackground(color);
    }
  private void setButtonStyles(JLabel label, String text) {
        label.setBackground(Color.decode("#9d9d9d"));
        label.setForeground(Color.decode("#ffffff"));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.decode("#737373"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#9d9d9d"));
            }
        });

        label.setText(text);
    }

    private void setButtonTextPosition(JLabel label, int horizontalAlignment, int verticalAlignment) {
        label.setHorizontalAlignment(horizontalAlignment);
        label.setVerticalAlignment(verticalAlignment);
    }

    private void setButtonFontType(JLabel label) {
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.BOLD, 30);
        label.setFont(font);
    }

    private void setButtonMovement(JLabel label) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.decode("#737373"));
                Point location = label.getLocation();
                int w = label.getWidth();
                int h = label.getHeight();
                int newX = location.x - 1;
                int newY = location.y - 1;
                label.setBounds(newX, newY, w + 6, h + 6);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#9d9d9d"));
                int w = label.getWidth();
                int h = label.getHeight();
                Point location = label.getLocation();
                int newX = location.x + 1;
                int newY = location.y + 1;
                label.setBounds(newX, newY, w - 6, h - 6);
            }
        });
    }
}

