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
public class jifrmSumaNumeros extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifrmSumaNumeros
     */
    public jifrmSumaNumeros() {
        initComponents();  
    }
     public jifrmSumaNumeros(String titulo) {
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

        jToolBar1 = new javax.swing.JToolBar();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicasion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtnumero1 = new javax.swing.JTextField();
        txtnumero2 = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Suma de numero");

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        btnSuma.setBackground(new java.awt.Color(255, 255, 255));
        btnSuma.setForeground(new java.awt.Color(51, 51, 51));
        btnSuma.setText("SUMA");
        btnSuma.setFocusable(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setMaximumSize(new java.awt.Dimension(222, 100));
        btnSuma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSuma);

        btnResta.setBackground(new java.awt.Color(255, 255, 255));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resta.png"))); // NOI18N
        btnResta.setFocusable(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setMaximumSize(new java.awt.Dimension(222, 100));
        btnResta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnResta);

        btnMultiplicasion.setBackground(new java.awt.Color(255, 255, 255));
        btnMultiplicasion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multiplicacion.png"))); // NOI18N
        btnMultiplicasion.setFocusable(false);
        btnMultiplicasion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicasion.setMaximumSize(new java.awt.Dimension(222, 100));
        btnMultiplicasion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMultiplicasion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicasionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMultiplicasion);

        btnDivision.setBackground(new java.awt.Color(255, 255, 255));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/division.png"))); // NOI18N
        btnDivision.setFocusable(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setMaximumSize(new java.awt.Dimension(222, 100));
        btnDivision.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDivision);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setText("SALIR");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        txtnumero1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR EL PRIMER VALOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        txtnumero2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR EL SEGUNDO VALOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        lblResultado.setMaximumSize(new java.awt.Dimension(20, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(txtnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(txtnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
 double 
         numeroUno, numeroDos, resultado;
        numeroUno=Integer.parseInt(txtnumero1.getText());
        numeroDos = Integer.parseInt(txtnumero2.getText());
        resultado = numeroUno / numeroDos;
        lblResultado.setText(""+resultado);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed

        Integer numeroUno, numeroDos, resultado;
        numeroUno=Integer.parseInt(txtnumero1.getText());
        numeroDos = Integer.parseInt(txtnumero2.getText());
        resultado = numeroUno +  numeroDos;
        lblResultado.setText(""+resultado);

    
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
      Integer numeroUno, numeroDos, resultado;
        numeroUno=Integer.parseInt(txtnumero1.getText());
        numeroDos = Integer.parseInt(txtnumero2.getText());
        resultado = numeroUno -  numeroDos;
        lblResultado.setText(""+resultado);
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicasionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicasionActionPerformed
       Integer numeroUno, numeroDos, resultado;
        numeroUno=Integer.parseInt(txtnumero1.getText());
        numeroDos = Integer.parseInt(txtnumero2.getText());
        resultado = numeroUno * numeroDos;
        lblResultado.setText(""+resultado);     
    }//GEN-LAST:event_btnMultiplicasionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicasion;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton jButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtnumero1;
    private javax.swing.JTextField txtnumero2;
    // End of variables declaration//GEN-END:variables
}