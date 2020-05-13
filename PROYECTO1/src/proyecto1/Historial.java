package proyecto1;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Historial extends javax.swing.JFrame {

    DefaultListModel modelolista;
    String resultado,orden;
    
    

    public static String Historial[] = new String[20];
    static int x = -1;

    public Historial() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelolista = new DefaultListModel();
        historial.setModel(modelolista);

    }

    public static void RellenoMatriz(String valor) {
     x++;
    if(x!=20){
    Historial[x] = valor;
    }else{
    for(int i=0; i<17;i++){
    Historial[i]=Historial[i+1];
    }
    x=19;
    Historial[19]=valor;
    
    }    
    }

    public void Mostrarlista() {
        modelolista.addElement(Historial[0]);
        modelolista.addElement(Historial[1]);
        modelolista.addElement(Historial[2]);
        modelolista.addElement(Historial[3]);
        modelolista.addElement(Historial[4]);
        modelolista.addElement(Historial[5]);
        modelolista.addElement(Historial[6]);
        modelolista.addElement(Historial[7]);
        modelolista.addElement(Historial[8]);
        modelolista.addElement(Historial[9]);
        modelolista.addElement(Historial[10]);
        modelolista.addElement(Historial[11]);
        modelolista.addElement(Historial[12]);
        modelolista.addElement(Historial[13]);
        modelolista.addElement(Historial[14]);
        modelolista.addElement(Historial[15]);
        modelolista.addElement(Historial[16]);
        modelolista.addElement(Historial[17]);
        modelolista.addElement(Historial[18]);
        modelolista.addElement(Historial[19]);
        modelolista.addElement("------------------------------------------------- ");
       

    }
    
    public static void Rellenadofull(){
   
    
    }
    
    
    

    public void Ordenamientoresultado() {
        String temp;
        for (int i = 1; i < Historial.length; i++) {
            for (int j = 0; i < Historial.length - 1; j++) {
                if (Double.parseDouble(Historial[j].substring(0,3)) > Double.parseDouble(Historial[j + 1].substring(0,3))) {
                    temp = Historial[j];
                    Historial[j] = Historial[j + 1];
                    Historial[j + 1] = temp;
                }

            }

        }

    }

    public void Ordenamientofecha(String Historial[]) {
        Double temp;
        for (int i = 1; i < Historial.length; i++) {
            for (int j = 0; i < Historial.length - 1; j++) {
                if (Double.parseDouble(Historial[j]) > Double.parseDouble(Historial[j + 1])) {
                    temp = Double.parseDouble(Historial[j]);
                    Historial[j] = Historial[j + 1];
                    Historial[j + 1] = temp.toString();
                }

            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historial = new javax.swing.JList();
        eliminar = new javax.swing.JButton();
        ordenar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Historial:");

        jScrollPane1.setViewportView(historial);

        eliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        ordenar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ordenar1.setText("Mostrar Historial");
        ordenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ordenar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminar)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(ordenar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
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
//////////////////////MOSTRAR HISTORIAL
    private void ordenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar1ActionPerformed
       int elitodo=historial.getSelectedIndex();
       modelolista.removeAllElements();
        
        Mostrarlista();

    }//GEN-LAST:event_ordenar1ActionPerformed
///////////////////////Eliminar
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
     try{ int eli=historial.getSelectedIndex();
      modelolista.remove(eli);}catch(Exception e){
      JOptionPane.showMessageDialog(null, "Debe de seleccionar la casilla que desea eliminar o el historial esta vacio");
      
      }
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JList historial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ordenar1;
    // End of variables declaration//GEN-END:variables
}
