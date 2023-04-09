/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_compiladores.components;

import com.mycompany.proyecto_compiladores.models.Customer;
import com.mycompany.proyecto_compiladores.utils.Utils;
import com.mycompany.proyecto_compiladores.views.Membership;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Gema
 */
public class MembershipClient extends javax.swing.JFrame {

    private final Utils util = new Utils();
    private final DefaultListModel privilegios = new DefaultListModel();

    /**
     * Creates new form MembershipClient
     */
    public MembershipClient(Customer customer) {
        initComponents();
        initValues(customer);
        setTitle("Membresías");
        setLocationRelativeTo(this);
    }

    private void initValues(Customer customer) {

        txt_membership.setText(customer.getTypeOfMembership().toUpperCase());
        txt_saludo.setText("BIENVENIDO " + customer.getName().toUpperCase() + " " + customer.getLastname().toUpperCase());
        txt_vigencia.setText(customer.getValidity().toUpperCase());
        txt_holder.setText(customer.getName().toUpperCase() + " " + customer.getLastname().toUpperCase());
        String textQr = "Nombre: " + customer.getName() + " " + customer.getLastname() + "\n"
                + "Correo Electronico: " + customer.getEmail() + "\n"
                + "Fecha de nacimiento: " + customer.getBirthday();

        ImageIcon icon = new ImageIcon(util.GenerateQR(textQr, 125));
        txt_qr.setIcon(icon);

        List<String> priv = util.getPrivilegios(customer.getTypeOfMembership());

        for (int i = 0; i < priv.size(); i++) {
            privilegios.addElement(priv.get(i));
        }

        list_privilegios.setModel(privilegios);
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
        txt_saludo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_vip = new javax.swing.JLabel();
        txt_titleHolder = new javax.swing.JLabel();
        txt_qr = new javax.swing.JLabel();
        txt_holder = new javax.swing.JLabel();
        txt_membership = new javax.swing.JLabel();
        txt_vigencia = new javax.swing.JLabel();
        txt_vig = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_privilegios = new javax.swing.JList<>();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_saludo.setText("Bienvenido {}.");

        jLabel2.setText("Esta es tu nueva membresía para Club Deportivo.");

        txt_vip.setText("VIP");

        txt_titleHolder.setText("TITULAR CLIENTE");

        txt_holder.setText("{}");

        txt_membership.setText("{}");

        txt_vigencia.setText("{}");

        txt_vig.setText("VIGENCIA");

        list_privilegios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_privilegios);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atras.png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel1.setText("Privilegios");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentLayout.createSequentialGroup()
                                        .addComponent(txt_vip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_membership, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(txt_vig))
                                    .addComponent(txt_titleHolder)
                                    .addComponent(txt_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(txt_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txt_vigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_saludo))))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addComponent(btn_back)
                .addGap(85, 85, 85))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txt_saludo)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_vip)
                                        .addComponent(txt_membership))
                                    .addComponent(txt_vig))
                                .addGap(41, 41, 41)
                                .addComponent(txt_titleHolder)
                                .addGap(12, 12, 12)
                                .addComponent(txt_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_vigencia))))
                .addGap(51, 51, 51)
                .addComponent(btn_back)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        new Membership().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(MembershipClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembershipClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembershipClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembershipClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_privilegios;
    private javax.swing.JLabel txt_holder;
    private javax.swing.JLabel txt_membership;
    private javax.swing.JLabel txt_qr;
    private javax.swing.JLabel txt_saludo;
    private javax.swing.JLabel txt_titleHolder;
    private javax.swing.JLabel txt_vig;
    private javax.swing.JLabel txt_vigencia;
    private javax.swing.JLabel txt_vip;
    // End of variables declaration//GEN-END:variables
}