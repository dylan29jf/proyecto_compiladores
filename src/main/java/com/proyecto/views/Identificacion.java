/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto.views;

import com.proyecto.Main;
import com.proyecto.models.ClaveElector;
import com.proyecto.utils.Utils;
import java.text.SimpleDateFormat;
import javax.swing.ButtonModel;

/**
 *
 * @author Gema
 */
public class Identificacion extends javax.swing.JFrame {

    private final Utils util = new Utils();

    /**
     * Creates new form Identificacion
     */
    public Identificacion() {
        initComponents();
        setTitle("Identificación");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_sex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_hombre = new javax.swing.JRadioButton();
        txt_mujer = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txt_entidad = new javax.swing.JComboBox<>();
        panel_clave = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_clave = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre(s)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 33, -1, -1));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 55, 250, 50));

        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 123, -1, -1));
        jPanel1.add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 145, 250, 50));
        jPanel1.add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 235, 250, 50));

        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 213, -1, -1));

        jLabel5.setText("Fecha de nacimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 310, -1, -1));

        jLabel6.setText("Sexo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        group_sex.add(txt_hombre);
        txt_hombre.setText("Hombre");
        jPanel1.add(txt_hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        group_sex.add(txt_mujer);
        txt_mujer.setText("Mujer");
        txt_mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mujerActionPerformed(evt);
            }
        });
        jPanel1.add(txt_mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel7.setText("Entidad federativa de nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        txt_entidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Ciudad de Mexico", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Mexico", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo Leon", "Oaxaca", "Puebla", "Queretaro", "Quintana Roo", "San Luis Potosi", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan", "Zacatecas" }));
        jPanel1.add(txt_entidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 250, 50));

        jLabel8.setText("Tu clave de elector es:");

        javax.swing.GroupLayout panel_claveLayout = new javax.swing.GroupLayout(panel_clave);
        panel_clave.setLayout(panel_claveLayout);
        panel_claveLayout.setHorizontalGroup(
            panel_claveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_claveLayout.createSequentialGroup()
                .addGroup(panel_claveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_claveLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_claveLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel_claveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_claveLayout.setVerticalGroup(
            panel_claveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_claveLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_clave, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panel_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        txt_date.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 344, 250, 50));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atras.png"))); // NOI18N
        jButton2.setToolTipText("Regresar al menú");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mujerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");

        String nombre = txt_nombre.getText().toUpperCase();
        String paterno = txt_paterno.getText().toUpperCase();
        String materno = txt_materno.getText().toUpperCase();
        String fecha = f1.format(txt_date.getDate().getTime());
        String sexo = txt_hombre.isSelected() ? "H" : "M";
        String entidad = txt_entidad.getSelectedItem().toString().toUpperCase();
        String[] birthday = util.dividirFecha(fecha);
        ClaveElector claveElector = new ClaveElector();
        claveElector.setNombre(nombre);
        claveElector.setApellidoPaterno(paterno);
        claveElector.setApellidoMaterno(materno);
        claveElector.setDiaNacimiento(birthday[0]);
        claveElector.setMesNacimiento(birthday[1]);
        claveElector.setAnioNacimiento(birthday[2]);
        claveElector.setEntidadFederativa(util.obtenerClaveEntidadFederativa(entidad));
        claveElector.setSexo(sexo);
        String clave = util.generarClaveElector(claveElector);

        txt_clave.setText(clave);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Identificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Identificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup group_sex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_clave;
    private javax.swing.JLabel txt_clave;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JComboBox<String> txt_entidad;
    private javax.swing.JRadioButton txt_hombre;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JRadioButton txt_mujer;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    // End of variables declaration//GEN-END:variables
}
