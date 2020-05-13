package proyecto1;

public class Integracion extends javax.swing.JFrame {

    int pagina;

    public Integracion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pagina1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        explicacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        pagina1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pagina1.setForeground(new java.awt.Color(0, 0, 0));
        pagina1.setMajorTickSpacing(1);
        pagina1.setMaximum(3);
        pagina1.setMinimum(1);
        pagina1.setMinorTickSpacing(1);
        pagina1.setPaintLabels(true);
        pagina1.setPaintTicks(true);
        pagina1.setSnapToTicks(true);
        pagina1.setValue(1);
        pagina1.setOpaque(false);
        pagina1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pagina1StateChanged(evt);
            }
        });

        explicacion.setColumns(20);
        explicacion.setRows(5);
        jScrollPane1.setViewportView(explicacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(pagina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pagina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void pagina1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pagina1StateChanged
        String Derivada = "";
        pagina = pagina1.getValue();
        if (pagina == 1) {
            Derivada = "INTEGRACIÓN POR SUSTITUCIÓN\n\n"
                    + "   La integración por sustitución consiste en facilitar una integral a través de la sustitución de una parte de la\n "
                    + "integral por una u, adaptando y sustituyendo dicha variable en las demás partes de la integral.\n  "
                    + " En otras palabras, se substituye todas las x de ∫ f(x) dx por u incluyendo dx a través de la igualación de la \n "
                    + "  derivada de u con la derivada de x y el valor substituido, para de ultimo integrar la ecuación simplificada.\n\n  "
                    + "Ejemplo:\n"
                    + "                             ∫(2x/(x^(2)+1)^(1/2))     donde: u= x^(2)+1 y  2(x)dx=du  dx=du/2x\n"
                    + "                             Susbtituyendo:\n"
                    + "                     ∫(2x/(x^(2)+1))     = ∫(1/(u)^(1/2))  =2  *(u)^(1/2)  =2  *( x^(2)+1)^(1/2)  +C";

        } else if (pagina == 2) {
            Derivada = "INTEGRACION POR PARTES\n\n"
                    + "La integración por sustitución consiste en facilitar una integral a través de la sustitución de una parte de la\n"
                    + "La integración por partes consiste en facilitar una integral a través de separar la multiplicación de dos valores\n"
                    + "con la formula ∫udv=uv-∫vdu,  de forma que en ∫A(x)*B(x) dx , A(x) = u y B(x)= dv   donde A se deriva para substituir\n"
                    + "du y B(x) se integra para substituir v, una vez sustituido todo se deriva de forma normal. Para escoger U se debe de\n"
                    + "revisar la secuencia ILATE (inversa, logarítmica, aritmética, trigonométrica y exponencial) donde si A(x) se identifica\n"
                    + "con alguna letra anterior a la letra que identifica a B(x), esta será U y B(x) la dv en caso contrario B(x) será la U y\n"
                    + "A(x) la dv.\n\n"
                    + "Ejemplo:\n"
                    + "∫x^(2)*ln(x) dx  donde      \n"
                    + "x^(2) es aritmetica y ln(x) exponencial dando asi que ln(x) =u y x^(2)=dv  \n"
                    + "derivándose u e integrándose dv obtenemos que du=1/x  y v= x^(3)/3\n"
                    + "sustituyendo los valores en ∫udv=uv-∫vdu obtenemos que:\n"
                    + "∫x^(2)*ln(x) dx  =    (ln(x)* x^(3))/3-∫ (x^(3)/3)*(1/x) d\n"
                    + "∫x^(2)*ln(x) dx =     (ln(x)* x^(3))/3-∫ (x^(2)/3)  \n\n"
                    + "Integrando :\n\n"
                    + "                                               ∫x^(2)*ln(x) dx  = (ln(x)* x^(3))/3- x^(3)/9 +C";

        } else if (pagina == 3) {
            Derivada = "INTEGRACION POR CAMBIO DE VARIABLES\n\n"
                    + "La integración por sustitución consiste en facilitar una integral a través de la sustitución de una parte de la\n"
                    + "La integración por cambio de variables consiste en facilitar una integral a través de la sustitución de la parte\n"
                    + "de una integral por una variable elevada o no a un número (se eleva dependiendo si realizar esto simplifica \n"
                    + "de algún modo la integral), tratando de colocarse todo en términos de la variable que substituyo el primer dato,\n"
                    + "incluyendo la dx.\n\n"
                    + "Ejemplo:\n\n"
                    + "∫(2x*(x+1)^(1/2))dx     t^(2)=x+1        t=(x+2)^(1/2)        t^(2)-1=x         dt( 2t) =dx  \n"
                    + "2∫( t^(2)-1)*( t^(2))^(1/2)( 2t)dt=    4∫t^(4)dt- 4∫t^(2)  =    (4/5) t^(5)- (4/3) t^(3)\n\n"
                    + "Sustituyendo 't' tenemos que:\n"
                    + "                                         (4/5) ((x+2)^(1/2)) ^(5)- (4/3) ((x+2)^(1/2)) ^(3)";

        }

        explicacion.setText(Derivada);
    }//GEN-LAST:event_pagina1StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea explicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider pagina1;
    // End of variables declaration//GEN-END:variables
}
