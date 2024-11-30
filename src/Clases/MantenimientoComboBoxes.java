/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement; 
import javax.swing.table.DefaultTableModel; 
import javax.swing.ComboBoxModel; 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
/**
 *
 * @author Sthefany
 */
public class MantenimientoComboBoxes {
    Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
    
    
      public DefaultComboBoxModel llenarciudadesproc ()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel ();
        
        modelo.addElement("Seleccione");
        
        try {
        Connection con = cone.obtenerconexion();
        CallableStatement cmd = con.prepareCall("{CALL sp_ciudades}");
        ResultSet rs= cmd.executeQuery();
        
        while(rs.next()) {
        
            modelo.addElement(rs.getString(2));
        
        }
        
        }
        catch(Exception ex) 
        {
        JOptionPane.showMessageDialog(null, ex.toString());
        
        }
        return modelo; 
    }
}
