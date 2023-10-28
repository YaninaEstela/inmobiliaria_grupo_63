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
    
    public void CobreTheme(JPanel panelPrincipal, JPanel panelMenu, JLabel lblLibreria, JPanel separador, JLabel btnPrincipal, JLabel btnPrestamos, JLabel btnDevoluciones, JLabel btnUsuarios, JLabel btnReportes, JLabel btnLibros) {
        setPanelBackground(panelPrincipal, Color.decode("#FFFFFF"));
        setPanelBackground(panelMenu, Color.decode("#6a462d"));
        setSeparatorBackground(separador, Color.decode("#ffffff"));
        setButtonStyles(lblLibreria, "Libreria");
        setButtonStyles(btnPrincipal, "  Principal");
        setButtonStyles(btnPrestamos, "  Prestamos");
        setButtonStyles(btnDevoluciones, "  Devoluciones");
        setButtonStyles(btnUsuarios, "  Usuarios");
        setButtonStyles(btnLibros, "  Libros");
        setButtonStyles(btnReportes, "  Reportes");
        setButtonTextPosition(lblLibreria, SwingConstants.CENTER, SwingConstants.CENTER);
        setButtonTextPosition(btnPrincipal, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonTextPosition(btnPrestamos, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonTextPosition(btnDevoluciones, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonTextPosition(btnUsuarios, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonTextPosition(btnLibros, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonTextPosition(btnReportes, SwingConstants.LEFT, SwingConstants.CENTER);
        setButtonFontType(lblLibreria);
        setButtonFontType(btnPrincipal);
        setButtonFontType(btnPrestamos);
        setButtonFontType(btnDevoluciones);
        setButtonFontType(btnUsuarios);
        setButtonFontType(btnLibros);
        setButtonFontType(btnReportes);
        setButtonMovement(btnPrincipal);
        setButtonMovement(btnPrestamos);
        setButtonMovement(btnDevoluciones);
        setButtonMovement(btnUsuarios);
        setButtonMovement(btnLibros);
        setButtonMovement(btnReportes);
    }
 private void setPanelBackground(JPanel panel, Color color) {
        panel.setBackground(color);
    }
 private void setSeparatorBackground(JPanel separator, Color color) {
        separator.setBackground(color);
    }
  private void setButtonStyles(JLabel label, String text) {
        label.setBackground(Color.decode("#925c33"));
        label.setForeground(Color.decode("#4f3624"));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.decode("#4f3624"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#925c33"));
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
                label.setBackground(Color.decode("#8d6e5a"));
                Point location = label.getLocation();
                int w = label.getWidth();
                int h = label.getHeight();
                int newX = location.x - 1;
                int newY = location.y - 1;
                label.setBounds(newX, newY, w + 6, h + 6);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#925c33"));
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

