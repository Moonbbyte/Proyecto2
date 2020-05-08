/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brandon
 */
public class Convertidor extends javax.swing.JFrame {

    ListUsuario lu = new ListUsuario();
    private static Object categoria;
    private static Object nombreImag;
    private static Object nombre;
    static int numerousuario;
    static int numerocategoria;
    static int numeroimagenes;
    static int secuencia = 0;

    public Convertidor() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarios = new javax.swing.JComboBox<>();
        categorias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        consola = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        imagenes = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        tipoImag = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Convertidor");
        jLabel1.setOpaque(true);

        usuarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario" }));
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });

        categorias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorias" }));
        categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasActionPerformed(evt);
            }
        });

        jButton1.setText("Encender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("JPEG A BMP Y VICEVERSA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("COPIA JPEG");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ROJO VERDE AZUL SEPIA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("MODIFICAR IMAGEN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("BLANCO Y NEGRO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Ejecutar en Paralelo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Editar en secuencia FIFO");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Editar en secuencia LIFO");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad Procesada:");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Consola de ejecución");
        jLabel3.setOpaque(true);

        consola.setBackground(new java.awt.Color(255, 255, 255));
        consola.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        consola.setForeground(new java.awt.Color(0, 0, 0));
        consola.setOpaque(true);

        jButton11.setText("Cargar usuario ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Cargar Categorias");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        imagenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imagenes" }));

        jToggleButton1.setText("Cargar Imagenes");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cola de Procesamiento:");
        jLabel4.setOpaque(true);

        tipoImag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "jpg", "bmp" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tipoImag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(consola, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jToggleButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(tipoImag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(consola, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariosActionPerformed

    private void categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasActionPerformed
    public void agregarUsuarios() {
        int x = (int) lu.find2(getNombre());
        if (x == 60) {
            lu.add(getNombre());
        }
    }

//////////////////////////////////CAMBIAR TIPOS
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        numeroimagenes = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().getSize();
        HilosFormato Hf[] = new HilosFormato[numeroimagenes];
        String nombreImagen;
        String tipo = tipoImag.getSelectedItem().toString();

        if (secuencia == 0) {
            JOptionPane.showMessageDialog(null, "Escoja modo de procesamiento");
        } else if (secuencia == 1) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                Hf[i] = new HilosFormato(nombreImagen, tipo);
            }

            switch (numeroimagenes) {
                case 1:
                    Hf[0].run();
                    Hf[0].start();
                    break;
                case 2:
                    Hf[0].run();
                    Hf[0].start();
                    Hf[1].run();
                    Hf[1].start();
                    break;
                case 3:
                    Hf[0].run();
                    Hf[0].start();
                    Hf[1].run();
                    Hf[1].start();
                    Hf[2].run();
                    Hf[2].start();

                    break;
                case 4:
                    Hf[0].run();
                    Hf[0].start();
                    Hf[1].run();
                    Hf[1].start();
                    Hf[2].run();
                    Hf[2].start();
                    Hf[3].run();
                    Hf[3].start();
                    break;
                case 5:
                    Hf[0].run();
                    Hf[0].start();
                    Hf[1].run();
                    Hf[1].start();
                    Hf[2].run();
                    Hf[2].start();
                    Hf[3].run();
                    Hf[3].start();
                    Hf[4].run();
                    Hf[4].start();
                    break;

                case 6:
                    Hf[0].run();
                    Hf[0].start();
                    Hf[1].run();
                    Hf[1].start();
                    Hf[2].run();
                    Hf[2].start();
                    Hf[3].run();
                    Hf[3].start();
                    Hf[4].run();
                    Hf[4].start();
                    Hf[5].run();
                    Hf[5].start();
                    break;
                case 7:
                    Hf[0].run();
                    Hf[0].start();
                    Hf[0].run();
                    Hf[1].start();
                    Hf[0].run();
                    Hf[2].start();
                    Hf[0].run();
                    Hf[3].start();
                    Hf[0].run();
                    Hf[4].start();
                    Hf[0].run();
                    Hf[5].start();
                    Hf[0].run();
                    Hf[6].start();
                    Hf[0].run();
                    Hf[7].start();
                case 8:
                    Hf[0].run();
                    Hf[0].start();
                    Hf[1].run();
                    Hf[1].start();
                    Hf[2].run();
                    Hf[2].start();
                    Hf[3].run();
                    Hf[3].start();
                    Hf[4].run();
                    Hf[4].start();
                    Hf[5].run();
                    Hf[5].start();
                    Hf[6].run();
                    Hf[6].start();
                    Hf[7].run();
                    Hf[7].start();
                    Hf[8].run();
                    Hf[8].start();
                    break;
///////////////////////AGREGAR AL ARCHIVO SECUENCIA HILO
                ///////////////imprimir fILE archivo en la consola
            }

            ////////////LIFO
        } else if (secuencia == 2) {
            for (int i = numeroimagenes; i > 0; i--) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i - 1).toString();
                Hf[i - 1] = new HilosFormato(nombreImagen, tipo);
                Hf[i - 1].run();
                Hf[i - 1].start();
            }
            /////////////////AGREGAR AL ARCHIVO SECUENCIA LIFO
            ///////////////imprimir fILE archivo en la consola  
///////////////////////////FIFO
        } else if (secuencia == 3) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                Hf[i] = new HilosFormato(nombreImagen, tipo);
                Hf[i].run();
                Hf[i].start();
            }
            ///////////////imprimir fILE archivo en la consola
        }


    }//GEN-LAST:event_jButton3ActionPerformed
//////////////////////COPIA JPG
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        numeroimagenes = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().getSize();
        String nombreImagen;
        HilosCopia hc[] = new HilosCopia[numeroimagenes];

        if (secuencia == 0) {
            JOptionPane.showMessageDialog(null, "Escoja modo de procesamiento");
        } else if (secuencia == 1) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                hc[i] = new HilosCopia(nombreImagen);
            }
            switch (numeroimagenes) {
                case 1:
                    hc[0].run();
                    hc[0].start();
                    break;
                case 2:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    break;
                case 3:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();

                    break;
                case 4:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    break;
                case 5:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    break;

                case 6:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    hc[5].run();
                    hc[5].start();
                    break;
                case 7:
                    hc[0].run();
                    hc[0].start();
                    hc[0].run();
                    hc[1].start();
                    hc[0].run();
                    hc[2].start();
                    hc[0].run();
                    hc[3].start();
                    hc[0].run();
                    hc[4].start();
                    hc[0].run();
                    hc[5].start();
                    hc[0].run();
                    hc[6].start();
                    hc[0].run();
                    hc[7].start();
                case 8:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    hc[5].run();
                    hc[5].start();
                    hc[6].run();
                    hc[6].start();
                    hc[7].run();
                    hc[7].start();
                    hc[8].run();
                    hc[8].start();
                    break;
            }

        } else if (secuencia == 2) {
            for (int i = numeroimagenes; i > 0; i--) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i - 1).toString();
                hc[i - 1] = new HilosCopia(nombreImagen);
                hc[i - 1].run();
                hc[i - 1].start();
            }
            /////////////////AGREGAR AL ARCHIVO SECUENCIA LIFO
            ///////////////imprimir fILE archivo en la consola  
///////////////////////////FIFO
        } else if (secuencia == 3) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                hc[i] = new HilosCopia(nombreImagen);
                hc[i].run();
                hc[i].start();
            }
            ///////////////imprimir fILE archivo en la consola
        }


    }//GEN-LAST:event_jButton4ActionPerformed
//////////////////COLORESSEPIAROJOAZULVERDE
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        numeroimagenes = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().getSize();
        String nombreImagen;
        HilosColores hc[] = new HilosColores[numeroimagenes];
        JpegImageHandlerColors Hi[] = new JpegImageHandlerColors[numeroimagenes];
        if (secuencia == 0) {
            JOptionPane.showMessageDialog(null, "Escoja modo de procesamiento");
        } else if (secuencia == 1) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                hc[i] = new HilosColores(nombreImagen);
            }
            switch (numeroimagenes) {
                case 1:
                    hc[0].run();
                    hc[0].start();
                    break;
                case 2:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    break;
                case 3:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();

                    break;
                case 4:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    break;
                case 5:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    break;

                case 6:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    hc[5].run();
                    hc[5].start();
                    break;
                case 7:
                    hc[0].run();
                    hc[0].start();
                    hc[0].run();
                    hc[1].start();
                    hc[0].run();
                    hc[2].start();
                    hc[0].run();
                    hc[3].start();
                    hc[0].run();
                    hc[4].start();
                    hc[0].run();
                    hc[5].start();
                    hc[0].run();
                    hc[6].start();
                    hc[0].run();
                    hc[7].start();
                case 8:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    hc[5].run();
                    hc[5].start();
                    hc[6].run();
                    hc[6].start();
                    hc[7].run();
                    hc[7].start();
                    hc[8].run();
                    hc[8].start();
                    break;
            }
        } else if (secuencia == 3) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                Hi[i] = new JpegImageHandlerColors(nombreImagen);
                Hi[i].Todoslosmetodos();
            }

        } else if (secuencia == 2) {
            for (int i = numeroimagenes; i > 0; i--) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i - 1).toString();
                Hi[i - 1] = new JpegImageHandlerColors(nombreImagen);
                Hi[i - 1].Todoslosmetodos();
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed
//////////////////////ROTATOR
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        numeroimagenes = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().getSize();
        String nombreImagen;
        HilosRotator hc[] = new HilosRotator[numeroimagenes];
        JpegImageHandlerRotator Hi[] = new JpegImageHandlerRotator[numeroimagenes];
        if (secuencia == 0) {
            JOptionPane.showMessageDialog(null, "Escoja modo de procesamiento");
        } else if (secuencia == 1) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                hc[i] = new HilosRotator(nombreImagen);
            }
            switch (numeroimagenes) {
                case 1:
                    hc[0].run();
                    hc[0].start();
                    break;
                case 2:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    break;
                case 3:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();

                    break;
                case 4:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    break;
                case 5:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    break;

                case 6:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    hc[5].run();
                    hc[5].start();
                    break;
                case 7:
                    hc[0].run();
                    hc[0].start();
                    hc[0].run();
                    hc[1].start();
                    hc[0].run();
                    hc[2].start();
                    hc[0].run();
                    hc[3].start();
                    hc[0].run();
                    hc[4].start();
                    hc[0].run();
                    hc[5].start();
                    hc[0].run();
                    hc[6].start();
                    hc[0].run();
                    hc[7].start();
                case 8:
                    hc[0].run();
                    hc[0].start();
                    hc[1].run();
                    hc[1].start();
                    hc[2].run();
                    hc[2].start();
                    hc[3].run();
                    hc[3].start();
                    hc[4].run();
                    hc[4].start();
                    hc[5].run();
                    hc[5].start();
                    hc[6].run();
                    hc[6].start();
                    hc[7].run();
                    hc[7].start();
                    hc[8].run();
                    hc[8].start();
                    break;
            }
        } else if (secuencia == 3) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                Hi[i] = new JpegImageHandlerRotator(nombreImagen);
                Hi[i].Todoslosmetodos();
            }

        } else if (secuencia == 2) {
            for (int i = numeroimagenes; i > 0; i--) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i - 1).toString();
                Hi[i - 1] = new JpegImageHandlerRotator(nombreImagen);
                Hi[i - 1].Todoslosmetodos();
            }
        }


    }//GEN-LAST:event_jButton6ActionPerformed
/////////////////////BLANCO Y NEGRO
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    numeroimagenes = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().getSize();
        String nombreImagen;
        HilosBn hc[] = new HilosBn[numeroimagenes];
        JpegImageHandlerBn Hi[] = new JpegImageHandlerBn[numeroimagenes];
        if (secuencia == 0) {
            JOptionPane.showMessageDialog(null, "Escoja modo de procesamiento");
        } else if (secuencia == 1) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                hc[i] = new HilosBn(nombreImagen);
                hc[i].run();
                hc[i].start();
            }} else if (secuencia == 3) {
            for (int i = 0; i < numeroimagenes; i++) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i).toString();
                Hi[i] = new JpegImageHandlerBn(nombreImagen);
                Hi[i].Todoslosmetodos();
            }

        } else if (secuencia == 2) {
            for (int i = numeroimagenes; i > 0; i--) {
                nombreImagen = lu.getNodo(numerousuario).getCategorias().getNodo(numerocategoria).getImagenes().get(i - 1).toString();
                Hi[i - 1] = new JpegImageHandlerBn(nombreImagen);
                Hi[i - 1].Todoslosmetodos();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed
//////////////////////EN PARARELO
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        secuencia = 1;
    }//GEN-LAST:event_jButton8ActionPerformed
////////////////////FIFO
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        secuencia = 3;
    }//GEN-LAST:event_jButton9ActionPerformed
//////////////////////LIFO
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        secuencia = 2;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int indexusuario, indexcategoria, indeximagenes;

        //HAY DOS VECES INDEX DE USUARIO IMAGENES Y CATEGORIAS POR QUE AL AGREGAR ESTOS EL INDEX DEBE DE ACTUALIZARSE
//////AGREGACION DE USUARIO
        indexusuario = (int) (lu.find2(getNombre()));
        if (indexusuario == 60) {
            lu.add(getNombre());
        } else {
        }
        ///////////////AGREGACION DE CATEGORIAS
        indexusuario = (int) (lu.find2(getNombre()));
        numerousuario = indexusuario;
        /////////////////////
        indexcategoria = (int) lu.getNodo(indexusuario).getCategorias().find2(this.getCategoria());
        if (indexcategoria == 60) {
            lu.getNodo(indexusuario).getCategorias().add(this.getCategoria());
        } else {
        }
        indexcategoria = (int) lu.getNodo(indexusuario).getCategorias().find2(this.getCategoria());
        numerocategoria = indexcategoria;
        ////////////////AGREGACION DE IMAGENES
        indeximagenes = (int) lu.getNodo(indexusuario).getCategorias().getNodo(indexcategoria).getImagenes().find2(getNombreImag());
        if (indeximagenes == 60) {
            lu.getNodo(indexusuario).getCategorias().getNodo(indexcategoria).getImagenes().add(getNombreImag());
        } else {
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        usuarios.removeAllItems();

        for (int i = 0; i < lu.getSize(); i++) {
            usuarios.addItem(lu.get(i).toString());
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        categorias.removeAllItems();
        String usuario = usuarios.getSelectedItem().toString();
        int indexusuario = (int) lu.find2(usuario);
        for (int i = 0; i < lu.getNodo(indexusuario).getCategorias().getSize(); i++) {
            categorias.addItem(lu.getNodo(indexusuario).getCategorias().get(i).toString());

        }
    }//GEN-LAST:event_jButton12ActionPerformed
/////////////////cargar al convertidor
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        imagenes.removeAllItems();
        String usuario = usuarios.getSelectedItem().toString();
        String categoria = categorias.getSelectedItem().toString();
        int indexusuario = (int) lu.find2(usuario);
        int indexcategoria = (int) lu.getNodo(indexusuario).getCategorias().find2(categoria);
        for (int i = 0; i < lu.getNodo(indexusuario).getCategorias().getNodo(indexcategoria).getImagenes().getSize(); i++) {
            imagenes.addItem(lu.getNodo(indexusuario).getCategorias().getNodo(indexcategoria).getImagenes().get(i).toString());
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static Object getCategoria() {
        return categoria;
    }

    public static void setCategoria(Object aCategoria) {
        categoria = aCategoria;
    }

    public static Object getNombreImag() {
        return nombreImag;
    }

    public static void setNombreImag(Object aNombreImag) {
        nombreImag = aNombreImag;
    }

    public static Object getNombre() {
        return nombre;
    }

    public static void setNombre(Object aNombre) {
        nombre = aNombre;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categorias;
    private javax.swing.JLabel consola;
    private javax.swing.JComboBox<String> imagenes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> tipoImag;
    private javax.swing.JComboBox<String> usuarios;
    // End of variables declaration//GEN-END:variables
}
