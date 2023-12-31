/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_VISTAS;

import AccesoDatos.InquilinoData;
import AccesoDatos.PropietarioData;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import themes.ButtonsColor;

/**
 *
 * @author crist
 */
public class ModificarInquilino extends javax.swing.JFrame {
    ButtonsColor buttons = new ButtonsColor();
    InquilinoData inquilinoData = new InquilinoData();
    PropietarioData propietarioData = new PropietarioData();
    DefaultTableModel modeloTablaInquilino = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    
    public ModificarInquilino() {
        initComponents();
        armarCabeceraInquilino();
        
        cargarTablaInquilino(inquilinoData.listarInquilinos());
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
        jTextFieldDetalle = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        btnLimpiarTodo = new javax.swing.JLabel();
        btnModificarInquilino = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInquilinos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBuscarInquilinoXDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 24));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar Inquilino");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 24));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DNI");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Detalle");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 24));

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
        jPanel3.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 30));

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
        jPanel3.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 30));

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
        jPanel3.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 30));

        jTextFieldDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDetalleActionPerformed(evt);
            }
        });
        jTextFieldDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDetalleKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 210, 30));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "FISICO", "JURIDICO" }));
        jPanel3.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 30));

        btnLimpiarTodo.setBackground(new java.awt.Color(76, 40, 130));
        btnLimpiarTodo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiarTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarTodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiarTodo.setText("Limpiar Todo");
        btnLimpiarTodo.setOpaque(true);
        btnLimpiarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarTodoMouseClicked(evt);
            }
        });
        jPanel3.add(btnLimpiarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 50));

        btnModificarInquilino.setBackground(new java.awt.Color(0, 119, 35));
        btnModificarInquilino.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarInquilino.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarInquilino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificarInquilino.setText("Modificar Inquilino");
        btnModificarInquilino.setOpaque(true);
        btnModificarInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarInquilinoMouseClicked(evt);
            }
        });
        jPanel3.add(btnModificarInquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 24));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 620));

        jPanel2.setBackground(new java.awt.Color(200, 200, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableInquilinos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableInquilinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInquilinosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableInquilinos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 690, 460));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Inquilinos ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 24));

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
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 740, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        jLabel7.setText("Inquilino DNI");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 26));

        jTextFieldBuscarInquilinoXDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarInquilinoXDniActionPerformed(evt);
            }
        });
        jTextFieldBuscarInquilinoXDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarInquilinoXDniKeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldBuscarInquilinoXDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 740, 620));

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
        if ((c < '0' || c > '9') ) {
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
        if((c<'a' || c>'z')&&(c<'A' || c>'Z')) evt.consume();
        if(jTextFieldNombre.getText().length()>=15){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A' || c>'Z')) evt.consume();
        if(jTextFieldApellido.getText().length()>=15){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDetalleActionPerformed

    private void jTextFieldDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDetalleKeyTyped
        //       char c = evt.getKeyChar();
        //            if((c<'a' || c>'z')&&(c<'A' || c>'Z')) evt.consume();
        //            if(jTextFieldDetalle.getText().length()>=15){
            //              evt.consume();
            //              Toolkit.getDefaultToolkit().beep();
            //           }
    }//GEN-LAST:event_jTextFieldDetalleKeyTyped

    private void btnLimpiarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarTodoMouseClicked
        limpiarTextFields();
    }//GEN-LAST:event_btnLimpiarTodoMouseClicked

    private void btnModificarInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarInquilinoMouseClicked
        modificarInquilino();
//          cargarTablaInquilino();
        
    }//GEN-LAST:event_btnModificarInquilinoMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jTableInquilinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInquilinosMouseClicked
        cargarTextField();
    }//GEN-LAST:event_jTableInquilinosMouseClicked

    private void jTextFieldBuscarInquilinoXDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarInquilinoXDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarInquilinoXDniActionPerformed

    private void jTextFieldBuscarInquilinoXDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarInquilinoXDniKeyReleased
        cargarTablaInquilino(buscarInquilinoXDni());
    }//GEN-LAST:event_jTextFieldBuscarInquilinoXDniKeyReleased
//
//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(ModificarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModificarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModificarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModificarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModificarInquilino().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLimpiarTodo;
    private javax.swing.JLabel btnModificarInquilino;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInquilinos;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBuscarInquilinoXDni;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDetalle;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
public void armarCabeceraInquilino() {
        modeloTablaInquilino.addColumn("ID");
        modeloTablaInquilino.addColumn("Nombre");
        modeloTablaInquilino.addColumn("Apellido");
        modeloTablaInquilino.addColumn("DNI");
        modeloTablaInquilino.addColumn("Detalle");
        modeloTablaInquilino.addColumn("Tipo");
       jTableInquilinos.setModel(modeloTablaInquilino);
       
//        jTablePropiedad.sizeColumnsToFit(1);
    }



   
    
    private void cargarTablaInquilino(ArrayList<Inquilino> list) {
        borrarFilas();
        
        for (Inquilino inquilino : list) {
            modeloTablaInquilino.addRow(new Object[]{
                inquilino.getIdInquilino(),
                inquilino.getNombreInquilino(),
                inquilino.getApellidoInquilino(),
                inquilino.getDniInquilino(),
                inquilino.getDetalleInquilino(),
                inquilino.getTipoInquilino()
               
            });
        }
    }

    public void borrarFilas() {
        int f = jTableInquilinos.getRowCount() - 1; // CANTIDAD DE FILAS MENOS UNO
        for (; f >= 0; f--) {
            modeloTablaInquilino.removeRow(f);
        }
    }
    
   
    
    
   
 private void limpiarTextFields() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDNI.setText("");
        jTextFieldDetalle.setText("");
        jComboBoxTipo.setSelectedIndex(0);
        
    }
 
 public void modificarInquilino(){
     int filaSeleccionada = jTableInquilinos.getSelectedRow();
     Inquilino inquilino = new Inquilino();
      if (filaSeleccionada != -1) {
       int idInquilino = (Integer) jTableInquilinos.getValueAt(filaSeleccionada, 0);
            
            inquilino =inquilinoData.buscarInquilinoPorId(idInquilino); 
      }
            boolean[] inquilinoRelleno ={false,false,false,false,false};
            try{
                if (validacionTextField1(jTextFieldNombre)) {
                inquilino.setNombreInquilino(jTextFieldNombre.getText());
                inquilinoRelleno[0] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar Nombre Inquilino");
                inquilinoRelleno[0] = false;
            }
            
             if (validacionTextField1(jTextFieldApellido)) {
                inquilino.setApellidoInquilino(jTextFieldApellido.getText());
                inquilinoRelleno[1] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar Apellido Inquilino");
                inquilinoRelleno[1] = false;
            }
           
             if (validacionTextField1(jTextFieldDNI)) {
                inquilino.setDniInquilino(Integer.parseInt(jTextFieldDNI.getText()));
                inquilinoRelleno[2] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar DNI");
                inquilinoRelleno[2] = false;
            }
             
            if (validacionTextField1(jTextFieldDetalle)) {
                inquilino.setDetalleInquilino(jTextFieldDetalle.getText());
                inquilinoRelleno[3] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar Detalle Inquilino");
                inquilinoRelleno[3] = false;
            }
            
            if (validacionComboBox(jComboBoxTipo)) {
                inquilino.setTipoInquilino(jComboBoxTipo.getSelectedItem().toString());// LE SETEAS EL NOMBRE QUE LO EXTRAES DEL TEXTFIELD
                inquilinoRelleno[4] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Tipo Inquilino");
                inquilinoRelleno[4] = false;
            }
            
            inquilino.setEstadoInquilino(true);
            
            if(inquilinoRelleno[0] == true
             &&inquilinoRelleno[1] == true
             &&inquilinoRelleno[2] == true
             &&inquilinoRelleno[3] == true
             &&inquilinoRelleno[4] == true ){
             inquilinoData.modificarInquilino(inquilino);
            } 
                
                
            }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese el Dni correctamente");
            jTextFieldDNI.setText("");
            validacionTextField1(jTextFieldDNI);

        } finally {
            cargarTablaInquilino(inquilinoData.listarInquilinos());
            limpiarTextFields();
        }
 }
 
 public void cargarTextField(){
     int filaSeleccionada = jTableInquilinos.getSelectedRow();
      if (filaSeleccionada != -1) {
            String nombre = jTableInquilinos.getValueAt(filaSeleccionada, 1).toString();
            jTextFieldNombre.setText(nombre + "");
            
            String apellido = jTableInquilinos.getValueAt(filaSeleccionada, 2).toString();
            jTextFieldApellido.setText(apellido + "");
            
            int dni = (Integer) jTableInquilinos.getValueAt(filaSeleccionada, 3);
            jTextFieldDNI.setText(dni + "");
            
            String detalle = jTableInquilinos.getValueAt(filaSeleccionada, 4).toString();
            jTextFieldDetalle.setText(detalle + "");
            
            String tipo = jTableInquilinos.getValueAt(filaSeleccionada, 5).toString();
            jComboBoxTipo.setSelectedItem(tipo + "");
            
      }
 }
 
 public void cargarTextFieldInac(){
     int filaSeleccionada = jTableInquilinos.getSelectedRow();
     String nombre = jTableInquilinos.getValueAt(filaSeleccionada, 1).toString();
            jTextFieldNombre.setText(nombre + "");
            
            String apellido = jTableInquilinos.getValueAt(filaSeleccionada, 2).toString();
            jTextFieldApellido.setText(apellido + "");
            
            int dni = (Integer) jTableInquilinos.getValueAt(filaSeleccionada, 3);
            jTextFieldDNI.setText(dni + "");
            
            String detalle = jTableInquilinos.getValueAt(filaSeleccionada, 4).toString();
            jTextFieldDetalle.setText(detalle + "");
            
            String tipo = jTableInquilinos.getValueAt(filaSeleccionada, 5).toString();
            jComboBoxTipo.setSelectedItem(tipo + "");
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
    
     private boolean validacionComboBox(JComboBox cbx) {
        if (cbx.getSelectedItem().equals("-")) {
            cbx.setBorder(BorderFactory.createLineBorder(Color.decode("#aa4356")));
            return false;
        } else {
            cbx.setBorder(null);
            return true;
        }
    }
     
     public ArrayList<Inquilino> buscarInquilinoXDni() {
        ArrayList<Inquilino> listaInquilino = new ArrayList<>();
        borrarFilasXDni();
        for (Inquilino inq : inquilinoData.listarInquilinos()) {
            if (String.valueOf(inq.getDniInquilino()).startsWith(jTextFieldBuscarInquilinoXDni.getText())) {
                listaInquilino.add(inq);

            }
        }

        return listaInquilino;
    }

    public void borrarFilasXDni() {
        int f = jTableInquilinos.getRowCount() - 1; // CANTIDAD DE FILAS MENOS UNO
        for (; f >= 0; f--) {
            modeloTablaInquilino.removeRow(f);
        }
    }
    
    public void colors() {
        
        buttons.setButtonStylesGreen(btnModificarInquilino);
        buttons.setButtonStylesRed(btnSalir);
        buttons.setButtonStylesDorado(btnLimpiarTodo);
        
    }
}
