package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Editor extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    static String str;
    FileOutputStream salida;
    static byte[] bytesimag;
    JpgToBmpImage Jtb = new JpgToBmpImage("x");
    BmptoJpegImage Btj = new BmptoJpegImage("x");
/**
 * Constructor del Editor, permite la inicializacion del Jframe Editor y lo posiciona en el centro
 **/
    public Editor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(236, 322));
        setMinimumSize(new java.awt.Dimension(234, 320));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EDITOR");
        jLabel1.setOpaque(true);

        jButton1.setText("JPEG A BMP Y VICEVERSA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("COPIA JPEG");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ROJO VERDE AZUL SEPIA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("MODIFICAR IMAGEN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("BLANCO Y NEGRO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(27, Short.MAX_VALUE))
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
/**
 * Boton con el cual se puede agregar imagenes al editor
 **/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JpgToBmpImage cargar = new JpgToBmpImage("x");

        if (seleccionado.showDialog(this, "Abrir archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {

                if (archivo.getName().endsWith("jpg")) {
                    try {

                        Jtb.setArchivo(archivo);
                        Jtb.readFile();
                        bytesimag = Jtb.img;

                    } catch (Exception e) {
                    }

                } else if (archivo.getName().endsWith("bmp")) {
                    try {

                        Btj.setArchivo(archivo);
                        Btj.readFile();
                        bytesimag = Btj.img;

                    } catch (Exception e) {
                    }

                }

            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed
/**
 *Boton para  cambiar el formato de las imagenes
 **/
////////////////////////CONVERTIR IMAGEN
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.str = archivo.getName();
        try {
            if (str.endsWith("jpg")) {
                System.out.println(str);
                
                Jtb.setNombre(this.str.substring(0, str.length() - 4));
                Jtb.generateFiles();
            } else if (str.endsWith("bmp")) {
                System.out.println(str);
               
                Btj.setNombre(this.str.substring(0, str.length() - 4));
                Btj.generateFiles();
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Boton para realizar una copia jpg de una imagen
 **/
/////////////////////////////COPIAR IMAGEN JPG
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.str = archivo.getName();
        try {
            ///////////////PRIMER PASO CONVERTIR A BMP UNA IMAGEN JPG

            if (str.endsWith("jpg")) {
                System.out.println(str);
               
                Jtb.setNombre(this.str.substring(0, str.length() - 4));
                Jtb.generateFiles();
                ////////////////////////////////////SEGUNDO PASO REALIZAR UNA COPIA DE UN BMP
                BmpHandlerCopy Bcopy = new BmpHandlerCopy(str.substring(0, str.length() - 4));
                Bcopy.readFile();
                Bcopy.generateFiles();
                /////////////////////////////TERCER PASO CONVERTIR LA COPIA DE BMP A JPG
                JpegImageCopy Jcopy = new JpegImageCopy(str.substring(0, str.length() - 4));
                Jcopy.readFile();
                Jcopy.generateFiles();

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * Boton para la edicion en rojo, verde, azul y sepia de una imagen.
 **/
/////////////////////////ROJO, VERDE, AZUL Y SEPIA
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
       this.str=archivo.getName();
        try {
            ///////////PRIMER PASO CONVERTIR A BMP EL ARCHIVO 
        JpegImageHandlerColors Jc= new JpegImageHandlerColors(str.substring(0, str.length()-4));   
        Jc.readFile();
        Jc.generateFiles();
        ////////////////////////SEPIA
        Jc.sepia();
        Jc.green();
        Jc.red();
        Jc.blue();
        Jc.pasarBmpajpg();
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton4ActionPerformed
/**
 * Boton para pasar las imagenes a blanco y negro.
 **/
/////////////////BLANCO Y NEGRO
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      this.str=archivo.getName();
        try {
            ///////////PRIMER PASO CONVERTIR A BMP EL ARCHIVO 
        JpegImageHandlerBn Bn= new JpegImageHandlerBn(str.substring(0, str.length()-4));   
        Bn.readFile();
        Bn.generateFiles();
        ////////////////////////SEPIA
       Bn.BN();
       Bn.convertirjpg();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed
/**
 * Boton para rotar imagenes.
 **/
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.str=archivo.getName();
        try{
        JpegImageHandlerRotator Jr = new  JpegImageHandlerRotator(str.substring(0, str.length()-4));
        Jr.readFile();
        Jr.generateFiles();
        Jr.rotarhorizontal();
        Jr.rotarvertical();
        Jr.pasaraJpg();
        }catch(Exception e){
            System.out.println(e);}
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
