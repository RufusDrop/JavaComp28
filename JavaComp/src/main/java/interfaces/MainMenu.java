
package interfaces;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;


public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
         this.setLocationRelativeTo(null); //Esta linea se pone para que la ventana salga centrada.
          try {
        javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
        System.err.println("Failed to initialize LaF");
        }

        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getName());
            if ("Flatlaf".equals(info.getName())) {
            System.out.println("Flatlaf look and feel stablished");
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
            }
        }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMainText = new javax.swing.JLabel();
        jPanelCuenta = new javax.swing.JPanel();
        jLabelNombreCuenta = new javax.swing.JLabel();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jButtonCuenta = new javax.swing.JButton();
        jButtonCarrito = new javax.swing.JButton();
        jPanelBusqueda = new javax.swing.JPanel();
        jTextFieldBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMainText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMainText.setText("Buenos días _nombre estas son algunas recomendaciones para ti:");
        jLabelMainText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanelCuenta.setBackground(new java.awt.Color(51, 51, 51));
        jPanelCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNombreCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombreCuenta.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNombreCuenta.setText("Nombre");

        jLabelCorreoElectronico.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCorreoElectronico.setText("Correo electronico");

        jButtonCuenta.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCuenta.setForeground(new java.awt.Color(204, 204, 204));
        jButtonCuenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicol\\OneDrive\\Documentos\\GitHub\\JavaComp28\\JavaComp\\src\\main\\resources\\images\\IconoCuentaAzulMini.png")); // NOI18N
        jButtonCuenta.setText("Cuenta");
        jButtonCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuenta.setIconTextGap(1);
        jButtonCuenta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuentaActionPerformed(evt);
            }
        });

        jButtonCarrito.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCarrito.setForeground(new java.awt.Color(204, 204, 204));
        jButtonCarrito.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicol\\OneDrive\\Documentos\\GitHub\\JavaComp28\\JavaComp\\src\\main\\resources\\images\\CarritoBlancoMini.png")); // NOI18N
        jButtonCarrito.setText("Tu carrito");
        jButtonCarrito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCarrito.setIconTextGap(1);
        jButtonCarrito.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCarrito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCuentaLayout = new javax.swing.GroupLayout(jPanelCuenta);
        jPanelCuenta.setLayout(jPanelCuentaLayout);
        jPanelCuentaLayout.setHorizontalGroup(
            jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuentaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreCuenta)
                    .addComponent(jLabelCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButtonCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCuentaLayout.setVerticalGroup(
            jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombreCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCorreoElectronico))
            .addComponent(jButtonCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelBusqueda.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBusqueda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldBusqueda.setText("jTextField1");
        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBusquedaLayout = new javax.swing.GroupLayout(jPanelBusqueda);
        jPanelBusqueda.setLayout(jPanelBusquedaLayout);
        jPanelBusquedaLayout.setHorizontalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanelBusquedaLayout.setVerticalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabelMainText, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanelCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMainText)
                .addContainerGap(567, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCuentaActionPerformed

    private void jButtonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCarritoActionPerformed

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         try {
        javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
        System.err.println("Failed to initialize LaF");
        }

        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getName());
            if ("Flatlaf".equals(info.getName())) {
            System.out.println("Flatlaf look and feel stablished");
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
            }
        }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarrito;
    private javax.swing.JButton jButtonCuenta;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelMainText;
    private javax.swing.JLabel jLabelNombreCuenta;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelCuenta;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
