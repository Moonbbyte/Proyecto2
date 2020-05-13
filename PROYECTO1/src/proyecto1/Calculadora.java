/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class Calculadora extends javax.swing.JFrame {

    String dato1, signo, dato2, valor;
    private boolean punto = true;
    Double resultado;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Numerocas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        Numerocas.setBackground(new java.awt.Color(255, 255, 255));
        Numerocas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        Numerocas.setOpaque(true);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("5");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("x");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("9");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("8");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("7");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("/");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("(-)");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("0");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("n √");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText(".");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("1/x");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("√");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("^");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton21.setText("Calcular");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton22.setText("C");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("Guardar Resultado");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("!");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("🡰");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nota: Para volver los numeros negativos presionar ¨(-)¨.");

        jLabel2.setText("Nota: Al presionar un boton para una operación el primer numero desaparece pero");

        jLabel3.setText("queda guardado.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Numerocas, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton21)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton25)
                                    .addComponent(jButton23)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Numerocas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton25)
                        .addGap(11, 11, 11)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
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
                                        //BOTONES NUMERALES
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "3");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "4");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "5");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "7");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "8");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "9");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        this.Numerocas.setText(this.Numerocas.getText() + "0");
    }//GEN-LAST:event_jButton15ActionPerformed
//BOTON CLEAR
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        this.Numerocas.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed
/////////////FACTORIAL
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        try {
            String Resultadofinal;
            if (!Numerocas.getText().equals("")) {
                dato1 = Numerocas.getText();
                Numerocas.setText("");
            }
            Resultadofinal = factorial(dato1);
            Numerocas.setText(Resultadofinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guarda el resultado anterior volver a digitar numeros");
        }
    }//GEN-LAST:event_jButton24ActionPerformed
//BOTON PUNTO
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            valor = Numerocas.getText();
            if (valor.length() <= 0) {
                Numerocas.setText("0.");
            } else if (Numerocas.getText().contains(".")) {
            } else {
                Numerocas.setText(Numerocas.getText() + ".");
                punto = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guarda el resultado anterior volver a digitar numeros");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {

            valor = Numerocas.getText();
            if (valor.length() > 0) {
                resultado = (-1) * Double.parseDouble(valor);
                Numerocas.setText(resultado.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guarda el resultado anterior volver a digitar numeros");
        }
    }//GEN-LAST:event_jButton14ActionPerformed
/////BOTON ELIMINAR
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        valor = Numerocas.getText();
        if (valor.length() > 0) {
            valor = valor.substring(0, valor.length() - 1);
            Numerocas.setText(valor);

        }
    }//GEN-LAST:event_jButton25ActionPerformed
//////////////////////////////SUMA
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!Numerocas.getText().equals("")) {
            dato1 = Numerocas.getText();
            signo = "+";
            Numerocas.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
/////////////////////////////RESTA
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!Numerocas.getText().equals("")) {
            dato1 = Numerocas.getText();
            signo = "-";
            Numerocas.setText("");
        }
    }//GEN-LAST:event_jButton5ActionPerformed
//////////////////////////////MULTIPLiCAR
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!Numerocas.getText().equals("")) {
            dato1 = Numerocas.getText();
            signo = "*";
            Numerocas.setText("");
        }
    }//GEN-LAST:event_jButton9ActionPerformed
////////////////////DIVIDIR
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (!Numerocas.getText().equals("")) {
            dato1 = Numerocas.getText();
            signo = "/";
            Numerocas.setText("");
        }
    }//GEN-LAST:event_jButton13ActionPerformed
//////////////////BOTON IGUAL
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        String Resultadofinal;
        dato2 = Numerocas.getText();
        try {
            if (!dato2.equals("") && signo != "raiz" && signo != "inverso" && signo != "raizn" && signo != "elevado") {
                Resultadofinal = operacionesbasicas(dato1, dato2, signo);
                Numerocas.setText(Resultadofinal);
            } else if (!dato2.equals("") && signo == "elevado") {
                Resultadofinal = elevado(dato1, dato2, signo);
                Numerocas.setText(Resultadofinal);
            } else if (!dato2.equals("") && signo == "raizn" && Double.parseDouble(dato1) > 0) {
                Resultadofinal = raizn(dato1, dato2, signo);
                Numerocas.setText(Resultadofinal);
            } else if (!dato2.equals("") && signo == "raizn" && Double.parseDouble(dato1) < 0 && Double.parseDouble(dato2) % 2 != 0) {
                Resultadofinal = raizn(dato1, dato2, signo);
                Numerocas.setText(Resultadofinal);
            } else if (!dato2.equals("") && signo == "raizn" && Double.parseDouble(dato1) < 0 && Double.parseDouble(dato2) % 2 == 0) {
                Resultadofinal = raizn(dato1, dato2, signo);
                Numerocas.setText(Resultadofinal + " i");
            }else if (!dato2.equals("") && signo == "raizn" && Double.parseDouble(dato1) ==0) {
                Numerocas.setText("0.0");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guarda el resultado anterior volver a digitar numeros");
        }

    }//GEN-LAST:event_jButton21ActionPerformed
/////////RAIZ
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        String Resultadofinal;
        try {
            if (!Numerocas.getText().equals("")) {
                dato1 = Numerocas.getText();
                signo = "raiz";
                Numerocas.setText("");
            }
            if (signo == "raiz" && Double.parseDouble(dato1) >= 0) {
                Resultadofinal = raizcuadrada(dato1, signo);
                Numerocas.setText(Resultadofinal);
            } else if (signo == "raiz" && Double.parseDouble(dato1) < 0) {
                Resultadofinal = raizcuadrada(dato1, signo);
                Numerocas.setText(Resultadofinal + " i");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guarda el resultado anterior volver a digitar numeros");
        }
    }//GEN-LAST:event_jButton19ActionPerformed
/////////RAIZ A LA N
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (!Numerocas.getText().equals("")) {
            dato1 = Numerocas.getText();
            signo = "raizn";
            Numerocas.setText("");
        }
    }//GEN-LAST:event_jButton16ActionPerformed
//////ELEVAR A LA N
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (!Numerocas.getText().equals("")) {
            dato1 = Numerocas.getText();
            signo = "elevado";
            Numerocas.setText("");
        }
    }//GEN-LAST:event_jButton20ActionPerformed
///////INVERSO
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String Resultadofinal;
        try {
            if (!Numerocas.getText().equals("")) {
                dato1 = Numerocas.getText();
                signo = "inverso";
                Numerocas.setText("");
            }
            if (signo == "inverso") {
                Resultadofinal = inverso(dato1, "1", signo);
                Numerocas.setText(Resultadofinal);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se guarda el resultado anterior volver a digitar numeros");
        }


    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        Historial.RellenoMatriz(Numerocas.getText() + " - Calculadora-  " + coseno.fechaActual());
        Favoritos.RellenoMatriz(Numerocas.getText() + " - Calculadora-  " + coseno.fechaActual());

    }//GEN-LAST:event_jButton23ActionPerformed

//////////////RAIZ CUADRADA
    public static String raizcuadrada(String dato1, String signo) {
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado;
        Double y, x = 0.0, tol = 0.00001;
        String resultnum = "";
        if (dato1.equals("0")) {
            resultnum = df.format(0);
        }
        if (Double.parseDouble(dato1) > 0) {
            x = Double.parseDouble(dato1) / 2;
            do {
                y = x;
                x = (y + (Double.parseDouble(dato1) / y)) / 2;
            } while (y - x!=0);
            resultnum = df.format(x);
        }
        if (Double.parseDouble(dato1) < 0) {
            x = -Double.parseDouble(dato1) / 2;
            do {
                y = x;
                x = (y + (-Double.parseDouble(dato1) / y)) / 2;
            } while (y - x != 0);

            resultnum = df.format(x);
        }
        resultado = resultnum;
        return resultado;
    }
/////////////////////////////////////FACTORIAL

    public static String factorial(String dato1) {
        Double N = (Double.parseDouble(dato1) + 1);
        Double Z = 0.0;
        DecimalFormat df = new DecimalFormat("0.00");
        Double resultado = 1.0;
        String resultadofinal = "";

        if (Double.parseDouble(dato1) == 0.0) {
            resultadofinal = "1";
        } else if (Double.parseDouble(dato1) != 0 && Double.parseDouble(dato1) > 0) {
            while (N != 1) {
                N = N - 1;
                resultado = N * resultado;
            }
            resultadofinal = df.format(resultado);
        } else if (Double.parseDouble(dato1) != 0 && Double.parseDouble(dato1) < 0 && Double.parseDouble(dato1) % 2 == 0) {
            Z = ((-Double.parseDouble(dato1)) + 1);

            while (Z != 1) {
                Z = Z - 1;
                resultado = Z * resultado;
            }
            resultadofinal = df.format(resultado);
        } else if (Double.parseDouble(dato1) != 0 && Double.parseDouble(dato1) < 0 && Double.parseDouble(dato1) % 2 != 0) {
            Z = ((-Double.parseDouble(dato1)) + 1);
            while (Z != 1) {
                Z = Z - 1;
                resultado = Z * resultado;
            }
            resultadofinal = df.format(-resultado);
        }

        return resultadofinal;
    }

/////////RAIZ A LA N
    public static String raizn(String dato1, String dato2, String signo) {
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado;
        Double y, t = 0.0, n = 0.0;
        String resultnum = "";
        
///////PARA TODO NUMERO ADENTRO DE LA RAIZ POSITIVO
         if (Double.parseDouble(dato1) > 0) {
            do {
                Double x = 1.0;
                n += 0.0001;
                for (int i = 0; i < Double.parseDouble(dato2); i++) {
                    x = x * n;
                }
                t = x;
            } while (t < Double.parseDouble(dato1));
            resultnum = df.format(n);

        }
///////n de la raiz impar, NUMERO ADENTRO NEGATIVO
        if (Double.parseDouble(dato1) < 0 && Double.parseDouble(dato2) % 2 != 0) {
            do {
                Double x = 1.0;
                n += 0.0001;
                for (int i = 0; i < Double.parseDouble(dato2); i++) {
                    x = x * n;
                }
                t = x;
            } while (t < -Double.parseDouble(dato1));
            resultnum = df.format(-n);

        }
////////////n de la raiz par, NUMERO ADENTRO NEGATIVO
        if (Double.parseDouble(dato1) < 0 && Double.parseDouble(dato2) % 2 == 0) {
            do {
                Double x = 1.0;
                n += 0.0001;
                for (int i = 0; i < Double.parseDouble(dato2); i++) {
                    x = x * n;
                }
                t = x;
            } while (t < -Double.parseDouble(dato1));
            resultnum = (df.format(n));

        }
        resultado = resultnum;
        return resultado;
    }

//////////////ELEVADO A LA N
    public static String elevado(String dato1, String dato2, String signo) {
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado;
        String resultnum = "";
        Double x = Double.parseDouble(dato1), y;
        if (Double.parseDouble(dato2) == 0) {
            x = 1.0;
        } else {
            for (int i = 1; i < (int) Double.parseDouble(dato2); i++) {
                y = x * Double.parseDouble(dato1);
                x = y;
            }
        }
        resultnum = df.format(x);
        resultado = resultnum;
        return resultado;
    }
////////////////////////////INVERSO

    public static String inverso(String dato1, String dato2, String signo) {
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado;
        String resultnum = "";
        if (signo.equals("inverso")) {
            resultnum = df.format(1 / Double.parseDouble(dato1));
        }
        resultado = resultnum;

        return resultado;
    }

    public static String operacionesbasicas(String dato1, String dato2, String signo) {
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado;
        String resultadonum = "";
        if (signo.equals("+")) {
            resultadonum = df.format(Double.parseDouble(dato1) + Double.parseDouble(dato2));
        } else if (signo.equals("-")) {
            resultadonum = df.format(Double.parseDouble(dato1) - Double.parseDouble(dato2));
        } else if (signo.equals("*")) {
            resultadonum = df.format(Double.parseDouble(dato1) * Double.parseDouble(dato2));
        } else if (signo.equals("/") && Double.parseDouble(dato2) != 0) {
            resultadonum = df.format(Double.parseDouble(dato1) / Double.parseDouble(dato2));
        } else if (signo.equals("/") && Double.parseDouble(dato2) == 0) {
            resultadonum = "No se puede dividir dentro de 0";
        }
        resultado = resultadonum;
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Numerocas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
