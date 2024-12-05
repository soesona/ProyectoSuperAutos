/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosuperautos;

// Librerías para conexión a la base de datos
import Clases.Conexionsqlnetbeans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Librerías para manejar la tabla y su modelo
import javax.swing.table.DefaultTableModel;

// Librerías para mostrar mensajes en cuadros de diálogo
import javax.swing.JOptionPane;

// Librerías para manejar eventos de la interfaz gráfica (botones, combos, etc.)
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author aleja
 */
public class Proveedores extends javax.swing.JFrame {
    
    
    
    
    /**
     * Creates new form Empleados
     */
    public Proveedores() {
        initComponents();
        mostrarProveedores();
       llenarComboBoxCiudades();
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtRtn = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        cbEstado = new javax.swing.JCheckBox();
        txtTelefono = new javax.swing.JTextField();
        cmbCiudad = new javax.swing.JComboBox<>();
        txtFechaRegistro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        BtnBuscar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Nombre del proveedor:");

        jLabel4.setText("RTN:");

        jLabel5.setText("Correo electrónico:");

        jLabel6.setText("Estado (activo/inactivo)");

        jLabel11.setText("Teléfono:");

        jLabel12.setText("Dirección:");

        jLabel13.setText("Fecha de registro:");

        jLabel14.setText("Ciudad:");

        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PROVEEDORES");

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "RTN", "Teléfono", "Correo", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tablaProveedores);

        BtnBuscar.setBackground(new java.awt.Color(133, 133, 133));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/BuscarIcon.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorderPainted(false);
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnBuscar.setIconTextGap(8);
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnAgregar.setBackground(new java.awt.Color(2, 167, 63));
        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/AggIcon.png"))); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorderPainted(false);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar.setIconTextGap(8);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnActualizar.setBackground(new java.awt.Color(2, 167, 63));
        BtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/ActualizarIcon.png"))); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.setBorder(null);
        BtnActualizar.setBorderPainted(false);
        BtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnActualizar.setIconTextGap(8);
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(193, 82, 57));
        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosImagenes/EliminarIcon.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorderPainted(false);
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEliminar.setIconTextGap(8);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(263, 263, 263))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbEstado)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtTelefono)
                                                    .addComponent(cmbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtFechaRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(29, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtRtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(txtFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbEstado))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed
        
    private void llenarComboBoxCiudades() {
    try (Connection conexion = new Conexionsqlnetbeans().obtenerconexion();
         Statement stmt = conexion.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT ID, DESCRIPCION FROM CIUDADES")) {

        cmbCiudad.removeAllItems();
        while (rs.next()) {
            cmbCiudad.addItem(rs.getInt("ID") + " - " + rs.getString("DESCRIPCION"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar ciudades: " + e.getMessage());
    }
}

        
    
    
    private void agregarProveedor() {
    String nombre = txtProveedor.getText();
    String rtn = txtRtn.getText();
    String telefono = txtTelefono.getText();
    String correo = txtCorreo.getText();
    String direccion = txtDireccion.getText();
    boolean activo = cbEstado.isSelected();
    String ciudadSeleccionada = (String) cmbCiudad.getSelectedItem();
    int idCiudad = Integer.parseInt(ciudadSeleccionada.split(" - ")[0]); // Extraer el ID de la ciudad

    String sql = "INSERT INTO PROVEEDORES (ID_CIUDAD, NOMBRE, RTN, TELEFONO, CORREO, DIRECCION, ACTIVO) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try (Connection conexion = new Conexionsqlnetbeans().obtenerconexion();
         PreparedStatement pst = conexion.prepareStatement(sql)) {

        pst.setInt(1, idCiudad);
        pst.setString(2, nombre);
        pst.setString(3, rtn);
        pst.setString(4, telefono);
        pst.setString(5, correo);
        pst.setString(6, direccion);
        pst.setBoolean(7, activo);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Proveedor agregado correctamente.");
        mostrarProveedores(); // Actualizar la tabla
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al agregar proveedor: " + e.getMessage());
    }
}

    private void mostrarProveedores() {
    DefaultTableModel modelo = (DefaultTableModel) tablaProveedores.getModel();
    modelo.setRowCount(0); // Limpiar la tabla

    String sql = "SELECT p.ID, p.NOMBRE, p.RTN, p.TELEFONO, p.CORREO, p.ACTIVO, c.DESCRIPCION AS CIUDAD " +
                 "FROM PROVEEDORES p " +
                 "JOIN CIUDADES c ON p.ID_CIUDAD = c.ID";

    try (Connection conexion = new Conexionsqlnetbeans().obtenerconexion();
         Statement stmt = conexion.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("NOMBRE"),
                rs.getString("RTN"),
                rs.getString("TELEFONO"),
                rs.getString("CORREO"),
                rs.getBoolean("ACTIVO") ? "Activo" : "Inactivo",
                rs.getString("CIUDAD")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar proveedores: " + e.getMessage());
    }
}

    
    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed
    private void actualizarProveedor() {
    int filaSeleccionada = tablaProveedores.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un proveedor para actualizar.");
        return;
    }

    String nombre = txtProveedor.getText();
    String rtn = txtRtn.getText();
    String telefono = txtTelefono.getText();
    String correo = txtCorreo.getText();
    String direccion = txtDireccion.getText();
    boolean activo = cbEstado.isSelected();
    String ciudadSeleccionada = (String) cmbCiudad.getSelectedItem();
    int idCiudad = Integer.parseInt(ciudadSeleccionada.split(" - ")[0]); // Extraer el ID de la ciudad

    String idProveedor = (String) tablaProveedores.getValueAt(filaSeleccionada, 0); // Suponiendo que la primera columna es el ID

    String sql = "UPDATE PROVEEDORES SET ID_CIUDAD = ?, NOMBRE = ?, RTN = ?, TELEFONO = ?, CORREO = ?, DIRECCION = ?, ACTIVO = ? WHERE ID = ?";
    try (Connection conexion = new Conexionsqlnetbeans().obtenerconexion();
         PreparedStatement pst = conexion.prepareStatement(sql)) {

        pst.setInt(1, idCiudad);
        pst.setString(2, nombre);
        pst.setString(3, rtn);
        pst.setString(4, telefono);
        pst.setString(5, correo);
        pst.setString(6, direccion);
        pst.setBoolean(7, activo);
        pst.setInt(8, Integer.parseInt(idProveedor));

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Proveedor actualizado correctamente.");
        mostrarProveedores(); // Actualizar la tabla
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar proveedor: " + e.getMessage());
    }
}

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        
    agregarProveedor();


    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        actualizarProveedor();
    }//GEN-LAST:event_BtnActualizarActionPerformed
    private void eliminarProveedor() {
    int filaSeleccionada = tablaProveedores.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un proveedor para eliminar.");
        return;
    }

    String idProveedor = (String) tablaProveedores.getValueAt(filaSeleccionada, 0); // Suponiendo que la primera columna es el ID

    String sql = "DELETE FROM PROVEEDORES WHERE ID = ?";
    try (Connection conexion = new Conexionsqlnetbeans().obtenerconexion();
         PreparedStatement pst = conexion.prepareStatement(sql)) {

        pst.setInt(1, Integer.parseInt(idProveedor));
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Proveedor eliminado correctamente.");
        mostrarProveedores(); // Actualizar la tabla
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar proveedor: " + e.getMessage());
    }
}

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        eliminarProveedor();
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtFechaRegistro;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtRtn;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}