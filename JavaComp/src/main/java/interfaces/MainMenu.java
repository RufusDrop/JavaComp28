
package interfaces;

import classes.Manager;
import classes.Opinion;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;


public class MainMenu extends javax.swing.JFrame {
    
    private List<String> categoriasSeleccionadas;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
            //Inicializo el jListCategorias con todas las categorias selecccionado
            jListCategorias.setSelectionInterval(0, 5); //Desde 0 al numero de categorias
            jButtonCategorias.setText("Todas las categorias");
            categoriasSeleccionadas = jListCategorias.getSelectedValuesList();
         this.setLocationRelativeTo(null); //Esta linea se pone para que la ventana salga centrada.
         jScrollPaneCategorias.setVisible(false);
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

        jLayeredPaneMain = new javax.swing.JLayeredPane();
        jScrollPaneCategorias = new javax.swing.JScrollPane();
        jListCategorias = new javax.swing.JList<>();
        jPanelCuenta = new javax.swing.JPanel();
        jLabelNombreCuenta = new javax.swing.JLabel();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jButtonCuenta = new javax.swing.JButton();
        jButtonCarrito = new javax.swing.JButton();
        jPanelBusqueda = new javax.swing.JPanel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonCategorias = new javax.swing.JButton();
        jComboBoxTipoBusqueda = new javax.swing.JComboBox<>();
        jButtonBusqueda = new javax.swing.JButton();
        jScrollPaneProductos = new javax.swing.JScrollPane();
        jPanelRecomendaciones = new javax.swing.JPanel();
        jLabelMainText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLayeredPaneMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListCategorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListCategorias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Todas las categorias", "Componentes", "Ordenadores", "Móviles y telefonía", "TV, audio y foto", "Consolas y videojuegos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListCategorias.setName(""); // NOI18N
        jListCategorias.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jListCategoriasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jListCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCategoriasMouseClicked(evt);
            }
        });
        jScrollPaneCategorias.setViewportView(jListCategorias);

        jLayeredPaneMain.add(jScrollPaneCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 160, 150));

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
        jButtonCuenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruben\\Documents\\GitHub\\JavaComp28\\JavaComp\\src\\main\\resources\\images\\IconoCuentaAzulMini.png")); // NOI18N
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
        jButtonCarrito.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruben\\Documents\\GitHub\\JavaComp28\\JavaComp\\src\\main\\resources\\images\\CarritoBlancoMini.png")); // NOI18N
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

        jLayeredPaneMain.add(jPanelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, -1));

        jPanelBusqueda.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBusqueda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldBusqueda.setText("jTextField1");
        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });

        jButtonCategorias.setText("Todas las categorias");
        jButtonCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategoriasActionPerformed(evt);
            }
        });

        jComboBoxTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por relevancia", "Por mayor precio", "Por menor precio" }));

        jButtonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconoLupaBlancaMini.png"))); // NOI18N
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBusquedaLayout = new javax.swing.GroupLayout(jPanelBusqueda);
        jPanelBusqueda.setLayout(jPanelBusquedaLayout);
        jPanelBusquedaLayout.setHorizontalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButtonCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTipoBusqueda, 0, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanelBusquedaLayout.setVerticalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLayeredPaneMain.add(jPanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));
        jLayeredPaneMain.add(jScrollPaneProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 590));

        jLabelMainText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMainText.setText("Buenos días _nombre estas son algunas recomendaciones para ti:");
        jLabelMainText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelRecomendacionesLayout = new javax.swing.GroupLayout(jPanelRecomendaciones);
        jPanelRecomendaciones.setLayout(jPanelRecomendacionesLayout);
        jPanelRecomendacionesLayout.setHorizontalGroup(
            jPanelRecomendacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecomendacionesLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabelMainText, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanelRecomendacionesLayout.setVerticalGroup(
            jPanelRecomendacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecomendacionesLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabelMainText)
                .addContainerGap(493, Short.MAX_VALUE))
        );

        jLayeredPaneMain.add(jPanelRecomendaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 590));

        getContentPane().add(jLayeredPaneMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed

    private void jButtonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCarritoActionPerformed

    private void jButtonCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCuentaActionPerformed

    private void jListCategoriasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jListCategoriasAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jListCategoriasAncestorAdded

    private void jListCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCategoriasMouseClicked
        // TODO add your handling code here:
        String categoriasBoton = ""; //Inicializo
        
        categoriasSeleccionadas = jListCategorias.getSelectedValuesList();
        System.out.println(categoriasSeleccionadas);
        if(jListCategorias.getSelectedValue() == "Todas las categorias"){
            jListCategorias.setSelectionInterval(0, 5); //Desde 0 al numero de categorias
            jButtonCategorias.setText("Todas las categorias");
        }else{
           
            for (int i = 0; i < categoriasSeleccionadas.size(); i++) {
                
                if(categoriasSeleccionadas.size()==1)
                        categoriasBoton= categoriasBoton+categoriasSeleccionadas.get(i);
                else
                    categoriasBoton= categoriasBoton+categoriasSeleccionadas.get(i)+",";
            }
            jButtonCategorias.setText(categoriasBoton); //Muestro las categorias como nombre del boton
        }
        
    }//GEN-LAST:event_jListCategoriasMouseClicked

    private void jButtonCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategoriasActionPerformed
        // TODO add your handling code here:
        jScrollPaneCategorias.setVisible(!jScrollPaneCategorias.isVisible());
        
    }//GEN-LAST:event_jButtonCategoriasActionPerformed

    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        // TODO add your handling code here:
        Manager.BuscarProductos(jTextFieldBusqueda.getText(), categoriasSeleccionadas, jComboBoxTipoBusqueda.getSelectedItem().toString());
        
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

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
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonCarrito;
    private javax.swing.JButton jButtonCategorias;
    private javax.swing.JButton jButtonCuenta;
    private javax.swing.JComboBox<String> jComboBoxTipoBusqueda;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelMainText;
    private javax.swing.JLabel jLabelNombreCuenta;
    private javax.swing.JLayeredPane jLayeredPaneMain;
    private javax.swing.JList<String> jListCategorias;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelCuenta;
    private javax.swing.JPanel jPanelRecomendaciones;
    private javax.swing.JScrollPane jScrollPaneCategorias;
    private javax.swing.JScrollPane jScrollPaneProductos;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
