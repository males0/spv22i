/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author males
 */
public class jifrmImitador extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifrmImitador
     */
    public jifrmImitador() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbOpcionUno = new javax.swing.JRadioButton();
        rbOpcionDos = new javax.swing.JRadioButton();
        rbOpcionTres = new javax.swing.JRadioButton();
        txtTexto = new javax.swing.JTextField();
        chbOpcionCuatro = new javax.swing.JCheckBox();
        chbOpcionCinco = new javax.swing.JCheckBox();
        chbOpcionSeis = new javax.swing.JCheckBox();
        cbxOriginal = new javax.swing.JComboBox<>();
        spOriginal = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        rbOpcionUnoI = new javax.swing.JRadioButton();
        rbOpcionDosI = new javax.swing.JRadioButton();
        rbOpcionTresI = new javax.swing.JRadioButton();
        chbOpcionCuatroI = new javax.swing.JCheckBox();
        chbOpcionCincoI = new javax.swing.JCheckBox();
        chbOpcionSeisI = new javax.swing.JCheckBox();
        txtTextoDosI = new javax.swing.JTextField();
        cbxOriginalI = new javax.swing.JComboBox<>();
        spOriginalI = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Original"));

        buttonGroup1.add(rbOpcionUno);
        rbOpcionUno.setText("Opcion 1");
        rbOpcionUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpcionUnoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbOpcionDos);
        rbOpcionDos.setText("Opcion 2");
        rbOpcionDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpcionDosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbOpcionTres);
        rbOpcionTres.setText("Opcion 3");
        rbOpcionTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpcionTresActionPerformed(evt);
            }
        });

        txtTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTextoKeyReleased(evt);
            }
        });

        buttonGroup2.add(chbOpcionCuatro);
        chbOpcionCuatro.setText("Opcion 4");
        chbOpcionCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbOpcionCuatroActionPerformed(evt);
            }
        });

        buttonGroup2.add(chbOpcionCinco);
        chbOpcionCinco.setText("Opcion 5");
        chbOpcionCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbOpcionCincoActionPerformed(evt);
            }
        });

        buttonGroup2.add(chbOpcionSeis);
        chbOpcionSeis.setText("Opcion 6");
        chbOpcionSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbOpcionSeisActionPerformed(evt);
            }
        });

        cbxOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOriginalActionPerformed(evt);
            }
        });

        spOriginal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spOriginalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOpcionUno)
                    .addComponent(rbOpcionDos)
                    .addComponent(rbOpcionTres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbOpcionSeis)
                    .addComponent(chbOpcionCinco)
                    .addComponent(chbOpcionCuatro))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(cbxOriginal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spOriginal))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chbOpcionCuatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbOpcionCinco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbOpcionSeis))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcionUno)
                            .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOpcionDos)
                            .addComponent(cbxOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbOpcionTres)
                            .addComponent(spOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Imitador"));

        rbOpcionUnoI.setBackground(new java.awt.Color(204, 204, 204));
        rbOpcionUnoI.setText("Opcion 1");
        rbOpcionUnoI.setEnabled(false);

        rbOpcionDosI.setBackground(new java.awt.Color(204, 204, 204));
        rbOpcionDosI.setText("Opcion 2");
        rbOpcionDosI.setEnabled(false);

        rbOpcionTresI.setBackground(new java.awt.Color(204, 204, 204));
        rbOpcionTresI.setText("Opcion 3");
        rbOpcionTresI.setEnabled(false);
        rbOpcionTresI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOpcionTresIActionPerformed(evt);
            }
        });

        chbOpcionCuatroI.setBackground(new java.awt.Color(204, 204, 204));
        chbOpcionCuatroI.setText("Opcion 4");
        chbOpcionCuatroI.setEnabled(false);
        chbOpcionCuatroI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbOpcionCuatroIActionPerformed(evt);
            }
        });

        chbOpcionCincoI.setBackground(new java.awt.Color(204, 204, 204));
        chbOpcionCincoI.setText("Opcion 5");
        chbOpcionCincoI.setEnabled(false);
        chbOpcionCincoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbOpcionCincoIActionPerformed(evt);
            }
        });

        chbOpcionSeisI.setBackground(new java.awt.Color(204, 204, 204));
        chbOpcionSeisI.setText("Opcion 6");
        chbOpcionSeisI.setEnabled(false);

        txtTextoDosI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTextoDosI.setEnabled(false);

        cbxOriginalI.setBackground(new java.awt.Color(204, 204, 204));
        cbxOriginalI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxOriginalI.setEnabled(false);

        spOriginalI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spOriginalI.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTextoDosI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbOpcionUnoI)
                            .addComponent(rbOpcionDosI)
                            .addComponent(rbOpcionTresI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbOpcionCincoI)
                            .addComponent(chbOpcionCuatroI)
                            .addComponent(chbOpcionSeisI))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(spOriginalI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(cbxOriginalI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcionUnoI)
                    .addComponent(chbOpcionCuatroI)
                    .addComponent(txtTextoDosI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcionDosI)
                    .addComponent(chbOpcionCincoI)
                    .addComponent(cbxOriginalI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcionTresI)
                    .addComponent(chbOpcionSeisI)
                    .addComponent(spOriginalI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbOpcionUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpcionUnoActionPerformed
    if(rbOpcionUno.isSelected()){
            rbOpcionUnoI.setSelected(true);
            rbOpcionDosI.setSelected(false);
            rbOpcionTresI.setSelected(false);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcionUnoActionPerformed

    private void rbOpcionDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpcionDosActionPerformed
                                            
        if(rbOpcionDos.isSelected()){
            rbOpcionDosI.setSelected(true);
            rbOpcionUnoI.setSelected(false);
            rbOpcionTresI.setSelected(false);
        }
    }//GEN-LAST:event_rbOpcionDosActionPerformed

    private void rbOpcionTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpcionTresActionPerformed
       if(rbOpcionTres.isSelected()){
            rbOpcionTresI.setSelected(true);
            rbOpcionUnoI.setSelected(false);
            rbOpcionDosI.setSelected(false);
        }
    }//GEN-LAST:event_rbOpcionTresActionPerformed

    private void chbOpcionSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbOpcionSeisActionPerformed
 if(chbOpcionSeis.isSelected()){
            chbOpcionSeisI.setSelected(true);
        }else{
            chbOpcionSeisI.setSelected(false);
        }    
    }//GEN-LAST:event_chbOpcionSeisActionPerformed

    private void chbOpcionCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbOpcionCuatroActionPerformed
 if(chbOpcionCuatro.isSelected()){
            chbOpcionCuatroI.setSelected(true);
        }else{
            chbOpcionCuatroI.setSelected(false);
        }        
    }//GEN-LAST:event_chbOpcionCuatroActionPerformed

    private void chbOpcionCincoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbOpcionCincoIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbOpcionCincoIActionPerformed

    private void chbOpcionCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbOpcionCincoActionPerformed
 if(chbOpcionCinco.isSelected()){
            chbOpcionCincoI.setSelected(true);
        }else{
            chbOpcionCincoI.setSelected(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_chbOpcionCincoActionPerformed

    private void txtTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoKeyReleased
    txtTextoDosI.setText(txtTexto.getText());
 
    }//GEN-LAST:event_txtTextoKeyReleased

    private void cbxOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOriginalActionPerformed
        this.cbxOriginalI.setSelectedItem(this.cbxOriginal.getSelectedItem());
    }//GEN-LAST:event_cbxOriginalActionPerformed

    private void spOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spOriginalStateChanged
      this.spOriginalI.setValue((Integer)this.spOriginal.getValue());
    }//GEN-LAST:event_spOriginalStateChanged

    private void rbOpcionTresIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOpcionTresIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOpcionTresIActionPerformed

    private void chbOpcionCuatroIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbOpcionCuatroIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbOpcionCuatroIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbxOriginal;
    private javax.swing.JComboBox<String> cbxOriginalI;
    private javax.swing.JCheckBox chbOpcionCinco;
    private javax.swing.JCheckBox chbOpcionCincoI;
    private javax.swing.JCheckBox chbOpcionCuatro;
    private javax.swing.JCheckBox chbOpcionCuatroI;
    private javax.swing.JCheckBox chbOpcionSeis;
    private javax.swing.JCheckBox chbOpcionSeisI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbOpcionDos;
    private javax.swing.JRadioButton rbOpcionDosI;
    private javax.swing.JRadioButton rbOpcionTres;
    private javax.swing.JRadioButton rbOpcionTresI;
    private javax.swing.JRadioButton rbOpcionUno;
    private javax.swing.JRadioButton rbOpcionUnoI;
    private javax.swing.JSpinner spOriginal;
    private javax.swing.JSpinner spOriginalI;
    private javax.swing.JTextField txtTexto;
    private javax.swing.JTextField txtTextoDosI;
    // End of variables declaration//GEN-END:variables
}
