/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosuperautos;

import Clases.Conexionsqlnetbeans;
import Clases.MantenimientoClientes;
import Clases.MantenimientoComboBoxes;
import Clases.Validaciones;
import java.awt.Color;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement; 
import javax.swing.table.DefaultTableModel; 
import javax.swing.ComboBoxModel; 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.sql.*; 
import javax.swing.JTextField;
/**
 *
 * @author Sthefany
 */
public class Clientes extends javax.swing.JFrame {
Conexionsqlnetbeans cone = new Conexionsqlnetbeans();
MantenimientoComboBoxes mancbo = new MantenimientoComboBoxes();
MantenimientoClientes man = new MantenimientoClientes(); 
int fila;
int codigo; 

    /**
     * Creates new form NewJFrame
     */
    public Clientes() {
        initComponents();
         this.setLocationRelativeTo(null); 
        llenarciudades();
     man.cargarTablaClientes(jdetalle, 0, 0, "", "", "", "", "", "mostrar");
        
  
    }

     public void llenarciudades()     
    {
        CboCiudades.setModel(mancbo.llenarciudadesproc()); 
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
        TxtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CboCiudades = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jdetalle = new javax.swing.JTable();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 220, 56));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Correo electrónico:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jPanel1.add(CboCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Ciudad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 60, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Teléfono: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));
        jPanel1.add(TxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 218, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("RTN/Identidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nombre completo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 204, 26));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 218, -1));

        jdetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ID", "Telefono", "Correo", "Direccion", "Ciudad"
            }
        ));
        jdetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdetalleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jdetalle);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 640, 280));

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
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 197, 41));

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
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 197, 41));

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
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 197, 41));

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
        jPanel1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 197, 41));

        TxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 210, -1));
        jPanel1.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 220, -1));
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 220, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Dirección: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
    man.mantenimientoClientes(codigo,0, "1","1","1","1","1","eliminar");
    JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
    limpiarCampos(); 
   man.cargarTablaClientes(jdetalle, 0, 0, "", "", "", "", "", "mostrar");
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
       
        if (Validaciones.esCampoVacio(TxtNombre, "Nombre de Cliente") || 
    Validaciones.esCampoVacio(TxtDireccion, "Dirección") || 
    Validaciones.esCampoVacio(TxtTelefono, "Teléfono") || 
    Validaciones.esCampoVacio(TxtCorreo, "Correo electrónico") || 
    Validaciones.esCampoVacio(TxtID, "RTN") || 
    Validaciones.esComboVacio(CboCiudades)) {
    return;  
}


if (!Validaciones.esSoloLetras(TxtNombre, "Nombre del Cliente") || 
    !Validaciones.esTelefonoValido(TxtTelefono) || 
    !Validaciones.esCorreoValido(TxtCorreo, "Correo electrónico") || 
    !Validaciones.esRtnValido(TxtID, "RTN")) { 
    return;  
}
        
        man.mantenimientoClientes(
    0,                                      
    CboCiudades.getSelectedIndex(),         
    TxtNombre.getText(),                    
    TxtID.getText(),                        
    TxtTelefono.getText(),                 
    TxtCorreo.getText(),                    
    TxtDireccion.getText(),                 
    "agregar"                               
    ); 
    
    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente");
    limpiarCampos(); 

     man.cargarTablaClientes(jdetalle, 0, 0, "", "", "", "", "", "mostrar");
    
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
           if (Validaciones.esCampoVacio(TxtNombre, "Nombre de Cliente") || 
    Validaciones.esCampoVacio(TxtDireccion, "Dirección") || 
    Validaciones.esCampoVacio(TxtTelefono, "Teléfono") || 
    Validaciones.esCampoVacio(TxtCorreo, "Correo electrónico") || 
    Validaciones.esCampoVacio(TxtID, "RTN") || 
    Validaciones.esComboVacio(CboCiudades)) {
    return;  
}


if (!Validaciones.esSoloLetras(TxtNombre, "Nombre del Cliente") || 
    !Validaciones.esTelefonoValido(TxtTelefono) || 
    !Validaciones.esCorreoValido(TxtCorreo, "Correo electrónico") || 
    !Validaciones.esRtnValido(TxtID, "RTN")) { 
    return;  
}
        
        man.mantenimientoClientes(
        codigo,                                 
        CboCiudades.getSelectedIndex(),         
        TxtNombre.getText(),                   
        TxtID.getText(),                        
        TxtTelefono.getText(),                 
        TxtCorreo.getText(),                  
        TxtDireccion.getText(),                
        "actualizar"                             
    ); 
    
  
    JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente");
 limpiarCampos();
    man.cargarTablaClientes(jdetalle, 0, 0, "", "", "", "", "", "mostrar"); 
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void jdetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdetalleMouseClicked
    try {
            
        fila = jdetalle.getSelectedRow(); 
        
    
        String rtn = jdetalle.getValueAt(fila, 1).toString(); 
        
       
        ResultSet rs;
        Connection con = cone.obtenerconexion();
        CallableStatement cmd = con.prepareCall("{CALL mostrarClienteEspecifico(?)}"); 
        
        
        cmd.setString(1, rtn); 
        
       
        rs = cmd.executeQuery();
        
        
        if (rs.next()) {
            
            TxtID.setText(String.valueOf(rs.getString("RTN"))); 
            TxtNombre.setText(rs.getString("NOMBRE"));     
            TxtTelefono.setText(rs.getString("TELEFONO")); 
            TxtCorreo.setText(rs.getString("CORREO"));     
            TxtDireccion.setText(rs.getString("DIRECCION"));
            CboCiudades.setSelectedItem(rs.getString("CIUDAD")); 
             codigo = rs.getInt("ID");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + ex.getMessage());
    }
    
    }//GEN-LAST:event_jdetalleMouseClicked

    private void TxtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarKeyPressed
     DefaultTableModel modelotabla = (DefaultTableModel) jdetalle.getModel();
     
     modelotabla.setRowCount(0);
     PreparedStatement ps;
     ResultSet rs;
     ResultSetMetaData rsmd; 
     int columnas = 0;
  
     String sql = "SELECT " +
                 "c.NOMBRE, " +             
                 "c.RTN, " +              
                 "c.TELEFONO, " +          
                 "c.CORREO, " +            
                 "c.DIRECCION, " +        
                 "ci.DESCRIPCION AS CIUDAD " +  
                 "FROM Clientes c " +
                 "INNER JOIN Ciudades ci ON c.ID_CIUDAD = ci.ID " +
                 "WHERE c.NOMBRE LIKE '%" + TxtBuscar.getText() + "%' " +  
                 "OR c.RTN LIKE '%" + TxtBuscar.getText() + "%'";       
               
               
              
     
     try  {
         
         Connection con=  cone.obtenerconexion();
         ps = con.prepareStatement(sql);
         
       

         rs = ps.executeQuery();
         rsmd = rs.getMetaData();
         columnas = rsmd.getColumnCount();
         
         while(rs.next())
             
         {
             Object[] fila = new Object[columnas];
             
             for(int i = 0 ; i< columnas; i++)
             {
                 fila[i] = rs.getObject(i+1);
             }
             
             modelotabla.addRow(fila);
             }
         
         } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + ex.getMessage());
         }
     
     
     
    }//GEN-LAST:event_TxtBuscarKeyPressed
private void limpiarCampos() {
    
      TxtID.setText(""); 
    TxtNombre.setText("");     
    TxtTelefono.setText(""); 
    TxtCorreo.setText("");     
    TxtDireccion.setText(""); 
    
    
    CboCiudades.setSelectedIndex(0);
    }
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JComboBox<String> CboCiudades;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jdetalle;
    // End of variables declaration//GEN-END:variables
}
