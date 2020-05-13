package proyecto1;

import javax.swing.JOptionPane;

public class EASYMATH extends javax.swing.JFrame {
    Historial his= new Historial();
    IngresoPotencia IP= new IngresoPotencia();
    Favoritos fv=new Favoritos();
    Calculadora cal = new Calculadora();
    EcuaCuadraticas ec = new EcuaCuadraticas();
    Sistemaecuaciones sec = new Sistemaecuaciones();
    Binomiocuadrado bn = new Binomiocuadrado();
    Diferenciacuadrados Dc = new Diferenciacuadrados();
    DifCubos Dcubos = new DifCubos();
    seno seno = new seno();
    coseno cos = new coseno();
    tangente tan = new tangente();
    LongitudArco La = new LongitudArco();
    Derivacion dev = new Derivacion();
    Integracion inte = new Integracion();
    SumaRieman SR = new SumaRieman();
    Ingreso ing = new Ingreso();
    IngresoTranpuesta ingt = new IngresoTranpuesta();
    ingresoinversa ingi= new ingresoinversa();
    DetTrInv DTI = new DetTrInv();
    tamOperacionesM tamM= new tamOperacionesM();

    public EASYMATH() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 500));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("EASY MATH");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(19, 25, 100, 17);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ARITMÉTICA");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 60, 80, 14);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ÁLGEBRA");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(155, 60, 90, 14);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRIGONOMETRIA");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(357, 60, 110, 14);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CÁLCULO");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(541, 60, 90, 14);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ÁLGEBRA LINEAL");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(738, 60, 120, 14);

        jButton1.setText("Calculadora");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(19, 92, 110, 23);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ecuaciones");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(155, 92, 90, 14);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Factorización");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(155, 221, 80, 14);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Funciones Trigonométricas");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(337, 92, 170, 14);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ángulos");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(357, 221, 90, 14);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cálculo diferencial");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(541, 92, 120, 14);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cálculo Integral");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(541, 180, 110, 14);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Operaciones con Matrices");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(720, 90, 180, 14);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Operaciones con matrices");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(730, 280, 160, 14);

        jButton2.setText("Ecuación Cuadrática");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(155, 126, 180, 23);

        jButton3.setText("Sistemas de Ecuaciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(155, 167, 180, 23);

        jButton4.setText("Binomio Cuadrado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(155, 253, 190, 23);

        jButton5.setText("Seno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(357, 112, 90, 23);

        jButton6.setText("Coseno");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(357, 146, 90, 23);

        jButton7.setText("Tangente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(357, 180, 90, 23);

        jButton8.setText("Longitud de Arco");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(357, 253, 140, 23);

        jButton9.setText("Diferencia de cuadrados");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(155, 294, 190, 23);

        jButton10.setText("Suma y diferencia de cubos");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(150, 350, 200, 23);

        jButton11.setText("Casos de Derivación");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(541, 126, 160, 23);

        jButton12.setText("Casos de integración");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(541, 212, 160, 23);

        jButton13.setText("Sumas de Riemann");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(541, 253, 160, 23);

        jButton14.setText("Traspuesta");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(738, 112, 120, 23);

        jButton15.setText("Inversa");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(738, 153, 120, 23);

        jButton16.setText("Determinante");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(738, 194, 120, 23);

        jButton17.setText("Operaciones con Matrices");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(720, 310, 190, 23);

        jButton18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton18.setText("Historial");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(630, 380, 110, 25);

        jButton19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton19.setText("Favoritos");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(750, 380, 110, 25);

        jButton21.setText("Potencia de Matrices");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(730, 240, 170, 23);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 940, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////TANGENTE
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tan.setTitle("Trigonometrica Tangente");
        tan.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
//CALCULADORA
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cal.setTitle("Calculadora");
        cal.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed
///////ECUACIONES CUADRATICAS
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ec.setTitle("Ecuaciones cuadraticas");
        ec.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
///////////Sistema de Ecuaciones
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sec.setTitle("Sistema de Ecuaciones");
        sec.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
/////////BINOMIO CUADRADO PERFECTO
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        bn.setTitle("Binomio cuadrado perfecto");
        bn.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
////////////////DIFERENCIA DE CUADRADOS
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Dc.setTitle("Diferencia de cuadrados");
        Dc.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed
////////////////////SUMA Y DIFERENCIA DE CUBOS
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Dcubos.setTitle("Diferencia y suma de Cubos");
        Dcubos.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed
//////////////////////////////////SENO
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        seno.setTitle("Trignometrica Seno");
        seno.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
/////////////////////////////COSENO
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cos.setTitle("Trigonometrica Coseno");
        cos.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
///////////////LONGITUD DE ARCO
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        La.setTitle("Longitud de arco");
        La.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        dev.setTitle("Casos de derivación");
        dev.setVisible(true);
        JOptionPane.showMessageDialog(null, "Arrastre el slider para cambiar de pagina y empieze a funcionar la guia");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        inte.setTitle("Casos de Integración");
        inte.setVisible(true);
        JOptionPane.showMessageDialog(null, "Arrastre el slider para cambiar de pagina y empieze a funcionar la guia");
    }//GEN-LAST:event_jButton12ActionPerformed
/////////////TABLAS, TRASPUESTA
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        ingt.setTitle("Tipo de Ingreso");
        ingt.setVisible(true);

    }//GEN-LAST:event_jButton14ActionPerformed
//////////////TABLA INVERSA
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        ingi.setTitle("Tipo de Ingreso");
        ingi.setVisible(true);

        
        
    }//GEN-LAST:event_jButton15ActionPerformed
/////////////////////////DETERMINANTE
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        ing.setTitle("Tipo de Ingreso");
        ing.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed
/////////RIEMANNN
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        SR.setTitle("Suma de Riemann");
        SR.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed
///////////////////OPERACIONES CON MATRICES
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        tamM.setTitle("Operaciones con Matrices");
        tamM.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        his.setTitle("Historial");
        his.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        fv.setTitle("Favoritos");
        fv.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        IP.setTitle("Potencia de Matrices");
        IP.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
