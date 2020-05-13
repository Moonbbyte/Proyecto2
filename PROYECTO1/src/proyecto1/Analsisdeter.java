package proyecto1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Analsisdeter extends javax.swing.JFrame {

    Double x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44;

    public Analsisdeter() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrada = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Nombreoperacion = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        entrada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Determinante:");
        Nombreoperacion.setOpaque(true);

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setOpaque(true);

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Guardar Resultados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed
//////////////////////CALCULAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         DecimalFormat df = new DecimalFormat("0.00");
        Double Determinante = 0.0;
    try{    
        String str = entrada.getText();
        String[] Ndigitos = str.split(",");

        if (Ndigitos.length == 4) {
            x11 = Double.parseDouble(Ndigitos[0]);
            x12 = Double.parseDouble(Ndigitos[1]);
            x21 = Double.parseDouble(Ndigitos[2]);
            x22 = Double.parseDouble(Ndigitos[3]);
           
            Determinante = Determinante2x2(x11, x12, x21, x22);
            resultado.setText(df.format(Determinante));
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
            Determinante=Determinante3x3(x11,x12,x13,x21,x22,x23,x31,x32,x33);
              resultado.setText(df.format(Determinante));
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
            Determinante=Determinante4X4(x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44);
           resultado.setText(df.format(Determinante));

        } else if (Ndigitos.length != 16 && Ndigitos.length != 9 && Ndigitos.length != 4) {
            JOptionPane.showMessageDialog(null, "Se deben de escribir 4, 9 o 16 digitos");
        } } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numeros mal digitados");
        }

       
    }//GEN-LAST:event_jButton1ActionPerformed
//////////////////////GUARDAR RESULTADO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Historial.RellenoMatriz(resultado.getText()+" - analisis de determinante -  "+coseno.fechaActual());
        Favoritos.RellenoMatriz(resultado.getText()+" - analisis de determinante -  "+coseno.fechaActual());
    }//GEN-LAST:event_jButton2ActionPerformed
  
    
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
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
