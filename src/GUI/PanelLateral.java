/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import GUI.Componentes.TemaPanelLateral;

/**
 *
 * @author USUARIO
 */
public class PanelLateral extends javax.swing.JPanel {

    /**
     * Creates new form PanelLateral
     */
    
    TemaPanelLateral temaPanelLateral = new TemaPanelLateral();
    
    public PanelLateral() {
        initComponents();
        aplicarTemas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLateral = new javax.swing.JPanel();
        jLabelTipoPropiedad = new javax.swing.JLabel();
        jLabelCantidadAmbientes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCantBanios = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelFiltrosResultados = new javax.swing.JLabel();
        jTextTipoPropiedad = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jPanelLateral.setBackground(new java.awt.Color(0, 102, 102));
        jPanelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTipoPropiedad.setText(" PROPIEDAD");
        jPanelLateral.add(jLabelTipoPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabelCantidadAmbientes.setText("CANTIDAD DE AMBIENTES");
        jPanelLateral.add(jLabelCantidadAmbientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setText("COCHERA");
        jPanelLateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel4.setText("SUPERFICIE (m²)");
        jPanelLateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setText("AMUEBLADO");
        jPanelLateral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabelCantBanios.setText("CANTIDAD DE BAÑOS");
        jPanelLateral.add(jLabelCantBanios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setText("ZONA");
        jPanelLateral.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel8.setText("PRECIO");
        jPanelLateral.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabelFiltrosResultados.setText("FILTROS RESULTADOS");
        jPanelLateral.add(jLabelFiltrosResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTipoPropiedadActionPerformed(evt);
            }
        });
        jPanelLateral.add(jTextTipoPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, -1));
        jPanelLateral.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));
        jPanelLateral.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));
        jPanelLateral.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, -1));
        jPanelLateral.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, -1));
        jPanelLateral.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));
        jPanelLateral.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel10.setText("DESDE");
        jPanelLateral.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanelLateral.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel11.setText("HASTA");
        jPanelLateral.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));
        jPanelLateral.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel12.setText("APLICAR FILTROS");
        jPanelLateral.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTipoPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTipoPropiedadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCantBanios;
    private javax.swing.JLabel jLabelCantidadAmbientes;
    private javax.swing.JLabel jLabelFiltrosResultados;
    private javax.swing.JLabel jLabelTipoPropiedad;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextTipoPropiedad;
    // End of variables declaration//GEN-END:variables

    public void aplicarTemas() {
        temaPanelLateral.aplicarPanel(jPanelLateral, jLabelFiltrosResultados, jLabelTipoPropiedad, jLabelCantidadAmbientes, jLabelCantBanios,jTextTipoPropiedad);
    }
}