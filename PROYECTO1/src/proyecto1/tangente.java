
package proyecto1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class tangente extends javax.swing.JFrame {
String valor1,Gradoradian;
   
    public tangente() {
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
        jLabel5 = new javax.swing.JLabel();
        resultadotangente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        datotangente = new javax.swing.JTextField();
        radiangrado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trigonometrica Tangente:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tan(");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(")");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Resultado:");

        resultadotangente.setBackground(new java.awt.Color(255, 255, 255));
        resultadotangente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resultadotangente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadotangente.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Guardar Resultado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        radiangrado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radiangrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grados", "Radianes" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datotangente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(radiangrado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(resultadotangente, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datotangente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiangrado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(resultadotangente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
//////////////////////////CALCULAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DecimalFormat df = new DecimalFormat("0.00000");
        String resultadoseno,resultadocoseno;
        Double resultadotangente1;
        valor1 = datotangente.getText();
        Gradoradian = radiangrado.getSelectedItem().toString();
   if (valor1.equals("")) {
            JOptionPane.showMessageDialog(null, "Deben de llenarse la casilla para iniciar el calculo");
        } else {
        if (Gradoradian == "Grados") {
           if(Double.parseDouble(valor1)==90 || Double.parseDouble(valor1)==180){
           JOptionPane.showMessageDialog(null, "El valor tiende al infinito");
           }
            
            resultadocoseno = resultadoradian(valor1, Gradoradian);
            resultadoseno=resultadoradianseno(valor1,Gradoradian);
            resultadotangente1=Double.parseDouble(resultadoseno)/Double.parseDouble(resultadocoseno);
            resultadotangente.setText(df.format(resultadotangente1));
        }
        else if (Gradoradian == "Radianes") {
           if(Double.parseDouble(valor1)==1.570796327 || Double.parseDouble(valor1)==4.71238898){
           JOptionPane.showMessageDialog(null, "El valor tiende al infinito");
           }
            
           resultadocoseno = resultadoradian(valor1, Gradoradian);
           resultadoseno=resultadoradianseno(valor1,Gradoradian);
           resultadotangente1=Double.parseDouble(resultadoseno)/Double.parseDouble(resultadocoseno);
           resultadotangente.setText(df.format(resultadotangente1));
        }  }
    }//GEN-LAST:event_jButton1ActionPerformed
/////////////////GUARDAR RESULTADO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 Historial.RellenoMatriz(resultadotangente.getText()+" -a través de tangente -  "+coseno.fechaActual());        
 Favoritos.RellenoMatriz(resultadotangente.getText()+" -a través de tangente -  "+coseno.fechaActual());   
    }//GEN-LAST:event_jButton2ActionPerformed
//////////////////////////////////////////////SENO//////////////////////////////////////
////////CALCULO EN RADIANES

    public static String resultadoradianseno(String dato1, String Gradoradian) {
        Double valor1 = 0.0, resultado = 0.0, valorsigno = 1.0, valorfactorial, valorpotencia;
        if (Gradoradian == "Grados") {
            valor1 = Double.parseDouble(dato1) * (3.141592654 / 180.0);
        }
        if (Gradoradian == "Radianes") {
            valor1 = Double.parseDouble(dato1);
        }

        for (int i = 0; i < 13; i++) {
            ///////////////////SIGNO
            if (i % 2 == 0) {
                valorsigno = 1.0;
            } else if (i % 2 != 0) {
                valorsigno = -1.0;
            }   /////perfecto
            valorfactorial = factorialseno(i);/////perfecto
            valorpotencia = potenciaseno(i, valor1);/////perfecto
            resultado = resultado + ((valorsigno * valorpotencia) / valorfactorial);
        }

        return resultado.toString();
    }

    ////////////////////////////VALOR DEL FACTORIAL
    public static Double factorialseno(int i) {
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
    public static Double potenciaseno(int i, Double valor1) {
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



/////////////////////////////////////COSENO///////////////////////////////////////////////////
    ////////CALCULO EN RADIANES

    public static String resultadoradian(String dato1, String Gradoradian) {
        DecimalFormat df = new DecimalFormat("#.000000");
        Double valor1 = 0.0, resultado = 0.0, valorsigno = 1.0, valorfactorial, valorpotencia;
        if (Gradoradian == "Grados") {
            valor1 = Double.parseDouble(dato1) * (3.141592654 / 180.0);         
        }
        if (Gradoradian == "Radianes") {
            valor1 = Double.parseDouble(dato1);
        }

        for (int i = 0; i < 12; i++) {
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

        return resultado.toString();
    }

    ////////////////////////////VALOR DEL FACTORIAL

    public static Double factorial(int i) {
        ///////+2 y no +1 por que en el while empiezo restando uno de una vez
        int N = (2 * i) + 1;
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
        Nmultiplicacion = (2 * i) ;
        ///////////////if n es igual a 0;
        for (int z = 0; z < Nmultiplicacion; z++) {
            y = valor1 * x;
            x = y;
        }
        return x;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datotangente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox radiangrado;
    private javax.swing.JLabel resultadotangente;
    // End of variables declaration//GEN-END:variables
}
