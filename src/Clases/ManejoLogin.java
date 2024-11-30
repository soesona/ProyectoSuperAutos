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
import javax.swing.table.DefaultTableModel; 
import javax.swing.ComboBoxModel; 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.sql.*; 
/**
 *
 * @author Sthefany
 */
public class ManejoLogin {
    
     
     
  public static boolean validarUsuario(String usuario, String clave) {
        Conexionsqlnetbeans cone = new Conexionsqlnetbeans(); 
        if (usuario.isEmpty() || clave.isEmpty()) {
            return false; 
        }
        
        
        String query = "SELECT * FROM USUARIOS WHERE CODIGO = ? AND CLAVE = ? AND ACTIVO = 1";
        
        try (Connection con = cone.obtenerconexion(); 
             PreparedStatement ps = con.prepareStatement(query)) { 

            ps.setString(1, usuario);
            ps.setString(2, clave);

            try (ResultSet rs = ps.executeQuery()) { 
                if (rs.next()) {
                    return true; 
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al validar usuario: " + ex.toString());
        }
        
        return false; 
    }
}
