/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ochotorres.interfazgrafica;

import com.unmsm.ochotorres.Tablero;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
        setImagen(anterior,"anterior.jpg");
        setImagen(posterior,"posterior.jpg");
        tableroLimpio();
                
        
    }

    public void setImagen(JButton boton, String imagePath) {
        ImageIcon icono = new ImageIcon(imagePath);
        ImageIcon iconAjustado = new ImageIcon(icono.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        boton.setIcon(iconAjustado);
    }
        
        public void tableroLimpio()
        {
            a.setVisible(false); b.setVisible(false); c.setVisible(false);
            d.setVisible(false); e.setVisible(false); f.setVisible(false);
            g.setVisible(false); h.setVisible(false); 
            ocho.setVisible(false); siete.setVisible(false); seis.setVisible(false);
            cinco.setVisible(false); cuatro.setVisible(false); tres.setVisible(false);
            dos.setVisible(false); uno.setVisible(false);
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
        tableroPresenter = new com.unmsm.ochotorres.interfazgrafica.TableroPresenter();
        jPanel1 = new javax.swing.JPanel();
        anterior = new javax.swing.JButton();
        posterior = new javax.swing.JButton();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        fila = new javax.swing.JLabel();
        dimension = new javax.swing.JTextField();
        crearTablero = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 153, 153));

        tableroPresenter.setPreferredSize(new java.awt.Dimension(0, 402));

        javax.swing.GroupLayout tableroPresenterLayout = new javax.swing.GroupLayout(tableroPresenter);
        tableroPresenter.setLayout(tableroPresenterLayout);
        tableroPresenterLayout.setHorizontalGroup(
            tableroPresenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tableroPresenterLayout.setVerticalGroup(
            tableroPresenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posterior, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        a.setText("a");

        b.setText("b");

        c.setText("c");

        d.setText("d");

        e.setText("e");

        f.setText("f");

        g.setText("g");

        h.setText("h");

        ocho.setText("8");

        siete.setText("7");

        seis.setText("6");

        cinco.setText("5");

        cuatro.setText("4");

        tres.setText("3");

        dos.setText("2");

        uno.setText("1");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ocho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(siete, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(cuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(uno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tableroPresenter, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                        .addGap(0, 32, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a)
                    .addComponent(b)
                    .addComponent(c)
                    .addComponent(d)
                    .addComponent(e)
                    .addComponent(f)
                    .addComponent(g)
                    .addComponent(h))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uno)
                        .addGap(31, 31, 31)
                        .addComponent(dos)
                        .addGap(32, 32, 32)
                        .addComponent(tres)
                        .addGap(35, 35, 35)
                        .addComponent(cuatro)
                        .addGap(36, 36, 36)
                        .addComponent(cinco)
                        .addGap(35, 35, 35)
                        .addComponent(seis)
                        .addGap(35, 35, 35)
                        .addComponent(siete)
                        .addGap(34, 34, 34)
                        .addComponent(ocho))
                    .addComponent(tableroPresenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unmsm/imagenes/torreani.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 40));
        jToolBar1.add(jLabel1);

        fila.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        fila.setText("DIMENSION DEL TABLERO :");
        fila.setPreferredSize(new java.awt.Dimension(150, 16));
        jToolBar1.add(fila);

        dimension.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dimension.setMinimumSize(new java.awt.Dimension(6, 30));
        dimension.setPreferredSize(new java.awt.Dimension(50, 30));
        dimension.setRequestFocusEnabled(false);
        dimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensionActionPerformed(evt);
            }
        });
        dimension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dimensionKeyTyped(evt);
            }
        });
        jToolBar1.add(dimension);

        crearTablero.setBackground(new java.awt.Color(204, 204, 255));
        crearTablero.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        crearTablero.setForeground(new java.awt.Color(51, 51, 51));
        crearTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unmsm/imagenes/execute.png"))); // NOI18N
        crearTablero.setText("CREAR TABLERO");
        crearTablero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearTablero.setFocusable(false);
        crearTablero.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        crearTablero.setPreferredSize(new java.awt.Dimension(160, 30));
        crearTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTableroActionPerformed(evt);
            }
        });
        jToolBar1.add(crearTablero);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unmsm/imagenes/torreani.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 40));
        jToolBar1.add(jLabel2);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);
        jToolBar1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTableroActionPerformed
        // TODO add your handling code here:
        String n = dimension.getText();
        int dimensionTablero = 0;
        try {
            dimensionTablero = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESAR DIMENSION CORRECTA!!");
        }
       
        if(dimensionTablero>0&&dimensionTablero<9)
        {
            Tablero.DIMENSION = dimensionTablero;
            Tablero tableroModelo = new Tablero();
            try {
                tableroPresenter.construirEnBaseA(tableroModelo);
            } catch (FueraLimiteException ex) {
                Logger.getLogger(Aplicacion8Torres.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch(dimensionTablero)
            {
                case 1: a.setVisible(true); b.setVisible(false); c.setVisible(false);
                        d.setVisible(false); e.setVisible(false); f.setVisible(false);
                        g.setVisible(false); h.setVisible(false); 
                        ocho.setVisible(false); siete.setVisible(false); seis.setVisible(false);
                        cinco.setVisible(false); cuatro.setVisible(false); tres.setVisible(false);
                        dos.setVisible(false); uno.setVisible(true);break;

                case 2: a.setVisible(true); b.setVisible(true); c.setVisible(false);
                        d.setVisible(false); e.setVisible(false); f.setVisible(false);
                        g.setVisible(false); h.setVisible(false);
                        ocho.setVisible(false); siete.setVisible(false); seis.setVisible(false);
                        cinco.setVisible(false); cuatro.setVisible(false); tres.setVisible(false);
                        dos.setVisible(true); uno.setVisible(true);break;

                case 3: a.setVisible(true); b.setVisible(true); c.setVisible(true);
                        d.setVisible(false); e.setVisible(false); f.setVisible(false);
                        g.setVisible(false); h.setVisible(false);
                        ocho.setVisible(false); siete.setVisible(false); seis.setVisible(false);
                        cinco.setVisible(false); cuatro.setVisible(false); tres.setVisible(true);
                        dos.setVisible(true); uno.setVisible(true);break;

                case 4: a.setVisible(true); b.setVisible(true); c.setVisible(true);
                        d.setVisible(true); e.setVisible(false); f.setVisible(false);
                        g.setVisible(false); h.setVisible(false);
                        ocho.setVisible(false); siete.setVisible(false); seis.setVisible(false);
                        cinco.setVisible(false); cuatro.setVisible(true); tres.setVisible(true);
                        dos.setVisible(true); uno.setVisible(true);break;

                case 5: a.setVisible(true); b.setVisible(true); c.setVisible(true);
                        d.setVisible(true); e.setVisible(true); f.setVisible(false);
                        g.setVisible(false); h.setVisible(false);
                        ocho.setVisible(false); siete.setVisible(false); seis.setVisible(false);
                        cinco.setVisible(true); cuatro.setVisible(true); tres.setVisible(true);
                        dos.setVisible(true); uno.setVisible(true);break;

                case 6: a.setVisible(true); b.setVisible(true); c.setVisible(true);
                        d.setVisible(true); e.setVisible(true); f.setVisible(true);
                        g.setVisible(false); h.setVisible(false);
                        ocho.setVisible(false); siete.setVisible(false); seis.setVisible(true);
                        cinco.setVisible(true); cuatro.setVisible(true); tres.setVisible(true);
                        dos.setVisible(true); uno.setVisible(true);break;

                case 7: a.setVisible(true); b.setVisible(true); c.setVisible(true);
                        d.setVisible(true); e.setVisible(true); f.setVisible(true);
                        g.setVisible(true); h.setVisible(false);
                        ocho.setVisible(false); siete.setVisible(true); seis.setVisible(true);
                        cinco.setVisible(true); cuatro.setVisible(true); tres.setVisible(true);
                        dos.setVisible(true); uno.setVisible(true);break;

                case 8: a.setVisible(true); b.setVisible(true); c.setVisible(true);
                        d.setVisible(true); e.setVisible(true); f.setVisible(true);
                        g.setVisible(true); h.setVisible(true);
                        ocho.setVisible(true); siete.setVisible(true); seis.setVisible(true);
                        cinco.setVisible(true); cuatro.setVisible(true); tres.setVisible(true);
                        dos.setVisible(true); uno.setVisible(true);break;
            }
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "INGRESAR DIMENSION ENTRE 1 - 8");
        }
    }//GEN-LAST:event_crearTableroActionPerformed

    private void dimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dimensionActionPerformed

    private void dimensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dimensionKeyTyped
                   // PERMITE QUE SOLO SE ACEPTEN NUMEROS Y DE HASTA 20 DIGITOS, CADA VEZ QUE SE TIPEA EN ESTE TEXTFIELD 
            if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
            {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            }
            int k = (int) evt.getKeyChar();
    }//GEN-LAST:event_dimensionKeyTyped
  
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
    private javax.swing.JLabel a;
    private javax.swing.JButton anterior;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel cinco;
    private javax.swing.JButton crearTablero;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel d;
    private javax.swing.JTextField dimension;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel fila;
    private javax.swing.JLabel g;
    private javax.swing.JLabel h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel ocho;
    private javax.swing.JPanel panel;
    private javax.swing.JButton posterior;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private com.unmsm.ochotorres.interfazgrafica.TableroPresenter tableroPresenter;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
