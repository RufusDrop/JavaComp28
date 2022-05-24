
package interfaces;

import classes.ClienteEmpresa;
import classes.ClienteParticular;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import java.io.*;
public class Login extends javax.swing.JFrame {

        /**
         * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); //Esta linea se pone para que la ventana salga centrada.
          try {
        javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
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

        jPasswordFieldContrasena = new javax.swing.JPasswordField();
        jTextFieldCorreoElectronico = new javax.swing.JTextField();
        jButtonRegistrarse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelRegistradoPregunta = new javax.swing.JLabel();
        jLabelLogIn = new javax.swing.JLabel();
        jToggleButtonIniciarSesion = new javax.swing.JToggleButton();
        jLabelTipoDeCuenta = new javax.swing.JLabel();
        jComboBoxEmpresaParticular = new javax.swing.JComboBox<>();

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

        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

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

        jLabelTipoDeCuenta.setText("Tipo de usuario");

        jComboBoxEmpresaParticular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresa", "Particular" }));
        jComboBoxEmpresaParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmpresaParticularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelRegistradoPregunta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addComponent(jToggleButtonIniciarSesion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabelContrasena)
                            .addComponent(jLabelTipoDeCuenta))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldContrasena)
                            .addComponent(jComboBoxEmpresaParticular, 0, 130, Short.MAX_VALUE)
                            .addComponent(jTextFieldCorreoElectronico))))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabelLogIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelLogIn)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTipoDeCuenta)
                    .addComponent(jComboBoxEmpresaParticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jToggleButtonIniciarSesion)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistradoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarse))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContrasenaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordFieldContrasenaActionPerformed

    private void jTextFieldCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoElectronicoActionPerformed

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
            new Registro(this,true).setVisible(true);
           this.setVisible(false);
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
        /*En funcion del tipo de usuario se busca en el
        archivo correspondiente la cuenta y se verifica si la contraseña 
        es la correspondiente:
        */
        Object tipoDeUsuario;
        tipoDeUsuario = jComboBoxEmpresaParticular.getSelectedItem();
        if(tipoDeUsuario=="Empresa"){
            try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\nicol\\OneDrive\\Documentos\\GitHub\\JavaComp28\\JavaComp\\src\\main\\resources\\documentosDeTexto\\AlmacenamientoEmpresas.TXT"))){
            //Cuando no haya mas objetos saltara la excepcion EOFException
            while(true){
                ClienteEmpresa aux=(ClienteEmpresa)ois.readObject();
                if(aux.getCorreo().equals(jTextFieldCorreoElectronico.getText())&&aux.getClave().equals(String.valueOf(jPasswordFieldContrasena.getPassword()))){
                    MainMenu abrir=new MainMenu();
                    abrir.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "El usuario o la contraseña son incorrectos", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(ClassNotFoundException e){
        }catch(EOFException e){
        }catch(IOException e){
        }                                         
        }else{
            try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\nicol\\OneDrive\\Documentos\\GitHub\\JavaComp28\\JavaComp\\src\\main\\resources\\documentosDeTexto\\AlmacenamientoParticulares.TXT"))){
            //Cuando no haya mas objetos saltara la excepcion EOFException
            while(true){
                ClienteParticular aux=(ClienteParticular)ois.readObject();               
                if(aux.getCorreo().equals(jTextFieldCorreoElectronico.getText())&&aux.getClave().equals(String.valueOf(jPasswordFieldContrasena.getPassword()))){
                    MainMenu abrir=new MainMenu();
                    abrir.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "El usuario o la contraseña son incorrectos", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(ClassNotFoundException e){
        }catch(EOFException e){
        }catch(IOException e){
        }
        }
    }//GEN-LAST:event_jToggleButtonIniciarSesionActionPerformed

    private void jComboBoxEmpresaParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmpresaParticularActionPerformed
       
    }//GEN-LAST:event_jComboBoxEmpresaParticularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */ try {
        javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JComboBox<String> jComboBoxEmpresaParticular;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelLogIn;
    private javax.swing.JLabel jLabelRegistradoPregunta;
    private javax.swing.JLabel jLabelTipoDeCuenta;
    private javax.swing.JPasswordField jPasswordFieldContrasena;
    private javax.swing.JTextField jTextFieldCorreoElectronico;
    private javax.swing.JToggleButton jToggleButtonIniciarSesion;
    // End of variables declaration//GEN-END:variables
}
