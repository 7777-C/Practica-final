/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package matriz;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author juanc
 */
public class VistaMatriz extends javax.swing.JFrame {

    /**
     * Creates new form VistaMatriz
     */
    private Matriz matriz;

    public VistaMatriz() {
        initComponents();
        matriz = Matriz.cargarMatriz();
        if (matriz != null) {
            txtMatrizOriginal.setText(matriz.mostrarMatrizOriginal());
        }
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
        jLabel3 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        btnPresentarMatriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMatrizResultado = new javax.swing.JTextArea();
        btnEliminarMultiplos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMatrizOriginal = new javax.swing.JTextArea();
        txtNumMultiplo = new javax.swing.JTextField();
        btnEliminarPrimos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("MATRIZ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setText("Ingrese la longitud en filas (M):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setText("Ingrese la longitud en columnas (N):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel1.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 300, -1));
        jPanel1.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 300, -1));

        btnPresentarMatriz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPresentarMatriz.setText("Presentar matriz");
        btnPresentarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresentarMatrizActionPerformed(evt);
            }
        });
        jPanel1.add(btnPresentarMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        txtMatrizResultado.setColumns(20);
        txtMatrizResultado.setRows(5);
        jScrollPane1.setViewportView(txtMatrizResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 240));

        btnEliminarMultiplos.setText("Eliminar múltiplos");
        btnEliminarMultiplos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMultiplosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarMultiplos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 130, -1));

        txtMatrizOriginal.setColumns(20);
        txtMatrizOriginal.setRows(5);
        jScrollPane2.setViewportView(txtMatrizOriginal);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 240));

        txtNumMultiplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumMultiploActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumMultiplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 130, -1));

        btnEliminarPrimos.setText("Eliminar primos");
        btnEliminarPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPrimosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarPrimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 130, -1));

        jLabel4.setText("Ingrese el número a eliminar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel5.setText("sus múltiplos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPresentarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresentarMatrizActionPerformed
        try {
            int filas = Integer.parseInt(txtFilas.getText());
            int columnas = Integer.parseInt(txtColumnas.getText());
            matriz = new Matriz(filas, columnas);
            txtMatrizOriginal.setText(matriz.mostrarMatrizOriginal());
            matriz.guardarMatriz();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.");
        }
    }//GEN-LAST:event_btnPresentarMatrizActionPerformed

    private void txtNumMultiploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumMultiploActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumMultiploActionPerformed

    private void btnEliminarMultiplosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMultiplosActionPerformed
         try {
            int num = Integer.parseInt(txtNumMultiplo.getText());
            matriz.eliminarMultiplos(num);
            txtMatrizResultado.setText(matriz.mostrarMatrizResultado());
            matriz.guardarMatriz();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.");
        }
    }//GEN-LAST:event_btnEliminarMultiplosActionPerformed

    private void btnEliminarPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPrimosActionPerformed
        matriz.eliminarPrimos();
        txtMatrizResultado.setText(matriz.mostrarMatrizResultado());
        matriz.guardarMatriz();
    }//GEN-LAST:event_btnEliminarPrimosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarMultiplos;
    private javax.swing.JButton btnEliminarPrimos;
    private javax.swing.JButton btnPresentarMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextArea txtMatrizOriginal;
    private javax.swing.JTextArea txtMatrizResultado;
    private javax.swing.JTextField txtNumMultiplo;
    // End of variables declaration//GEN-END:variables
}
