/**
 * FormRegistros.java
 *
 * Clase creada el 3 de diciembre de 2023
 *
 */
package gui;

import util.Control;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 * Esta clase es un frame base para hacer los registros CRUD de las entidades
 *
 * @author Fabricio Aldaco Aguilera 0000235101
 *
 */
public class FormRegistros extends javax.swing.JFrame {

    Control control;

    /**
     * Creates new form FormRegistros
     */
    public FormRegistros() {

        control = Control.getInstance();
        setUndecorated(true);
        initComponents();

        // Iconos ic = Iconos.getInstance();
        //Image imagen = new ImageIcon(getClass().getResource("/principal1.png")).getImage();
        //  ic.iconos(imagen, this);
        getContentPane().setBackground(Color.WHITE);
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice gd = ge.getDefaultScreenDevice();
//        gd.setFullScreenWindow(this);
        setExtendedState(FormRegistros.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnProductora = new javax.swing.JButton();
        txtTransportadora = new javax.swing.JLabel();
        txtTranslado = new javax.swing.JLabel();
        txtProductora = new javax.swing.JLabel();
        txtBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTransportadora = new javax.swing.JButton();
        btnTranslado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTransportadora1 = new javax.swing.JLabel();
        btnTransportadora1 = new javax.swing.JButton();
        txtProductora1 = new javax.swing.JLabel();
        asdasdasdasd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setSize(this.getSize());
        jPanel1.setPreferredSize(this.getSize());

        btnProductora.setBackground(new java.awt.Color(244, 244, 244));
        btnProductora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnProductora.setText("Empresa Productora");
        btnProductora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductora.setMargin(new java.awt.Insets(10, 10, 10, 10));
        btnProductora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoraActionPerformed(evt);
            }
        });

        txtTransportadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t1.png"))); // NOI18N
        txtTransportadora.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtTransportadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTransportadora.setPreferredSize(new java.awt.Dimension(289, 205));
        txtTransportadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTransportadoraMouseClicked(evt);
            }
        });

        txtTranslado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t1t.png"))); // NOI18N
        txtTranslado.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtTranslado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTranslado.setPreferredSize(new java.awt.Dimension(289, 205));
        txtTranslado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTransladoMouseClicked(evt);
            }
        });

        txtProductora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1.png"))); // NOI18N
        txtProductora.setAlignmentX(1.0F);
        txtProductora.setAlignmentY(1.0F);
        txtProductora.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtProductora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtProductora.setPreferredSize(new java.awt.Dimension(289, 205));
        txtProductora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProductoraMouseClicked(evt);
            }
        });
        //labelfert.setBorder(BorderFactory.createCompoundBorder(
            //new MatteBorder(2, 2, 2, 2, Color.RED),
            //BorderFactory.createEmptyBorder(10, 10, 0, 0)));

    txtBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/holaa.png"))); // NOI18N
    txtBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    txtBack.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtBackMouseClicked(evt);
        }
    });

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeRegg-5.png"))); // NOI18N
    jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel1MouseClicked(evt);
        }
    });

    btnTransportadora.setBackground(new java.awt.Color(244, 244, 244));
    btnTransportadora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnTransportadora.setText("Empresa de Transportes");
    btnTransportadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnTransportadora.setMargin(new java.awt.Insets(10, 10, 10, 10));
    btnTransportadora.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTransportadoraActionPerformed(evt);
        }
    });

    btnTranslado.setBackground(new java.awt.Color(244, 244, 244));
    btnTranslado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnTranslado.setText("Registrar Translado Completo");
    btnTranslado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnTranslado.setMargin(new java.awt.Insets(10, 10, 10, 10));
    btnTranslado.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTransladoActionPerformed(evt);
        }
    });

    jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    txtTransportadora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.png"))); // NOI18N
    txtTransportadora1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    txtTransportadora1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    txtTransportadora1.setPreferredSize(new java.awt.Dimension(289, 205));
    txtTransportadora1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtTransportadora1MouseClicked(evt);
        }
    });

    btnTransportadora1.setBackground(new java.awt.Color(244, 244, 244));
    btnTransportadora1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnTransportadora1.setText("Residuos");
    btnTransportadora1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnTransportadora1.setMargin(new java.awt.Insets(10, 10, 10, 10));
    btnTransportadora1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTransportadora1ActionPerformed(evt);
        }
    });

    txtProductora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssd.png"))); // NOI18N
    txtProductora1.setAlignmentX(1.0F);
    txtProductora1.setAlignmentY(1.0F);
    txtProductora1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    txtProductora1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    txtProductora1.setPreferredSize(new java.awt.Dimension(289, 205));
    txtProductora1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            txtProductora1MouseClicked(evt);
        }
    });
    //labelfert.setBorder(BorderFactory.createCompoundBorder(
        //new MatteBorder(2, 2, 2, 2, Color.RED),
        //BorderFactory.createEmptyBorder(10, 10, 0, 0)));

asdasdasdasd.setBackground(new java.awt.Color(244, 244, 244));
asdasdasdasd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
asdasdasdasd.setText("Registrar vehiculos");
asdasdasdasd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
asdasdasdasd.setMargin(new java.awt.Insets(10, 10, 10, 10));
asdasdasdasd.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        asdasdasdasdActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(txtProductora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(btnProductora, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtTranslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(txtProductora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(asdasdasdasd, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(txtTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtBack)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addGap(29, 29, 29))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(btnTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(192, 192, 192))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txtTransportadora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(107, 107, 107)
            .addComponent(btnTranslado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTransportadora1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(193, 193, 193))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtProductora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProductora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnProductora)
                                    .addComponent(asdasdasdasd))
                                .addComponent(btnTransportadora))))
                    .addGap(40, 40, 40)
                    .addComponent(txtTranslado, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtTransportadora1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnTranslado)
                .addComponent(btnTransportadora1))
            .addContainerGap(88, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
 private JFrame getFrame() {
        return this;
    }
    private void btnTransportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportadoraActionPerformed
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarEmpresaTransportadora(getFrame());
                return null;
            }
        };

        worker.execute();
    }//GEN-LAST:event_btnTransportadoraActionPerformed

    private void btnProductoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoraActionPerformed

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarEmpresaProductora(getFrame());
                return null;
            }
        };

        worker.execute();

    }//GEN-LAST:event_btnProductoraActionPerformed

    private void txtTransportadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransportadoraMouseClicked
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarEmpresaTransportadora(getFrame());
                return null;
            }
        };

        worker.execute();

    }//GEN-LAST:event_txtTransportadoraMouseClicked

    private void txtTransladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransladoMouseClicked
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarTranslado(getFrame());

                return null;
            }
        };

        worker.execute();

    }//GEN-LAST:event_txtTransladoMouseClicked

    private void txtProductoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductoraMouseClicked
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarEmpresaProductora(getFrame());

                return null;
            }
        };

        worker.execute();
    }//GEN-LAST:event_txtProductoraMouseClicked

    private void txtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtBackMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnTransladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransladoActionPerformed
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarTranslado(getFrame());

                return null;
            }
        };

        worker.execute();
    }//GEN-LAST:event_btnTransladoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void txtTransportadora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTransportadora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransportadora1MouseClicked

    private void btnTransportadora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportadora1ActionPerformed

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarResiduo(getFrame());

                return null;
            }
        };

        worker.execute();


    }//GEN-LAST:event_btnTransportadora1ActionPerformed

    private void txtProductora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductora1MouseClicked

    private void asdasdasdasdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asdasdasdasdActionPerformed
        control.registrarVehiculos(getFrame());

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                control.registrarVehiculos(getFrame());

                return null;
            }
        };

        worker.execute();

    }//GEN-LAST:event_asdasdasdasdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asdasdasdasd;
    private javax.swing.JButton btnProductora;
    private javax.swing.JButton btnTranslado;
    private javax.swing.JButton btnTransportadora;
    private javax.swing.JButton btnTransportadora1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBack;
    private javax.swing.JLabel txtProductora;
    private javax.swing.JLabel txtProductora1;
    private javax.swing.JLabel txtTranslado;
    private javax.swing.JLabel txtTransportadora;
    private javax.swing.JLabel txtTransportadora1;
    // End of variables declaration//GEN-END:variables
}
