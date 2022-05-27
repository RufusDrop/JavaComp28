
package interfaces;

public class OpinionPanel extends javax.swing.JPanel {

    /**
     * Creates new form Opinion
     */
    public OpinionPanel() {
        initComponents();
    }
    public String getjLabelOpinion(){
        return jLabelOpinion.getText();
    }
    public void setjLabelOpinion(String txt){
        jLabelOpinion.setText("\""+txt+"\"");
    }
    public int getjLabelPuntuacion(){
        return Integer.parseInt(jLabelPuntuacion.getText());
    }
    public void setPuntuacion(int num){
        if(num == -1){
            jProgressBarPuntuacion.setVisible(false);
            jLabelPuntuacion.setVisible(false);
            jLabelPuntuacionMaxima.setVisible(false);
        }else{
             jLabelPuntuacion.setText(String.valueOf(num));
             setBarraValue(num);
             jProgressBarPuntuacion.setVisible(true);
             jLabelPuntuacion.setVisible(true);
             jLabelPuntuacionMaxima.setVisible(true);
        }
       
    }
    public void setjLabelFecha(String fecha){
        jLabelFecha.setText(fecha);
    }
    public void setBarraValue(double value){
        int valueInt = ((int)(value+0.5))*100;
        jProgressBarPuntuacion.setValue(valueInt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBarPuntuacion = new javax.swing.JProgressBar();
        jLabelOpinion = new javax.swing.JLabel();
        jLabelPuntuacion = new javax.swing.JLabel();
        jLabelPuntuacionMaxima = new javax.swing.JLabel();
        jLabelFechaDeRealizacion = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();

        jProgressBarPuntuacion.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBarPuntuacion.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBarPuntuacion.setMaximum(500);
        jProgressBarPuntuacion.setValue(400);

        jLabelOpinion.setText("\"BlablaBlablaBlablaBlablaBlablaBlablaBlablaBlablaBlablaBlablaBlablaBlabl\"");

        jLabelPuntuacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPuntuacion.setText("4");

        jLabelPuntuacionMaxima.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPuntuacionMaxima.setText("/ 5");

        jLabelFechaDeRealizacion.setText("Fecha de realización:");

        jLabelFecha.setText("20/20/2020");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOpinion, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBarPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPuntuacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPuntuacionMaxima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFechaDeRealizacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBarPuntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabelPuntuacionMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabelFechaDeRealizacion)
                        .addComponent(jLabelFecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelOpinion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFechaDeRealizacion;
    private javax.swing.JLabel jLabelOpinion;
    private javax.swing.JLabel jLabelPuntuacion;
    private javax.swing.JLabel jLabelPuntuacionMaxima;
    private javax.swing.JProgressBar jProgressBarPuntuacion;
    // End of variables declaration//GEN-END:variables
}
