/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author USUARIO
 */
public class TemaPanelSuperior {
    
    // ESTE MÉTODO ES UN INVOCADOR DE LOS MÉTODOS QUE ESCRIBÍ EN ESTA CLASE TemaPanelSuperior
    // SE JUNTAN TODOS LOS MÉTODOS PARA APLICARSE
    public void aplicarPanel(JPanel panelSuperior,JLabel button){
        setPanelBackground(panelSuperior, Color.decode("#ffffff"));
        setButtonFontType(button);
        setButtonStyles(button,"Buscar");
        setButtonTextPosition(button, SwingConstants.CENTER, SwingConstants.CENTER);
    }
    
    private void setPanelBackground(JPanel panelSuperior, Color color) {
        panelSuperior.setBackground(color);
    }
    
    private void setButtonFontType(JLabel button){
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.BOLD, 30);
        button.setFont(font);
    }
    
    private void setButtonStyles(JLabel button, String text) {
        button.setOpaque(true);
        button.setBackground(Color.decode("#CCAB7A"));
        button.setForeground(Color.decode("#ffffff"));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // SE CARGA EN EL EVENTO, EL MÉTODO
                button.setBackground(Color.decode("#836F50"));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.decode("#CCAB7A"));
                
            }
        });

        button.setText(text);
    }
    
    private void setButtonTextPosition(JLabel button, int horizontalAlignment, int verticalAlignment) {
        button.setHorizontalAlignment(horizontalAlignment);
        button.setVerticalAlignment(verticalAlignment);
    }
    
}
