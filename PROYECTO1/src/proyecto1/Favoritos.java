/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;
import java.awt.Component;
import static java.util.Collections.list;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author brand
 */
public class Favoritos extends javax.swing.JFrame {

    DefaultListModel modelolista;
    String resultado, orden, color;
    int delet;

    public static String Historial[] = new String[10];
    static int x = -1;

    public Favoritos() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelolista = new DefaultListModel();
        historial.setModel(modelolista);
        modelolista.addElement("Cambiar de prioridad una casilla: Dar click en la casilla");

    }

    public static void RellenoMatriz(String valor) {

        x++;
        if (x != 10) {
            Historial[x] = valor;
        } else {
            for (int i = 0; i < 7; i++) {
                Historial[i] = Historial[i + 1];
            }
            x = 9;
            Historial[9] = valor;

        }
    }

    public void Mostrarlista() {

        x0.setText(Historial[0]);
        x1.setText(Historial[1]);
        x2.setText(Historial[2]);
        x3.setText(Historial[3]);
        x4.setText(Historial[4]);
        x5.setText(Historial[5]);
        x6.setText(Historial[6]);
        x7.setText(Historial[7]);
        x8.setText(Historial[8]);
        x9.setText(Historial[9]);
    }

    public void listadelet() {
        for (int i = 9; i > x; i--) {
            Historial[i] = "(Vacio)";

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ordenar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historial = new javax.swing.JList();
        eliminar = new javax.swing.JButton();
        colores = new javax.swing.JComboBox();
        x0 = new javax.swing.JButton();
        x1 = new javax.swing.JButton();
        x2 = new javax.swing.JButton();
        x3 = new javax.swing.JButton();
        x4 = new javax.swing.JButton();
        x5 = new javax.swing.JButton();
        x6 = new javax.swing.JButton();
        x7 = new javax.swing.JButton();
        x8 = new javax.swing.JButton();
        x9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        eli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Prioridad:");

        ordenar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ordenar1.setText("Mostrar Historial");
        ordenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(historial);

        eliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        colores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        colores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta", "Media", "Leve", "Ninguna" }));

        x0.setBackground(new java.awt.Color(255, 255, 255));
        x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0ActionPerformed(evt);
            }
        });

        x1.setBackground(new java.awt.Color(255, 255, 255));
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });

        x2.setBackground(new java.awt.Color(255, 255, 255));
        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });

        x3.setBackground(new java.awt.Color(255, 255, 255));
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });

        x4.setBackground(new java.awt.Color(255, 255, 255));
        x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x4ActionPerformed(evt);
            }
        });

        x5.setBackground(new java.awt.Color(255, 255, 255));
        x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x5ActionPerformed(evt);
            }
        });

        x6.setBackground(new java.awt.Color(255, 255, 255));
        x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x6ActionPerformed(evt);
            }
        });

        x7.setBackground(new java.awt.Color(255, 255, 255));
        x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x7ActionPerformed(evt);
            }
        });

        x8.setBackground(new java.awt.Color(255, 255, 255));
        x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x8ActionPerformed(evt);
            }
        });

        x9.setBackground(new java.awt.Color(255, 255, 255));
        x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x9ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("3.");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("4.");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("5.");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("10.");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("9.");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("8.");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("7.");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("6.");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("1.");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("2.");

        eli.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setText("Favoritos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ordenar1)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                .addComponent(x0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(ordenar1)
                    .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(x0, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
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


    private void ordenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar1ActionPerformed
        int elitodo = historial.getSelectedIndex();
        listadelet();
        Mostrarlista();


    }//GEN-LAST:event_ordenar1ActionPerformed
/////////////////////////////ELIMINAR
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String p = eli.getText();
        if (p.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe de ingresar un numero de casilla para poder eliminar");
        } else {
            if (x0.getText().equals("(Vacio)") && x1.getText().equals("(Vacio)")) {
                JOptionPane.showMessageDialog(null, "El historial esta vacio no es posible eliminar valores");
                x=-1;
            } else {
                delet = Integer.parseInt(p);

                listadelet();
                Mostrarlista();

                if (delet == 1) {
                    for (int i = 0; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                    x = x - 1;
                    //////////////////////para  casilla 2 matriz 1
                } else if (delet == 2) {
                    for (int i = 1; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                    x = x - 1;
                } else if (delet == 3) {
                    for (int i = 2; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                } else if (delet == 4) {
                    for (int i = 3; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                        x = x - 1;
                    }
                    Mostrarlista();
                } else if (delet == 5) {
                    for (int i = 4; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                    x = x - 1;
                } else if (delet == 6) {
                    for (int i = 5; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                    x = x - 1;
                } else if (delet == 7) {
                    for (int i = 6; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                    x = x - 1;
                } else if (delet == 8) {
                    for (int i = 7; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                    x = x - 1;
                } else if (delet == 9) {
                    for (int i = 8; i < 9; i++) {
                        Historial[i] = Historial[i + 1];
                    }
                    Mostrarlista();
                    x = x - 1;
                } else if (delet == 10) {
                    Historial[9] = "(Vacio)";
                    Mostrarlista();
                    x = x - 1;
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed


    private void x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x4.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x4.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x4.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x4.setBackground(Color.white);
        }
    }//GEN-LAST:event_x4ActionPerformed

    private void x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x0.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x0.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x0.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x0.setBackground(Color.white);
        }
    }//GEN-LAST:event_x0ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x1.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x1.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x1.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x1.setBackground(Color.white);
        }
    }//GEN-LAST:event_x1ActionPerformed

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x2.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x2.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x2.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x2.setBackground(Color.white);
        }
    }//GEN-LAST:event_x2ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x3.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x3.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x3.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x3.setBackground(Color.white);
        }
    }//GEN-LAST:event_x3ActionPerformed

    private void x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x5ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x5.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x5.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x5.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x5.setBackground(Color.white);
        }
    }//GEN-LAST:event_x5ActionPerformed

    private void x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x6ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x6.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x6.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x6.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x6.setBackground(Color.white);
        }
    }//GEN-LAST:event_x6ActionPerformed

    private void x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x7ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x7.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x7.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x7.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x7.setBackground(Color.white);
        }
    }//GEN-LAST:event_x7ActionPerformed

    private void x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x8ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x8.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x8.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x8.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x8.setBackground(Color.white);
        }
    }//GEN-LAST:event_x8ActionPerformed

    private void x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x9ActionPerformed
        color = colores.getSelectedItem().toString();
        if (color.equals("Alta")) {
            x9.setBackground(Color.red);

        } else if (color.equals("Media")) {

            x9.setBackground(Color.yellow);

        } else if (color.equals("Leve")) {
            x9.setBackground(Color.green);
        } else if (color.equals("Ninguna")) {
            x9.setBackground(Color.white);
        }
    }//GEN-LAST:event_x9ActionPerformed

    private void eliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox colores;
    private javax.swing.JTextField eli;
    private javax.swing.JButton eliminar;
    private javax.swing.JList historial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton ordenar1;
    private javax.swing.JButton x0;
    private javax.swing.JButton x1;
    private javax.swing.JButton x2;
    private javax.swing.JButton x3;
    private javax.swing.JButton x4;
    private javax.swing.JButton x5;
    private javax.swing.JButton x6;
    private javax.swing.JButton x7;
    private javax.swing.JButton x8;
    private javax.swing.JButton x9;
    // End of variables declaration//GEN-END:variables
}
