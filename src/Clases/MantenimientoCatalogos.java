/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.sql.*;

/**
 *
 * @author JuanRa
 */
public class MantenimientoCatalogos {
    Conexionsqlnetbeans cone = new Conexionsqlnetbeans();

    
    public static Integer ingresar(String vrdescripcion, String vrnombre_tabla) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
        
        if (vrdescripcion.isEmpty()) {
            return -1; 
        }
        
        String query = "{CALL " + vrnombre_tabla + "(0, ?, 'INGRESAR')}";

        try { 
             Connection con = cone.obtenerconexion(); 
             
             CallableStatement stmt = con.prepareCall(query);
             stmt.setString(1, vrdescripcion);

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
    
    public static Integer modificar(Integer vrid, String vrdescripcion, String vrnombre_tabla) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
        
        if (vrdescripcion.isEmpty()) {
            return -1; 
        }
        
        String query = "{CALL " + vrnombre_tabla + "(" + vrid + ", ?, 'ACTUALIZAR')}";

        try { 
             Connection con = cone.obtenerconexion(); 
             
             CallableStatement stmt = con.prepareCall(query);
             stmt.setString(1, vrdescripcion);

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
    
    public static Integer eliminar(Integer vrid, String vrnombre_tabla) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
        
        String query = "{CALL " + vrnombre_tabla + "(" + vrid + ", '', 'ELIMINAR')}";

        try { 
             Connection con = cone.obtenerconexion(); 
             
             CallableStatement stmt = con.prepareCall(query);

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
    
    public DefaultComboBoxModel obtener_catalogo_combo(String vrnombre_tabla)
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        modelo.addElement("Seleccione");
        
        try
        {
            Connection con = cone.obtenerconexion();
            CallableStatement cmd = con.prepareCall("{Call " + vrnombre_tabla + "}");
            
            ResultSet rs = cmd.executeQuery();
            
            while(rs.next())
            {
                modelo.addElement(rs.getString(2));
            }
        }
        catch (Exception ex)
                {
                    System.out.println(ex.toString());
                }
        
        return modelo;
    }
    
    public DefaultTableModel obtener_catalogo_grid(String vrnombre_tabla)
    {
        DefaultTableModel   vrmodelo    = new DefaultTableModel();
        Statement           vrstmt      = null;
        ResultSet           vrrs        = null;
        Connection con = cone.obtenerconexion();
        
        try 
        {   
            if (vrstmt == null)
            {   
                vrstmt = cone.conexion.createStatement() ;
            }
 
            vrrs = vrstmt.executeQuery("SELECT DESCRIPCION FROM " + vrnombre_tabla);
        } 
        catch (SQLException vrex) 
        {
            //ins_log.LB_Log("Error SQL al realizar la consulta *** " + vrquery + ", ver clase cls_controlar_base: " + vrex);
            //ins_log.log("Error SQL al realizar la consulta *** " + vrquery + ", ver clase cls_controlar_base: " + vrex);
        }
        
       try {
            String [] Datos = new String[4];
            vrmodelo      = new DefaultTableModel();
            vrmodelo.addColumn("Descripción");
            
            while(vrrs.next())
            {
                Datos[0] = vrrs.getString(1);;
                
                vrmodelo.addRow(Datos);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return vrmodelo;
    }
    
    public Integer obtener_id(String vrnombre_tabla, String vrdescripcion)
    {
        DefaultTableModel   vrmodelo    = new DefaultTableModel();
        Statement           vrstmt      = null;
        ResultSet           vrrs        = null;
        Connection con = cone.obtenerconexion();
        Integer             vrid        = 0;

        try 
        {   
            if (vrstmt == null)
            {   
                vrstmt = cone.conexion.createStatement() ;
            }
 
            vrrs = vrstmt.executeQuery("SELECT ID FROM " + vrnombre_tabla + " WHERE DESCRIPCION = '" + vrdescripcion + "'");
            
            while(vrrs.next())
            {
                vrid = vrrs.getInt(1);
            }
            
            System.out.println(vrid);
        } 
        catch (SQLException vrex) 
        {
            System.out.println(vrex.toString());
        }
      
        return vrid;
    }
    
    public Double obtener_precio_vehiculo(Integer vrid)
    {
        DefaultTableModel   vrmodelo    = new DefaultTableModel();
        Statement           vrstmt      = null;
        ResultSet           vrrs        = null;
        Connection con = cone.obtenerconexion();
        Double              vrprecio    = 0.00;

        try 
        {   
            if (vrstmt == null)
            {   
                vrstmt = cone.conexion.createStatement() ;
            }
 
            vrrs = vrstmt.executeQuery("SELECT PRECIO_VENTA FROM VEHICULOS WHERE ID = " + vrid);
            
            while(vrrs.next())
            {
                vrprecio = vrrs.getDouble(1);
            }
        } 
        catch (SQLException vrex) 
        {
            System.out.println(vrex.toString());
        }
      
        return vrprecio;
    }
}
