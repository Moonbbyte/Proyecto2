
package proyecto1;

import java.text.DecimalFormat;


public class deter4x4 extends javax.swing.JFrame {
Double x11,x12,x13,x14,x21,x22,x23,x24,x31,x32,x33,x34,x41,x42,x43,x44;
    
    public deter4x4() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public static Double Determinante3x3(Double x11,Double x12,Double x13,Double x21, Double x22,Double x23,Double x31, Double x32,Double x33){
    Double resultado;
    resultado=((x11*x22*x33)+(x21*x32*x13)+(x31*x12*x23))-((x31*x22*x13)+(x32*x11*x23)+(x21*x12*x33)); 
    return resultado;
    }
    
    public static Double Determinante(Double x11,Double x12,Double x13,Double x14,Double x21,Double x22,Double x23,Double x24,Double x31,Double x32,Double x33,Double x34,Double x41,Double x42,Double x43,Double x44){
    Double resultado;
    resultado=x11*Determinante3x3(x22,x23,x24,x32,x33,x34,x42,x43,x44)-x21*Determinante3x3(x12,x13,x14,x32,x33,x34,x42,x43,x44)+x31*Determinante3x3(x12,x13,x14,x22,x23,x24,x42,x43,x44)-x41*Determinante3x3(x12,x13,x14,x22,x23,x24,x32,x33,x34);
    return resultado;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombreoperacion = new javax.swing.JLabel();
        y11 = new javax.swing.JTextField();
        y12 = new javax.swing.JTextField();
        y22 = new javax.swing.JTextField();
        y21 = new javax.swing.JTextField();
        y31 = new javax.swing.JTextField();
        y32 = new javax.swing.JTextField();
        y41 = new javax.swing.JTextField();
        y43 = new javax.swing.JTextField();
        y42 = new javax.swing.JTextField();
        y33 = new javax.swing.JTextField();
        y23 = new javax.swing.JTextField();
        y13 = new javax.swing.JTextField();
        y14 = new javax.swing.JTextField();
        y24 = new javax.swing.JTextField();
        y34 = new javax.swing.JTextField();
        y44 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Determinante:");
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

        y41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y41ActionPerformed(evt);
            }
        });

        y43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y43ActionPerformed(evt);
            }
        });

        y42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y42ActionPerformed(evt);
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

        y13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y13ActionPerformed(evt);
            }
        });

        y14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y14ActionPerformed(evt);
            }
        });

        y24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y24ActionPerformed(evt);
            }
        });

        y34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y34ActionPerformed(evt);
            }
        });

        y44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y44ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resultado:");

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setOpaque(true);

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Guardar Resultado:");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(y41, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y42, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(y21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(y31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(y43, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(y23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(y33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(96, 96, 96))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y43, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void y11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y11ActionPerformed

    private void y12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y12ActionPerformed

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

    private void y41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y41ActionPerformed

    private void y43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y43ActionPerformed

    private void y42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y42ActionPerformed

    private void y33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y33ActionPerformed

    private void y23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y23ActionPerformed

    private void y13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y13ActionPerformed

    private void y14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y14ActionPerformed

    private void y24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y24ActionPerformed

    private void y34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y34ActionPerformed

    private void y44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y44ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DecimalFormat df = new DecimalFormat("0.00");
        Double determinante;  
        x11=Double.parseDouble(y11.getText());
        x12=Double.parseDouble(y12.getText());
        x13=Double.parseDouble(y13.getText());
        x14=Double.parseDouble(y14.getText());
        x21=Double.parseDouble(y21.getText());
        x22=Double.parseDouble(y22.getText());
        x23=Double.parseDouble(y23.getText());
        x24=Double.parseDouble(y24.getText());
        x31=Double.parseDouble(y31.getText());
        x32=Double.parseDouble(y32.getText());
        x33=Double.parseDouble(y33.getText());
        x34=Double.parseDouble(y34.getText());
        x41=Double.parseDouble(y41.getText());
        x42=Double.parseDouble(y42.getText());
        x43=Double.parseDouble(y43.getText());
        x44=Double.parseDouble(y44.getText());
      determinante=Determinante(x11,x12,x13,x14,x21,x22,x23,x24,x31,x32,x33,x34,x41,x42,x43,x44) ;
      resultado.setText(df.format(determinante));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Historial.RellenoMatriz(resultado.getText()+" -Determinante 4x4 -  "+coseno.fechaActual());
        Favoritos.RellenoMatriz(resultado.getText()+" -Determinante 4x4 -  "+coseno.fechaActual());
    }//GEN-LAST:event_jButton2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombreoperacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField y11;
    private javax.swing.JTextField y12;
    private javax.swing.JTextField y13;
    private javax.swing.JTextField y14;
    private javax.swing.JTextField y21;
    private javax.swing.JTextField y22;
    private javax.swing.JTextField y23;
    private javax.swing.JTextField y24;
    private javax.swing.JTextField y31;
    private javax.swing.JTextField y32;
    private javax.swing.JTextField y33;
    private javax.swing.JTextField y34;
    private javax.swing.JTextField y41;
    private javax.swing.JTextField y42;
    private javax.swing.JTextField y43;
    private javax.swing.JTextField y44;
    // End of variables declaration//GEN-END:variables
}
