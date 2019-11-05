/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Velan
 */
public class PanelMenu extends javax.swing.JPanel {

    InterfazGrafica interfazGrafica;
    
    /**
     * Creates new form creacionç
     */


    PanelMenu(InterfazGrafica pInterfazGrafica) {
        interfazGrafica = pInterfazGrafica;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtFldIP = new javax.swing.JTextField();
        txtFldMasc = new javax.swing.JTextField();
        lblIP = new javax.swing.JLabel();
        lblMascara = new javax.swing.JLabel();
        TitDatosRed = new javax.swing.JLabel();

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtFldIP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFldIP.setText("192.168.0.1");
        txtFldIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldIPActionPerformed(evt);
            }
        });

        txtFldMasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFldMasc.setText("255.255.255.0");
        txtFldMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldMascActionPerformed(evt);
            }
        });

        lblIP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIP.setText("IP");

        lblMascara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMascara.setText("Máscara de Red");

        TitDatosRed.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitDatosRed.setText("Datos de la Red");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIP)
                            .addComponent(lblMascara))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFldIP)
                            .addComponent(txtFldMasc, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(TitDatosRed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitDatosRed)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIP))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldMasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMascara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldIPActionPerformed

    }//GEN-LAST:event_txtFldIPActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String IP = new String();
        String mascara = new String();
        IP = this.txtFldIP.getText().toString();
        mascara = this.txtFldMasc.getText().toString();
        
        interfazGrafica.getContentPane().remove(this);
        interfazGrafica.buscarHostActivosAnterior(IP, mascara);
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        interfazGrafica.cerrar();
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtFldMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldMascActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitDatosRed;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblMascara;
    private javax.swing.JTextField txtFldIP;
    private javax.swing.JTextField txtFldMasc;
    // End of variables declaration//GEN-END:variables
}