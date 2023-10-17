/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Componentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class TemaPanelSuperior {
    
    public void aplicarPanel(JPanel panelSuperior){
        setPanelBackground(panelSuperior, Color.decode("#736d62"));
        setButtonFontType(f);
    }
    
    private void setPanelBackground(JPanel panelSuperior, Color color) {
        panelSuperior.setBackground(color);
    }
    
    private void setButtonFontType(JLabel button){
        Font font = new Font("Tw Cen Mt Condensed Extra Bold", Font.BOLD, 30);
        button.setFont(font);
    }
    
}
