/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import logica.ControllerClienteCanino;

/**
 *
 * @author Federico
 */
public class Pantalla extends javax.swing.JFrame {

    
    final static int numeroid = 0;
    ControllerClienteCanino controlador;
    
    
    /**
     * Creates new form Pantalla
     */
    public Pantalla(ControllerClienteCanino controlador) {
        initComponents();
        this.controlador=controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chbEspecial = new javax.swing.JCheckBox();
        chbAlergico = new javax.swing.JCheckBox();
        txtNCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        txtCelDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttObservaciones = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        jLabel1.setBackground(new java.awt.Color(255, 102, 204));
        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Peluquería Canina");

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perrito01.PNG"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente Nº:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Raza:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Color:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Alérgico:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Atención Especial:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre Dueño:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cel. Dueño:");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Observaciones:");

        chbEspecial.setBackground(new java.awt.Color(238, 238, 238));
        chbEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbEspecialActionPerformed(evt);
            }
        });

        chbAlergico.setBackground(new java.awt.Color(238, 238, 238));

        txtNCliente.setBackground(new java.awt.Color(238, 238, 238));
        txtNCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNCliente.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNCliente.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtNombre.setBackground(new java.awt.Color(238, 238, 238));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtRaza.setBackground(new java.awt.Color(238, 238, 238));
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.setCaretColor(new java.awt.Color(0, 0, 0));
        txtRaza.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtColor.setBackground(new java.awt.Color(238, 238, 238));
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setCaretColor(new java.awt.Color(0, 0, 0));
        txtColor.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtNombreDuenio.setBackground(new java.awt.Color(238, 238, 238));
        txtNombreDuenio.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreDuenio.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombreDuenio.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtCelDuenio.setBackground(new java.awt.Color(238, 238, 238));
        txtCelDuenio.setForeground(new java.awt.Color(0, 0, 0));
        txtCelDuenio.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCelDuenio.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txttObservaciones.setBackground(new java.awt.Color(238, 238, 238));
        txttObservaciones.setColumns(20);
        txttObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        txttObservaciones.setRows(5);
        txttObservaciones.setCaretColor(new java.awt.Color(0, 0, 0));
        txttObservaciones.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txttObservaciones);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addComponent(txtRaza)
                                    .addComponent(txtColor)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(25, 25, 25)
                                        .addComponent(chbAlergico))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnGuardar)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNombreDuenio)
                                                .addComponent(chbEspecial)
                                                .addComponent(txtCelDuenio)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(img1)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(chbAlergico))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(chbEspecial))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCelDuenio.setText("");
        txtColor.setText("");
        txtNCliente.setText("");
        txtNombre.setText("");
        txtNombreDuenio.setText("");
        txtRaza.setText("");
        txttObservaciones.setText("");
        chbAlergico.setSelected(false);
        chbEspecial.setSelected(false);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chbEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbEspecialActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String numeroCliente = txtNCliente.getText();
        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String nombreDuenio = txtNombreDuenio.getText();
        String celDuenio = txtCelDuenio.getText();
        String observaciones = txttObservaciones.getText();
        boolean alergico = chbAlergico.isSelected();
        boolean especial = chbEspecial.isSelected();
        
        controlador.altaClienteCanino(numeroCliente,nombre,raza,color,alergico,especial,nombreDuenio,celDuenio,observaciones);
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chbAlergico;
    private javax.swing.JCheckBox chbEspecial;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextArea txttObservaciones;
    // End of variables declaration//GEN-END:variables
}