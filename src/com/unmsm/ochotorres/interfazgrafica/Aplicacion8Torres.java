/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres.interfazgrafica;

import com.unmsm.ochotorres.Tablero;

/**
 *
 * @author pc
 */
public class Aplicacion8Torres extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacion8Torres
     */
    
   
    public Aplicacion8Torres() {
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

        panel = new javax.swing.JPanel();
        panelTablero = new com.unmsm.ochotorres.interfazgrafica.TableroPresenter();
        jToolBar1 = new javax.swing.JToolBar();
        fila = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        columna = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        crearTablero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        fila.setText("Filas");
        jToolBar1.add(fila);

        txtFilas.setMinimumSize(new java.awt.Dimension(6, 30));
        txtFilas.setPreferredSize(new java.awt.Dimension(30, 30));
        txtFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilasActionPerformed(evt);
            }
        });
        jToolBar1.add(txtFilas);

        columna.setText("Columnas");
        jToolBar1.add(columna);

        txtColumnas.setPreferredSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(txtColumnas);

        crearTablero.setBackground(new java.awt.Color(0, 59, 60));
        crearTablero.setForeground(new java.awt.Color(255, 255, 255));
        crearTablero.setText("Crear Tablero");
        crearTablero.setFocusable(false);
        crearTablero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearTablero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        crearTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTableroActionPerformed(evt);
            }
        });
        jToolBar1.add(crearTablero);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);
        jToolBar1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilasActionPerformed

    private void crearTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTableroActionPerformed
        // TODO add your handling code here:
        String f = txtFilas.getText();
        //Se obtiene la cantidad de columnas a crear como una cadena de caracter
        String c = txtColumnas.getText();
        //Se cambia de cadena de caracteres a numeros
        int filas = Integer.parseInt(f);
        int columnas = Integer.parseInt(c);

        Tablero.DIMENSION_X = filas;
        Tablero.DIMENSION_Y = columnas;

        Tablero tablero = new Tablero();
        panelTablero.construirTablero(tablero);
        
    }//GEN-LAST:event_crearTableroActionPerformed
  
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
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion8Torres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion8Torres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel columna;
    private javax.swing.JButton crearTablero;
    private javax.swing.JLabel fila;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panel;
    private com.unmsm.ochotorres.interfazgrafica.TableroPresenter panelTablero;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}