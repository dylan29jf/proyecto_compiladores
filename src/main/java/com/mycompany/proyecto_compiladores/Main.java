/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_compiladores;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.mycompany.proyecto_compiladores.views.CardMain;
import com.mycompany.proyecto_compiladores.views.Identificacion;
import com.mycompany.proyecto_compiladores.views.Membership;

/**
 *
 * @author Gema
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        nav_credential = new javax.swing.JButton();
        nav_payment = new javax.swing.JButton();
        nav_ine = new javax.swing.JButton();
        nav_membership = new javax.swing.JButton();
        nav_card = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        nav_credential.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_credential.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id-card.png"))); // NOI18N
        nav_credential.setToolTipText("Credencial Escolar");
        nav_credential.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_credential.setIconTextGap(20);

        nav_payment.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cash-payment.png"))); // NOI18N
        nav_payment.setToolTipText("Pago de servicio");
        nav_payment.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_payment.setIconTextGap(20);

        nav_ine.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_ine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarjeta-de-identificacion.png"))); // NOI18N
        nav_ine.setToolTipText("INE");
        nav_ine.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_ine.setIconTextGap(30);
        nav_ine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_ineActionPerformed(evt);
            }
        });

        nav_membership.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_membership.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarifa.png"))); // NOI18N
        nav_membership.setToolTipText("Membresia Club Deportivo");
        nav_membership.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nav_membership.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nav_membership.setIconTextGap(20);
        nav_membership.setVerifyInputWhenFocusTarget(false);
        nav_membership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_membershipActionPerformed(evt);
            }
        });

        nav_card.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarjeta-de-credito.png"))); // NOI18N
        nav_card.setToolTipText("Tarjetas");
        nav_card.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nav_card.setIconTextGap(30);
        nav_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_cardActionPerformed(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_exit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_exit.setIconTextGap(8);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nav_credential, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nav_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nav_ine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nav_membership, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nav_card, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(nav_card, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nav_membership, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nav_ine, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nav_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nav_credential, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_exit)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nav_membershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_membershipActionPerformed
        // TODO add your handling code here:
        new Membership().setVisible(true);
        dispose();
    }//GEN-LAST:event_nav_membershipActionPerformed

    private void nav_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_cardActionPerformed
        // TODO add your handling code here:
        CardMain cardMain = new CardMain();
        cardMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nav_cardActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void nav_ineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_ineActionPerformed
        // TODO add your handling code here:
        new Identificacion().setVisible(true);
        dispose();
    }//GEN-LAST:event_nav_ineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // Registra
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nav_card;
    private javax.swing.JButton nav_credential;
    private javax.swing.JButton nav_ine;
    private javax.swing.JButton nav_membership;
    private javax.swing.JButton nav_payment;
    // End of variables declaration//GEN-END:variables
}
