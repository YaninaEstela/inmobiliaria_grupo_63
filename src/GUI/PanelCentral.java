package GUI;

import AccesoDatos.PropiedadData;
import Entidades.Propiedad;
import GUI.Componentes.TemaPanelCentral;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JScrollPane;

public class PanelCentral extends javax.swing.JPanel {

    TemaPanelCentral temaPanelCentral = new TemaPanelCentral();
    PropiedadData propiedadData = new PropiedadData();
    
    ArrayList<Propiedad> listaProp = propiedadData.listarPropiedades();
    //ArrayList<Propiedad> listaProp = new ArrayList<>();

    public void setListaProp(ArrayList<Propiedad> listaProp) {
        this.listaProp = listaProp;
        System.out.println("Lista Seteada");
    }
    
    public PanelCentral() {
        initComponents();
        
        aplicarTemas(listaProp);

        // BARRA DE SCROLL
        JScrollPane scrollPane = new JScrollPane(jPanelCentral);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // Establece el diseño del panel principal (this) para mostrar el JScrollPane
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
        
        int multiplicador = 250*temaPanelCentral.getMultiplicador();
        jPanelCentral.setPreferredSize(new Dimension(1060, multiplicador));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentral = new javax.swing.JPanel();

        jPanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(1060, 635));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(1060, 635));

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelCentral;
    // End of variables declaration//GEN-END:variables

    public void aplicarTemas(ArrayList <Propiedad> listaPropiedades) {
        temaPanelCentral.panelAutomaticCreation(jPanelCentral, listaPropiedades);
    }
    
    public void limpiarLista(){
        Iterator<Propiedad> iterador = listaProp.iterator();
        while (iterador.hasNext()) {
            iterador.next();
            iterador.remove();
        }
    }
}
