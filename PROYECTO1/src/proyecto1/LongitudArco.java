
package proyecto1;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class LongitudArco extends javax.swing.JFrame {

    String Angulo, Radio, gradoradian;
    Double Angulo1, Radio1;

    public LongitudArco() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        longitudresultante = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datoradio = new javax.swing.JTextField();
        datoangulo = new javax.swing.JTextField();
        radianesgrado = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Longitud de arco:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ángulo:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Radio:");

        longitudresultante.setBackground(new java.awt.Color(255, 255, 255));
        longitudresultante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        longitudresultante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        longitudresultante.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Resultado:");

        datoradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoradioActionPerformed(evt);
            }
        });

        datoangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoanguloActionPerformed(evt);
            }
        });

        radianesgrado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radianesgrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Radianes", "Grados" }));
        radianesgrado.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Guardar Resultados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55)
                        .addComponent(datoradio, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(longitudresultante, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radianesgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(207, 207, 207))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(datoangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(257, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(radianesgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                            .addComponent(datoradio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(longitudresultante, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(datoangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(268, Short.MAX_VALUE)))
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

    private void datoradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoradioActionPerformed

    private void datoanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoanguloActionPerformed
/////////////////////////CALCULAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        Double valorangulo, valorRadio, Arcofinal;
        int anguloentero, radioentero;
        Angulo = datoangulo.getText();
        Radio = datoradio.getText();
        gradoradian = radianesgrado.getSelectedItem().toString();
        if (Angulo.equals("") || Radio.equals("")) {
            JOptionPane.showMessageDialog(null, "Deben de llenarse todas las casillas para iniciar el calculo");
        } else {
            valorangulo = Double.parseDouble(Angulo);
            valorRadio = Double.parseDouble(Radio);
            Arcofinal = ValorArco(valorangulo, valorRadio, gradoradian);
            longitudresultante.setText(df.format(Arcofinal));
            if (gradoradian == "Grados") {
                valorangulo = valorangulo;
            } else if (gradoradian == "Radianes") {
                valorangulo = valorangulo * (180 / 3.141592654);
            }
            anguloentero = (int) ((double) valorangulo);
            radioentero = Integer.parseInt(Radio);
            if(radioentero<100){JOptionPane.showMessageDialog(null,"Puede que el circulo sea pequeño y poco visible, si desea aumente el radio a mas de 100");}
            int centrar = (int) (radioentero / 2);
            Graphics h = getGraphics();
            h.setColor(Color.blue);
            h.drawRect(290 - centrar, 325 - centrar, radioentero, radioentero);
            h.setColor(Color.red);
            h.drawArc(290 - centrar, 325 - centrar, radioentero, radioentero, 0, anguloentero);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        datoradio.setText("");
        datoangulo.setText("");
        Graphics g = getGraphics();
        super.paint(g);
    }//GEN-LAST:event_jButton3ActionPerformed
///////////////GUARDAR
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Historial.RellenoMatriz(longitudresultante.getText()+" - Longitud de Arco -  "+coseno.fechaActual());
         Favoritos.RellenoMatriz(longitudresultante.getText()+" - Longitud de Arco -  "+coseno.fechaActual());
    }//GEN-LAST:event_jButton2ActionPerformed

    public static Double ValorArco(Double valorangulo, Double valorRadio, String gradoradian) {
        Double resultadoarco, valorangulo1 = 0.0;
        if (gradoradian == "Grados") {
            valorangulo1 = valorangulo * (3.141592654 / 180);
        } else if (gradoradian == "Radianes") {
            valorangulo1 = valorangulo;
        }
        resultadoarco = valorangulo1 * valorRadio;
        return resultadoarco;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datoangulo;
    private javax.swing.JTextField datoradio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel longitudresultante;
    private javax.swing.JComboBox radianesgrado;
    // End of variables declaration//GEN-END:variables
}
