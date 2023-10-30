/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_VISTAS;

import themes.ThemaCC;

/**
 *
 * @author crist
 */
public class MenuPrincipalInmobiliaria extends javax.swing.JFrame {
    ThemaCC temaCC = new ThemaCC();
    public MenuPrincipalInmobiliaria() {
        initComponents();
        themaColorCC();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        btnPropiedad = new javax.swing.JLabel();
        btnContratos = new javax.swing.JLabel();
        btnPropietario = new javax.swing.JLabel();
        btnInquilino = new javax.swing.JLabel();
        separador = new javax.swing.JPanel();
        btnMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(246, 246, 246));
        contenido.setPreferredSize(new java.awt.Dimension(1037, 635));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jPanelFondo.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 1037, 635));

        btnPropiedad.setBackground(new java.awt.Color(204, 204, 204));
        btnPropiedad.setText("Gestion Propiedad");
        btnPropiedad.setOpaque(true);
        btnPropiedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPropiedadMouseClicked(evt);
            }
        });
        jPanelFondo.add(btnPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 50));

        btnContratos.setBackground(new java.awt.Color(204, 204, 204));
        btnContratos.setText("Gestion Contratos");
        btnContratos.setOpaque(true);
        btnContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContratosMouseClicked(evt);
            }
        });
        jPanelFondo.add(btnContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 240, 50));

        btnPropietario.setBackground(new java.awt.Color(204, 204, 204));
        btnPropietario.setText("Gestion Propietario");
        btnPropietario.setOpaque(true);
        jPanelFondo.add(btnPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 240, 50));

        btnInquilino.setBackground(new java.awt.Color(204, 204, 204));
        btnInquilino.setText("Gestion Inquilino");
        btnInquilino.setOpaque(true);
        btnInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInquilinoMouseClicked(evt);
            }
        });
        jPanelFondo.add(btnInquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 240, 50));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanelFondo.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 10));

        btnMenu.setText("Menu ");
        jPanelFondo.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPropiedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPropiedadMouseClicked
        PanelGestionPropiedad gestionPropietario = new PanelGestionPropiedad();
        gestionPropietario.setSize(1037, 635); //SE ABRE LA PÁGINA HOME
        gestionPropietario.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(gestionPropietario);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnPropiedadMouseClicked

    private void btnInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInquilinoMouseClicked
        GestionInquilino gestionInquilino = new GestionInquilino();
         gestionInquilino.setSize(1037, 635); //SE ABRE LA PÁGINA HOME
         gestionInquilino.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(gestionInquilino);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnInquilinoMouseClicked

    private void btnContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContratosMouseClicked
        GestionContrato gestionContratos = new GestionContrato();
        gestionContratos.setSize(1037, 635); //SE ABRE LA PÁGINA HOME
        gestionContratos.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(gestionContratos);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnContratosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalInmobiliaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnContratos;
    private javax.swing.JLabel btnInquilino;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JLabel btnPropiedad;
    private javax.swing.JLabel btnPropietario;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel separador;
    // End of variables declaration//GEN-END:variables
public void themaColorCC(){
 temaCC.CobreTheme(jPanelFondo,btnMenu,separador,btnPropiedad,btnPropietario,btnInquilino,btnContratos);
}

}
