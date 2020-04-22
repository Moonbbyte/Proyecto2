package proyecto_2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

public class Biblioteca extends javax.swing.JFrame implements Serializable {

    private static final long serialVersionUID = 1L;
    BitManager bit = new BitManager();
    BitManager1 bit1 = new BitManager1();
    BitManager2 bit2 = new BitManager2();
    BitManager3 bit3 = new BitManager3();

    private static String usuario1;
    ListaDCircular lc = new ListaDCircular();
    auxlistimag fimag = new auxlistimag();
    ListImag li = new ListImag();
    ListUsuario lu = new ListUsuario();
    static int n = 0;

    public Biblioteca() {

        initComponents();
        this.setLocationRelativeTo(null);
        

    }

    public static String getUsuario1() {
        return usuario1;
    }

    public static void setUsuario1(String Usuario1) {
        usuario1 = Usuario1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        areaImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Imagen = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        cat = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoria = new javax.swing.JTree();
        jButton11 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Usuario");
        usuario.setOpaque(true);

        areaImagen.setBackground(new java.awt.Color(255, 255, 255));
        areaImagen.setOpaque(true);

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cargar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Imagen.setBackground(new java.awt.Color(255, 255, 255));
        Imagen.setForeground(new java.awt.Color(0, 0, 0));

        jButton5.setText("Agregar Imagen");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Categorias:");
        jLabel3.setOpaque(true);

        jButton6.setText("Eliminar Imagen");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Cargar categoria");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        cat.setBackground(new java.awt.Color(255, 255, 255));
        cat.setForeground(new java.awt.Color(0, 0, 0));

        jButton8.setText("Crear Categoria");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Eliminar Categoria");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Encender");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        categoria.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                categoriaComponentRemoved(evt);
            }
        });
        categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoria);

        jButton11.setText("Cargar Imagenes");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("s");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jButton1))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(0, 10, Short.MAX_VALUE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jToggleButton1)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addComponent(areaImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6))
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jButton1)
                                .addGap(156, 156, 156)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addGap(31, 31, 31)
                                .addComponent(jButton11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(areaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addComponent(jButton2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3)))))
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
/////////////////atras
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (n < 0) {
            JOptionPane.showMessageDialog(null, "Ya llego a la primera imagen");
            n = 1;
        } else {
            this.areaImagen.setIcon((ImageIcon) li.get(n--));
        }
    }//GEN-LAST:event_jButton1ActionPerformed
////////////////////adelante
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            this.areaImagen.setIcon((ImageIcon) li.get(n++));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya llego a la ultima imagen");
            n = li.getSize() - 1;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        usuario.setText(lu.get(0).toString());
        
        Object t = lc.find(cat.getText());
        if ((int) t == 60) {
            lc.add(cat.getText());
        }
        if ((int) t == 0) {
            lc.add(cat.getText());
        } else if ((int) t == 50) {
            JOptionPane.showMessageDialog(null, "Ya existe dicha categoria");
        }
    
///no es necesario el size-1 pues la i llegara hasta 3 si el size es 4    /// for (int i = 0; i < lc.getSize(); i++) {
      ///      cat2.addItem(lc.get(i));
        ///}
        
        this.areaImagen.setIcon((ImageIcon)li.get(0));
       
        n=1;
    }//GEN-LAST:event_jButton10ActionPerformed
///////////////////////////CREAR CATEGORIA
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      try{  //////////////////////////agregar elementos al arbol
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoria.getSelectionPath().getLastPathComponent();
         DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(cat.getText());
         selectedNode.add(newNode);
          DefaultTreeModel model = (DefaultTreeModel) categoria.getModel();
          model.reload();
        
       //////////////////////////////////////////////////////////////////// 
        
        
        Object t = lc.find(cat.getText());
        if ((int) t == 60) {
            lc.add(cat.getText());
        }
        if ((int) t == 0) {
            lc.add(cat.getText());
        } else if ((int) t == 50) {
            JOptionPane.showMessageDialog(null, "Ya existe dicha categoria");
        }} catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de seleccionar la categoria donde guardara el archivo");
        }
       
    }//GEN-LAST:event_jButton8ActionPerformed
    public void usuariob(String usuario) {
        Object numero = lu.find(usuario);
        String nombre = usuario;
        if ((int) numero == 50) {
            Biblioteca.setUsuario1(nombre);
        } else {
            JOptionPane.showMessageDialog(null,"Usuario creado");
            lu.add(usuario);
            Biblioteca.setUsuario1(nombre);

        }

    }

/////////////////ELIMINAR CATEGORIA
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoria.getSelectionPath().getLastPathComponent();
        DefaultTreeModel model = (DefaultTreeModel) categoria.getModel();
        model.removeNodeFromParent(selectedNode);
        Object t = lc.find(selectedNode);
        
        
        if ((int) t == 60){
            JOptionPane.showMessageDialog(null, "Lo que se esta tratando de eliminar no es una categoria");
        }
         else if ((int) t == 50) {
           lc.delete(selectedNode);
            
        }


    }//GEN-LAST:event_jButton9ActionPerformed
/////////////////////////CARGAR IMAGEN
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //////////////////////////////////meter imagenes
        
       try{ DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoria.getSelectionPath().getLastPathComponent();
         DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(Imagen.getText());
         selectedNode.add(newNode);
         
          DefaultTreeModel model = (DefaultTreeModel) categoria.getModel();
          model.reload();
        ///////////////////////////////////////////////mostrar imagenes
        
        BufferedImage img = null;
        String t = Imagen.getText();
        
        try {
            img = ImageIO.read(new File("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\Proyect 2\\Proyecto2\\Imagenes\\" + t + ".jpg"));
        } catch (Exception e) {

        }
        /////////////////////////////////////////ESPACIO PARA AGRAGAR AL FICHERO DE NOMBRE DE IMAGENES//////////// para que no se repita
        
        fimag.add(t);
        /////////////////////////////////////////////////////////////////
        ImageIcon n = new ImageIcon(img);
        li.add(n);

        this.areaImagen.setIcon((ImageIcon) li.get(0));} catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Debe de seleccionar la categoria donde guardara el archivo");
        }
    }//GEN-LAST:event_jButton5ActionPerformed
//////////////////////ELIMINAR IMAGENES
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoria.getSelectionPath().getLastPathComponent();
        DefaultTreeModel model = (DefaultTreeModel) categoria.getModel();
        model.removeNodeFromParent(selectedNode);
        
       ////////////////AQUI SOLO LAS ELIMINO DEL PANEL PUES PUEDEN EXISTIR EN OTRAS CATEGORIAS DICHAS IMAGENES 
        
        
    }//GEN-LAST:event_jButton6ActionPerformed
///////////////////////////cargar categoria
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoria.getSelectionPath().getLastPathComponent();
        for(int i=0; i<lc.getSize()-1;i++){
         DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(lc.get(i));
         selectedNode.add(newNode);
        }
     DefaultTreeModel model = (DefaultTreeModel) categoria.getModel();
          model.reload();
        
        
    }//GEN-LAST:event_jButton7ActionPerformed
////////////////GUARDAR EN MEMORIA
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        bit.writeObject(lu);
        bit1.writeObject(lc);
        bit2.writeObject(li);
        bit3.writeObject(fimag);


    }//GEN-LAST:event_jButton4ActionPerformed
////////LEER LA MEMORIA
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ///////////////////usuario
       
        ListUsuario readed = (ListUsuario) bit.readObject();
        for (int i = 0; i < readed.getSize(); i++) {
            lu.add(readed.get(i));
        }
        ListaDCircular cat = (ListaDCircular) bit1.readObject();
        
        System.out.println(cat.getSize());
        for (int i = 0; i < cat.getSize(); i++) {
            lc.add(cat.get(i));
        }
      System.out.println("/////////////////////");
        ListImag img = (ListImag) bit2.readObject();
   
        for (int i = 0; i < img.getSize(); i++) {
            li.add(img.get(i));
        }
        auxlistimag aux = (auxlistimag) bit3.readObject();
      
        for (int i = 0; i < aux.getSize(); i++) {
            fimag.add(aux.get(i));
        }  
    }//GEN-LAST:event_jButton3ActionPerformed
////////////////MOUSE CLICKED
    private void categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaMouseClicked
    /////mostrar imagenes
       // li find n=find
        TreeSelectionModel am= categoria.getSelectionModel();
    if(am.getSelectionCount()>0){
    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoria.getSelectionPath().getLastPathComponent();
        System.out.println(selectedNode.getUserObject().toString());
    
    Object t=fimag.find2(selectedNode.getUserObject());
        System.out.println(t);
       if((int)t!=60 && (int)t!=fimag.getSize()){
        this.areaImagen.setIcon((ImageIcon)li.get((int)t));
        n=(int)t;
        }
               }
    
    
    }//GEN-LAST:event_categoriaMouseClicked

    private void categoriaComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_categoriaComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaComponentRemoved
//////////////////CARGAR IMAGENES
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoria.getSelectionPath().getLastPathComponent();
        for(int i=0; i<fimag.getSize();i++){
         DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(fimag.get(i));
         selectedNode.add(newNode);
        }  
        DefaultTreeModel model = (DefaultTreeModel) categoria.getModel();
          model.reload();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       fimag.Imprimir();
               
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public void Cargarlista() {
    
    usuario.setText(lu.get(0).toString());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Imagen;
    private javax.swing.JLabel areaImagen;
    private javax.swing.JTextField cat;
    private javax.swing.JTree categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
