package proyecto1;

import javax.swing.JOptionPane;

public class potencia4x4 extends javax.swing.JFrame {

    Double x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44;
    Double w11, w12, w13, w14, w21, w22, w23, w24, w31, w32, w33, w34, w41, w42, w43, w44;
    Double potencia;
    Double z11[] = new Double[30];
    Double z13[] = new Double[30];
    Double z12[] = new Double[30];
    Double z14[] = new Double[30];
    Double z21[] = new Double[30];
    Double z22[] = new Double[30];
    Double z23[] = new Double[30];
    Double z24[] = new Double[30];
    Double z31[] = new Double[30];
    Double z32[] = new Double[30];
    Double z33[] = new Double[30];
    Double z34[] = new Double[30];
    Double z41[] = new Double[30];
    Double z43[] = new Double[30];
    Double z42[] = new Double[30];
    Double z44[] = new Double[30];

    public potencia4x4() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        r44 = new javax.swing.JLabel();
        r43 = new javax.swing.JLabel();
        r33 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        r34 = new javax.swing.JLabel();
        r24 = new javax.swing.JLabel();
        r14 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        r11 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        r31 = new javax.swing.JLabel();
        r41 = new javax.swing.JLabel();
        r42 = new javax.swing.JLabel();
        y44 = new javax.swing.JTextField();
        y34 = new javax.swing.JTextField();
        y24 = new javax.swing.JTextField();
        y14 = new javax.swing.JTextField();
        y13 = new javax.swing.JTextField();
        y23 = new javax.swing.JTextField();
        y33 = new javax.swing.JTextField();
        y43 = new javax.swing.JTextField();
        y42 = new javax.swing.JTextField();
        y32 = new javax.swing.JTextField();
        y41 = new javax.swing.JTextField();
        y31 = new javax.swing.JTextField();
        y21 = new javax.swing.JTextField();
        y22 = new javax.swing.JTextField();
        y12 = new javax.swing.JTextField();
        y11 = new javax.swing.JTextField();
        Nombreoperacion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nombreoperacion1 = new javax.swing.JLabel();
        potencia1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        r44.setBackground(new java.awt.Color(255, 255, 255));
        r44.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r44.setOpaque(true);

        r43.setBackground(new java.awt.Color(255, 255, 255));
        r43.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r43.setOpaque(true);

        r33.setBackground(new java.awt.Color(255, 255, 255));
        r33.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r33.setOpaque(true);

        r32.setBackground(new java.awt.Color(255, 255, 255));
        r32.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r32.setOpaque(true);

        r22.setBackground(new java.awt.Color(255, 255, 255));
        r22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r22.setOpaque(true);

        r23.setBackground(new java.awt.Color(255, 255, 255));
        r23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r23.setOpaque(true);

        r34.setBackground(new java.awt.Color(255, 255, 255));
        r34.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r34.setOpaque(true);

        r24.setBackground(new java.awt.Color(255, 255, 255));
        r24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r24.setOpaque(true);

        r14.setBackground(new java.awt.Color(255, 255, 255));
        r14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r14.setOpaque(true);

        r13.setBackground(new java.awt.Color(255, 255, 255));
        r13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r13.setOpaque(true);

        r12.setBackground(new java.awt.Color(255, 255, 255));
        r12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r12.setOpaque(true);

        r11.setBackground(new java.awt.Color(255, 255, 255));
        r11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r11.setOpaque(true);

        r21.setBackground(new java.awt.Color(255, 255, 255));
        r21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r21.setOpaque(true);

        r31.setBackground(new java.awt.Color(255, 255, 255));
        r31.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r31.setOpaque(true);

        r41.setBackground(new java.awt.Color(255, 255, 255));
        r41.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r41.setOpaque(true);

        r42.setBackground(new java.awt.Color(255, 255, 255));
        r42.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r42.setOpaque(true);

        y44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y44ActionPerformed(evt);
            }
        });

        y34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y34ActionPerformed(evt);
            }
        });

        y24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y24ActionPerformed(evt);
            }
        });

        y14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y14ActionPerformed(evt);
            }
        });

        y13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y13ActionPerformed(evt);
            }
        });

        y23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y23ActionPerformed(evt);
            }
        });

        y33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y33ActionPerformed(evt);
            }
        });

        y43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y43ActionPerformed(evt);
            }
        });

        y42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y42ActionPerformed(evt);
            }
        });

        y32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y32ActionPerformed(evt);
            }
        });

        y41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y41ActionPerformed(evt);
            }
        });

        y31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y31ActionPerformed(evt);
            }
        });

        y21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y21ActionPerformed(evt);
            }
        });

        y22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y22ActionPerformed(evt);
            }
        });

        y12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y12ActionPerformed(evt);
            }
        });

        y11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y11ActionPerformed(evt);
            }
        });

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Potencia:");
        Nombreoperacion.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Nombreoperacion1.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion1.setText("Potencia a la:");
        Nombreoperacion1.setOpaque(true);

        potencia1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        potencia1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        potencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(y41, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y42, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(y21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(y31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(y43, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(y23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(y33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4))))
                    .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(r34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nombreoperacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(r14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombreoperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y43, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void y44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y44ActionPerformed

    private void y34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y34ActionPerformed

    private void y24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y24ActionPerformed

    private void y14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y14ActionPerformed

    private void y13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y13ActionPerformed

    private void y23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y23ActionPerformed

    private void y33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y33ActionPerformed

    private void y43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y43ActionPerformed

    private void y42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y42ActionPerformed

    private void y32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y32ActionPerformed

    private void y41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y41ActionPerformed

    private void y31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y31ActionPerformed

    private void y21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y21ActionPerformed

    private void y22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y22ActionPerformed

    private void y12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y12ActionPerformed

    private void y11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
        int p = Integer.parseInt(potencia1.getText());
        potencia = Double.parseDouble(potencia1.getText());
        w11 = Double.parseDouble(y11.getText());
        w12 = Double.parseDouble(y12.getText());
        w13 = Double.parseDouble(y13.getText());
        w14 = Double.parseDouble(y14.getText());
        w21 = Double.parseDouble(y21.getText());
        w22 = Double.parseDouble(y22.getText());
        w23 = Double.parseDouble(y23.getText());
        w24 = Double.parseDouble(y24.getText());
        w31 = Double.parseDouble(y31.getText());
        w32 = Double.parseDouble(y32.getText());
        w33 = Double.parseDouble(y33.getText());
        w34 = Double.parseDouble(y34.getText());
        w41 = Double.parseDouble(y41.getText());
        w42 = Double.parseDouble(y42.getText());
        w43 = Double.parseDouble(y43.getText());
        w44 = Double.parseDouble(y44.getText());
        z11[0] = w11;
        z13[0] = w13;
        z12[0] = w12;
        z14[0] = w14;
        z21[0] = w21;
        z22[0] = w22;
        z23[0] = w23;
        z24[0] = w24;
        z31[0] = w31;
        z32[0] = w32;
        z33[0] = w33;
        z34[0] = w34;
        z41[0] = w41;
        z43[0] = w43;
        z42[0] = w42;
        z44[0] = w44;

        if (potencia == 1.0) {
        r11.setText(w11.toString());
        r12.setText(w12.toString());
        r13.setText(w13.toString());
        r14.setText(w14.toString());
        r21.setText(w21.toString());
        r22.setText(w22.toString());
        r23.setText(w23.toString());
        r24.setText(w24.toString());
        r31.setText(w31.toString());
        r32.setText(w32.toString());
        r33.setText(w33.toString());
        r34.setText(w34.toString());
        r41.setText(w41.toString());
        r42.setText(w42.toString());
        r43.setText(w43.toString());
        r44.setText(w44.toString());

        } else if (potencia > 1.0) {
            for (int i = 0; i < potencia - 1; i++) {
                z11[i + 1] = z11[i] * w11 + z12[i] * w21 + z13[i] * w31 + z14[i] * w41;
                z12[i + 1] = z11[i] * w12 + z12[i] * w22 + z13[i] * w32 + z14[i] * w42;
                z13[i + 1] = z11[i] * w13 + z12[i] * w23 + z13[i] * w33 + z14[i] * w43;
                z14[i + 1] = z11[i] * w14 + z12[i] * w24 + z13[i] * w34 + z14[i] * w44;
                z21[i + 1] = z21[i] * w11 + z22[i] * w21 + z23[i] * w31 + z24[i] * w41;
                z22[i + 1] = z21[i] * w12 + z22[i] * w22 + z23[i] * w32 + z24[i] * w42;
                z23[i + 1] = z21[i] * w13 + z22[i] * w23 + z23[i] * w33 + z24[i] * w43;
                z24[i + 1] = z21[i] * w14 + z22[i] * w24 + z23[i] * w34 + z24[i] * w44;
                z31[i + 1] = z31[i] * w11 + z32[i] * w21 + z33[i] * w31 + z34[i] * w41;
                z32[i + 1] = z31[i] * w12 + z32[i] * w22 + z33[i] * w32 + z34[i] * w42;
                z33[i + 1] = z31[i] * w13 + z32[i] * w23 + z33[i] * w33 + z34[i] * w43;
                z34[i + 1] = z31[i] * w14 + z32[i] * w24 + z33[i] * w34 + z34[i] * w44;
                z41[i + 1] = z41[i] * w11 + z42[i] * w21 + z43[i] * w31 + z44[i] * w41;
                z42[i + 1] = z41[i] * w12 + z42[i] * w22 + z43[i] * w32 + z44[i] * w42;
                z43[i + 1] = z41[i] * w13 + z42[i] * w23 + z43[i] * w33 + z44[i] * w43;
                z44[i + 1] = z41[i] * w14 + z42[i] * w24 + z43[i] * w34 + z44[i] * w44;
            }
            
        r11.setText(z11[p-1].toString());
        r12.setText(z12[p-1].toString());
        r13.setText(z13[p-1].toString());
        r14.setText(z14[p-1].toString());
        r21.setText(z21[p-1].toString());
        r22.setText(z22[p-1].toString());
        r23.setText(z23[p-1].toString());
        r24.setText(z24[p-1].toString());
        r31.setText(z31[p-1].toString());
        r32.setText(z32[p-1].toString());
        r33.setText(z33[p-1].toString());
        r34.setText(z34[p-1].toString());
        r41.setText(z41[p-1].toString());
        r42.setText(z42[p-1].toString());
        r43.setText(z43[p-1].toString());
        r44.setText(z44[p-1].toString());
        } }catch(Exception e){JOptionPane.showMessageDialog(null, "Se deben de llenar todas las casillas para empezar el calculo");

}

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void potencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potencia1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombreoperacion;
    private javax.swing.JLabel Nombreoperacion1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField potencia1;
    private javax.swing.JLabel r11;
    private javax.swing.JLabel r12;
    private javax.swing.JLabel r13;
    private javax.swing.JLabel r14;
    private javax.swing.JLabel r21;
    private javax.swing.JLabel r22;
    private javax.swing.JLabel r23;
    private javax.swing.JLabel r24;
    private javax.swing.JLabel r31;
    private javax.swing.JLabel r32;
    private javax.swing.JLabel r33;
    private javax.swing.JLabel r34;
    private javax.swing.JLabel r41;
    private javax.swing.JLabel r42;
    private javax.swing.JLabel r43;
    private javax.swing.JLabel r44;
    private javax.swing.JTextField y11;
    private javax.swing.JTextField y12;
    private javax.swing.JTextField y13;
    private javax.swing.JTextField y14;
    private javax.swing.JTextField y21;
    private javax.swing.JTextField y22;
    private javax.swing.JTextField y23;
    private javax.swing.JTextField y24;
    private javax.swing.JTextField y31;
    private javax.swing.JTextField y32;
    private javax.swing.JTextField y33;
    private javax.swing.JTextField y34;
    private javax.swing.JTextField y41;
    private javax.swing.JTextField y42;
    private javax.swing.JTextField y43;
    private javax.swing.JTextField y44;
    // End of variables declaration//GEN-END:variables
}
