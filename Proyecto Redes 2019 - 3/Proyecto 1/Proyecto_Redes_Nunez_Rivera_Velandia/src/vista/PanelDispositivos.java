/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Velan
 */
public class PanelDispositivos extends javax.swing.JPanel {

    InterfazGrafica interfazGrafica;
    boolean guardar = false;

    /**
     * Creates new form PanelDispositivos
     */
    PanelDispositivos(InterfazGrafica aThis, List<String[]> dispositivos) {
        this.interfazGrafica = aThis;
        initComponents();
        llenarT(dispositivos);
        this.guardar = true;
    }

    public boolean isGuardar() {
        return guardar;
    }

    public void setGuardar(boolean guardar) {
        this.guardar = guardar;
    }

    public void llenarT(List<String[]> dispositivos) {

        jTable1.setDefaultRenderer(Object.class, new ImagenesT());

        String[] titulos = {"Direccion IP", "Direccion MAC", "Estado", "Tipo"};

        DefaultTableModel tm = new DefaultTableModel(null, titulos);

        for (int i = 0; i < dispositivos.size(); i++) {
            System.out.println("Panel Dispositivos mostrará: " + dispositivos.get(i)[0] + " " + dispositivos.get(i)[2]+ " "+ dispositivos.get(i)[3]);
        }

        for (int i = 0; i < dispositivos.size(); i++) {
            
            Object[] obj = new Object[4];
            
            obj[0] = dispositivos.get(i)[0]; //IP
            obj[1] = dispositivos.get(i)[1]; //MAC
            obj[2] = dispositivos.get(i)[2]; //Estado

            switch (dispositivos.get(i)[3].toUpperCase()) { //TIPO

                case "DESCONOCIDO":
                    obj[3] = new JLabel(iconoDesconocido);
                    break;
                case "DESKTOP":
                    obj[3] = new JLabel(iconoPC);
                    break;
                case "LAPTOP":
                    obj[3] = new JLabel(iconoLaptop);
                    break;
                case "CELULAR":
                    obj[3] = new JLabel(iconoCel);
                    break;
                case "IMPRESORA":
                    obj[3] = new JLabel(iconoImpresora);
                    break;
                case "SMART_TV":
                    obj[3] = new JLabel(iconoTelevision);
                    break;
                case "SMART_WATCH":
                    obj[3] = new JLabel(iconoReloj);
                    break;
                case "OTRO":
                    obj[3] = new JLabel(iconoOtro);
                    break;
            }

            tm.addRow(obj);

        }//fin for 

        jTable1.setRowHeight(50);
        jTable1.setModel(tm);

        /*para cuando el man quiera cambiar de icono mostrar un cuadrito que muestre un menu,
        seleccione el tipo de dispositivo: 1 pc 2 laptop ... otro*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizarInactivos = new javax.swing.JButton();
        lblTituloDispositivosRed = new javax.swing.JLabel();
        txtFldMinInactivo = new javax.swing.JTextField();
        lblMinInactivo = new javax.swing.JLabel();
        lblMaxTramasNoResividas = new javax.swing.JLabel();
        txtFldMaxTramasNoRecividas = new javax.swing.JTextField();
        btnSalirPnl2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cambiarTipo = new javax.swing.JButton();

        btnActualizarInactivos.setText("Actualizar");
        btnActualizarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInactivosActionPerformed(evt);
            }
        });

        lblTituloDispositivosRed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTituloDispositivosRed.setText("Dispositivos en Red");

        txtFldMinInactivo.setText("1");

        lblMinInactivo.setText("Minutos Inactivo");

        lblMaxTramasNoResividas.setText("Max Tramas");

        txtFldMaxTramasNoRecividas.setText("2");

        btnSalirPnl2.setText("Salir");
        btnSalirPnl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPnl2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        cambiarTipo.setText("Cambiar tipo dispositivo seleccionado");
        cambiarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(cambiarTipo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lblTituloDispositivosRed))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinInactivo)
                    .addComponent(lblMaxTramasNoResividas))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFldMinInactivo)
                    .addComponent(txtFldMaxTramasNoRecividas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalirPnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloDispositivosRed)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cambiarTipo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinInactivo)
                            .addComponent(txtFldMinInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaxTramasNoResividas)
                            .addComponent(txtFldMaxTramasNoRecividas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnActualizarInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnSalirPnl2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInactivosActionPerformed
        
        if (txtFldMaxTramasNoRecividas.getText() != null && txtFldMaxTramasNoRecividas.getText() != "") {
            
            if (txtFldMinInactivo.getText() != null && txtFldMinInactivo.getText() != "") {
                
                /*while (interfazGrafica.isActualizando() ) {
                    System.out.println("Se está actualizando auntomaticamente, por favor espere.");
                }*/
                interfazGrafica.actualizarDispositivos(txtFldMaxTramasNoRecividas.getText(), txtFldMinInactivo.getText());
                
            }
            
        }
    }//GEN-LAST:event_btnActualizarInactivosActionPerformed

    private void btnSalirPnl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPnl2ActionPerformed

        interfazGrafica.cerrar();
    }//GEN-LAST:event_btnSalirPnl2ActionPerformed

    private void cambiarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarTipoActionPerformed

        filaselec = jTable1.getSelectedRow();

        if (filaselec != -1) {
            String[] opciones = {
                "DESCONOCIDO",
                "DESKTOP",
                "LAPTOP",
                "CELULAR",
                "IMPRESORA",
                "SMART_TV",
                "SMART_WATCH",
                "OTRO"
            };

            String resp = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de dispositivo", "seleccion", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
            switch (resp.toUpperCase()) {

                case "DESCONOCIDO":
                    jTable1.setValueAt(new JLabel(iconoDesconocido), filaselec, 3); //setValueAt(dato_que_ingresa,fila_sececcionada,columna_a_modificar)
                    break;
                case "DESKTOP":
                    jTable1.setValueAt(new JLabel(iconoPC), filaselec, 3);
                    break;
                case "LAPTOP":
                    jTable1.setValueAt(new JLabel(iconoLaptop), filaselec, 3);
                    break;
                case "CELULAR":
                    jTable1.setValueAt(new JLabel(iconoCel), filaselec, 3);

                    break;
                case "IMPRESORA":
                    jTable1.setValueAt(new JLabel(iconoImpresora), filaselec, 3);

                    break;
                case "SMART_TV":
                    jTable1.setValueAt(new JLabel(iconoTelevision), filaselec, 3);
                    break;
                case "SMART_WATCH":
                    jTable1.setValueAt(new JLabel(iconoReloj), filaselec, 3);
                    break;
                case "OTRO":
                    jTable1.setValueAt(new JLabel(iconoOtro), filaselec, 3);
                    break;
            }
            interfazGrafica.actualizarDispositivo( jTable1.getValueAt(filaselec, 0).toString(), resp.toUpperCase() );
        } else {
            JOptionPane.showMessageDialog(null, "no se selecciono ninguna fila", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cambiarTipoActionPerformed

    public String getCantidadTramas() {
        return txtFldMaxTramasNoRecividas.getText();
    }

    public String getTiempo() {
        return txtFldMinInactivo.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarInactivos;
    private javax.swing.JButton btnSalirPnl2;
    private javax.swing.JButton cambiarTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMaxTramasNoResividas;
    private javax.swing.JLabel lblMinInactivo;
    private javax.swing.JLabel lblTituloDispositivosRed;
    private javax.swing.JTextField txtFldMaxTramasNoRecividas;
    private javax.swing.JTextField txtFldMinInactivo;
    // End of variables declaration//GEN-END:variables
    private ImageIcon iconoPC = new ImageIcon("IconoPC.png");
    private ImageIcon iconoLaptop = new ImageIcon("IconoLaptop.png");
    private ImageIcon iconoImpresora = new ImageIcon("IconoImpresora.png");
    private ImageIcon iconoReloj = new ImageIcon("IconoReloj.png");
    private ImageIcon iconoCel = new ImageIcon("IconoCel.png");
    private ImageIcon iconoTelevision = new ImageIcon("IconoTelevision.png");
    private ImageIcon iconoDesconocido = new ImageIcon("IconoDesconocido.png");
    private ImageIcon iconoOtro = new ImageIcon("IconoOtro.png");
    int filaselec = -1;

    List<String[]> getDispositivos() {

        int cantHost = this.jTable1.getRowCount();

        List<String[]> hostsGuardar = new ArrayList<>();

        for (int i = 0; i < cantHost; i++) {
            String[] hostActual = new String[4];
            for (int j = 0; j < 4; j++) {

                Object[] objetoActual = new Object[4];
                objetoActual[j] = this.jTable1.getValueAt(i, j).toString() + "%";

                if (j == 3) {

                    if (objetoActual[j].toString().contains("IconoPC.png")) {

                        objetoActual[j] = "DESKTOP%";
                    }
                    if (objetoActual[j].toString().contains("IconoLaptop.png")) {

                        objetoActual[j] = "LAPTOP%";
                    }
                    if (objetoActual[j].toString().contains("IconoImpresora.png")) {
                        objetoActual[j] = "IMPRESORA%";
                    }
                    if (objetoActual[j].toString().contains("IconoReloj.png")) {
                        objetoActual[j] = "SMART_WATCH%";
                    }
                    if (objetoActual[j].toString().contains("IconoCel.png")) {
                        objetoActual[j] = "CELULAR%";

                    }
                    if (objetoActual[j].toString().contains("IconoTelevision.png")) {
                        objetoActual[j] = "SMART_TV%";

                    }
                    if (objetoActual[j].toString().contains("IconoDesconocido.png")) {
                        objetoActual[j] = "DESCONOCIDO%";

                    }
                    if (objetoActual[j].toString().contains("IconoOtro.png")) {
                        objetoActual[j] = "OTRO%";
                    }
                }

                hostActual[j] = objetoActual[j].toString();
            }
            hostsGuardar.add(hostActual);
        }

        return hostsGuardar;
    }

    public InterfazGrafica getInterfazGrafica() {
        return interfazGrafica;
    }

    public void setInterfazGrafica(InterfazGrafica interfazGrafica) {
        this.interfazGrafica = interfazGrafica;
    }

    public JButton getBtnActualizarInactivos() {
        return btnActualizarInactivos;
    }

    public void setBtnActualizarInactivos(JButton btnActualizarInactivos) {
        this.btnActualizarInactivos = btnActualizarInactivos;
    }

    public JButton getBtnSalirPnl2() {
        return btnSalirPnl2;
    }

    public void setBtnSalirPnl2(JButton btnSalirPnl2) {
        this.btnSalirPnl2 = btnSalirPnl2;
    }

    public JButton getCambiarTipo() {
        return cambiarTipo;
    }

    public void setCambiarTipo(JButton cambiarTipo) {
        this.cambiarTipo = cambiarTipo;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JLabel getLblMaxTramasNoResividas() {
        return lblMaxTramasNoResividas;
    }

    public void setLblMaxTramasNoResividas(JLabel lblMaxTramasNoResividas) {
        this.lblMaxTramasNoResividas = lblMaxTramasNoResividas;
    }

    public JLabel getLblMinInactivo() {
        return lblMinInactivo;
    }

    public void setLblMinInactivo(JLabel lblMinInactivo) {
        this.lblMinInactivo = lblMinInactivo;
    }

    public JLabel getLblTituloDispositivosRed() {
        return lblTituloDispositivosRed;
    }

    public void setLblTituloDispositivosRed(JLabel lblTituloDispositivosRed) {
        this.lblTituloDispositivosRed = lblTituloDispositivosRed;
    }

    public String getTxtFldMaxTramasNoRecividas() {
        return txtFldMaxTramasNoRecividas.getText();
    }

    public void setTxtFldMaxTramasNoRecividas(String txtFldMaxTramasNoRecividas) {
        this.txtFldMaxTramasNoRecividas.setText(txtFldMaxTramasNoRecividas);
    }

    public JTextField getTxtFldMinInactivo() {
        return txtFldMinInactivo;
    }

    public void setTxtFldMinInactivo(JTextField txtFldMinInactivo) {
        this.txtFldMinInactivo = txtFldMinInactivo;
    }

    public ImageIcon getIconoPC() {
        return iconoPC;
    }

    public void setIconoPC(ImageIcon iconoPC) {
        this.iconoPC = iconoPC;
    }

    public ImageIcon getIconoLaptop() {
        return iconoLaptop;
    }

    public void setIconoLaptop(ImageIcon iconoLaptop) {
        this.iconoLaptop = iconoLaptop;
    }

    public ImageIcon getIconoImpresora() {
        return iconoImpresora;
    }

    public void setIconoImpresora(ImageIcon iconoImpresora) {
        this.iconoImpresora = iconoImpresora;
    }

    public ImageIcon getIconoReloj() {
        return iconoReloj;
    }

    public void setIconoReloj(ImageIcon iconoReloj) {
        this.iconoReloj = iconoReloj;
    }

    public ImageIcon getIconoCel() {
        return iconoCel;
    }

    public void setIconoCel(ImageIcon iconoCel) {
        this.iconoCel = iconoCel;
    }

    public ImageIcon getIconoTelevision() {
        return iconoTelevision;
    }

    public void setIconoTelevision(ImageIcon iconoTelevision) {
        this.iconoTelevision = iconoTelevision;
    }

    public ImageIcon getIconoDesconocido() {
        return iconoDesconocido;
    }

    public void setIconoDesconocido(ImageIcon iconoDesconocido) {
        this.iconoDesconocido = iconoDesconocido;
    }

    public ImageIcon getIconoOtro() {
        return iconoOtro;
    }

    public void setIconoOtro(ImageIcon iconoOtro) {
        this.iconoOtro = iconoOtro;
    }

    public int getFilaselec() {
        return filaselec;
    }

    public void setFilaselec(int filaselec) {
        this.filaselec = filaselec;
    }

}