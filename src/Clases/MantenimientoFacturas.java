/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JuanRa
 */
public class MantenimientoFacturas {
    Conexionsqlnetbeans cone = new Conexionsqlnetbeans();

    
    public Integer ingresar(Integer vrid_tipo, Integer vrid_sucursal, String vrfecha, String vrnumero, Integer vrid_cliente, String vrfecha_desde, String vrfecha_hasta) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
            
        String query = "{CALL SP_FACTURAS (?, ?, ?, ?, ?, ?, ?, 'INGRESAR')}";

        try { 
             Connection con = cone.obtenerconexion(); 
             
             CallableStatement stmt = con.prepareCall(query);
             stmt.setInt(1, vrid_tipo);
             stmt.setInt(2, vrid_sucursal);
             stmt.setString(3, vrfecha);
             stmt.setString(4, vrnumero);
             stmt.setInt(5, vrid_cliente);
             stmt.setString(6, vrfecha_desde);
             stmt.setString(7, vrfecha_hasta);
            
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
    
    public Integer ingresar_detalle(Integer vrid_factura, Integer vridvehiculo, Double vrcantidad, Double vrprecio_venta, Double vrdescuento, Double vrimpuesto) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
            
        String query = "{CALL SP_FACTURAS_DETALLES (?, ?, ?, ?, ?, ?)}";

        try { 
             Connection con = cone.obtenerconexion(); 
             
             CallableStatement stmt = con.prepareCall(query);
             stmt.setInt(1, vrid_factura);
             stmt.setInt(2, vridvehiculo);
             stmt.setDouble(3, vrcantidad);
             stmt.setDouble(4, vrprecio_venta);
             stmt.setDouble(5, vrdescuento);
             stmt.setDouble(6, vrimpuesto);
            
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
    
    public Integer obtener_ultimo_id()
    {
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
 
            vrrs = vrstmt.executeQuery("SELECT MAX(ID) ID FROM FACTURAS");
            
            while(vrrs.next())
            {
                vrid = vrrs.getInt(1);
            }
            
        } 
        catch (SQLException vrex) 
        {
            System.out.println(vrex.toString());
        }
      
        return vrid;
    }
}
