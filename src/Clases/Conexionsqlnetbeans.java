/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author Sthefany
 */
/*public class Conexionsqlnetbeans {
    Connection conexion = null;
    String usuario = "admin2";
    String clave ="password";
    String db = "SuperAutos33";
    
    
     public Connection obtenerconexion() 
{
    try {
        /*String cadena = "jdbc:sqlserver://localhost;databaseName=SuperAutos33;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";*/
        
        /*String cadena = "jdbc:sqlserver://localhost:1433;databaseName=SuperAutos33;user=admin2;password=password;encrypt=true;trustServerCertificate=true";
        
        conexion = DriverManager.getConnection(cadena);
       
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
    }
    return conexion;
}

}*/


public class Conexionsqlnetbeans {

    public static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection conexion = null;

    public Connection obtenerconexion() {
        try {
            String cadena = "jdbc:sqlserver://localhost:1433;databaseName=SuperAutos33;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
            conexion = DriverManager.getConnection(cadena);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        return conexion;
    }
}
