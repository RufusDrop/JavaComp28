
package interfaces;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); //Esta linea se pone para que la ventana salga centrada.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordFieldContrasena = new javax.swing.JPasswordField();
        jTextFieldCorreoElectronico = new javax.swing.JTextField();
        jComboBoxAdministradorCliente = new javax.swing.JComboBox<>();
        jButtonRegistrarse = new javax.swing.JButton();
        jLabelTipoDeUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelRegistradoPregunta = new javax.swing.JLabel();
        jLabelLogIn = new javax.swing.JLabel();
        jToggleButtonIniciarSesion = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(203, 203, 203));

        jPasswordFieldContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContrasenaActionPerformed(evt);
            }
        });

        jTextFieldCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoElectronicoActionPerformed(evt);
            }
        });

        jComboBoxAdministradorCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente" }));
        jComboBoxAdministradorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdministradorClienteActionPerformed(evt);
            }
        });

        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

        jLabelTipoDeUsuario.setText("Tipo de usuario");

        jLabel3.setText("Correo electrónico");

        jLabelContrasena.setText("Contraseña");

        jLabelRegistradoPregunta.setForeground(new java.awt.Color(50, 150, 180));
        jLabelRegistradoPregunta.setText("¿Aún no estás registrado?");

        jLabelLogIn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogIn.setForeground(new java.awt.Color(44, 160, 201));
        jLabelLogIn.setText("LOG IN");
        jLabelLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToggleButtonIniciarSesion.setText("Iniciar sesión");
        jToggleButtonIniciarSesion.setToolTipText("Pulse aqui para iniciar sesión");
        jToggleButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTipoDeUsuario)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabelContrasena))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordFieldContrasena)
                                    .addComponent(jTextFieldCorreoElectronico)
                                    .addComponent(jComboBoxAdministradorCliente, 0, 120, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRegistradoPregunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jToggleButtonIniciarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabelLogIn)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelLogIn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoDeUsuario)
                    .addComponent(jComboBoxAdministradorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jToggleButtonIniciarSesion)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistradoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarse))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContrasenaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordFieldContrasenaActionPerformed

    private void jTextFieldCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoElectronicoActionPerformed

    private void jComboBoxAdministradorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdministradorClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdministradorClienteActionPerformed

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        Object tipoDeUsuario;
        tipoDeUsuario = jComboBoxAdministradorCliente.getSelectedItem();
        if(tipoDeUsuario=="Cliente"){
            new Registro(this,true).setVisible(true);
           this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private void jToggleButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonIniciarSesionActionPerformed
        // TODO add your handling code here:
        /**
         * 
         * El for comprueba que la contraseña no tenga espacios en ella
         */
        boolean ContrasenaConEspacios = false;
        for (int i = 0; i <jPasswordFieldContrasena.getPassword().length ; i++) {
            System.out.println(jPasswordFieldContrasena.getPassword()[i]);
            if(jPasswordFieldContrasena.getPassword()[i] == ' ')
            {
              ContrasenaConEspacios = true;
            }
        }
        if(jPasswordFieldContrasena.getPassword().length==0 || jTextFieldCorreoElectronico.getText().isBlank()){  //Se comprueba que los campos esten rellenos
            JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
            if(jTextFieldCorreoElectronico.getText().contains(" ")){
                JOptionPane.showMessageDialog(this, "El correo no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE); //Luego se comprueba que el correo sea correcto
        }
        else
        if(ContrasenaConEspacios){
            JOptionPane.showMessageDialog(this, "La contraseña no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE); //Luego se comprueba la contraseña con la booleana anterior
        }
        
        
    }//GEN-LAST:event_jToggleButtonIniciarSesionActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JComboBox<String> jComboBoxAdministradorCliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelLogIn;
    private javax.swing.JLabel jLabelRegistradoPregunta;
    private javax.swing.JLabel jLabelTipoDeUsuario;
    private javax.swing.JPasswordField jPasswordFieldContrasena;
    private javax.swing.JTextField jTextFieldCorreoElectronico;
    private javax.swing.JToggleButton jToggleButtonIniciarSesion;
    // End of variables declaration//GEN-END:variables
}
