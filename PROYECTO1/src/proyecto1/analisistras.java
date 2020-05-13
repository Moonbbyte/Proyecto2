/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class analisistras extends javax.swing.JFrame {

    public analisistras() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jButton1 = new javax.swing.JButton();
        Nombreoperacion = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

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

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Transpuesta");
        Nombreoperacion.setOpaque(true);

        entrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
////////////////////////////CALCULAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String str = entrada.getText();
            String Ndigitos[] = str.split(",");

            if (Ndigitos.length == 4) {
                r11.setText(Ndigitos[0]);
                r12.setText(Ndigitos[2]);
                r21.setText(Ndigitos[1]);
                r22.setText(Ndigitos[3]);
                
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
                r11.setText(Ndigitos[0]);
                r12.setText(Ndigitos[3]);
                r13.setText(Ndigitos[6]);
                r21.setText(Ndigitos[1]);
                r22.setText(Ndigitos[4]);
                r23.setText(Ndigitos[7]);
                r31.setText(Ndigitos[2]);
                r32.setText(Ndigitos[5]);
                r33.setText(Ndigitos[8]);
                
                 
                r14.setText("-");
                
                r24.setText("-");
                
                r34.setText("-");
                r41.setText("-");
                r42.setText("-");
                r43.setText("-");
                r44.setText("-");

            } else if (Ndigitos.length == 16) {
                r11.setText(Ndigitos[0]);
                r12.setText(Ndigitos[4]);
                r13.setText(Ndigitos[8]);
                r14.setText(Ndigitos[12]);
                r21.setText(Ndigitos[1]);
                r22.setText(Ndigitos[5]);
                r23.setText(Ndigitos[9]);
                r24.setText(Ndigitos[13]);
                r31.setText(Ndigitos[2]);
                r32.setText(Ndigitos[6]);
                r33.setText(Ndigitos[10]);
                r34.setText(Ndigitos[14]);
                r41.setText(Ndigitos[3]);
                r42.setText(Ndigitos[7]);
                r43.setText(Ndigitos[11]);
                r44.setText(Ndigitos[15]);
            } else if (Ndigitos.length != 16 && Ndigitos.length != 9 && Ndigitos.length != 4) {
                JOptionPane.showMessageDialog(null, "Se deben de escribir 4, 9 o 16 digitos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numeros mal digitados");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed


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
