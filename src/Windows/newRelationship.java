/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Classes.Relacion;
import Classes.Vertice;
import Classes.band_Relationship;
import Classes.dist_Relationship;
import static Windows.MainWindow.b_relaciones;
import static Windows.MainWindow.d_relaciones;
import static Windows.MainWindow.nodos;
import static Windows.MainWindow.relaciones;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Memo
 */
public class newRelationship extends javax.swing.JFrame {

    /**
     * Creates new form newRelationship
     */
    public newRelationship() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_node1 = new javax.swing.JComboBox();
        cb_node2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf_peso = new javax.swing.JFormattedTextField();
        cb_material = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sp_banda = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Node 1: ");

        jLabel2.setText("Node 2:");

        cb_node1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_node1ItemStateChanged(evt);
            }
        });

        jLabel3.setText("longitud");

        jLabel4.setText("Material: ");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tf_peso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        cb_material.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione Material--", "Cobre", "Fibra Optica" }));
        cb_material.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_materialItemStateChanged(evt);
            }
        });

        jLabel5.setText("Crear Conexion");

        jLabel6.setText("Maximo ancho de Banda:");

        sp_banda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1, 1));
        sp_banda.setEnabled(false);

        jLabel7.setText("conectado con: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_node1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_node2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_banda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cb_node1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_node2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cb_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(sp_banda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_node1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_node1ItemStateChanged
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < nodos.size(); i++) {
            if (!cb_node1.getSelectedItem().equals(nodos.get(i))) {
                model.addElement(nodos.get(i));
            }
        }
        cb_node2.setModel(model);
    }//GEN-LAST:event_cb_node1ItemStateChanged

    private void cb_materialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_materialItemStateChanged
        // TODO add your handling code here:
        if (cb_material.getSelectedIndex() == 0) {
            sp_banda.setEnabled(false);
        } else if (cb_material.getSelectedIndex() == 1) {
            SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 100, 1);
            sp_banda.setModel(model);
            sp_banda.setEnabled(true);
        } else if (cb_material.getSelectedIndex() == 2) {
            SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 10000, 1);
            sp_banda.setModel(model);
            sp_banda.setEnabled(true);
        }
    }//GEN-LAST:event_cb_materialItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (cb_material.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un material");
        } else {
            Vertice v1 = ((Vertice) cb_node1.getSelectedItem());
            Vertice v2 = ((Vertice) cb_node2.getSelectedItem());
            int longitud = Integer.parseInt(tf_peso.getText());
            int banda = (int) sp_banda.getValue();
            String material = (String) cb_material.getSelectedItem();
            b_Relacion = new band_Relationship(v1,v2,banda);
            b_relaciones.insert(b_Relacion, b_relaciones.size());
            d_Relacion = new dist_Relationship(v1,v2,longitud);
            d_relaciones.insert(d_Relacion, d_relaciones.size());
            relacion = new Relacion(v1, v2, longitud, banda, material);
            relaciones.insert(relacion, relaciones.size());
            JOptionPane.showMessageDialog(this, "Relacion creada exitosamente");
            cb_material.setSelectedIndex(0);
            sp_banda.setValue(1);
            sp_banda.setEnabled(false);
            tf_peso.setText("");
            cb_node1.setSelectedIndex(1);
            File archivo;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./mapa.txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                bw.write(",");
                bw.write(v1.getNombre() + ",");
                bw.write(v1.getNum_tipo() + ",");
                bw.write(v2.getNombre() + ",");
                bw.write(v2.getNum_tipo() + ",");
                bw.write(((Relacion)relaciones.get(relaciones.size() -1)).getLongitud() + ",");
                bw.write(((Relacion)relaciones.get(relaciones.size() -1)).getMax_ancho_de_banda() + ",");
                bw.write(((Relacion)relaciones.get(relaciones.size() -1)).getMaterial());
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
                
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(newRelationship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newRelationship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newRelationship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newRelationship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newRelationship().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_material;
    public static javax.swing.JComboBox cb_node1;
    public static javax.swing.JComboBox cb_node2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner sp_banda;
    private javax.swing.JFormattedTextField tf_peso;
    // End of variables declaration//GEN-END:variables
    Relacion relacion;
    band_Relationship b_Relacion;
    dist_Relationship d_Relacion;
}
