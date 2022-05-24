
package interfaces;

import classes.Cliente;
import classes.ClienteEmpresa;
import classes.ClienteParticular;
import classes.Direccion;
import classes.UtilRegistro;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JDialog {
    
    private Cliente cli = null;
    private Direccion dir = null;
    
    /**
     * Creates new form Registro
     */
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null); //Esta linea se pone para que la ventana salga centrada.
        
        
        
        /**
         * Asegura que todas las cajas empiecen con la visibilidad esperada
         */
        Object tipoDeUsuario;
        tipoDeUsuario = jComboBoxEmpresaParticular.getSelectedItem();
        if(tipoDeUsuario=="Empresa"){
            jLabelDNI.setVisible(false);
            jTextFieldDNI.setVisible(false);
            jLabelCIF.setVisible(true);
            jTextFieldCIF.setVisible(true);
            jLabelWeb.setVisible(true);
            jTextFieldWeb.setVisible(true);
        }
        else if(tipoDeUsuario == "Particular"){
            jLabelDNI.setVisible(true);
            jTextFieldDNI.setVisible(true);
            jLabelCIF.setVisible(false);
            jTextFieldCIF.setVisible(false);
            jLabelWeb.setVisible(false);
            jTextFieldWeb.setVisible(false);
        }
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

        jLabelRegistro = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreoElectronico = new javax.swing.JTextField();
        jTextFieldContrasena = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jToggleButtonGuardar = new javax.swing.JToggleButton();
        jLabelTieneCuentaPregunta = new javax.swing.JLabel();
        jButtonLogIn = new javax.swing.JButton();
        jComboBoxEmpresaParticular = new javax.swing.JComboBox<>();
        jLabelTipoDeUsuario = new javax.swing.JLabel();
        jLabelWeb = new javax.swing.JLabel();
        jTextFieldWeb = new javax.swing.JTextField();
        jLabelCIF = new javax.swing.JLabel();
        jTextFieldCIF = new javax.swing.JTextField();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jFormattedTextFieldCodigoPostal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelRegistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(51, 153, 255));
        jLabelRegistro.setText("REGISTRO");

        jLabelDNI.setText("DNI:");

        jLabelNombre.setText("Nombre:");

        jLabelCorreoElectronico.setText("Correo electrónico:");

        jLabelContrasena.setText("Contraseña:");

        jLabelDireccion.setText("Direccion:");
        jLabelDireccion.setToolTipText("Introducir tipo de vía, nombre de la vía, número, puerta, letra... ");

        jLabelTelefono.setText("Teléfono:");

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jTextFieldCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoElectronicoActionPerformed(evt);
            }
        });

        jTextFieldContrasena.setToolTipText("Por seguridad usar 8 caracteres como mínimo con letras, numeros y caracteres especiales.");

        jTextFieldDireccion.setToolTipText("Introducir tipo de vía, nombre de la vía, número, puerta, letra...\n");

        jToggleButtonGuardar.setText("GUARDAR");
        jToggleButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGuardarActionPerformed(evt);
            }
        });

        jLabelTieneCuentaPregunta.setForeground(new java.awt.Color(50, 150, 180));
        jLabelTieneCuentaPregunta.setText("¿Ya tiene una cuenta?");

        jButtonLogIn.setText("Log In");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jComboBoxEmpresaParticular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresa", "Particular" }));
        jComboBoxEmpresaParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmpresaParticularActionPerformed(evt);
            }
        });

        jLabelTipoDeUsuario.setText("Tipo de usuario");

        jLabelWeb.setText("Web:");

        jLabelCIF.setText("CIF:");

        jTextFieldCIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCIFActionPerformed(evt);
            }
        });

        jFormattedTextFieldTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefonoActionPerformed(evt);
            }
        });

        jLabelCiudad.setText("Ciudad:");

        jLabelCodigoPostal.setText("Código Postal:");

        jFormattedTextFieldCodigoPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabelRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jToggleButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCorreoElectronico)
                    .addComponent(jLabelContrasena)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelTipoDeUsuario)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelCodigoPostal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelCIF)
                        .addComponent(jLabelDNI))
                    .addComponent(jLabelCiudad)
                    .addComponent(jLabelWeb)
                    .addComponent(jLabelTieneCuentaPregunta))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(jComboBoxEmpresaParticular, 0, 130, Short.MAX_VALUE)
                        .addComponent(jTextFieldCIF)
                        .addComponent(jTextFieldDNI)
                        .addComponent(jTextFieldNombre)
                        .addComponent(jTextFieldCorreoElectronico)
                        .addComponent(jTextFieldContrasena)
                        .addComponent(jTextFieldDireccion)
                        .addComponent(jFormattedTextFieldTelefono)
                        .addComponent(jTextFieldCiudad)
                        .addComponent(jFormattedTextFieldCodigoPostal)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoDeUsuario)
                    .addComponent(jComboBoxEmpresaParticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDNI)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreoElectronico)
                    .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContrasena)
                    .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCiudad)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodigoPostal)
                    .addComponent(jFormattedTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWeb)
                    .addComponent(jTextFieldWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jToggleButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTieneCuentaPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogIn))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGuardarActionPerformed
        // TODO add your handling code here:
        /**
         * 
         * Se comprueba que el numero de telefono sean numeros
         */
        boolean numInvalido = false;
        try{
            for (int i = 0; i < jFormattedTextFieldTelefono.getText().length(); i++) {
                int telefonoInt = Integer.parseInt(jFormattedTextFieldTelefono.getText());
        }
        } catch(NumberFormatException e){
            numInvalido = true;
        }
        Object tipoDeUsuario;
        tipoDeUsuario = jComboBoxEmpresaParticular.getSelectedItem();
        /**
         * Se comprueba que todos los datos se introduzcan y sean validos
         */
        if( 
                
                (tipoDeUsuario=="Empresa" && (jTextFieldCIF.getText().isBlank()||jTextFieldWeb.getText().isBlank()))  
                || (tipoDeUsuario=="Particular" && (jTextFieldDNI.getText().isBlank()))){
            JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(    
                 jTextFieldNombre.getText().isBlank()||
                 jTextFieldCorreoElectronico.getText().isBlank() ||
                 jTextFieldContrasena.getText().isBlank()|| 
                 jTextFieldDireccion.getText().isBlank()||
                 jFormattedTextFieldTelefono.getText().isBlank()||
                 jFormattedTextFieldCodigoPostal.getText().isBlank()||
                 jTextFieldCiudad.getText().isBlank())
                 
         { 
              JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(tipoDeUsuario=="Particular" && jTextFieldDNI.getText().contains(" ")){  //Luego se comprueba que el dni sea correcto
                JOptionPane.showMessageDialog(this, "El DNI no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(tipoDeUsuario=="Empresa" &&jTextFieldCIF.getText().contains(" ")){  //Luego se comprueba que el correo sea correcto
                JOptionPane.showMessageDialog(this, "El CIF no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(tipoDeUsuario=="Empresa" &&jTextFieldWeb.getText().contains(" ")){  //Luego se comprueba que el correo sea correcto
                JOptionPane.showMessageDialog(this, "La web no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(jTextFieldCorreoElectronico.getText().contains(" ")){  //Luego se comprueba que el correo sea correcto
                JOptionPane.showMessageDialog(this, "El correo no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(jTextFieldContrasena.getText().contains(" ")){  //Luego se comprueba que el correo sea correcto
                JOptionPane.showMessageDialog(this, "La contraseña no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(jFormattedTextFieldTelefono.getText().contains(" ")){  //Luego se comprueba que el correo sea correcto
                JOptionPane.showMessageDialog(this, "El teléfono no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(numInvalido || jFormattedTextFieldTelefono.getText().length()!=9){
            JOptionPane.showMessageDialog(this, "El teléfono debe ser valido. Nueve numeros enteros seguidos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if(jFormattedTextFieldCodigoPostal.getText().contains(" ")){  
                JOptionPane.showMessageDialog(this, "El código postal no puede tener espacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        if((int)jFormattedTextFieldCodigoPostal.getText().length()!=5){  
                JOptionPane.showMessageDialog(this, "Introduzca un codigo postal correcto", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
        /**
         * Se atribuyen variables a la informacion introducida por el usuario
         */
        try {
            String direccion = jTextFieldDireccion.getText();
            String ciudad = jTextFieldCiudad.getText();
            int codigoPostal =  Integer.parseInt(jFormattedTextFieldCodigoPostal.getText());
        
            String nombre = jTextFieldNombre.getText();
            String correo = jTextFieldCorreoElectronico.getText();
            String clave = jTextFieldContrasena.getText();
            int telefono = Integer.parseInt(jFormattedTextFieldTelefono.getText());
            
            dir = new Direccion(direccion,codigoPostal,ciudad);
            
            if (tipoDeUsuario.equals("Empresa")) {
                String cif = jTextFieldCIF.getText();
                String web = jTextFieldWeb.getText();
                cli = new ClienteEmpresa(nombre , correo , clave , dir , null , telefono , cif , web);
        } else {
                String dni = jTextFieldDNI.getText();
            cli = new ClienteParticular(nombre , correo , clave , dir , null , telefono , dni);
        }           
        //lo insertamos en el array
        if (UtilRegistro.registroCliente(cli)) {
            JOptionPane.showMessageDialog(this, "Ha sido registrado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            new Login().setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Ya estás registrado. Inicia sesión.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Excepción al registrarse.", "Mensaje", JOptionPane.ERROR_MESSAGE);        
        }
        
        UtilRegistro.guardarDatos();
        }
        System.out.println(UtilRegistro.getClientes().toString());
    }//GEN-LAST:event_jToggleButtonGuardarActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jComboBoxEmpresaParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmpresaParticularActionPerformed
        // TODO add your handling code here:
        /**
         * Asegura que dependiendo del tipo se activen las debidas cajas.
         */
        Object tipoDeUsuario;
        tipoDeUsuario = jComboBoxEmpresaParticular.getSelectedItem();
        if(tipoDeUsuario=="Empresa"){
            jLabelDNI.setVisible(false);
            jTextFieldDNI.setVisible(false);
            jLabelCIF.setVisible(true);
            jTextFieldCIF.setVisible(true);
            jLabelWeb.setVisible(true);
            jTextFieldWeb.setVisible(true);
        }
        else if(tipoDeUsuario == "Particular"){
            jLabelDNI.setVisible(true);
            jTextFieldDNI.setVisible(true);
            jLabelCIF.setVisible(false);
            jTextFieldCIF.setVisible(false);
            jLabelWeb.setVisible(false);
            jTextFieldWeb.setVisible(false); 
        }
    }//GEN-LAST:event_jComboBoxEmpresaParticularActionPerformed

    private void jTextFieldCIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCIFActionPerformed

    private void jTextFieldCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoElectronicoActionPerformed

    private void jFormattedTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefonoActionPerformed

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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JComboBox<String> jComboBoxEmpresaParticular;
    private javax.swing.JFormattedTextField jFormattedTextFieldCodigoPostal;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabelCIF;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTieneCuentaPregunta;
    private javax.swing.JLabel jLabelTipoDeUsuario;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JTextField jTextFieldCIF;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldContrasena;
    private javax.swing.JTextField jTextFieldCorreoElectronico;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldWeb;
    private javax.swing.JToggleButton jToggleButtonGuardar;
    // End of variables declaration//GEN-END:variables
}
