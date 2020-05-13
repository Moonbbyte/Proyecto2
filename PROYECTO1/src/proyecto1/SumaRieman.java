/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.text.DecimalFormat;

/**
 *
 * @author brand
 */
public class SumaRieman extends javax.swing.JFrame {

    Double a, b, dif;
    String funcion1;

    public SumaRieman() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        liminf = new javax.swing.JTextField();
        limsup = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        funcion = new javax.swing.JComboBox();
        diferencial = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(332, 380));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Suma de Riemann:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 152, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Limite superior:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 108, 19);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Limite inferior:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 49, 107, 19);

        liminf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        liminf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(liminf);
        liminf.setBounds(127, 49, 163, 21);

        limsup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        limsup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(limsup);
        limsup.setBounds(128, 88, 163, 21);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Diferencial:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 173, 79, 19);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Función:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 133, 59, 19);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resultado:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 212, 74, 19);

        funcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        funcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cuadratica", "Cubica", "Exponencial" }));
        getContentPane().add(funcion);
        funcion.setBounds(128, 132, 104, 23);

        diferencial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        diferencial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(diferencial);
        diferencial.setBounds(128, 173, 163, 21);

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultado.setOpaque(true);
        getContentPane().add(resultado);
        resultado.setBounds(128, 212, 163, 18);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Guardar Resultado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 280, 152, 38);

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 280, 101, 38);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("R. mas exacto a través de diferencial mas pequeña.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 250, 310, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/be0a21b6db86a29e5c7354946e009e8d.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-10, -10, 350, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/////////////////////GUARDAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Historial.RellenoMatriz(resultado.getText()+" - Suma de Riemann -  "+coseno.fechaActual());
         Favoritos.RellenoMatriz(resultado.getText()+" - Suma de Riemann -  "+coseno.fechaActual());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DecimalFormat df = new DecimalFormat("0.000");
        Double n, cuadratica, cubica, exponencial;
        a = Double.parseDouble(liminf.getText());
        b = Double.parseDouble(limsup.getText());
        dif = Double.parseDouble(diferencial.getText());
        n = (b - a) / dif;
        funcion1 = funcion.getSelectedItem().toString();
        if (funcion1.equals("Cuadratica")) {
            cuadratica = cuadratica(a, b, n);
            resultado.setText(df.format(cuadratica));
        } else if (funcion1.equals("Cubica")) {
            cubica = cubica(a, b, n);
            resultado.setText(df.format(cubica));
        }else if (funcion1.equals("Exponencial")) {
            exponencial = intexponencial(a,b,n);
            resultado.setText(df.format(exponencial));
        }

    }//GEN-LAST:event_jButton2ActionPerformed
/////////////////////INTEGRAL CUBICA

    public static Double cubica(Double a, Double b, Double n) {
        Double resultado = 0.0;

        resultado = elevado(a, 3) * (b - a) + (1.5) * (elevado((b - a), 2) * elevado(a, 2) * ((1 / n) + 1)) + (0.5) * (a * elevado((b - a), 3)) * (1 + (1 / n)) * (2 + (1 / n))
                + (0.25) * elevado((b - a), 4) * (1 + (2 / n) + (1 / elevado(n, 2)));

        return resultado;
    }

///////INTEGRAL CUADRATICA
    public static Double cuadratica(Double a, Double b, Double n) {
        Double resultado = 0.0;
        
        resultado = elevado(a, 2) * (b - a) + a * elevado((b - a), 2) * (1 + (1 / n)) + (0.1666666667) * elevado((b - a), 3) * (2 + (3 / n) + (1 / elevado(n, 2)));

        return resultado;
    }
//////////////////////INTEGRAL EXPONENCIAL
    public static Double intexponencial(Double a,Double b, Double n){
    Double resultado=0.0;
    
    resultado=exponencial1(a)*(b-a)*((1/n)*(1-exponencial1((b-a)*(1+(1/n)))))/(1-exponencial1((b-a)/n));
    
    
    
    return resultado;
    }
    
    ////////////////////SERIE DE TYLOR EXPONENCIAL

    public static Double exponencial1(Double dato) {
        Double resultado = 0.0, x=0.0, y;
        Double valorfactorial,valorelevado;
        for (int i = 0; i < 20; i++) {
            valorfactorial=factorial(i);
            valorelevado=elevado(dato,i);
            resultado = (valorelevado/valorfactorial) + resultado;
        }
        return resultado;
    }

////////////////////ELEVAR A LA N
    public static Double elevado(Double dato, int exponencial) {
        Double x = 1.0, y;
        
        for (int i = 0; i < exponencial; i++) {
            y = dato * x;
            x = y;
        }
        return x;
    }


    ////////////////FACTORIAL
    public static Double factorial(int dato1) {
        int N = dato1 + 1;
        Double resultado = 1.0;
            while (N != 1) {
                N = N - 1;
                resultado = N * resultado;
            }
        
        return resultado;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diferencial;
    private javax.swing.JComboBox funcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField liminf;
    private javax.swing.JTextField limsup;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
