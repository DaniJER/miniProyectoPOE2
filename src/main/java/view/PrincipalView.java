/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
/**
 *
 * @author El Rey
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonInstruction = new javax.swing.JButton();
        jugarButton = new javax.swing.JButton();
        paraQueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 600));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TILE GAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 90, 350, 170);

        buttonInstruction.setBackground(new java.awt.Color(235, 235, 235));
        buttonInstruction.setFont(new java.awt.Font("Fira Code", 0, 36)); // NOI18N
        buttonInstruction.setForeground(new java.awt.Color(0, 0, 0));
        buttonInstruction.setText("Cómo jugar");
        buttonInstruction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonInstruction.setOpaque(true);
        buttonInstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstructionActionPerformed(evt);
            }
        });
        jPanel1.add(buttonInstruction);
        buttonInstruction.setBounds(40, 430, 250, 80);

        jugarButton.setBackground(new java.awt.Color(255, 255, 255));
        jugarButton.setFont(new java.awt.Font("Fira Code", 0, 36)); // NOI18N
        jugarButton.setForeground(new java.awt.Color(0, 0, 0));
        jugarButton.setText("Jugar");
        jugarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jugarButton);
        jugarButton.setBounds(350, 330, 230, 80);

        paraQueButton.setBackground(new java.awt.Color(255, 255, 255));
        paraQueButton.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        paraQueButton.setForeground(new java.awt.Color(0, 0, 0));
        paraQueButton.setText("Para qué sirve");
        paraQueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraQueButtonActionPerformed(evt);
            }
        });
        jPanel1.add(paraQueButton);
        paraQueButton.setBounds(630, 420, 240, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstructionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInstructionActionPerformed

    private void paraQueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraQueButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paraQueButtonActionPerformed
    
    private void jugarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.PlayController.eventJugarButton();
    }
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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInstruction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jugarButton;
    private javax.swing.JButton paraQueButton;
    // End of variables declaration//GEN-END:variables
}
