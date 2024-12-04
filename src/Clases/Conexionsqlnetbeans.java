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
public class Conexionsqlnetbeans {
    Connection conexion = null;
    String usuario = "localhost";
    String clave ="31468";
    String db = "SuperAutos";
    
    
     public Connection obtenerconexion() 
{
    try {
        String cadena = "jdbc:sqlserver://localhost;databaseName=SuperAutos;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
        
        conexion = DriverManager.getConnection(cadena);
       
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
    }
    return conexion;
}

}

