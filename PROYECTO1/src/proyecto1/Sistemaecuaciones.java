package proyecto1;

import javax.swing.JOptionPane;

public class Sistemaecuaciones extends javax.swing.JFrame {

    matriz2x2 matriz2 = new matriz2x2();
    matriz3x3 matriz3 = new matriz3x3();
    matriz1x1 matriz1 = new matriz1x1();
    String valormatriz;

    public Sistemaecuaciones() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

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
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Numerodematriz, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numerodematriz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/////////CREAR MATRIZ
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        valormatriz = Numerodematriz.getText();
        if (valormatriz.equals("")) {
            JOptionPane.showMessageDialog(null, "Deben de llenarse la casilla para iniciar el calculo");
        } else {
            if (Double.parseDouble(valormatriz) < 1) {
                JOptionPane.showMessageDialog(null, "Digite un numero igual o mayor a 1");
            } else if (Double.parseDouble(valormatriz) == 1) {
                matriz1.setTitle("Matriz 1x1:");
                matriz1.setVisible(true);
            } else if (Double.parseDouble(valormatriz) == 2) {
                matriz2.setTitle("Matriz 2x2:");
                matriz2.setVisible(true);
            } else if (Double.parseDouble(valormatriz) == 3) {
                matriz3.setTitle("Matriz 3x3:");
                matriz3.setVisible(true);
            } else if (Double.parseDouble(valormatriz) >= 4) {
                JOptionPane.showMessageDialog(null, "Digite un numero menor a 4");
            } else if (Double.parseDouble(valormatriz) > 1 && Double.parseDouble(valormatriz) != 2 && Double.parseDouble(valormatriz) != 3 && Double.parseDouble(valormatriz) != 4 && Double.parseDouble(valormatriz) < 4) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entero");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Numerodematriz;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
