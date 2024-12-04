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
        CallableStatement cmd = con.prepareCall("{CALL sp_ciudades(0, '', 'MOSTRAR')}");
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
    
    public DefaultComboBoxModel llenartiposfacturas ()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel ();
        
        modelo.addElement("Seleccione");
        
        try {
        Connection con = cone.obtenerconexion();
        CallableStatement cmd = con.prepareCall("{CALL SP_FACTURAS_TIPOS(0, '', 'MOSTRAR')}");
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
    
    
    
    public DefaultComboBoxModel llenarVehiculos ()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel ();
        
        modelo.addElement("000 - Seleccione");
        
        try {
        Connection con = cone.obtenerconexion();

        CallableStatement cmd = con.prepareCall("{CALL SP_VEHICULOS(0, 0, 0, 0, 0, 0, '', '', 0, '', 0, 0, 0, 'MOSTRAR')}");

        ResultSet rs= cmd.executeQuery();
        
        while(rs.next()) {
//            System.out.println(rs.getString(1));
            modelo.addElement(rs.getString(1));
        
        }

        }
        catch(Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

        return modelo; 
    }
    
    public DefaultComboBoxModel llenarClientes ()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel ();
        
        modelo.addElement("000 - Seleccione");
        
        try {
        Connection con = cone.obtenerconexion();

        CallableStatement cmd = con.prepareCall("{CALL SP_CLIENTES()}");

        ResultSet rs= cmd.executeQuery();
        
        while(rs.next()) {
//            System.out.println(rs.getString(1));
            modelo.addElement(rs.getString(1));
        
        }

        }
        catch(Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

        return modelo; 
    }
}
