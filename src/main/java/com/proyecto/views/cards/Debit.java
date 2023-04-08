/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.proyecto.views.cards;

import com.proyecto.main.Dashboard;
import com.proyecto.utils.Utils;
import com.proyecto.views.Cards;
import java.awt.Color;

/**
 *
 * @author dylan
 */
public class Debit extends javax.swing.JPanel {
    
    Utils util = new Utils();
    /**
     * Creates new form Debit
     */
    public Debit() {
        initComponents();
        initStyle();
    }
    
    private void initStyle(){
        btn_deposit.putClientProperty( "JButton.buttonType", "roundRect");
        btn_deposit.putClientProperty( "Button.innerFocusWidth", 1 );
        btn_withdrawal.putClientProperty( "JButton.buttonType", "roundRect");
        btn_withdrawal.putClientProperty( "Button.innerFocusWidth", 1 );
        txt_balance.putClientProperty("FlatLaf.style", "font: bold $h2.font");
        txt_balance.setForeground(Color.BLACK);
        txt_account.putClientProperty("FlatLaf.style", "font: bold $h3.font");
        txt_account.setForeground(Color.BLACK);
        txt_numberCard.putClientProperty("FlatLaf.style", "font: $h4.font");
        txt_numberCard.setForeground(Color.BLACK);
        txt_currentBalance.putClientProperty("FlatLaf.style", "font: $h2.font");
        txt_currentBalance.setForeground(Color.BLACK);
        txt_moneda.putClientProperty("FlatLaf.style", "font: $h2.font");
        txt_moneda.setForeground(Color.BLACK);
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
        txt_balance = new javax.swing.JLabel();
        txt_account = new javax.swing.JLabel();
        btn_deposit = new javax.swing.JButton();
        btn_withdrawal = new javax.swing.JButton();
        txt_numberCard = new javax.swing.JLabel();
        txt_currentBalance = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        btn_back = new javax.swing.JLabel();
        txt_moneda = new javax.swing.JLabel();

        content.setBackground(new java.awt.Color(255, 255, 255));

        txt_balance.setText("Saldo actual");

        txt_account.setText("Cuenta");

        btn_deposit.setText("Deposito");
        btn_deposit.setBorderPainted(false);
        btn_deposit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositActionPerformed(evt);
            }
        });

        btn_withdrawal.setText("Retiro");
        btn_withdrawal.setBorderPainted(false);
        btn_withdrawal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_withdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withdrawalActionPerformed(evt);
            }
        });

        txt_numberCard.setText("**** **** 7448");

        txt_currentBalance.setText("700.98");

        container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        btn_back.setText("<< Regresar");
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        txt_moneda.setText("$");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btn_withdrawal)
                                .addGap(74, 74, 74)
                                .addComponent(btn_deposit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                                .addComponent(txt_balance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_account)
                                .addGap(25, 25, 25))))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(txt_moneda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_currentBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_numberCard)))
                .addGap(113, 113, 113))
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_back)
                .addGap(40, 40, 40)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_account)
                    .addComponent(txt_balance))
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_currentBalance)
                    .addComponent(txt_numberCard)
                    .addComponent(txt_moneda))
                .addGap(33, 33, 33)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_withdrawal)
                    .addComponent(btn_deposit))
                .addGap(33, 33, 33)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        util.ShowPanel(new Cards(), content, 738, 528);
        Dashboard.txt_title.setText("Tarjetas");
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_withdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withdrawalActionPerformed
        // TODO add your handling code here:
        util.ShowPanel(new Withdrawal(), container, 739, 294);
    }//GEN-LAST:event_btn_withdrawalActionPerformed

    private void btn_depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositActionPerformed
        // TODO add your handling code here:
        util.ShowPanel(new Deposit(), container, 739, 294);
    }//GEN-LAST:event_btn_depositActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_deposit;
    private javax.swing.JButton btn_withdrawal;
    private javax.swing.JPanel container;
    private javax.swing.JPanel content;
    private javax.swing.JLabel txt_account;
    private javax.swing.JLabel txt_balance;
    public static javax.swing.JLabel txt_currentBalance;
    private javax.swing.JLabel txt_moneda;
    private javax.swing.JLabel txt_numberCard;
    // End of variables declaration//GEN-END:variables
}
