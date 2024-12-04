/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author JuanRa
 */
public class MantenimientoFacturas {
    Conexionsqlnetbeans cone = new Conexionsqlnetbeans();

    
    public Integer ingresar(Integer vrid_tipo, String vrfecha, String vrnumero, Integer vrid_cliente, String vrfecha_desde, String vrfecha_hasta) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
            
        String query = "{CALL SP_FACTURAS (?, ?, ?, ?, ?, ?, 'INGRESAR')}";

        try { 
             Connection con = cone.obtenerconexion(); 
             
             CallableStatement stmt = con.prepareCall(query);
             stmt.setInt(1, vrid_tipo);
             stmt.setString(2, vrfecha);
             stmt.setString(3, vrnumero);
             stmt.setInt(4, vrid_cliente);
             stmt.setString(5, vrfecha_desde);
             stmt.setString(6, vrfecha_hasta);
            
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
}
