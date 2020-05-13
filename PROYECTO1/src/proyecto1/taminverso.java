/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JOptionPane;

public class taminverso extends javax.swing.JFrame {
inversa2x2 inversa2x2=new inversa2x2();
inversa3x3 inversa3x3=new inversa3x3();
inversa4x4 inversa4x4=new inversa4x4();
String valormatriz;
    
    public taminverso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Numerodematriz = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese n para el tamaño de la matriz nxn:");
        jLabel1.setOpaque(true);

        Numerodematriz.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("Crear Matriz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Numerodematriz, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numerodematriz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        valormatriz = Numerodematriz.getText();
        if (valormatriz.equals("")) {
            JOptionPane.showMessageDialog(null, "Deben de llenarse la casilla para iniciar el calculo");
        } else if (Double.parseDouble(valormatriz) <= 1) {
            JOptionPane.showMessageDialog(null, "Digite un numero mayor a 1");}
        if (Double.parseDouble(valormatriz) == 2) {
            inversa2x2.setTitle("Inversa 2x2");
            inversa2x2.setVisible(true);
        } else if (Double.parseDouble(valormatriz) == 3) {
            inversa3x3.setTitle("Inversa 3x3");
            inversa3x3.setVisible(true);
        } else if (Double.parseDouble(valormatriz) == 4) {
            inversa4x4.setTitle("Inversa 4x4");
            inversa4x4.setVisible(true);
        } else if (Double.parseDouble(valormatriz) > 1 && Double.parseDouble(valormatriz) != 2 && Double.parseDouble(valormatriz) != 3 && Double.parseDouble(valormatriz) != 4 && Double.parseDouble(valormatriz) > 4) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero entre 2 y 4 ");
        }else if (Double.parseDouble(valormatriz) >4) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero entre 2 y 4 ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Numerodematriz;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
