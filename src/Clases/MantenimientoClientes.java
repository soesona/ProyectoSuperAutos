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
public class MantenimientoClientes {
    Conexionsqlnetbeans cone = new Conexionsqlnetbeans();  
    
    
public void mantenimientoClientes(int id, int id_ciudad, String nombre, String rtn, String telefono, String correo, String direccion, String accion) {
    try {
        Connection con = cone.obtenerconexion(); // Método para obtener conexión
         CallableStatement cmd  = con.prepareCall("{CALL mantenimientoClientes(?,?,?,?,?,?,?,?)}"); // Llamada al procedimiento
        
        // Asignación de parámetros
        cmd.setInt(1, id); // ID
        cmd.setInt(2, id_ciudad); // ID_CIUDAD
        cmd.setString(3, nombre); // NOMBRE
        cmd.setString(4, rtn); // RTN
        cmd.setString(5, telefono); // TELEFONO
        cmd.setString(6, correo); // CORREO
        cmd.setString(7, direccion); // DIRECCION
        cmd.setString(8, accion); // ACCION
        
        // Ejecución del procedimiento
        cmd.execute();
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.toString()); // Manejo de errores
    }
}

public void cargarTablaClientes(JTable tabla, int codigo, int idCiudad, String nombre, String rtn, String telefono, String correo, String direccion, String accion) {
    DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
    modeloTabla.setRowCount(0); // Limpiar la tabla antes de cargar los datos

    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;

    try {
        
        Connection con = cone.obtenerconexion(); 
        CallableStatement cmd = con.prepareCall("{CALL mantenimientoClientes(?,?,?,?,?,?,?,?)}"); 

       
         cmd.setInt(1, codigo);               // ID (No usado para 'mostrar', pero debe ser pasado como parámetro)
        cmd.setInt(2, idCiudad);             // ID_CIUDAD (Campo numérico)
        cmd.setString(3, nombre);            // Nombre
        cmd.setString(4, rtn);               // RTN
        cmd.setString(5, telefono);          // Teléfono
        cmd.setString(6, correo);            // Correo
        cmd.setString(7, direccion);         // Dirección
        cmd.setString(8, accion);            // Acción 'mostrar'


     
        rs = cmd.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();

        while (rs.next()) {
            Object[] fila = new Object[columnas]; 
            
            
            for (int i = 0; i < columnas; i++) {
                fila[i] = rs.getObject(i+1);
            }
            modeloTabla.addRow(fila); 
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.toString()); 
    }
}
}
