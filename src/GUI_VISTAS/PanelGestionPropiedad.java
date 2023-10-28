/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI_VISTAS;

import AccesoDatos.PropiedadData;
import AccesoDatos.PropietarioData;
import Entidades.Propiedad;
import Entidades.Propietario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class PanelGestionPropiedad extends javax.swing.JPanel {

    PropiedadData propiedadData = new PropiedadData();
    Propiedad propiedad = new Propiedad();
    PropietarioData propietarioData = new PropietarioData();
    Propietario propietario = new Propietario();
    BuscarPropietario buscaPropietario = new BuscarPropietario();

    DefaultTableModel modeloTablaPropiedades = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    DefaultTableModel modeloTablaPropietarios = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public PanelGestionPropiedad() {
        initComponents();
        armarCabeceraPropiedad();
        armarCabeceraPropietario();
        cargarTablaPropiedad();
        cargarTablapropietario();
        listarPropietarioComboBox();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldZona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSup = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAmue = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAmb = new javax.swing.JComboBox<>();
        jComboBoxBanio = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JLabel();
        btnModificar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxPropietario = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldIDpropietario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePropiedad = new javax.swing.JTable();
        btnEliminar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePropietario = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnEliminar1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(240, 226, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Propietario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, 26));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Departamento", "Casa", "PH", "Oficina", "Local", "Galpon" }));
        jPanel2.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, 40));

        jLabel2.setText("Tipo Propiedad");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 26));
        jPanel2.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel3.setText("Precio");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 26));

        jTextFieldZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldZonaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        jLabel4.setText("Zona");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 26));
        jPanel2.add(jTextFieldSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 212, 210, 30));

        jLabel5.setText("Superficie");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 26));

        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 262, 210, 30));

        jLabel6.setText("Direccion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 26));

        jComboBoxAmue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        jPanel2.add(jComboBoxAmue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 70, -1));

        jLabel7.setText("Ambientes");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 26));

        jComboBoxAmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4" }));
        jPanel2.add(jComboBoxAmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, -1));

        jComboBoxBanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4" }));
        jPanel2.add(jComboBoxBanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 70, -1));

        jLabel8.setText("Baños");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 26));

        jLabel9.setText("Amueblado");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 70, 26));

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 240, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 204, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setOpaque(true);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 80, 43));

        btnModificar.setBackground(new java.awt.Color(51, 51, 255));
        btnModificar.setText("Modificar");
        btnModificar.setOpaque(true);
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 80, 43));

        jLabel10.setText("Descripcion");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 110, 26));

        jPanel2.add(jComboBoxPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 100, 30));

        jLabel11.setText("Buscar");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 60, 30));

        jTextFieldIDpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDpropietarioActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldIDpropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 60, 40));

        jPanel3.setBackground(new java.awt.Color(240, 226, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePropiedad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablePropiedad);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 680, 210));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setText("Desactivar Propiedad");
        btnEliminar.setOpaque(true);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 146, 43));

        btnLimpiar.setBackground(new java.awt.Color(102, 204, 0));
        btnLimpiar.setText("Limpiar Todo");
        btnLimpiar.setOpaque(true);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 240, 43));

        jLabel12.setText("Propietario");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

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
        jScrollPane3.setViewportView(jTablePropietario);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 680, 170));

        jLabel13.setText("Propiedad");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnEliminar1.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar1.setText("Desactivar Proppietario");
        btnEliminar1.setOpaque(true);
        btnEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminar1MouseClicked(evt);
            }
        });
        jPanel3.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 146, 43));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarTextFields();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminacionLogicaPropiedad();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        agregarPropiedad();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldZonaActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        buscaPropietario.setVisible(true);
        buscaPropietario.setLocationRelativeTo(null);


    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1MouseClicked

    private void jTextFieldIDpropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDpropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDpropietarioActionPerformed

    private void jTablePropietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePropietarioMouseClicked
        cargarTextField();
    }//GEN-LAST:event_jTablePropietarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnEliminar1;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JComboBox<String> jComboBoxAmb;
    private javax.swing.JComboBox<String> jComboBoxAmue;
    private javax.swing.JComboBox<String> jComboBoxBanio;
    private javax.swing.JComboBox<String> jComboBoxPropietario;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePropiedad;
    private javax.swing.JTable jTablePropietario;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldIDpropietario;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldSup;
    private javax.swing.JTextField jTextFieldZona;
    // End of variables declaration//GEN-END:variables

    private void agregarPropiedad() {
        // Instanciar un objeto alumno y setea los parametros con los datos de los textField
        // Ademas valida todos los datos y captura excepciones.

        Propiedad nuevoPropiedad = new Propiedad();

        boolean[] propiedadRelleno = {false, false, false, false, false, false, false, false, false, false};

        try {
             if (validacionTextField1(jTextFieldIDpropietario)) {
                nuevoPropiedad.setSuperficiePropiedad(Integer.parseInt(jTextFieldIDpropietario.getText()));
                propiedadRelleno[9] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar IDpropietario");
                propiedadRelleno[9] = false;
            }
            if (validacionComboBox(jComboBoxTipo)) {
                nuevoPropiedad.setTipoPropiedad(jComboBoxTipo.getSelectedItem().toString());// LE SETEAS EL NOMBRE QUE LO EXTRAES DEL TEXTFIELD
                propiedadRelleno[0] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Tipo Propiedad");
                propiedadRelleno[0] = false;
            }

            if (validacionTextField1(jTextFieldPrecio)) {
                nuevoPropiedad.setPrecioTasadoPropiedad(Double.parseDouble(jTextFieldPrecio.getText()));
                propiedadRelleno[1] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Precio");
                propiedadRelleno[1] = false;
            }

            if (validacionTextField1(jTextFieldZona)) {
                nuevoPropiedad.setZonaPropiedad(jTextFieldZona.getText());
                propiedadRelleno[2] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar una Zona");
                propiedadRelleno[2] = false;
            }

            if (validacionTextField1(jTextFieldSup)) {
                nuevoPropiedad.setSuperficiePropiedad(Double.parseDouble(jTextFieldSup.getText()));
                propiedadRelleno[3] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar la Superficie");
                propiedadRelleno[3] = false;
            }
            if (validacionTextField1(jTextFieldDireccion)) {
                nuevoPropiedad.setDireccionPropiedad(jTextFieldDireccion.getText());
                propiedadRelleno[4] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar una Zona");
                propiedadRelleno[4] = false;
            }
            if (validacionComboBox(jComboBoxAmb)) {
                nuevoPropiedad.setCantidadAmbientes(Integer.parseInt(jComboBoxAmb.getSelectedItem().toString()));// LE SETEAS EL NOMBRE QUE LO EXTRAES DEL TEXTFIELD
                propiedadRelleno[5] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Tipo Propiedad");
                propiedadRelleno[5] = false;
            }
            if (validacionComboBox(jComboBoxBanio)) {
                nuevoPropiedad.setCantidadBanios(Integer.parseInt(jComboBoxBanio.getSelectedItem().toString()));// LE SETEAS EL NOMBRE QUE LO EXTRAES DEL TEXTFIELD
                propiedadRelleno[6] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Cantidad Baños");
                propiedadRelleno[6] = false;
            }
            if (validacionComboBox(jComboBoxAmue)) {
                boolean mueble;
                if (jComboBoxAmue.getSelectedItem().toString().equals("SI")) {
                    nuevoPropiedad.setAmueblado(true);
                    propiedadRelleno[7] = true;
                } else if (jComboBoxAmue.getSelectedItem().toString().equals("NO")) {
                    nuevoPropiedad.setAmueblado(false);
                    propiedadRelleno[7] = true;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un si esta Amueblado");
                propiedadRelleno[7] = false;
            }

            if (validacionTextArea(jTextAreaDescrip)) {
                nuevoPropiedad.setDescripcionPropiedad(jTextAreaDescrip.getText());
                propiedadRelleno[8] = true;
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar Descripcion");
                propiedadRelleno[8] = false;
            }
           
//            propiedadRelleno.setEstadoAlumno(true);
            if (propiedadRelleno[0] == true
                    && propiedadRelleno[1] == true
                    && propiedadRelleno[2] == true
                    && propiedadRelleno[3] == true
                    && propiedadRelleno[4] == true
                    && propiedadRelleno[5] == true
                    && propiedadRelleno[6] == true
                    && propiedadRelleno[7] == true
                    && propiedadRelleno[8] == true
                    && propiedadRelleno[9] == true) {
                propiedadData.guardarPropiedad(nuevoPropiedad);
                limpiarTextFields();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese el Precio correctamente");
            jTextFieldPrecio.setText("");
            validacionTextField1(jTextFieldPrecio);

        } finally {
            cargarTablaPropiedad();
        }
    }

    private void eliminacionLogicaPropiedad() {
        int filaSeleccionada = jTablePropiedad.getSelectedRow();
        if (filaSeleccionada != -1) { // SI HAY UNA FILA SELECCIONADA ENTRA AL CONDICIONAL
            int idPropiedad = (Integer) jTablePropiedad.getValueAt(filaSeleccionada, 0); // TRAES EL VALOR DE LA FILA SELECCIONADA
            propiedadData.cambiarEstadoPropiedad(idPropiedad);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
        cargarTablaPropiedad();
        limpiarTextFields();
//        btnEliminar.setVisible(false);
    }

    private void listarPropietarioComboBox() {
        for (Propietario propietario : propietarioData.listarPropietarios()) {
            String item = propietario.getIdPropietario() + " - " + propietario.getNombrePropietario() + " - " + propietario.getApellidoPropietario();
            jComboBoxPropietario.addItem(item);
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

    private boolean validacionComboBox(JComboBox cbx) {
        if (cbx.getSelectedItem().equals("-")) {
            cbx.setBorder(BorderFactory.createLineBorder(Color.decode("#aa4356")));
            return false;
        } else {
            cbx.setBorder(null);
            return true;
        }
    }

    private boolean validacionTextArea(JTextArea jta) {
        if (jta.getText().isEmpty()) {
            jta.setBorder(BorderFactory.createLineBorder(Color.decode("#aa4356")));
            return false;
        } else {
            jta.setBorder(null);
            return true;
        }
    }

    private void limpiarTextFields() {
        jComboBoxTipo.setSelectedIndex(0);
        jTextFieldPrecio.setText("");
        jTextFieldZona.setText("");
        jTextFieldSup.setText("");
        jTextFieldDireccion.setText("");
        jComboBoxAmb.setSelectedIndex(0);
        jComboBoxBanio.setSelectedIndex(0);
        jComboBoxAmue.setSelectedIndex(0);
        jTextAreaDescrip.setText("");
    }

    public void armarCabeceraPropiedad() {
        modeloTablaPropiedades.addColumn("ID");
        modeloTablaPropiedades.addColumn("ID propietario");
        modeloTablaPropiedades.addColumn("Tipo");
        modeloTablaPropiedades.addColumn("Precio");
        modeloTablaPropiedades.addColumn("Zona");
        modeloTablaPropiedades.addColumn("Sup. m ");
        modeloTablaPropiedades.addColumn("Direccion");
        modeloTablaPropiedades.addColumn("Disp.");
        modeloTablaPropiedades.addColumn("Ambientes");
        modeloTablaPropiedades.addColumn("baños");
        modeloTablaPropiedades.addColumn("Amueblado");
        modeloTablaPropiedades.addColumn("Descripcion");
        modeloTablaPropiedades.addColumn("Estado");
        jTablePropiedad.setModel(modeloTablaPropiedades);
//        jTablePropiedad.sizeColumnsToFit(1);
    }

    private void cargarTablaPropiedad() {
        borrarFilas();
        for (Propiedad propiedad : propiedadData.listarPropiedades()) {
            modeloTablaPropiedades.addRow(new Object[]{
                propiedad.getIdPropiedad(),
                propiedad.getPropietario().getIdPropietario(),
                propiedad.getTipoPropiedad(),
                propiedad.getPrecioTasadoPropiedad(),
                propiedad.getZonaPropiedad(),
                propiedad.getSuperficiePropiedad(),
                propiedad.getDireccionPropiedad(),
                propiedad.isDisponibilidadPropiedad(),
                propiedad.getCantidadAmbientes(),
                propiedad.getCantidadBanios(),
                propiedad.isAmueblado(),
                propiedad.getDescripcionPropiedad(),
                propiedad.isEstadoPropiedad()
            });
        }
    }

    public void borrarFilas() {
        int f = jTablePropiedad.getRowCount() - 1; // CANTIDAD DE FILAS MENOS UNO
        for (; f >= 0; f--) {
            modeloTablaPropiedades.removeRow(f);
        }
    }

//    public void borrarFilas2() {
//        int f = jTablePropiedad.getRowCount() - 1; // CANTIDAD DE FILAS MENOS UNO
//        for (; f >= 0; f--) {
//            modeloTablaPropietarios.removeRow(f);
//        }
//    }

    private void armarCabeceraPropietario() {

        modeloTablaPropietarios.addColumn("ID");
        modeloTablaPropietarios.addColumn("Nombre");
        modeloTablaPropietarios.addColumn("Apellido");
        modeloTablaPropietarios.addColumn("DNI");
        modeloTablaPropietarios.addColumn("Domicilio ");
        modeloTablaPropietarios.addColumn("Tel.");
        modeloTablaPropietarios.addColumn("Estado");

        jTablePropietario.setModel(modeloTablaPropietarios);

    }

    private void cargarTablapropietario() {
//        borrarFilas2();
        for (Propietario propietario : propietarioData.listarPropietarios()) {
            modeloTablaPropietarios.addRow(new Object[]{
                propietario.getIdPropietario(),
                propietario.getNombrePropietario(),
                propietario.getApellidoPropietario(),
                propietario.getDniPropietario(),
                propietario.getDomicilioPropietario(),
                propietario.getTelefonoPropietario(),
                propietario.isEstadoPropietario()

            });
        }
    }

    public void cargarTextField() {
        int filaSeleccionada = jTablePropietario.getSelectedRow();
        if (filaSeleccionada != -1) {
            int id = (Integer) jTablePropietario.getValueAt(filaSeleccionada, 0);
            jTextFieldIDpropietario.setText(id + "");
        }
    }
}
