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
public class analisisinv extends javax.swing.JFrame {

    Double x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44;

    public analisisinv() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrada = new javax.swing.JTextField();
        Nombreoperacion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        r11 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        r14 = new javax.swing.JLabel();
        r24 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        r31 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        r33 = new javax.swing.JLabel();
        r34 = new javax.swing.JLabel();
        r44 = new javax.swing.JLabel();
        r43 = new javax.swing.JLabel();
        r42 = new javax.swing.JLabel();
        r41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        entrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Inversa:");
        Nombreoperacion.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        r11.setBackground(new java.awt.Color(255, 255, 255));
        r11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r11.setOpaque(true);

        r12.setBackground(new java.awt.Color(255, 255, 255));
        r12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r12.setOpaque(true);

        r13.setBackground(new java.awt.Color(255, 255, 255));
        r13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r13.setOpaque(true);

        r14.setBackground(new java.awt.Color(255, 255, 255));
        r14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r14.setOpaque(true);

        r24.setBackground(new java.awt.Color(255, 255, 255));
        r24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r24.setOpaque(true);

        r23.setBackground(new java.awt.Color(255, 255, 255));
        r23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r23.setOpaque(true);

        r22.setBackground(new java.awt.Color(255, 255, 255));
        r22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r22.setOpaque(true);

        r21.setBackground(new java.awt.Color(255, 255, 255));
        r21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r21.setOpaque(true);

        r31.setBackground(new java.awt.Color(255, 255, 255));
        r31.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r31.setOpaque(true);

        r32.setBackground(new java.awt.Color(255, 255, 255));
        r32.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r32.setOpaque(true);

        r33.setBackground(new java.awt.Color(255, 255, 255));
        r33.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r33.setOpaque(true);

        r34.setBackground(new java.awt.Color(255, 255, 255));
        r34.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r34.setOpaque(true);

        r44.setBackground(new java.awt.Color(255, 255, 255));
        r44.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r44.setOpaque(true);

        r43.setBackground(new java.awt.Color(255, 255, 255));
        r43.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r43.setOpaque(true);

        r42.setBackground(new java.awt.Color(255, 255, 255));
        r42.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r42.setOpaque(true);

        r41.setBackground(new java.awt.Color(255, 255, 255));
        r41.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r41.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Double Determinante1, determinante;
        String str = entrada.getText();
       
        String[] Ndigitos = str.split(",");
        Double p11, p12, p13, p14, p21, p22, p23, p24, p31, p32, p33, p34, p41, p42, p43, p44;
        DecimalFormat df = new DecimalFormat("#.00");
        if (Ndigitos.length == 4) {
            x11 = Double.parseDouble(Ndigitos[0]);
            x12 = Double.parseDouble(Ndigitos[1]);
            x21 = Double.parseDouble(Ndigitos[2]);
            x22 = Double.parseDouble(Ndigitos[3]);
            Determinante1 = Determinante2x2(x11, x12, x21, x22);
            p11 = x11 * (1 / Determinante1);
            p12 = x12 * (1 / Determinante1);
            p21 = x21 * (1 / Determinante1);
            p22 = x22 * (1 / Determinante1);

            r11.setText(df.format(p11));
            r12.setText(df.format(p12));
            r21.setText(df.format(p21));
            r22.setText(df.format(p22));
             r13.setText("-");
                r14.setText("-");
                r23.setText("-");
                r24.setText("-");
                r31.setText("-");
                r32.setText("-");
                r33.setText("-");
                r34.setText("-");
                r41.setText("-");
                r42.setText("-");
                r43.setText("-");
                r44.setText("-");
        } else if (Ndigitos.length == 9) {
            x11 = Double.parseDouble(Ndigitos[0]);
            x12 = Double.parseDouble(Ndigitos[1]);
            x13 = Double.parseDouble(Ndigitos[2]);
            x21 = Double.parseDouble(Ndigitos[3]);
            x22 = Double.parseDouble(Ndigitos[4]);
            x23 = Double.parseDouble(Ndigitos[5]);
            x31 = Double.parseDouble(Ndigitos[6]);
            x32 = Double.parseDouble(Ndigitos[7]);
            x33 = Double.parseDouble(Ndigitos[8]);

            Determinante1 = Determinante3x3(x11, x12, x13, x21, x22, x23, x31, x32, x33);
            p11 = Determinante2x2(x22, x23, x32, x33) * (1 / Determinante1);
            p12 = -Determinante2x2(x21, x23, x31, x33) * (1 / Determinante1);
            p13 = Determinante2x2(x21, x22, x31, x32) * (1 / Determinante1);
            p21 = -Determinante2x2(x12, x13, x32, x33) * (1 / Determinante1);
            p22 = Determinante2x2(x11, x13, x31, x33) * (1 / Determinante1);
            p23 = -Determinante2x2(x11, x12, x31, x32) * (1 / Determinante1);
            p31 = Determinante2x2(x12, x13, x22, x23) * (1 / Determinante1);
            p32 = -Determinante2x2(x11, x13, x21, x23) * (1 / Determinante1);
            p33 = Determinante2x2(x11, x12, x21, x22) * (1 / Determinante1);

            r11.setText(df.format(p11));
            r12.setText(df.format(p21));
            r13.setText(df.format(p31));
            r21.setText(df.format(p12));
            r22.setText(df.format(p22));
            r23.setText(df.format(p32));
            r31.setText(df.format(p13));
            r32.setText(df.format(p23));
            r33.setText(df.format(p33));
             
                r14.setText("-");
                
                r24.setText("-");
                
                r34.setText("-");
                r41.setText("-");
                r42.setText("-");
                r43.setText("-");
                r44.setText("-");

        } else if (Ndigitos.length == 16) {
            x11 = Double.parseDouble(Ndigitos[0]);
            x12 = Double.parseDouble(Ndigitos[1]);
            x13 = Double.parseDouble(Ndigitos[2]);
            x14 = Double.parseDouble(Ndigitos[3]);
            x21 = Double.parseDouble(Ndigitos[4]);
            x22 = Double.parseDouble(Ndigitos[5]);
            x23 = Double.parseDouble(Ndigitos[6]);
            x24 = Double.parseDouble(Ndigitos[7]);
            x31 = Double.parseDouble(Ndigitos[8]);
            x32 = Double.parseDouble(Ndigitos[9]);
            x33 = Double.parseDouble(Ndigitos[10]);
            x34 = Double.parseDouble(Ndigitos[11]);
            x41 = Double.parseDouble(Ndigitos[12]);
            x42 = Double.parseDouble(Ndigitos[13]);
            x43 = Double.parseDouble(Ndigitos[14]);
            x44 = Double.parseDouble(Ndigitos[15]);

            determinante = Determinante4X4(x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44);
            p11 = Determinante3x3(x22, x23, x24, x32, x33, x34, x42, x43, x44) * (1 / determinante);
            p12 = -Determinante3x3(x21, x23, x24, x31, x33, x34, x41, x43, x44) * (1 / determinante);
            p13 = Determinante3x3(x21, x22, x24, x31, x32, x34, x41, x42, x44) * (1 / determinante);
            p14 = -Determinante3x3(x21, x22, x23, x31, x32, x33, x41, x42, x43) * (1 / determinante);
            p21 = -Determinante3x3(x12, x13, x14, x32, x33, x34, x42, x43, x44) * (1 / determinante);
            p22 = +Determinante3x3(x11, x13, x14, x31, x33, x34, x41, x43, x44) * (1 / determinante);
            p23 = -Determinante3x3(x11, x12, x14, x31, x32, x34, x41, x42, x44) * (1 / determinante);
            p24 = Determinante3x3(x11, x12, x13, x31, x32, x33, x41, x42, x43) * (1 / determinante);
            p31 = Determinante3x3(x12, x13, x14, x22, x23, x24, x42, x43, x44) * (1 / determinante);
            p32 = -Determinante3x3(x11, x13, x14, x21, x23, x24, x41, x43, x44) * (1 / determinante);
            p33 = Determinante3x3(x11, x12, x14, x21, x22, x24, x41, x42, x44) * (1 / determinante);
            p34 = -Determinante3x3(x11, x12, x13, x21, x22, x23, x41, x42, x43) * (1 / determinante);
            p41 = -Determinante3x3(x12, x13, x14, x22, x23, x24, x32, x33, x34) * (1 / determinante);
            p42 = Determinante3x3(x11, x13, x14, x21, x23, x24, x31, x33, x34) * (1 / determinante);
            p43 = -Determinante3x3(x11, x12, x14, x21, x22, x24, x31, x32, x34) * (1 / determinante);
            p44 = Determinante3x3(x11, x12, x13, x21, x22, x23, x31, x32, x33) * (1 / determinante);
            r11.setText(df.format(p11));
            r12.setText(df.format(p21));
            r13.setText(df.format(p31));
            r14.setText(df.format(p41));
            r21.setText(df.format(p12));
            r22.setText(df.format(p22));
            r23.setText(df.format(p32));
            r24.setText(df.format(p42));
            r31.setText(df.format(p13));
            r32.setText(df.format(p23));
            r33.setText(df.format(p33));
            r34.setText(df.format(p43));
            r41.setText(df.format(p14));
            r42.setText(df.format(p24));
            r43.setText(df.format(p34));
            r44.setText(df.format(p44));

        } else if (Ndigitos.length != 16 && Ndigitos.length != 9 && Ndigitos.length != 4) {
            JOptionPane.showMessageDialog(null, "Se deben de escribir 4, 9 o 16 digitos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static Double Determinante2x2(Double x11, Double x12, Double x21, Double x22) {
        Double resultado;
        resultado = (x11 * x22) - (x21 * x12);
        return resultado;
    }

    public static Double Determinante3x3(Double x11, Double x12, Double x13, Double x21, Double x22, Double x23, Double x31, Double x32, Double x33) {
        Double resultado;
        resultado = ((x11 * x22 * x33) + (x21 * x32 * x13) + (x31 * x12 * x23)) - ((x31 * x22 * x13) + (x32 * x11 * x23) + (x21 * x12 * x33));
        return resultado;
    }

    public static Double Determinante4X4(Double x11, Double x12, Double x13, Double x14, Double x21, Double x22, Double x23, Double x24, Double x31, Double x32, Double x33, Double x34, Double x41, Double x42, Double x43, Double x44) {
        Double resultado;
        resultado = x11 * Determinante3x3(x22, x23, x24, x32, x33, x34, x42, x43, x44) - x21 * Determinante3x3(x12, x13, x14, x32, x33, x34, x42, x43, x44) + x31 * Determinante3x3(x12, x13, x14, x22, x23, x24, x42, x43, x44) - x41 * Determinante3x3(x12, x13, x14, x22, x23, x24, x32, x33, x34);
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombreoperacion;
    private javax.swing.JTextField entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel r11;
    private javax.swing.JLabel r12;
    private javax.swing.JLabel r13;
    private javax.swing.JLabel r14;
    private javax.swing.JLabel r21;
    private javax.swing.JLabel r22;
    private javax.swing.JLabel r23;
    private javax.swing.JLabel r24;
    private javax.swing.JLabel r31;
    private javax.swing.JLabel r32;
    private javax.swing.JLabel r33;
    private javax.swing.JLabel r34;
    private javax.swing.JLabel r41;
    private javax.swing.JLabel r42;
    private javax.swing.JLabel r43;
    private javax.swing.JLabel r44;
    // End of variables declaration//GEN-END:variables
}
