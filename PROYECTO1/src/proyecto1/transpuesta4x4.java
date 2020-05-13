package proyecto1;

public class transpuesta4x4 extends javax.swing.JFrame {

    Double x11, x12, x13, x14, x21, x22, x23, x24, x31, x32, x33, x34, x41, x42, x43, x44;

    public transpuesta4x4() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nombreoperacion = new javax.swing.JLabel();
        y11 = new javax.swing.JTextField();
        y12 = new javax.swing.JTextField();
        y22 = new javax.swing.JTextField();
        y21 = new javax.swing.JTextField();
        y31 = new javax.swing.JTextField();
        y32 = new javax.swing.JTextField();
        y41 = new javax.swing.JTextField();
        y42 = new javax.swing.JTextField();
        y43 = new javax.swing.JTextField();
        y33 = new javax.swing.JTextField();
        y23 = new javax.swing.JTextField();
        y14 = new javax.swing.JTextField();
        y24 = new javax.swing.JTextField();
        y13 = new javax.swing.JTextField();
        y34 = new javax.swing.JTextField();
        y44 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        r11 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        r14 = new javax.swing.JLabel();
        r24 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        r31 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        r33 = new javax.swing.JLabel();
        r34 = new javax.swing.JLabel();
        r44 = new javax.swing.JLabel();
        r43 = new javax.swing.JLabel();
        r42 = new javax.swing.JLabel();
        r41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nombreoperacion.setBackground(new java.awt.Color(255, 255, 255));
        Nombreoperacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Nombreoperacion.setText("Transpuesta :");
        Nombreoperacion.setOpaque(true);

        y11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y11ActionPerformed(evt);
            }
        });

        y12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y12ActionPerformed(evt);
            }
        });

        y22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y22ActionPerformed(evt);
            }
        });

        y21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y21ActionPerformed(evt);
            }
        });

        y31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y31ActionPerformed(evt);
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

        y42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y42ActionPerformed(evt);
            }
        });

        y43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y43ActionPerformed(evt);
            }
        });

        y33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y33ActionPerformed(evt);
            }
        });

        y23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y23ActionPerformed(evt);
            }
        });

        y14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y14ActionPerformed(evt);
            }
        });

        y24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y24ActionPerformed(evt);
            }
        });

        y13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y13ActionPerformed(evt);
            }
        });

        y34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y34ActionPerformed(evt);
            }
        });

        y44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        y44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y44ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        r11.setBackground(new java.awt.Color(255, 255, 255));
        r11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r11.setOpaque(true);

        r12.setBackground(new java.awt.Color(255, 255, 255));
        r12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r12.setOpaque(true);

        r13.setBackground(new java.awt.Color(255, 255, 255));
        r13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r13.setOpaque(true);

        r14.setBackground(new java.awt.Color(255, 255, 255));
        r14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r14.setOpaque(true);

        r24.setBackground(new java.awt.Color(255, 255, 255));
        r24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r24.setOpaque(true);

        r23.setBackground(new java.awt.Color(255, 255, 255));
        r23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r23.setOpaque(true);

        r22.setBackground(new java.awt.Color(255, 255, 255));
        r22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r22.setOpaque(true);

        r21.setBackground(new java.awt.Color(255, 255, 255));
        r21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r21.setOpaque(true);

        r31.setBackground(new java.awt.Color(255, 255, 255));
        r31.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r31.setOpaque(true);

        r32.setBackground(new java.awt.Color(255, 255, 255));
        r32.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r32.setOpaque(true);

        r33.setBackground(new java.awt.Color(255, 255, 255));
        r33.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r33.setOpaque(true);

        r34.setBackground(new java.awt.Color(255, 255, 255));
        r34.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r34.setOpaque(true);

        r44.setBackground(new java.awt.Color(255, 255, 255));
        r44.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r44.setOpaque(true);

        r43.setBackground(new java.awt.Color(255, 255, 255));
        r43.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r43.setOpaque(true);

        r42.setBackground(new java.awt.Color(255, 255, 255));
        r42.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r42.setOpaque(true);

        r41.setBackground(new java.awt.Color(255, 255, 255));
        r41.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r41.setOpaque(true);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                        .addComponent(r24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nombreoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(r12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(y44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(r42, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r43, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void y11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y11ActionPerformed

    private void y12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y12ActionPerformed

    private void y22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y22ActionPerformed

    private void y21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y21ActionPerformed

    private void y31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y31ActionPerformed

    private void y32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y32ActionPerformed

    private void y41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y41ActionPerformed

    private void y42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y42ActionPerformed

    private void y43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y43ActionPerformed

    private void y33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y33ActionPerformed

    private void y23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y23ActionPerformed

    private void y14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y14ActionPerformed

    private void y24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y24ActionPerformed

    private void y13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y13ActionPerformed

    private void y34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y34ActionPerformed

    private void y44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y44ActionPerformed
////////CALCULAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        x11 = Double.parseDouble(y11.getText());
        x12 = Double.parseDouble(y12.getText());
        x13 = Double.parseDouble(y13.getText());
        x14 = Double.parseDouble(y14.getText());
        x21 = Double.parseDouble(y21.getText());
        x22 = Double.parseDouble(y22.getText());
        x23 = Double.parseDouble(y23.getText());
        x24 = Double.parseDouble(y24.getText());
        x31 = Double.parseDouble(y31.getText());
        x32 = Double.parseDouble(y32.getText());
        x33 = Double.parseDouble(y33.getText());
        x34 = Double.parseDouble(y34.getText());
        x41 = Double.parseDouble(y41.getText());
        x42 = Double.parseDouble(y42.getText());
        x43 = Double.parseDouble(y43.getText());
        x44 = Double.parseDouble(y44.getText());

        r11.setText(x11.toString());
        r12.setText(x21.toString());
        r13.setText(x31.toString());
        r14.setText(x41.toString());
        r21.setText(x12.toString());
        r22.setText(x22.toString());
        r23.setText(x32.toString());
        r24.setText(x42.toString());
        r31.setText(x13.toString());
        r32.setText(x23.toString());
        r33.setText(x33.toString());
        r34.setText(x43.toString());
        r41.setText(x14.toString());
        r42.setText(x24.toString());
        r43.setText(x34.toString());
        r44.setText(x44.toString());

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombreoperacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
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
