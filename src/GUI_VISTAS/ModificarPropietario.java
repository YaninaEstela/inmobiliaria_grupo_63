/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_VISTAS;

import AccesoDatos.PropietarioData;
import Entidades.Propietario;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import themes.ButtonsColor;

/**
 *
 * @author crist
 */
public class ModificarPropietario extends javax.swing.JFrame {

    ButtonsColor buttons = new ButtonsColor();
    PropietarioData propietarioData = new PropietarioData();
    Propietario propietario = new Propietario();
    DefaultTableModel modeloTablaPropietarios = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public ModificarPropietario() {
        initComponents();
        armarCabeceraPropietarios();
        cargarTablaPropietarios(propietarioData.listarPropietarios());
        colors();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnModificarPropietario = new javax.swing.JLabel();
        jTextFieldDomicilio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePropietario = new javax.swing.JTable();
        btnSalir = new javax.swing.JLabel();
        jTextFieldBuscarPropietarioXDni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Telefono");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 24));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 24));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DNI");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Domicilio");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 24));

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });
        jTextFieldDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 30));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, 30));

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 30));

        jLabel6.setBackground(new java.awt.Color(76, 40, 130));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Limpiar Todo");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 50));

        btnModificarPropietario.setBackground(new java.awt.Color(0, 119, 35));
        btnModificarPropietario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarPropietario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarPropietario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificarPropietario.setText("Modificar Propietario");
        btnModificarPropietario.setOpaque(true);
        btnModificarPropietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarPropietarioMouseClicked(evt);
            }
        });
        jPanel3.add(btnModificarPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 50));

        jTextFieldDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDomicilioActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Modificar Propietario");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 40));

        jPanel2.setBackground(new java.awt.Color(200, 200, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePropietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePropietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePropietarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePropietario);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 87, 670, 460));

        btnSalir.setBackground(new java.awt.Color(223, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("Salir");
        btnSalir.setOpaque(true);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 740, 38));

        jTextFieldBuscarPropietarioXDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarPropietarioXDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarPropietarioXDniKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldBuscarPropietarioXDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 160, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        jLabel8.setText("Propietario DNI");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 26));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Propietarios");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 24));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume(); // Evita caracteres no válidos
        }

        if (jTextFieldDNI.getText().length() >= 8) {
            evt.consume(); // Evita que se ingresen más de 20 caracteres
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldDNIKeyTyped

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        if (jTextFieldNombre.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        if (jTextFieldApellido.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume(); // Evita caracteres no válidos
        }

        if (jTextFieldTelefono.getText().length() >= 11) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        limpiarTextFields();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnModificarPropietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPropietarioMouseClicked
        modificarPropietario();
    }//GEN-LAST:event_btnModificarPropietarioMouseClicked

    private void jTextFieldDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDomicilioActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jTextFieldBuscarPropietarioXDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPropietarioXDniKeyReleased
        cargarTablaPropietarios(buscarPropietarioXDni());
    }//GEN-LAST:event_jTextFieldBuscarPropietarioXDniKeyReleased

    private void jTablePropietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePropietarioMouseClicked
        cargarTextField();
    }//GEN-LAST:event_jTablePropietarioMouseClicked

    private void jTextFieldBuscarPropietarioXDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPropietarioXDniKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume(); // Evita caracteres no válidos
        }

        if (jTextFieldBuscarPropietarioXDni.getText().length() >= 11) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldBuscarPropietarioXDniKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModificarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModificarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModificarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModificarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModificarPropietario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnModificarPropietario;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePropietario;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBuscarPropietarioXDni;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDomicilio;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
public void armarCabeceraPropietarios() {
        modeloTablaPropietarios.addColumn("ID");
        modeloTablaPropietarios.addColumn("Nombre");
        modeloTablaPropietarios.addColumn("Apellido");
        modeloTablaPropietarios.addColumn("DNI");
        modeloTablaPropietarios.addColumn("Domicilio");
        modeloTablaPropietarios.addColumn("Telefono");
        jTablePropietario.setModel(modeloTablaPropietarios);

//        jTablePropiedad.sizeColumnsToFit(1);
    }

    public void cargarTablaPropietarios(ArrayList<Propietario> list) {
        borrarFilas();

        for (Propietario propietario : list) {
            modeloTablaPropietarios.addRow(new Object[]{
                propietario.getIdPropietario(),
                propietario.getNombrePropietario(),
                propietario.getApellidoPropietario(),
                propietario.getDniPropietario(),
                propietario.getDomicilioPropietario(),
                propietario.getTelefonoPropietario()

            });
        }
    }

    public void borrarFilas() {
        int f = jTablePropietario.getRowCount() - 1; // CANTIDAD DE FILAS MENOS UNO
        for (; f >= 0; f--) {
            modeloTablaPropietarios.removeRow(f);
        }
    }

    private void limpiarTextFields() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDNI.setText("");
        jTextFieldDomicilio.setText("");
        jTextFieldTelefono.setText("");

    }

    public ArrayList<Propietario> buscarPropietarioXDni() {
        ArrayList<Propietario> listaPropietario = new ArrayList<>();
        borrarFilas();
        for (Propietario prop : propietarioData.listarPropietarios()) {
            if (String.valueOf(prop.getDniPropietario()).startsWith(jTextFieldBuscarPropietarioXDni.getText())) {
                listaPropietario.add(prop);

            }
        }

        return listaPropietario;
    }

    public void cargarTextField() {
        int filaSeleccionada = jTablePropietario.getSelectedRow();
        String nombre = jTablePropietario.getValueAt(filaSeleccionada, 1).toString();
        jTextFieldNombre.setText(nombre + "");

        String apellido = jTablePropietario.getValueAt(filaSeleccionada, 2).toString();
        jTextFieldApellido.setText(apellido + "");

        int dni = (Integer) jTablePropietario.getValueAt(filaSeleccionada, 3);
        jTextFieldDNI.setText(dni + "");

        String domicilio = jTablePropietario.getValueAt(filaSeleccionada, 4).toString();
        jTextFieldDomicilio.setText(domicilio + "");

        String telefono = jTablePropietario.getValueAt(filaSeleccionada, 5).toString();
        jTextFieldTelefono.setText(telefono + "");
    }

    public void modificarPropietario() {
        int filaSeleccionada = jTablePropietario.getSelectedRow();
        Propietario propietario = new Propietario();
        if (filaSeleccionada != -1) {
            int idPropietario = (Integer) jTablePropietario.getValueAt(filaSeleccionada, 0);

            propietario = propietarioData.buscarPropietarioPorId(idPropietario);
        }
        boolean[] propietarioRelleno = {false, false, false, false, false};

        try {

            if (validacionTextField1(jTextFieldNombre)) {
                propietario.setNombrePropietario(jTextFieldNombre.getText());
                propietarioRelleno[0] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar Nombre Propietario");
                propietarioRelleno[0] = false;
            }

            if (validacionTextField1(jTextFieldApellido)) {
                propietario.setApellidoPropietario(jTextFieldApellido.getText());
                propietarioRelleno[1] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar Apellido Propietario");
                propietarioRelleno[1] = false;
            }

            if (validacionTextField1(jTextFieldDNI)) {
                propietario.setDniPropietario(Integer.parseInt(jTextFieldDNI.getText()));
                propietarioRelleno[2] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar DNI");
                propietarioRelleno[2] = false;
            }

            if (validacionTextField1(jTextFieldDomicilio)) {
                propietario.setDomicilioPropietario(jTextFieldDomicilio.getText());
                propietarioRelleno[3] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar Domicilio Propietario");
                propietarioRelleno[3] = false;
            }

            if (validacionTextField1(jTextFieldTelefono)) {
                propietario.setTelefonoPropietario(Integer.parseInt(jTextFieldTelefono.getText()));
                propietarioRelleno[4] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Telefono Propietario");
                propietarioRelleno[4] = false;
            }

            propietario.setEstadoPropietario(true);

            if (propietarioRelleno[0] == true
                    && propietarioRelleno[1] == true
                    && propietarioRelleno[2] == true
                    && propietarioRelleno[3] == true
                    && propietarioRelleno[4] == true) {
                propietarioData.guardarPropietario(propietario);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese el Dni correctamente");
            jTextFieldDNI.setText("");
            validacionTextField1(jTextFieldDNI);

        } finally {
            cargarTablaPropietarios(propietarioData.listarPropietarios());
            limpiarTextFields();
        }
    }

    private boolean validacionTextField1(JTextField jtf) {
        if (jtf.getText().isEmpty()) {
            jtf.setBorder(BorderFactory.createLineBorder(Color.decode("#aa4356")));
            return false;
        } else {
            jtf.setBorder(null);
            return true;
        }
    }
    
    public void colors() {
        buttons.setButtonStylesGreen(btnModificarPropietario);
        buttons.setButtonStylesRed(btnSalir);
        buttons.setButtonStylesDorado(jLabel6);
        
    }

}
