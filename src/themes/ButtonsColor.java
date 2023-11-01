/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package themes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author crist
 */
public class ButtonsColor {
    
    
        
    
    
    
   public void setButtonStylesGreen(JLabel label) {
        label.setBackground(Color.decode("#007723"));
        label.setForeground(Color.decode("#ffffff"));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.decode("#143018"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#007723"));
            }
        });

       
    }
   
    public void setButtonStylesRed(JLabel label) {
        label.setBackground(Color.decode("#DF0000"));
        label.setForeground(Color.decode("#ffffff"));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.decode("#4a1508"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#DF0000"));
            }
        });

       
    }
    
    public void setButtonStylesDorado(JLabel label) {
        label.setBackground(Color.decode("#C39717"));
        label.setForeground(Color.decode("#ffffff"));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.decode("#29200e"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#C39717"));
            }
        });

       
    }
    
    public void setButtonStylesBlue(JLabel label) {
        label.setBackground(Color.decode("#3333FF"));
        label.setForeground(Color.decode("#ffffff"));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.decode("#333c87"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.decode("#3333FF"));
            }
        });

       
    }
}
