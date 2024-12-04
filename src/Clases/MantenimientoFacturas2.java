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
public class MantenimientoFacturas2 {
    Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
    
    public static Integer ingresar(Integer vrid_tipo, String vrfecha, String vrnumero, Integer vrid_cliente, String vrfecha_desde, String vrfecha_hasta) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
            
        String query = "{CALL SP_FACTURAS (?, ?, ?, ?, ?, ? 'INGRESAR')}";

        try { 
             Connection con = cone.obtenerconexion(); 
             
             CallableStatement stmt = con.prepareCall(query);
             stmt.setInt(1, vrid_tipo);
             stmt.setString(1, vrfecha);
             stmt.setString(1, vrnumero);
             stmt.setInt(1, vrid_cliente);
             stmt.setString(1, vrfecha_desde);
             stmt.setString(1, vrfecha_hasta);
             stmt.setString(1, "INGRESAR");

            try 
            {
                stmt.execute();
            }
            catch (SQLException ex) {
                System.err.println(ex.toString());
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        return 0;
    }
    
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
}
