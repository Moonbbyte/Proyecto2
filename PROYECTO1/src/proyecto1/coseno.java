
package proyecto1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class coseno extends javax.swing.JFrame {
String valor1,Gradoradian;
Historial His=new Historial();
    public coseno() {
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
        jLabel4 = new javax.swing.JLabel();
        resultadocoseno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        radiangrado = new javax.swing.JComboBox();
        datocoseno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(479, 340));

        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cos(");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 70, 52, 30);

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Coseno:");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 76, 27);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resultado:");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 130, 86, 27);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(")");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 70, 19, 30);

        resultadocoseno.setBackground(new java.awt.Color(255, 255, 255));
        resultadocoseno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultadocoseno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadocoseno.setOpaque(true);
        jPanel1.add(resultadocoseno);
        resultadocoseno.setBounds(81, 162, 279, 27);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(364, 162, 93, 27);

        jButton2.setText("Guardar Resultado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(35, 220, 143, 38);

        radiangrado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radiangrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grados", "Radianes" }));
        jPanel1.add(radiangrado);
        radiangrado.setBounds(305, 74, 90, 27);

        datocoseno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        datocoseno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(datocoseno);
        datocoseno.setBounds(145, 69, 70, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/be0a21b6db86a29e5c7354946e009e8d.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 490, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String resultado;
        valor1 = datocoseno.getText();
        Gradoradian = radiangrado.getSelectedItem().toString();
if (valor1.equals("")) {
            JOptionPane.showMessageDialog(null, "Deben de llenarse la casilla para iniciar el calculo");
        } else {
        if (Gradoradian == "Grados") {
            resultado = resultadoradian(valor1, Gradoradian);
            resultadocoseno.setText(resultado);
        }
        if (Gradoradian == "Radianes") {
            
            resultado = resultadoradian(valor1, Gradoradian);
            resultadocoseno.setText(resultado);
        }}

    }//GEN-LAST:event_jButton1ActionPerformed
//////////////////////GUARDAR RESULTADO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Historial.RellenoMatriz(resultadocoseno.getText()+" -a través de coseno-  "+coseno.fechaActual());
        Favoritos.RellenoMatriz(resultadocoseno.getText()+" -a través de coseno-  "+coseno.fechaActual());
    }//GEN-LAST:event_jButton2ActionPerformed
/////////////FECHA
  public static String fechaActual(){
  String fecha1="";
  Date fecha=new Date();
  SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
  
  
  return formatofecha.format(fecha);
  }




///////CALCULO EN RADIANES

    public static String resultadoradian(String dato1, String Gradoradian) {
        DecimalFormat df = new DecimalFormat("0.00000");
        Double valor1 = 0.0, resultado = 0.0, valorsigno = 1.0, valorfactorial, valorpotencia;
        if (Gradoradian == "Grados") {
            valor1 = Double.parseDouble(dato1) * (3.141592654 / 180.0);         
        }
        if (Gradoradian == "Radianes") {
            valor1 = Double.parseDouble(dato1);
        }

        for (int i = 0; i < 16; i++) {
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
    private javax.swing.JTextField datocoseno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox radiangrado;
    private javax.swing.JLabel resultadocoseno;
    // End of variables declaration//GEN-END:variables
}
