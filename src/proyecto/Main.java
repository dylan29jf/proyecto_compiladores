package proyecto;

import proyecto.cards.CardMain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dylan
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Main() {
        initComponents();
        this.setTitle("Menú");
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
        nav_card = new javax.swing.JButton();
        nav_membership = new javax.swing.JButton();
        nav_ine = new javax.swing.JButton();
        nav_payment = new javax.swing.JButton();
        nav_credential = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 750));

        nav_card.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/assets/icons/tarjeta-de-credito.png"))); // NOI18N
        nav_card.setText("Tarjetas");
        nav_card.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_card.setIconTextGap(30);
        nav_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_cardActionPerformed(evt);
            }
        });

        nav_membership.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_membership.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/assets/icons/tarifa.png"))); // NOI18N
        nav_membership.setText("Membresia Club Deportivo");
        nav_membership.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nav_membership.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_membership.setIconTextGap(20);
        nav_membership.setVerifyInputWhenFocusTarget(false);
        nav_membership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_membershipActionPerformed(evt);
            }
        });

        nav_ine.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_ine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/assets/icons/tarjeta-de-identificacion.png"))); // NOI18N
        nav_ine.setText("INE");
        nav_ine.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_ine.setIconTextGap(30);

        nav_payment.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/assets/icons/cash-payment.png"))); // NOI18N
        nav_payment.setText("Pago de servicio");
        nav_payment.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_payment.setIconTextGap(20);

        nav_credential.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nav_credential.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/assets/icons/id-card.png"))); // NOI18N
        nav_credential.setText("Credencial Escolar");
        nav_credential.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nav_credential.setIconTextGap(20);

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/assets/icons/exit.png"))); // NOI18N
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
                .addGap(382, 382, 382)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nav_credential, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nav_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nav_ine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nav_membership, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nav_card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(398, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nav_card, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nav_membership, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nav_ine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nav_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nav_credential, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void nav_membershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_membershipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nav_membershipActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

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
