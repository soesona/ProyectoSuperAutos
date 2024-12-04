/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.sql.CallableStatement;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement; 
import javax.swing.table.DefaultTableModel; 
import javax.swing.ComboBoxModel; 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
/**
 *
 * @author Sthefany
 */
public class MantenimientoSucursales {
       Conexionsqlnetbeans cone = new Conexionsqlnetbeans();  
    
       
       public void mantenimientoSucursales(int id, int id_ciudad, String nombre, String direccion, String telefono, String correo, String accion) {
    try {
        Connection con = cone.obtenerconexion(); 
        CallableStatement cmd = con.prepareCall("{CALL mantenimientoSucursales(?,?,?,?,?,?,?)}"); 
        
       
        cmd.setInt(1, id); 
        cmd.setInt(2, id_ciudad); 
        cmd.setString(3, nombre); 
        cmd.setString(4, direccion); 
        cmd.setString(5, telefono); 
        cmd.setString(6, correo); 
        cmd.setString(7, accion); 
        
       
        cmd.execute();
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.toString()); 
    }
}
       
       public void cargarTablaSucursales(JTable tabla, int codigo, int idCiudad, String nombre, String direccion, String telefono, String correo, String accion) {
    DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
    modeloTabla.setRowCount(0);

    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;

    try {
        Connection con = cone.obtenerconexion();
        CallableStatement cmd = con.prepareCall("{CALL mantenimientoSucursales(?,?,?,?,?,?,?)}");

        cmd.setInt(1, codigo);
        cmd.setInt(2, idCiudad);
        cmd.setString(3, nombre);
        cmd.setString(4, direccion);
        cmd.setString(5, telefono);
        cmd.setString(6, correo);
        cmd.setString(7, accion);

        rs = cmd.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();

        while (rs.next()) {
            Object[] fila = new Object[columnas];
            for (int i = 0; i < columnas; i++) {
                fila[i] = rs.getObject(i + 1);
            }
            modeloTabla.addRow(fila);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
    }
}
       
       public boolean verificarCodigoExistente(int codigo) {
    try {
        Connection con = cone.obtenerconexion();
        String query = "SELECT COUNT(*) FROM SUCURSALES WHERE ID = ?";  
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, codigo);  
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            int count = rs.getInt(1);  
            return count > 0;  
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al verificar el código: " + ex.getMessage());
    }
    return false;  
}


}
