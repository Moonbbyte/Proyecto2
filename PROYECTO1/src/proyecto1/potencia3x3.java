package proyecto1;

import javax.swing.JOptionPane;

public class potencia3x3 extends javax.swing.JFrame {

    Double x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44;
    Double w11, w12, w13, w14, w21, w22, w23, w24, w31, w32, w33, w34, w41, w42, w43, w44;
    Double potencia;
    Double z11[] = new Double[30];
    Double z13[] = new Double[30];
    Double z12[] = new Double[30];
    Double z21[] = new Double[30];
    Double z22[] = new Double[30];
    Double z23[] = new Double[30];
    Double z31[] = new Double[30];
    Double z32[] = new Double[30];
    Double z33[] = new Double[30];

    public potencia3x3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nombreoperacion = new javax.swing.JLabel();
        y11 = new javax.swing.JTextField();
        y12 = new javax.swing.JTextField();
        y13 = new javax.swing.JTextField();
        y22 = new javax.swing.JTextField();
        y21 = new javax.swing.JTextField();
        y31 = new javax.swing.JTextField();
        y32 = new javax.swing.JTextField();
        y33 = new javax.swing.JTextField();
        y23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        r31 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        r11 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        r33 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        potencia1 = new javax.swing.JTextField();
        Nombreoperacion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Transpuesta :");
        Nombreoperacion.setOpaque(true);

        y11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y11ActionPerformed(evt);
            }
        });

        y12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y12ActionPerformed(evt);
            }
        });

        y13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y13ActionPerformed(evt);
            }
        });

        y22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y22ActionPerformed(evt);
            }
        });

        y21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y21ActionPerformed(evt);
            }
        });

        y31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y31ActionPerformed(evt);
            }
        });

        y32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y32ActionPerformed(evt);
            }
        });

        y33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y33ActionPerformed(evt);
            }
        });

        y23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y23ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        r31.setBackground(new java.awt.Color(255, 255, 255));
        r31.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r31.setOpaque(true);

        r21.setBackground(new java.awt.Color(255, 255, 255));
        r21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r21.setOpaque(true);

        r11.setBackground(new java.awt.Color(255, 255, 255));
        r11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r11.setOpaque(true);

        r12.setBackground(new java.awt.Color(255, 255, 255));
        r12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r12.setOpaque(true);

        r13.setBackground(new java.awt.Color(255, 255, 255));
        r13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r13.setOpaque(true);

        r22.setBackground(new java.awt.Color(255, 255, 255));
        r22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r22.setOpaque(true);

        r23.setBackground(new java.awt.Color(255, 255, 255));
        r23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r23.setOpaque(true);

        r33.setBackground(new java.awt.Color(255, 255, 255));
        r33.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r33.setOpaque(true);

        r32.setBackground(new java.awt.Color(255, 255, 255));
        r32.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r32.setOpaque(true);

        potencia1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        potencia1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        potencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencia1ActionPerformed(evt);
            }
        });

        Nombreoperacion1.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion1.setText("Potencia a la:");
        Nombreoperacion1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nombreoperacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombreoperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void y11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y11ActionPerformed

    private void y12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y12ActionPerformed

    private void y13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y13ActionPerformed

    private void y22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y22ActionPerformed

    private void y21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y21ActionPerformed

    private void y31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y31ActionPerformed

    private void y32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y32ActionPerformed

    private void y33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y33ActionPerformed

    private void y23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y23ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{   w11 = Double.parseDouble(y11.getText());
        w12 = Double.parseDouble(y12.getText());
        w13 = Double.parseDouble(y13.getText());
        w21 = Double.parseDouble(y21.getText());
        w22 = Double.parseDouble(y22.getText());
        w23 = Double.parseDouble(y23.getText());
        w31 = Double.parseDouble(y31.getText());
        w32 = Double.parseDouble(y32.getText());
        w33 = Double.parseDouble(y33.getText());
        potencia = Double.parseDouble(potencia1.getText());
         int p = Integer.parseInt(potencia1.getText());
        z11[0] = w11;
        z13[0] = w13;
        z12[0] = w12;
        z21[0] = w21;
        z22[0] = w22;
        z23[0] = w23;
        z31[0] = w31;
        z32[0] = w32;
        z33[0] = w33;
       

        if (potencia == 1.0) {
            r11.setText(w11.toString());
            r12.setText(w12.toString());
            r13.setText(w13.toString());
            r21.setText(w21.toString());
            r22.setText(w22.toString());
            r23.setText(w23.toString());
            r31.setText(w31.toString());
            r32.setText(w32.toString());
            r33.setText(w33.toString());

        } else if (potencia > 1.0) {
            for (int i = 0; i < potencia - 1; i++) {
                z11[i + 1] = z11[i] * w11 + z12[i] * w21 + z13[i] * w31;
                z12[i + 1] = z11[i] * w12 + z12[i] * w22 + z13[i] * w32;
                z13[i + 1] = z11[i] * w13 + z12[i] * w23 + z13[i] * w33;

                z21[i + 1] = z21[i] * w11 + z22[i] * w21 + z23[i] * w31;
                z22[i + 1] = z21[i] * w12 + z22[i] * w22 + z23[i] * w32;
                z23[i + 1] = z21[i] * w13 + z22[i] * w23 + z23[i] * w33;

                z31[i + 1] = z31[i] * w11 + z32[i] * w21 + z33[i] * w31;
                z32[i + 1] = z31[i] * w12 + z32[i] * w22 + z33[i] * w32;
                z33[i + 1] = z31[i] * w13 + z32[i] * w23 + z33[i] * w33;
            }
            r11.setText(z11[p-1].toString());
            r12.setText(z12[p-1].toString());
            r13.setText(z13[p-1].toString());
            r21.setText(z21[p-1].toString());
            r22.setText(z22[p-1].toString());
            r23.setText(z23[p-1].toString());
            r31.setText(z31[p-1].toString());
            r32.setText(z32[p-1].toString());
            r33.setText(z33[p-1].toString());
            
        } }catch(Exception e){JOptionPane.showMessageDialog(null, "Se deben de llenar todas las casillas para empezar el calculo");

}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void potencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potencia1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombreoperacion;
    private javax.swing.JLabel Nombreoperacion1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField potencia1;
    private javax.swing.JLabel r11;
    private javax.swing.JLabel r12;
    private javax.swing.JLabel r13;
    private javax.swing.JLabel r21;
    private javax.swing.JLabel r22;
    private javax.swing.JLabel r23;
    private javax.swing.JLabel r31;
    private javax.swing.JLabel r32;
    private javax.swing.JLabel r33;
    private javax.swing.JTextField y11;
    private javax.swing.JTextField y12;
    private javax.swing.JTextField y13;
    private javax.swing.JTextField y21;
    private javax.swing.JTextField y22;
    private javax.swing.JTextField y23;
    private javax.swing.JTextField y31;
    private javax.swing.JTextField y32;
    private javax.swing.JTextField y33;
    // End of variables declaration//GEN-END:variables
}
