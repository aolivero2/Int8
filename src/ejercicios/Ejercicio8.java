/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author SERVIDOR
 */
public class Ejercicio8 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio8
     */
    public Ejercicio8() {
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
        jLabel2 = new javax.swing.JLabel();
        txtCh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("  PAGO A PROFESORES ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Cantidad de horas trabajadas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        txtCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChActionPerformed(evt);
            }
        });
        txtCh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChKeyTyped(evt);
            }
        });
        jPanel1.add(txtCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 60, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText(" Total a pagar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 110, 30));

        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("    Total descuento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, 30));

        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
            }
        });
        jPanel1.add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, 30));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 90, 30));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChActionPerformed
        
    }//GEN-LAST:event_txtChActionPerformed

    private void txtChKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();    
          } 
    }//GEN-LAST:event_txtChKeyTyped

    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped
        
    }//GEN-LAST:event_txtPagoKeyTyped

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyTyped
        
    }//GEN-LAST:event_txtDescKeyTyped

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int nh=0,sa ;
        double des, to;


         if (txtCh.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numero de horas", "Error", JOptionPane.ERROR_MESSAGE);
            txtCh.requestFocusInWindow();
        }

        else {
          nh=Integer.parseInt(txtCh.getText());
         }

        sa= nh * 20000;
        des= 0.05 * sa;
        to= sa-des;

     txtDesc.setText(String.valueOf(des));
     txtPago.setText(String.valueOf(to));
        
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtCh.setText("");
        txtDesc.setText("");
        txtPago.setText("");
        
       txtCh.requestFocusInWindow();
   
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCh;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
