
package interfaces;

import classes.Cliente;
import classes.ClienteEmpresa;
import classes.ClienteParticular;
import static interfaces.Login.objcli;
import javax.swing.ImageIcon;
public class UsuarioPanel extends javax.swing.JPanel {

    /**
     * Creates new form UsuarioPanelAdmin
     */
    public UsuarioPanel() {
        initComponents();
        
        if(objcli.getClass().equals(ClienteEmpresa.class)){
            setjComboBoxTipoUsuario("Empresa");
            jLabelDNI.setVisible(false);
            jTextFieldDNI.setVisible(false);
            jLabelCIF.setVisible(true);
            jTextFieldCIF.setVisible(true);
            jLabelWeb.setVisible(true);
            jTextFieldWeb.setVisible(true);
            importadorInformacion(objcli);
        }else{
            setjComboBoxTipoUsuario("Cliente");
            jLabelDNI.setVisible(true);
            jTextFieldDNI.setVisible(true);
            jLabelCIF.setVisible(false);
            jTextFieldCIF.setVisible(false);
            jLabelWeb.setVisible(false);
            jTextFieldWeb.setVisible(false);
            importadorInformacion(objcli);
        }
    }
    public String getjTextFieldNombre(){
        return jTextFieldNombre.getText();
    }
    public String getjTextFieldCorreoElectronico(){
        return jTextFieldCorreoElectronico.getText();
    }
    public String getjTextFieldClave(){
        return jTextFieldContrasena.getText();
    }
    public String getjTextFieldDireccion(){
        return jTextFieldDireccion.getText();
    }
    public String getjTextFieldCiudad(){
        return jTextFieldCiudad.getText();
    }
    public int getjFormattedTextFieldCodigoPostal(){
        String str = String.valueOf(jFormattedTextFieldCodigoPostal.getValue());
        return Integer.parseInt(str);
    }
    public int getjFormattedTextFieldTelefono(){
        String str = String.valueOf(jFormattedTextFieldTelefono.getValue());
        return Integer.parseInt(str);
    }
    public String getjTextFieldCIF(){
        return jTextFieldCIF.getText();
    }
    public String getjTextFieldWeb(){
        return jTextFieldWeb.getText();
    }
    public String getjTextFieldDNI(){
        return jTextFieldDNI.getText();
    }
    public void setjComboBoxTipoUsuario(String txt){
        jComboBoxTipoUsuario.setSelectedItem(txt);
    }
    public void setjTextFieldCIF(String txt){
        jTextFieldCIF.setText(txt);
    }
    public void setjTextFieldDNI(String txt){
        jTextFieldDNI.setText(txt);
    }
    public void setjTextFieldNombre(String txt){
        jTextFieldNombre.setText(txt);
    }
    public void setjTextFieldCorreoElectronico(String txt){
        jTextFieldCorreoElectronico.setText(txt);
    }
    public void setjTextFieldContrasena(String txt){
       jTextFieldContrasena.setText(txt);
    }
    public void setjTextFieldDireccion(String txt){
        jTextFieldDireccion.setText(txt);
    }
    public void setjTextFieldCiudad(String txt){
        jTextFieldCiudad.setText(txt);
    }
    public void setjFormattedTextFieldCodigoPostal(int codpost){
        jFormattedTextFieldCodigoPostal.setText(String.valueOf(codpost));
    }
    public void setjFormattedTextFieldTelefono(int num){
       jFormattedTextFieldTelefono.setText(String.valueOf(num));
    }
    public void setjTextFieldWeb(String txt){
        jTextFieldWeb.setText(txt);
    }
    public void setjLabelFotoCuenta(String URL){
        jLabelFotoCuenta.setIcon(new ImageIcon(getClass().getResource(URL)));
    }
    public void setModoLectura(){
        jComboBoxTipoUsuario.setEditable(false);
        jTextFieldCIF.setEditable(false);
        jTextFieldDNI.setEditable(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldCorreoElectronico.setEditable(false);
        jTextFieldContrasena.setEditable(false);
        jTextFieldDireccion.setEditable(false);
        jFormattedTextFieldCodigoPostal.setEditable(false);
        jTextFieldWeb.setEditable(false);
    }
    public void setModoEditable(){
        jComboBoxTipoUsuario.setEditable(true);
        jTextFieldCIF.setEditable(true);
        jTextFieldDNI.setEditable(true);
        jTextFieldNombre.setEditable(true);
        jTextFieldCorreoElectronico.setEditable(true);
        jTextFieldContrasena.setEditable(true);
        jTextFieldDireccion.setEditable(true);
        jFormattedTextFieldCodigoPostal.setEditable(true);
        jTextFieldWeb.setEditable(true);
    }
    
    public void importadorInformacion(Cliente usuario){
        setjTextFieldNombre(usuario.getNombre());
        setjTextFieldCorreoElectronico(usuario.getCorreo());
        setjTextFieldContrasena(usuario.getClave());
        setjTextFieldDireccion(usuario.getDireccion().getDireccion());
        setjTextFieldCiudad(usuario.getDireccion().getCiudad());
        setjFormattedTextFieldCodigoPostal(usuario.getDireccion().getCodigoPostal());
        setjFormattedTextFieldTelefono(usuario.getTelefono());
        //Obtenemos los atributos especificos a empresa o particular en funcion del tipo de cliente
        String tipo = usuario.getClass().getSimpleName();
         if (tipo.equals("ClienteEmpresa")) {
            ClienteEmpresa emp = (ClienteEmpresa) usuario;
            setjComboBoxTipoUsuario("Empresa");
            setjTextFieldCIF(emp.getCIF());
            setjTextFieldWeb(emp.getWeb());
            
        } else {
            ClienteParticular part = (ClienteParticular) usuario;
            setjComboBoxTipoUsuario("Particular");
            setjTextFieldDNI(part.getDNI());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jTextFieldCorreoElectronico = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabelCIF = new javax.swing.JLabel();
        jFormattedTextFieldCodigoPostal = new javax.swing.JFormattedTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFotoCuenta = new javax.swing.JLabel();
        jTextFieldCIF = new javax.swing.JTextField();
        jTextFieldWeb = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldContrasena = new javax.swing.JTextField();
        jLabelTipoDeCuenta = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresa", "Particular" }));
        jComboBoxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioActionPerformed(evt);
            }
        });

        jTextFieldCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoElectronicoActionPerformed(evt);
            }
        });

        jLabelTelefono.setText("Teléfono:");

        jLabelCorreoElectronico.setText("Correo electrónico:");

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jLabelCIF.setText("CIF:");

        jFormattedTextFieldCodigoPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCodigoPostalActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre:");

        jTextFieldCIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCIFActionPerformed(evt);
            }
        });

        jLabelDireccion.setText("Dirección");

        jLabelTipoDeCuenta.setText("Tipo de cuenta");

        jLabelDNI.setText("DNI:");

        jLabelContrasena.setText("Contraseña");

        jLabelWeb.setText("Web:");

        jLabelCiudad.setText("Ciudad");

        jLabelCodigoPostal.setText("Código Postal");

        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });

        jFormattedTextFieldTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelFotoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelCorreoElectronico)
                    .addComponent(jLabelContrasena)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelTipoDeCuenta)
                    .addComponent(jLabelCIF)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelCodigoPostal)
                    .addComponent(jLabelCiudad)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelWeb))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(jTextFieldCIF, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombre)
                        .addComponent(jTextFieldCorreoElectronico)
                        .addComponent(jTextFieldContrasena)
                        .addComponent(jTextFieldDireccion)
                        .addComponent(jComboBoxTipoUsuario, 0, 130, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(jTextFieldCiudad)
                        .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipoDeCuenta)
                            .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCIF)
                            .addComponent(jTextFieldCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDNI)
                            .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCorreoElectronico)
                            .addComponent(jTextFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelContrasena)
                            .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelFotoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion))
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
                    .addComponent(jLabelTelefono)
                    .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWeb)
                    .addComponent(jTextFieldWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCodigoPostalActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldCIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCIFActionPerformed

    private void jTextFieldCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoElectronicoActionPerformed

    private void jComboBoxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioActionPerformed
        // TODO add your handling code here:
        /**
        * Asegura que dependiendo del tipo se activen las debidas cajas.
        */
        Object tipoDeUsuario;
        tipoDeUsuario = jComboBoxTipoUsuario.getSelectedItem();
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
    }//GEN-LAST:event_jComboBoxTipoUsuarioActionPerformed

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jFormattedTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCodigoPostal;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabelCIF;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFotoCuenta;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoDeCuenta;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JTextField jTextFieldCIF;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldContrasena;
    private javax.swing.JTextField jTextFieldCorreoElectronico;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldWeb;
    // End of variables declaration//GEN-END:variables
}
