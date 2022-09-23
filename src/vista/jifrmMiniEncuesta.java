/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author males
 */
public class jifrmMiniEncuesta extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifrmMiniEncuesta
     */
    public jifrmMiniEncuesta() {
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
        jPanel1 = new javax.swing.JPanel();
        rbtnWindows = new javax.swing.JRadioButton();
        rbtnLinux = new javax.swing.JRadioButton();
        rbtnMac = new javax.swing.JRadioButton();
        rbtnSolaris = new javax.swing.JRadioButton();
        rbtnUnix = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        chbDesarrolloSoftware = new javax.swing.JCheckBox();
        chbAdministracion = new javax.swing.JCheckBox();
        chbDiseñoGrafico = new javax.swing.JCheckBox();
        chbSistemas = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        sliNumeroHoras = new javax.swing.JSlider();
        btnGenerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mini Encuesta");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione el Sistema Operativo"));

        buttonGroup1.add(rbtnWindows);
        rbtnWindows.setText("Windows");

        buttonGroup1.add(rbtnLinux);
        rbtnLinux.setText("Linux");

        buttonGroup1.add(rbtnMac);
        rbtnMac.setText("Mac");

        buttonGroup1.add(rbtnSolaris);
        rbtnSolaris.setText("Solaris");

        buttonGroup1.add(rbtnUnix);
        rbtnUnix.setText("Unix");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMac)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnWindows)
                            .addComponent(rbtnLinux))
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnUnix)
                            .addComponent(rbtnSolaris))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnWindows)
                    .addComponent(rbtnSolaris))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnUnix)
                    .addComponent(rbtnLinux))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnMac)
                .addGap(38, 38, 38))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione tu Especialidad"));

        chbDesarrolloSoftware.setText("Desarrollo de Software");

        chbAdministracion.setText("Administracion");
        chbAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAdministracionActionPerformed(evt);
            }
        });

        chbDiseñoGrafico.setText("Diseño Grafico");

        chbSistemas.setText("Sistemas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chbDesarrolloSoftware)
                        .addGap(139, 139, 139)
                        .addComponent(chbSistemas))
                    .addComponent(chbAdministracion)
                    .addComponent(chbDiseñoGrafico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbDesarrolloSoftware)
                    .addComponent(chbSistemas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbAdministracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbDiseñoGrafico)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione el numero de horas en el computador"));

        sliNumeroHoras.setBackground(new java.awt.Color(255, 0, 0));
        sliNumeroHoras.setForeground(new java.awt.Color(255, 255, 51));
        sliNumeroHoras.setMajorTickSpacing(1);
        sliNumeroHoras.setMaximum(10);
        sliNumeroHoras.setMinimum(1);
        sliNumeroHoras.setPaintLabels(true);
        sliNumeroHoras.setPaintTicks(true);
        sliNumeroHoras.setSnapToTicks(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(sliNumeroHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(sliNumeroHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(btnGenerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAdministracionActionPerformed
   
    }//GEN-LAST:event_chbAdministracionActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
      String msjSO="";
        if(rbtnWindows.isSelected()){
            msjSO = "Windows";
        }else if(rbtnLinux.isSelected()){
            msjSO = "Linux";
        }else if(rbtnMac.isSelected()){
            msjSO = "Mac";
        }else if(rbtnSolaris.isSelected()){
            msjSO = "Solaris";
        }else if(rbtnUnix.isSelected()){
            msjSO = "Unix";
        }else{
            msjSO = "Ubuntu";
        }
        
        String msjEspecialidad="";
        
        if(chbDesarrolloSoftware.isSelected()){
            msjEspecialidad += " Desarrollo ";
        }
        if(chbAdministracion.isSelected()){
            msjEspecialidad += " Administtracion ";
        }
        if(chbDiseñoGrafico.isSelected()){
            msjEspecialidad += " Diseño Grafico ";
        }
        
        Integer numeroHoras = sliNumeroHoras.getValue();
        
        JOptionPane.showMessageDialog(null, "Sistema Operativo preferido: "+msjSO+"\n\n"+
                "Tus Especialidades son: "+msjEspecialidad+"\n\n"+
                "Numero de Horas en el computador: " + numeroHoras);
    }//GEN-LAST:event_btnGenerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbAdministracion;
    private javax.swing.JCheckBox chbDesarrolloSoftware;
    private javax.swing.JCheckBox chbDiseñoGrafico;
    private javax.swing.JCheckBox chbSistemas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbtnLinux;
    private javax.swing.JRadioButton rbtnMac;
    private javax.swing.JRadioButton rbtnSolaris;
    private javax.swing.JRadioButton rbtnUnix;
    private javax.swing.JRadioButton rbtnWindows;
    private javax.swing.JSlider sliNumeroHoras;
    // End of variables declaration//GEN-END:variables
}
