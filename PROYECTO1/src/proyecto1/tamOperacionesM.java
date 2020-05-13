/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JOptionPane;

public class tamOperacionesM extends javax.swing.JFrame {

    String operaciones1;

    Double x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44;
    Double w11, w12, w13, w14, w21, w22, w23, w24, w31, w32, w33, w34, w41, w42, w43, w44;
    Double s11 = 0.0, s12 = 0.0, s13 = 0.0, s21 = 0.0, s22 = 0.0, s23 = 0.0, s31 = 0.0, s32 = 0.0, s33 = 0.0;
    Double k1 = 0.0;
    int fila1, columna1, fila2, columna2;

    public tamOperacionesM() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombreoperacion = new javax.swing.JLabel();
        Nombreoperacion1 = new javax.swing.JLabel();
        Nombreoperacion2 = new javax.swing.JLabel();
        Nombreoperacion3 = new javax.swing.JLabel();
        Nombreoperacion4 = new javax.swing.JLabel();
        Nombreoperacion5 = new javax.swing.JLabel();
        columnas1 = new javax.swing.JTextField();
        filas1 = new javax.swing.JTextField();
        columnas2 = new javax.swing.JTextField();
        filas2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        y13 = new javax.swing.JTextField();
        y12 = new javax.swing.JTextField();
        y11 = new javax.swing.JTextField();
        y21 = new javax.swing.JTextField();
        y22 = new javax.swing.JTextField();
        y31 = new javax.swing.JTextField();
        y32 = new javax.swing.JTextField();
        y33 = new javax.swing.JTextField();
        y23 = new javax.swing.JTextField();
        Nombreoperacion6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        z11 = new javax.swing.JTextField();
        z13 = new javax.swing.JTextField();
        z12 = new javax.swing.JTextField();
        z21 = new javax.swing.JTextField();
        z22 = new javax.swing.JTextField();
        z23 = new javax.swing.JTextField();
        z33 = new javax.swing.JTextField();
        z32 = new javax.swing.JTextField();
        z31 = new javax.swing.JTextField();
        r11 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        r31 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        r33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1320, 968));
        setMinimumSize(new java.awt.Dimension(930, 520));
        getContentPane().setLayout(null);

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Filas:");
        Nombreoperacion.setOpaque(true);
        getContentPane().add(Nombreoperacion);
        Nombreoperacion.setBounds(28, 67, 88, 28);

        Nombreoperacion1.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion1.setText("Columnas:");
        Nombreoperacion1.setOpaque(true);
        getContentPane().add(Nombreoperacion1);
        Nombreoperacion1.setBounds(28, 101, 88, 28);

        Nombreoperacion2.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion2.setText("Tamaño de filas y columnas de la Matriz 1");
        Nombreoperacion2.setOpaque(true);
        getContentPane().add(Nombreoperacion2);
        Nombreoperacion2.setBounds(28, 37, 309, 19);

        Nombreoperacion3.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion3.setText("Columnas:");
        Nombreoperacion3.setOpaque(true);
        getContentPane().add(Nombreoperacion3);
        Nombreoperacion3.setBounds(28, 211, 88, 28);

        Nombreoperacion4.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion4.setText("Filas:");
        Nombreoperacion4.setOpaque(true);
        getContentPane().add(Nombreoperacion4);
        Nombreoperacion4.setBounds(28, 177, 88, 28);

        Nombreoperacion5.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion5.setText("Tamaño de filas y columnas de la Matriz 2");
        Nombreoperacion5.setOpaque(true);
        getContentPane().add(Nombreoperacion5);
        Nombreoperacion5.setBounds(28, 147, 309, 19);

        columnas1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        columnas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        columnas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnas1ActionPerformed(evt);
            }
        });
        getContentPane().add(columnas1);
        columnas1.setBounds(134, 105, 51, 23);

        filas1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filas1ActionPerformed(evt);
            }
        });
        getContentPane().add(filas1);
        filas1.setBounds(134, 71, 51, 23);

        columnas2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        columnas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        columnas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnas2ActionPerformed(evt);
            }
        });
        getContentPane().add(columnas2);
        columnas2.setBounds(134, 215, 51, 23);

        filas2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filas2ActionPerformed(evt);
            }
        });
        getContentPane().add(filas2);
        filas2.setBounds(134, 181, 51, 23);

        jButton1.setText("Crear Matrices");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 270, 130, 40);

        y13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y13ActionPerformed(evt);
            }
        });
        getContentPane().add(y13);
        y13.setBounds(480, 70, 51, 49);

        y12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y12ActionPerformed(evt);
            }
        });
        getContentPane().add(y12);
        y12.setBounds(420, 70, 51, 49);

        y11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y11ActionPerformed(evt);
            }
        });
        getContentPane().add(y11);
        y11.setBounds(358, 69, 51, 49);

        y21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y21ActionPerformed(evt);
            }
        });
        getContentPane().add(y21);
        y21.setBounds(358, 129, 51, 49);

        y22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y22ActionPerformed(evt);
            }
        });
        getContentPane().add(y22);
        y22.setBounds(420, 130, 51, 49);

        y31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y31ActionPerformed(evt);
            }
        });
        getContentPane().add(y31);
        y31.setBounds(360, 190, 51, 49);

        y32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y32ActionPerformed(evt);
            }
        });
        getContentPane().add(y32);
        y32.setBounds(420, 190, 51, 49);

        y33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y33ActionPerformed(evt);
            }
        });
        getContentPane().add(y33);
        y33.setBounds(480, 190, 51, 49);

        y23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y23ActionPerformed(evt);
            }
        });
        getContentPane().add(y23);
        y23.setBounds(480, 130, 51, 49);

        Nombreoperacion6.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion6.setText("Operaciones entre Matrices");
        Nombreoperacion6.setOpaque(true);
        getContentPane().add(Nombreoperacion6);
        Nombreoperacion6.setBounds(358, 11, 204, 28);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-", "*" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(614, 129, 36, 23);

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(591, 170, 100, 34);

        z11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z11ActionPerformed(evt);
            }
        });
        getContentPane().add(z11);
        z11.setBounds(737, 69, 51, 49);

        z13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z13ActionPerformed(evt);
            }
        });
        getContentPane().add(z13);
        z13.setBounds(851, 69, 51, 49);

        z12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z12ActionPerformed(evt);
            }
        });
        getContentPane().add(z12);
        z12.setBounds(794, 69, 51, 49);

        z21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z21ActionPerformed(evt);
            }
        });
        getContentPane().add(z21);
        z21.setBounds(737, 129, 51, 49);

        z22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z22ActionPerformed(evt);
            }
        });
        getContentPane().add(z22);
        z22.setBounds(794, 129, 51, 49);

        z23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z23ActionPerformed(evt);
            }
        });
        getContentPane().add(z23);
        z23.setBounds(851, 129, 51, 49);

        z33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z33ActionPerformed(evt);
            }
        });
        getContentPane().add(z33);
        z33.setBounds(851, 191, 51, 49);

        z32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z32ActionPerformed(evt);
            }
        });
        getContentPane().add(z32);
        z32.setBounds(794, 191, 51, 49);

        z31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        z31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        z31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z31ActionPerformed(evt);
            }
        });
        getContentPane().add(z31);
        z31.setBounds(737, 191, 51, 49);

        r11.setBackground(new java.awt.Color(255, 255, 255));
        r11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r11.setOpaque(true);
        getContentPane().add(r11);
        r11.setBounds(560, 280, 52, 49);

        r12.setBackground(new java.awt.Color(255, 255, 255));
        r12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r12.setOpaque(true);
        getContentPane().add(r12);
        r12.setBounds(620, 280, 52, 49);

        r13.setBackground(new java.awt.Color(255, 255, 255));
        r13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r13.setOpaque(true);
        getContentPane().add(r13);
        r13.setBounds(680, 280, 52, 49);

        r23.setBackground(new java.awt.Color(255, 255, 255));
        r23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r23.setOpaque(true);
        getContentPane().add(r23);
        r23.setBounds(680, 340, 52, 49);

        r22.setBackground(new java.awt.Color(255, 255, 255));
        r22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r22.setOpaque(true);
        getContentPane().add(r22);
        r22.setBounds(620, 340, 52, 49);

        r21.setBackground(new java.awt.Color(255, 255, 255));
        r21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r21.setOpaque(true);
        getContentPane().add(r21);
        r21.setBounds(560, 340, 52, 49);

        r31.setBackground(new java.awt.Color(255, 255, 255));
        r31.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r31.setOpaque(true);
        getContentPane().add(r31);
        r31.setBounds(560, 400, 52, 49);

        r32.setBackground(new java.awt.Color(255, 255, 255));
        r32.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r32.setOpaque(true);
        getContentPane().add(r32);
        r32.setBounds(620, 400, 52, 49);

        r33.setBackground(new java.awt.Color(255, 255, 255));
        r33.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r33.setOpaque(true);
        getContentPane().add(r33);
        r33.setBounds(680, 400, 52, 49);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city-vector-panorama-reflection.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void columnas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnas1ActionPerformed

    private void filas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filas1ActionPerformed

    private void columnas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnas2ActionPerformed

    private void filas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filas2ActionPerformed
//////////////////////////CREAR MATRICES
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        operaciones1 = jComboBox1.getSelectedItem().toString();
        int x = 0;
        falseTodos(x);
        fila1 = Integer.parseInt(filas1.getText());
        columna1 = Integer.parseInt(columnas1.getText());
        fila2 = Integer.parseInt(filas2.getText());
        columna2 = Integer.parseInt(columnas2.getText());
        Botonesvisibles(fila1, columna1);
        Botonesvisibles2(fila2, columna2);

        Modobase(x);
        Modobaseresultado(x);
        ///////////////SUMA


    }//GEN-LAST:event_jButton1ActionPerformed
    public void falseTodos(int x) {

        y11.setEnabled(false);
        y12.setEnabled(false);
        y13.setEnabled(false);
        y22.setEnabled(false);
        y23.setEnabled(false);
        y21.setEnabled(false);
        y31.setEnabled(false);
        y32.setEnabled(false);
        y33.setEnabled(false);
        z11.setEnabled(false);
        z12.setEnabled(false);
        z13.setEnabled(false);
        z22.setEnabled(false);
        z23.setEnabled(false);
        z21.setEnabled(false);
        z31.setEnabled(false);
        z32.setEnabled(false);
        z33.setEnabled(false);
        r11.setEnabled(false);
        r12.setEnabled(false);
        r13.setEnabled(false);
        r22.setEnabled(false);
        r23.setEnabled(false);
        r21.setEnabled(false);
        r31.setEnabled(false);
        r32.setEnabled(false);
        r33.setEnabled(false);

    }

    public void Botonesvisibles(int fila1, int columna1) {
        if (fila1 == 1 && columna1 == 1) {
            y11.setEnabled(true);
          
        } else if (fila1 == 1 && columna1 == 2) {
            y11.setEnabled(true);
            y12.setEnabled(true);
           
        } else if (fila1 == 1 && columna1 == 3) {
            y11.setEnabled(true);
            y12.setEnabled(true);
            y13.setEnabled(true);
           
            
        } else if (fila1 == 2 && columna1 == 1) {
            y11.setEnabled(true);
            y21.setEnabled(true);
        } else if (fila1 == 2 && columna1 == 2) {
            y11.setEnabled(true);
            y12.setEnabled(true);
            y21.setEnabled(true);
            y22.setEnabled(true);
        } else if (fila1 == 2 && columna1 == 3) {
            y11.setEnabled(true);
            y12.setEnabled(true);
            y13.setEnabled(true);
            y21.setEnabled(true);
            y22.setEnabled(true);
            y23.setEnabled(true);

        } else if (fila1 == 3 && columna1 == 1) {
            y11.setEnabled(true);
            y21.setEnabled(true);
            y31.setEnabled(true);
        } else if (fila1 == 3 && columna1 == 2) {
            y11.setEnabled(true);
            y12.setEnabled(true);
            y31.setEnabled(true);
            y21.setEnabled(true);
            y22.setEnabled(true);
            y32.setEnabled(true);
        } else if (fila1 == 3 && columna1 == 3) {
            y11.setEnabled(true);
            y12.setEnabled(true);
            y13.setEnabled(true);
            y21.setEnabled(true);
            y22.setEnabled(true);
            y23.setEnabled(true);
            y31.setEnabled(true);
            y32.setEnabled(true);
            y33.setEnabled(true);

        }

    }

    public void Botonesvisibles2(int fila1, int columna1) {
        if (fila1 == 1 && columna1 == 1) {
            z11.setEnabled(true);
        } else if (fila1 == 1 && columna1 == 2) {
            z11.setEnabled(true);
            z12.setEnabled(true);
        } else if (fila1 == 1 && columna1 == 3) {
            z11.setEnabled(true);
            z12.setEnabled(true);
            z13.setEnabled(true);
        } else if (fila1 == 2 && columna1 == 1) {
            z11.setEnabled(true);
            z21.setEnabled(true);
        } else if (fila1 == 2 && columna1 == 2) {
            z11.setEnabled(true);
            z12.setEnabled(true);
            z21.setEnabled(true);
            z22.setEnabled(true);
        } else if (fila1 == 2 && columna1 == 3) {
            z11.setEnabled(true);
            z12.setEnabled(true);
            z13.setEnabled(true);
            z21.setEnabled(true);
            z22.setEnabled(true);
            z23.setEnabled(true);

        } else if (fila1 == 3 && columna1 == 1) {
            z11.setEnabled(true);
            z21.setEnabled(true);
            z31.setEnabled(true);
        } else if (fila1 == 3 && columna1 == 2) {
            z11.setEnabled(true);
            z12.setEnabled(true);
            z31.setEnabled(true);
            z21.setEnabled(true);
            z22.setEnabled(true);
            z32.setEnabled(true);
        } else if (fila1 == 3 && columna1 == 3) {
            z11.setEnabled(true);
            z12.setEnabled(true);
            z13.setEnabled(true);
            z21.setEnabled(true);
            z22.setEnabled(true);
            z23.setEnabled(true);
            z31.setEnabled(true);
            z32.setEnabled(true);
            z33.setEnabled(true);

        }

    }

    public static Double Suma(Double x, Double y) {
        Double resultado;
        resultado = x + y;
        return resultado;
    }

    public static Double Resta(Double x, Double y) {
        Double resultado;
        resultado = x - y;
        return resultado;
    }


    private void y13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y13ActionPerformed

    private void y12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y12ActionPerformed

    private void y11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y11ActionPerformed

    private void y21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y21ActionPerformed

    private void y22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y22ActionPerformed

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
////////////////////////////////////CALCULAR MATRICES
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        operaciones1 = jComboBox1.getSelectedItem().toString();
        int x=0;
       
      if(filas1.getText().equals("") || filas2.getText().equals("") ||columnas1.getText().equals("") ||columnas2.getText().equals("") )  {
      JOptionPane.showMessageDialog(null, "Se debe de indicar la cantidad de filas y columnas antes de iniciar el calculo");
      
      }else
        {
        x11 = Double.parseDouble(y11.getText());
        x12 = Double.parseDouble(y12.getText());
        x13 = Double.parseDouble(y13.getText());
        x21 = Double.parseDouble(y21.getText());
        x22 = Double.parseDouble(y22.getText());
        x23 = Double.parseDouble(y23.getText());
        x31 = Double.parseDouble(y31.getText());
        x32 = Double.parseDouble(y32.getText());
        x33 = Double.parseDouble(y33.getText());
        w11 = Double.parseDouble(z11.getText());
        w12 = Double.parseDouble(z12.getText());
        w13 = Double.parseDouble(z13.getText());
        w21 = Double.parseDouble(z21.getText());
        w22 = Double.parseDouble(z22.getText());
        w23 = Double.parseDouble(z23.getText());
        w31 = Double.parseDouble(z31.getText());
        w32 = Double.parseDouble(z32.getText());
        w33 = Double.parseDouble(z33.getText());
        ///////////////////////////SUMA
        
       
       if (columna1 == columna2 && fila1 == fila2 && operaciones1 == "-") {
            if (fila1 == 1 && columna1 == 1) {
                s11 = Resta(x11, w11);
            } else if (fila1 == 1 && columna1 == 2) {
                s11 = Resta(x11, w11);
                s12 = Resta(x12, w12);
            } else if (fila1 == 1 && columna1 == 3) {
                s11 = Resta(x11, w11);
                s12 = Resta(x12, w12);
                s13 = Resta(x13, w13);
            } else if (fila1 == 2 && columna1 == 1) {
                s11 = Resta(x11, w11);
                s21 = Resta(x21, w21);
            } else if (fila1 == 2 && columna1 == 2) {
                s11 = Resta(x11, w11);
                s12 = Resta(x12, w12);
                s21 = Resta(x21, w21);
                s22 = Resta(x22, w22);
            } else if (fila1 == 2 && columna1 == 3) {
                s11 = Resta(x11, w11);
                s12 =Resta(x12, w12);
                s13 =Resta(x13, w13);
                s21 = Resta(x11, w11);
                s22 = Resta(x12, w12);
                s23 = Resta(x13, w13);
            } else if (fila1 == 3 && columna1 == 1) {
                s11 = Resta(x11, w11);
                s21 = Resta(x21, w21);
                s31 = Resta(x31, w31);
            } else if (fila1 == 3 && columna1 == 2) {
                s11 = Resta(x11, w11);
                s21 = Resta(x21, w21);
                s31 = Resta(x31, w31);
                s12 = Resta(x12, w12);
                s22 = Resta(x22, w22);
                s32 = Resta(x32, w32);
            } else if (fila1 == 3 && columna1 == 3) {
                s11 = Resta(x11, w11);
                s21 = Resta(x21, w21);
                s31 = Resta(x31, w31);
                s12 = Resta(x12, w12);
                s22 = Resta(x22, w22);
                s32 = Resta(x32, w32);
                s13 = Resta(x13, w13);
                s23 = Resta(x23, w23);
                s33 = Resta(x33, w33);
            }} else if (columna1 != columna2 || fila1 != fila2 && operaciones1 == "-") {
        JOptionPane.showMessageDialog(null, "El numero de columnas y filas entre ambas matrices no es igual, no es posible restar");
        } 
            
         if (columna1 == columna2 && fila1 == fila2 && operaciones1 == "+") {
            if (fila1 == 1 && columna1 == 1) {
                s11 = Suma(x11, w11);
            } else if (fila1 == 1 && columna1 == 2) {
                s11 = Suma(x11, w11);
                s12 = Suma(x12, w12);
            } else if (fila1 == 1 && columna1 == 3) {
                s11 = Suma(x11, w11);
                s12 = Suma(x12, w12);
                s13 = Suma(x13, w13);
            } else if (fila1 == 2 && columna1 == 1) {
                s11 = Suma(x11, w11);
                s21 = Suma(x21, w21);
            } else if (fila1 == 2 && columna1 == 2) {
                s11 = Suma(x11, w11);
                s12 = Suma(x12, w12);
                s21 = Suma(x21, w21);
                s22 = Suma(x22, w22);
            } else if (fila1 == 2 && columna1 == 3) {
                s11 = Suma(x11, w11);
                s12 = Suma(x12, w12);
                s13 = Suma(x13, w13);
                s21 = Suma(x11, w11);
                s22 = Suma(x12, w12);
                s23 = Suma(x13, w13);
            } else if (fila1 == 3 && columna1 == 1) {
                s11 = Suma(x11, w11);
                s21 = Suma(x21, w21);
                s31 = Suma(x31, w31);
            } else if (fila1 == 3 && columna1 == 2) {
                s11 = Suma(x11, w11);
                s21 = Suma(x21, w21);
                s31 = Suma(x31, w31);
                s12 = Suma(x12, w12);
                s22 = Suma(x22, w22);
                s32 = Suma(x32, w32);
            } else if (fila1 == 3 && columna1 == 3) {
                s11 = Suma(x11, w11);
                s21 = Suma(x21, w21);
                s31 = Suma(x31, w31);
                s12 = Suma(x12, w12);
                s22 = Suma(x22, w22);
                s32 = Suma(x32, w32);
                s13 = Suma(x13, w13);
                s23 = Suma(x23, w23);
                s33 = Suma(x33, w33);
            }

        }else  if (columna1 != columna2  || fila1 != fila2 && operaciones1 == "+") {
        JOptionPane.showMessageDialog(null, "El numero de columnas y filas entre ambas matrices no es igual, no es posible sumar");
        }
        
        
        
        if (columna1==fila2 && operaciones1 == "*") {
        s11=x11*w11+x12*w21+x13*w31;
        s12=x11*w12+x12*w22+x13*w32;
        s13=x11*w13+x12*w23+x13*w33;
        
        s21=x21*w11+x22*w21+x23*w31;
        s22=x21*w12+x22*w22+x23*w32;
        s23=x21*w13+x22*w23+x23*w33;
        
        s31=x31*w11+x32*w21+x33*w31;
        s32=x31*w12+x32*w22+x33*w32;
        s33=x31*w13+x32*w23+x33*w33;
        JOptionPane.showMessageDialog(null, "Multiplicacion con exito");
        
        }else if (columna1!=fila2 && operaciones1 == "*") {
        JOptionPane.showMessageDialog(null, "No es posible multiplicar, el numero de columnas de la matriz n no es igual al numero de filas de la matriz 2");
        } 
        r11.setText(s11.toString());
        r12.setText(s12.toString());
        r13.setText(s13.toString());
        r21.setText(s21.toString());
        r22.setText(s22.toString());
        r23.setText(s23.toString());
        r31.setText(s31.toString());
        r32.setText(s32.toString());
        r33.setText(s33.toString());}

    }//GEN-LAST:event_jButton2ActionPerformed
    public void Modobase(int x) {

        y11.setText("0.0");
        y12.setText("0.0");
        y13.setText("0.0");
        y21.setText("0.0");
        y22.setText("0.0");
        y23.setText("0.0");
        y31.setText("0.0");
        y32.setText("0.0");
        y33.setText("0.0");
        z11.setText("0.0");
        z12.setText("0.0");
        z13.setText("0.0");
        z21.setText("0.0");
        z22.setText("0.0");
        z23.setText("0.0");
        z31.setText("0.0");
        z32.setText("0.0");
        z33.setText("0.0");

    }

    public void Modobaseresultado(int x) {
        r11.setText("-");
        r12.setText("-");
        r13.setText("-");
        r21.setText("-");
        r22.setText("-");
        r23.setText("-");
        r31.setText("-");
        r32.setText("-");
        r33.setText("-");
        s11 = 0.0;
        s12 = 0.0;
        s13 = 0.0;
        s21 = 0.0;
        s22 = 0.0;
        s23 = 0.0;
        s31 = 0.0;
        s32 = 0.0;
        s33 = 0.0;

    }


    private void z11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z11ActionPerformed

    private void z13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z13ActionPerformed

    private void z12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z12ActionPerformed

    private void z21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z21ActionPerformed

    private void z22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z22ActionPerformed

    private void z23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z23ActionPerformed

    private void z33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z33ActionPerformed

    private void z32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z32ActionPerformed

    private void z31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z31ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombreoperacion;
    private javax.swing.JLabel Nombreoperacion1;
    private javax.swing.JLabel Nombreoperacion2;
    private javax.swing.JLabel Nombreoperacion3;
    private javax.swing.JLabel Nombreoperacion4;
    private javax.swing.JLabel Nombreoperacion5;
    private javax.swing.JLabel Nombreoperacion6;
    private javax.swing.JTextField columnas1;
    private javax.swing.JTextField columnas2;
    private javax.swing.JTextField filas1;
    private javax.swing.JTextField filas2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField z11;
    private javax.swing.JTextField z12;
    private javax.swing.JTextField z13;
    private javax.swing.JTextField z21;
    private javax.swing.JTextField z22;
    private javax.swing.JTextField z23;
    private javax.swing.JTextField z31;
    private javax.swing.JTextField z32;
    private javax.swing.JTextField z33;
    // End of variables declaration//GEN-END:variables
}
