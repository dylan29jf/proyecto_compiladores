/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.proyecto.views;

import com.proyecto.components.MembershipComponent;
import com.proyecto.main.Dashboard;
import com.proyecto.models.Customer;
import com.proyecto.utils.Utils;
import java.awt.Color;
import java.text.SimpleDateFormat;

/**
 *
 * @author dylan
 */
public class Membership extends javax.swing.JPanel {
    private final Utils util = new Utils();
    private Customer customer;
    /**
     * Creates new form Membership
     */
    public Membership() {
        initComponents();
        initStyles();
    }
    
    private void initStyles(){
        txt_title.putClientProperty("FlatLaf.style", "font: bold $h2.font");
        txt_title.setForeground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        txt_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_lastnames = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_membership = new javax.swing.JComboBox<>();
        btn_tramitar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_vigencia = new javax.swing.JComboBox<>();
        txt_date = new com.toedter.calendar.JDateChooser();

        content.setBackground(new java.awt.Color(255, 255, 255));

        txt_title.setText("Datos Generales");

        jLabel2.setText("Nombre(s)");

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellidos");

        jLabel4.setText("Correo Electronico");

        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setText("Tipo de Membresia");

        txt_membership.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Premium", "Plus", "Basica" }));
        txt_membership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_membershipActionPerformed(evt);
            }
        });

        btn_tramitar.setBackground(new java.awt.Color(18, 90, 173));
        btn_tramitar.setForeground(new java.awt.Color(255, 255, 255));
        btn_tramitar.setText("Tramitar");
        btn_tramitar.setBorder(null);
        btn_tramitar.setBorderPainted(false);
        btn_tramitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tramitarActionPerformed(evt);
            }
        });

        jLabel7.setText("Vigencia");

        txt_vigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "1 año", "2 años", "3 años" }));
        txt_vigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vigenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_membership, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txt_lastnames, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txt_vigencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txt_title))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btn_tramitar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_lastnames, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(txt_title)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_membership, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_vigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btn_tramitar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_membershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_membershipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_membershipActionPerformed

    private void btn_tramitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tramitarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat ff = new SimpleDateFormat("yy/MM/dd");
        customer = new Customer();
        customer.setName(txt_name.getText());
        customer.setLastname(txt_lastnames.getText());
        customer.setEmail(txt_email.getText());
        customer.setBirthday(ff.format(txt_date.getDate().getTime()));
        customer.setTypeOfMembership(String.valueOf(txt_membership.getSelectedItem()));
        customer.setValidity(String.valueOf(txt_vigencia.getSelectedItem()));
        
        
        util.ShowPanel(new MembershipComponent(customer), content, 738, 528);
        Dashboard.txt_title.setText("Memebresia");
        
    }//GEN-LAST:event_btn_tramitarActionPerformed

    private void txt_vigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vigenciaActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tramitar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_lastnames;
    private javax.swing.JComboBox<String> txt_membership;
    private javax.swing.JTextField txt_name;
    private javax.swing.JLabel txt_title;
    private javax.swing.JComboBox<String> txt_vigencia;
    // End of variables declaration//GEN-END:variables
}