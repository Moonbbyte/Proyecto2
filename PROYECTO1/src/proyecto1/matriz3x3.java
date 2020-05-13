/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.text.DecimalFormat;


public class matriz3x3 extends javax.swing.JFrame {
String v11,v12,v13,R1,v21,v22,v23,R2,v31,v32,v33,R3;
   
    public matriz3x3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultado3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        resultado2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        resultado1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        z1 = new javax.swing.JTextField();
        z2 = new javax.swing.JTextField();
        z3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Xresult = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Yresult = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Zresult = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        resultado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Z=");

        resultado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Z=");

        resultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Z=");

        z1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z1ActionPerformed(evt);
            }
        });

        z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z2ActionPerformed(evt);
            }
        });

        z3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Y+");

        jLabel5.setText("Y+");

        jLabel4.setText("Y+");

        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });

        y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y2ActionPerformed(evt);
            }
        });

        y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y3ActionPerformed(evt);
            }
        });

        jLabel3.setText("X+");

        jLabel2.setText("X+");

        jLabel1.setText("X+");

        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });

        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });

        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Resultado:");

        Xresult.setBackground(new java.awt.Color(255, 255, 255));
        Xresult.setOpaque(true);

        jLabel11.setText("X=");

        jLabel12.setText("Y=");

        Yresult.setBackground(new java.awt.Color(255, 255, 255));
        Yresult.setOpaque(true);

        jLabel13.setText("Z=");

        Zresult.setBackground(new java.awt.Color(255, 255, 255));
        Zresult.setOpaque(true);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar Resultado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Xresult, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(Yresult, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Zresult, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Xresult, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(Zresult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Yresult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultado3ActionPerformed

    private void resultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultado2ActionPerformed

    private void resultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultado1ActionPerformed

    private void z1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z1ActionPerformed

    private void z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z2ActionPerformed

    private void z3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z3ActionPerformed

    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y1ActionPerformed

    private void y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y2ActionPerformed

    private void y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y3ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x2ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x3ActionPerformed

   //////////////////CALCULAR 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DecimalFormat df = new DecimalFormat("0.00");
       String determatriz,deterx,detery,deterz;
       Double X,Y,Z;
       v11=x1.getText();
       v12=y1.getText();
       v13=z1.getText();
       v21=x2.getText();
       v22=y2.getText();
       v23=z2.getText();
       v31=x3.getText();
       v32=y3.getText();
       v33=z3.getText();
       R1=resultado1.getText();
       R2=resultado2.getText();
       R3=resultado3.getText();
       determatriz=dmatriz(v11,v12,v13,R1,v21,v22,v23,R2,v31,v32,v33,R3);
       deterx=DX(v11,v12,v13,R1,v21,v22,v23,R2,v31,v32,v33,R3);
       detery=DY(v11,v12,v13,R1,v21,v22,v23,R2,v31,v32,v33,R3);
       deterz=DZ(v11,v12,v13,R1,v21,v22,v23,R2,v31,v32,v33,R3);
       X=Double.parseDouble(deterx)/Double.parseDouble(determatriz);
       Y=Double.parseDouble(detery)/Double.parseDouble(determatriz);
       Z=Double.parseDouble(deterz)/Double.parseDouble(determatriz);
       Xresult.setText(df.format(X));
       Yresult.setText(df.format(Y));
       Zresult.setText(df.format(Z));
       
       
    }//GEN-LAST:event_jButton1ActionPerformed
////////////////GUARDAR
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Historial.RellenoMatriz("X: "+Xresult.getText()+" Y: "+Xresult.getText()+" Z: "+Zresult.getText()+" -Sistema de ecuaciones 3x3-  "+coseno.fechaActual());
        Favoritos.RellenoMatriz("X: "+Xresult.getText()+" Y: "+Xresult.getText()+" Z: "+Zresult.getText()+" -Sistema de ecuaciones 3x3-  "+coseno.fechaActual());
    }//GEN-LAST:event_jButton2ActionPerformed
//////////DETERMINANTE MATRIZ
 public static String dmatriz(String v11,String v12,String v13,String R1,String v21,String v22,String v23,String R2,String v31,String v32,String v33,String R3){
 String result;
 Double resultnum1,resultnum2,finalresult;
 resultnum1=(Double.parseDouble(v11)*Double.parseDouble(v22)*Double.parseDouble(v33)+Double.parseDouble(v21)*Double.parseDouble(v32)*Double.parseDouble(v13)+
         Double.parseDouble(v31)*Double.parseDouble(v12)*Double.parseDouble(v23));
 resultnum2=(Double.parseDouble(v31)*Double.parseDouble(v22)*Double.parseDouble(v13)+Double.parseDouble(v11)*Double.parseDouble(v32)*Double.parseDouble(v23)+
         Double.parseDouble(v21)*Double.parseDouble(v12)*Double.parseDouble(v33));
 finalresult=resultnum1-resultnum2;
 result=finalresult.toString();
 return result;
 }
 ///////////////////////////DETERMINANTE DE X
 public static String DX(String v11,String v12,String v13,String R1,String v21,String v22,String v23,String R2,String v31,String v32,String v33,String R3){
 String result;
 Double resultnum1,resultnum2,finalresult;
 resultnum1=(Double.parseDouble(R1)*Double.parseDouble(v22)*Double.parseDouble(v33)+Double.parseDouble(v12)*Double.parseDouble(v23)*Double.parseDouble(R3)+
         Double.parseDouble(v13)*Double.parseDouble(R2)*Double.parseDouble(v32));
 resultnum2=(Double.parseDouble(R3)*Double.parseDouble(v22)*Double.parseDouble(v13)+Double.parseDouble(v32)*Double.parseDouble(v23)*Double.parseDouble(R1)+
         Double.parseDouble(v33)*Double.parseDouble(R2)*Double.parseDouble(v12));
 finalresult=resultnum1-resultnum2;
 result=finalresult.toString();
 return result;
 }
 ///////////////////////////DETERMINANTE DE Y
 public static String DY(String v11,String v12,String v13,String R1,String v21,String v22,String v23,String R2,String v31,String v32,String v33,String R3){
 String result;
 Double resultnum1,resultnum2,finalresult;
 resultnum1=(Double.parseDouble(v11)*Double.parseDouble(R2)*Double.parseDouble(v33)+Double.parseDouble(v21)*Double.parseDouble(R3)*Double.parseDouble(v13)+
         Double.parseDouble(v31)*Double.parseDouble(R1)*Double.parseDouble(v23));
 resultnum2=(Double.parseDouble(v31)*Double.parseDouble(R2)*Double.parseDouble(v13)+Double.parseDouble(v11)*Double.parseDouble(R3)*Double.parseDouble(v23)+
         Double.parseDouble(v21)*Double.parseDouble(R1)*Double.parseDouble(v33));
 finalresult=resultnum1-resultnum2;
 result=finalresult.toString();
 return result;
 }
 ///////////////////////////DETERMINANTE DE Z
 public static String DZ(String v11,String v12,String v13,String R1,String v21,String v22,String v23,String R2,String v31,String v32,String v33,String R3){
 String result;
 Double resultnum1,resultnum2,finalresult;
 resultnum1=(Double.parseDouble(v11)*Double.parseDouble(v22)*Double.parseDouble(R3)+Double.parseDouble(v12)*Double.parseDouble(R2)*Double.parseDouble(v31)+
         Double.parseDouble(R1)*Double.parseDouble(v21)*Double.parseDouble(v32));
 resultnum2=(Double.parseDouble(v31)*Double.parseDouble(v22)*Double.parseDouble(R1)+Double.parseDouble(v32)*Double.parseDouble(R2)*Double.parseDouble(v11)+
         Double.parseDouble(R3)*Double.parseDouble(v21)*Double.parseDouble(v12));
 finalresult=resultnum1-resultnum2;
 result=finalresult.toString();
 return result;
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Xresult;
    private javax.swing.JLabel Yresult;
    private javax.swing.JLabel Zresult;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultado1;
    private javax.swing.JTextField resultado2;
    private javax.swing.JTextField resultado3;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    private javax.swing.JTextField z3;
    // End of variables declaration//GEN-END:variables
}
