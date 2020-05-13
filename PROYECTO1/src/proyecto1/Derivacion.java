/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author brand
 */
public class Derivacion extends javax.swing.JFrame {

    int pagina;

    public Derivacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();
        pagina1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Casos de Derivación");

        jScrollPane1.setViewportView(texto);

        pagina1.setForeground(new java.awt.Color(0, 0, 0));
        pagina1.setMajorTickSpacing(1);
        pagina1.setMaximum(6);
        pagina1.setMinimum(1);
        pagina1.setPaintLabels(true);
        pagina1.setPaintTicks(true);
        pagina1.setSnapToTicks(true);
        pagina1.setValue(1);
        pagina1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pagina1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(pagina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DerivadaproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void DerivadacocienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pagina1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pagina1StateChanged
        String Derivada = "";
        pagina = pagina1.getValue();
        if (pagina == 1) {
            Derivada = "DERIVADA DE UNA FUNCION DE GRADO N\n\n"
                    + "                                                  d[x^(n)]=n*x^(n-1)"
                    + "\n                                                  dx"
                    + "\n Para derivar una función de grado n se debe de multiplicar la función por su exponente para luego a este restarle 1. "
                    + "\n"
                    + "\n Ejemplo:                         \n  \n"
                    + "\n                                                  d[x^(3)] = 3*x^(2)"
                    + "\n                                                  dx";
            texto.setText(Derivada);
        } else if (pagina == 2) {
            texto.setText("");
            Derivada = "DERIVADA DEL PRODUCTO DE UNA CONSTANTE POR UNA FUNCIÓN\n\n"
                    + "                                                  d[ K*f(x) ]= K*d[ f(x) ]"
                    + "\n                                                  dx"
                    + "\n Para derivar el producto de una constante por una función se debe de extraer la constante que multiplica la función"
                    + "\n y solo derivar esta."
                    + "\n Ejemplo:                         \n  \n"
                    + "\n                                                  d[ 3*ln(x) ] =  3*d[ ln(x)] =  3/x "
                    + "\n                                                  dx";

            texto.setText(Derivada);
        } else if (pagina == 3) {

            texto.setText("");

            Derivada = "DERIVADA DE UNA SUMA\n \n"
                    + "                                                 d[A(x)+B(x)]=d[A(x)]+d[B(x)] "
                    + "\n                                                  dx                   dx         dx"
                    + "\n Para derivar una suma se deben de separar los factores que se estan sumando y derivar cada uno aparte"
                    + "\n para luego sumar el resultado de ambas derivaciones."
                    + "\n Ejemplo:                         \n  \n"
                    + "\n                                                  d[3*ln(x)+x^(3)] =  3*d[ln(x)]+d[x^(3)] =  3/x + 3*x^(2)"
                    + "\n                                                  dx                                dx           dx ";

            texto.setText(Derivada);

        } else if (pagina == 4) {
            texto.setText("");
            Derivada = "DERIVADA DE UN PRODUCTO\n\n"
                    + "                                                  d[A(x)*B(x)]=A'(x)B(x)+A(x)*B'(x)"
                    + "\n                                                  dx"
                    + "\n\n                                                  d[A(x)*B(x)*C(x)]=A'(x)B(x)C(x)+A(x)B'(x)C(x)+A(x)B(x)C'(x)            "
                    + "\n                                                  dx"
                    + "\n Para derivar un producto se debe de realizar una suma con un numero de elementos iguales a los contenidos en  "
                    + "\n el producto  cada elemento contiene el producto a derivar derivandose un solo dato de los que compone el producto,"
                    + "\n repitiendose el procedimiento con distinto valor en cada elemento."
                    + "\n Ejemplo:                         \n  \n"
                    + "\n           d[x^(3)*(2*x)*3ln(x)] = d[x^(3)]*(2x)*(3ln(x)) + x^(3)*d[(2x)]*(3ln(x)) + x^(3)*(2x)*3d[ln(x)]"
                    + "\n           dx                                   dx                                              dx                                              dx"
                    + "\n\n           = 3*x^(2)(2x)(3ln(x))+2*x^(3)*3ln(x)+x^(3)*2x*3/x  = 18x^(3)*ln(x)+6x^(3)*ln(x)+6x^(3)";

            texto.setText(Derivada);

        } else if (pagina == 5) {
            texto.setText("");
            Derivada = "DERIVADA DE UN COCIENTE\n\n"
                    + "                                                  d[A(x) / B(x)]=B(x)A'(x)-A(x)*B'(x) / (B(x))^(2)"
                    + "\n                                                  dx           "
                    + "\n\n Para derivar un cociente se debe de elevar al cuadrado el denominador y en el numerador se realiza una  "
                    + "\n multiplicacion del divisor original por la derivada del numerador original menos el numerador original por la derivada del "
                    + "\n divisor original."
                    + "\n Ejemplo:                         \n  \n"
                    + "\n           d[x^(3)/8x^(2)] = 8x^(2)*(d[x^(3)]/dx)- x^(3)*(d[8x^(2)]/dx)  /  (8x^(2))^(2)"
                    + "\n           dx                                           "
                    + "\n\n           = (24x^(4)-16x^(4))/64x^(4)  = 1/8 ";
        } else if (pagina == 6) {

            texto.setText("");

            Derivada = " REGLA DE LA CADENA\n\n     "
                    + "                                     d[f(u)]/dx = df/dx*du/dx"
                    + "\n La regla de la cadena consiste en derivar de forma jerarquica los elementos de una función  siendo estos cotenidos "
                    + "\n adentro de esta,para ello se sustituye el valor que contiene la funcion por una u y se deriva esta, para luego ser "
                    + "\n multiplicada por la derivada de la función original, para finalizar se sustituyen las u restantes por el valor que contenia."
                    + "\n Ejemplo:                         \n  \n"
                    + "\n                                         f=cos(3x^(3))   donde: u=3x^(3) "
                    + "\n                                        df/dx= d[cos(u)]/dx * du/dx"
                    + "\n                                        df/dx= -sen(u)* du/dx = -sen(3x^(3))* d[3x^(3]/dx"
                    + "\n                                        df/dx= -sen(3x^(3))*9x^(2)      "
                    + "\n \n                                       df/dx= -9sen(3x^(3))*x^(2) ";
                    

            texto.setText(Derivada);
        }

        texto.setText(Derivada);
    }//GEN-LAST:event_pagina1StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider pagina1;
    private javax.swing.JTextPane texto;
    // End of variables declaration//GEN-END:variables
}
