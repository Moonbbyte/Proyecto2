package proyecto1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class seno extends javax.swing.JFrame {

    String valor1, Gradoradian;

    public seno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resultadosen = new javax.swing.JLabel();
        datoseno = new javax.swing.JTextField();
        radiangrado = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(428, 300));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seno:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 11, 71, 22);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sen(");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 52, 49, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(")");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 50, 20, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Resultado:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(22, 130, 95, 20);

        resultadosen.setBackground(new java.awt.Color(255, 255, 255));
        resultadosen.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        resultadosen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadosen.setOpaque(true);
        getContentPane().add(resultadosen);
        resultadosen.setBounds(86, 161, 223, 32);

        datoseno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(datoseno);
        datoseno.setBounds(69, 51, 80, 20);

        radiangrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grados", "Radianes" }));
        getContentPane().add(radiangrado);
        radiangrado.setBounds(258, 52, 115, 32);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(319, 161, 86, 32);

        jButton2.setText("Guardar Resultado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 211, 150, 33);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/be0a21b6db86a29e5c7354946e009e8d.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/////////////////////CALCULAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String resultado;
        valor1 = datoseno.getText();
        Gradoradian = radiangrado.getSelectedItem().toString();
if (valor1.equals("")) {
            JOptionPane.showMessageDialog(null, "Deben de llenarse la casilla para iniciar el calculo");
        } else {
        if (Gradoradian == "Grados") {
            resultado = resultadoradian(valor1, Gradoradian);
            resultadosen.setText(resultado);
        }
        else if (Gradoradian == "Radianes") {

            resultado = resultadoradian(valor1, Gradoradian);
            resultadosen.setText(resultado);
        }}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Historial.RellenoMatriz(resultadosen.getText()+" -a través de seno-  "+coseno.fechaActual());
       Favoritos.RellenoMatriz(resultadosen.getText()+" -a través de seno-  "+coseno.fechaActual());
    }//GEN-LAST:event_jButton2ActionPerformed
////////CALCULO EN RADIANES

    public static String resultadoradian(String dato1, String Gradoradian) {
        DecimalFormat df = new DecimalFormat("0.000");
        Double valor1 = 0.0, resultado = 0.0, valorsigno = 1.0, valorfactorial, valorpotencia;
        if (Gradoradian == "Grados") {
            valor1 = Double.parseDouble(dato1) * (3.141592654 / 180.0);
        }
        if (Gradoradian == "Radianes") {
            valor1 = Double.parseDouble(dato1);
        }

        for (int i = 0; i < 19; i++) {
            ///////////////////SIGNO
            if (i % 2 == 0) {
                valorsigno = 1.0;
            } else if (i % 2 != 0) {
                valorsigno = -1.0;
            }   /////perfecto
            valorfactorial = factorial(i);/////perfecto
            valorpotencia = potencia(i, valor1);/////perfecto
            resultado = resultado + ((valorsigno * valorpotencia) / valorfactorial);
        }

        return df.format(resultado);
    }

    ////////////////////////////VALOR DEL FACTORIAL
    public static Double factorial(int i) {
        ///////+2 y no +1 por que en el while empiezo restando uno de una vez
        int N = (2 * i) + 2;
        Double resultado = 1.0;
        while (N != 1) {
            N = N - 1;
            resultado = N * resultado;
        }
        return resultado;
    }

    ////////////////////////elevado a la N
    public static Double potencia(int i, Double valor1) {
        Double x = 1.0, y;
        int Nmultiplicacion;
        Nmultiplicacion = (2 * i) + 1;
        ///////////////if n es igual a 0;
        for (int z = 0; z < Nmultiplicacion; z++) {
            y = valor1 * x;
            x = y;
        }
        return x;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datoseno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox radiangrado;
    private javax.swing.JLabel resultadosen;
    // End of variables declaration//GEN-END:variables
}
