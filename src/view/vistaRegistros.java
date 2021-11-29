/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.vistaVentanaController;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
//import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Biblioteca;
import model.Cliente;
import model.Contenido;

/**
 *
 * @author JULIAN C
 */
public class vistaRegistros extends javax.swing.JFrame {

    /**
     * Creates new form ClienteVista
     */
    public vistaRegistros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getIconImage();
        this.setCxbContenido(vistaVentanaController.buscarContenidos());
        this.setCxbFecha(vistaVentanaController.buscarFechas());
        this.setCxbUsuario(vistaVentanaController.buscarClientes());
        this.setTblResults(vistaVentanaController.buscarRegistros());
    }

    @Override
    public final Image getIconImage() {
        Image iconoApp = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("utils/imgs/icono.jpg"));
        return iconoApp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_datos = new javax.swing.JPanel();
        jLabel_busqUsuario = new javax.swing.JLabel();
        btn_venta = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        tituloP1 = new javax.swing.JLabel();
        btn_AgregarRegistro = new javax.swing.JButton();
        jLabel_busqTitulo = new javax.swing.JLabel();
        CbxContenido = new javax.swing.JComboBox<>();
        CbxFecha = new javax.swing.JComboBox<>();
        CbxUsuario = new javax.swing.JComboBox<>();
        jLabel_busqUsuario1 = new javax.swing.JLabel();
        btn_AgregarRegistro1 = new javax.swing.JButton();
        jPanel_Detalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_detalle = new javax.swing.JTable();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista de Cliente");
        setPreferredSize(new java.awt.Dimension(800, 440));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_datos.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_datos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel_datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_busqUsuario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel_busqUsuario.setText("Usuario:");
        jPanel_datos.add(jLabel_busqUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, 20));

        btn_venta.setText("Ver Registros");
        btn_venta.setFocusPainted(false);
        btn_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ventaMouseClicked(evt);
            }
        });
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });
        jPanel_datos.add(btn_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 260, 40));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/imgs/teRetoAProgramarlo.png"))); // NOI18N
        jPanel_datos.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 280, 80));

        tituloP1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        tituloP1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tituloP1.setText("Sistema de control de registros de Bibliotecas");
        jPanel_datos.add(tituloP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 400, 50));

        btn_AgregarRegistro.setText("Agregar Registro");
        btn_AgregarRegistro.setFocusPainted(false);
        btn_AgregarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarRegistroMouseClicked(evt);
            }
        });
        btn_AgregarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarRegistroActionPerformed(evt);
            }
        });
        jPanel_datos.add(btn_AgregarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, 30));

        jLabel_busqTitulo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel_busqTitulo.setText("Contenido:");
        jPanel_datos.add(jLabel_busqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 20));

        CbxContenido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        CbxContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxContenidoActionPerformed(evt);
            }
        });
        jPanel_datos.add(CbxContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 130, -1));

        CbxFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        CbxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxFechaActionPerformed(evt);
            }
        });
        jPanel_datos.add(CbxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 130, -1));

        CbxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        CbxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxUsuarioActionPerformed(evt);
            }
        });
        jPanel_datos.add(CbxUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 130, -1));

        jLabel_busqUsuario1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel_busqUsuario1.setText("Fecha:");
        jPanel_datos.add(jLabel_busqUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 20));

        btn_AgregarRegistro1.setText("Modificar Registro");
        btn_AgregarRegistro1.setFocusPainted(false);
        btn_AgregarRegistro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarRegistro1MouseClicked(evt);
            }
        });
        btn_AgregarRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarRegistro1ActionPerformed(evt);
            }
        });
        jPanel_datos.add(btn_AgregarRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        getContentPane().add(jPanel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 160));

        jPanel_Detalle.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Detalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        tbl_detalle.setAutoCreateRowSorter(true);
        tbl_detalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.Registro", "Fecha", "Usuario", "Nombre", "ID Contenido", "Contenido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_detalle);

        javax.swing.GroupLayout jPanel_DetalleLayout = new javax.swing.GroupLayout(jPanel_Detalle);
        jPanel_Detalle.setLayout(jPanel_DetalleLayout);
        jPanel_DetalleLayout.setHorizontalGroup(
            jPanel_DetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DetalleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel_DetalleLayout.setVerticalGroup(
            jPanel_DetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DetalleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_Detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, 770, 220));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/imgs/fondo.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void btn_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventaMouseClicked
        ArrayList<Biblioteca> registros = controller.vistaVentanaController.buscarRegistros();
        setTblResults(registros);
        System.out.println("Registros completados");
    }//GEN-LAST:event_btn_ventaMouseClicked

    private void btn_AgregarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarRegistroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarRegistroMouseClicked

    private void btn_AgregarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarRegistroActionPerformed
        controller.RegistrarVentaController.mostrar();
    }//GEN-LAST:event_btn_AgregarRegistroActionPerformed

    private void CbxContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxContenidoActionPerformed

    private void CbxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxFechaActionPerformed

    private void CbxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxUsuarioActionPerformed

    private void btn_AgregarRegistro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarRegistro1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarRegistro1MouseClicked

    private void btn_AgregarRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarRegistro1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new vistaRegistros().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxContenido;
    private javax.swing.JComboBox<String> CbxFecha;
    private javax.swing.JComboBox<String> CbxUsuario;
    private javax.swing.JButton btn_AgregarRegistro;
    private javax.swing.JButton btn_AgregarRegistro1;
    private javax.swing.JButton btn_venta;
    private javax.swing.JLabel jLabel_busqTitulo;
    private javax.swing.JLabel jLabel_busqUsuario;
    private javax.swing.JLabel jLabel_busqUsuario1;
    private javax.swing.JPanel jPanel_Detalle;
    private javax.swing.JPanel jPanel_datos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tbl_detalle;
    private javax.swing.JLabel tituloP1;
    // End of variables declaration//GEN-END:variables

    public JTable getTbl_detalle() {
        return tbl_detalle;
    }

    public void setTbl_detalle(JTable tbl_detalle) {
        this.tbl_detalle = tbl_detalle;
    }

    public void setTblResults(ArrayList<Biblioteca> bibliotecas) {
        String[] headers = {"No Registro", "Fecha", "Usuario", "Nombre", "ID Contenido", "Contenido"};
        this.tbl_detalle.removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers);
        this.tbl_detalle.setModel(tableModel);
        for (int i = 0; i < bibliotecas.size(); i++) {
            tableModel.addRow(bibliotecas.get(i).toArray());
        }
    }

    public void setCxbContenido(ArrayList<Contenido> contenidos) {
        this.CbxContenido.removeAll();
        for (int i = 0; i < contenidos.size(); i++) {
            this.CbxContenido.addItem(contenidos.get(i).getContenidoTitulo());
        }
    }
        public void setCxbUsuario(ArrayList<Cliente> clientes) {
        this.CbxUsuario.removeAll();
        for (int i = 0; i < clientes.size(); i++) {
            this.CbxUsuario.addItem(clientes.get(i).getClienteTag());
        }
    }
            public void setCxbFecha(ArrayList<Biblioteca> fechas) {
        this.CbxFecha.removeAll();
        for (int i = 0; i < fechas.size(); i++) {
            this.CbxFecha.addItem(fechas.get(i).getBibliotecaFecha());
        }
    }
}
