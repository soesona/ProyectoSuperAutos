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
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;



/**
 *
 * @author Sthefany
 */
public class Validaciones {
   public static boolean esCampoVacio(JTextField campo, String nombreCampo) {
        if (campo.getText().trim().isEmpty()) {
       
            JOptionPane.showMessageDialog(null, "El campo " + nombreCampo + " no puede estar vacío.");
            return true;
        }
        return false;
    }

    public static boolean esComboVacio(JComboBox combo) {
        if (combo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción del comboBox.");
            return true;
        }
        return false;
    }

    public static boolean esSoloNumeros(JTextField campo, String nombreCampo) {
        String texto = campo.getText();
        if (!texto.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "El campo " + nombreCampo + " solo puede contener números.");
            return false;
        }
        return true;
    }

  public static boolean esSoloLetras(JTextField campo, String nombreCampo) {
    String texto = campo.getText();
 
     if (!texto.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜ\\s]+")) {
        JOptionPane.showMessageDialog(null, "El campo " + nombreCampo + " solo puede contener letras, tildes y espacios.");
        return false;
    }
    return true;
   
}

    public static boolean esAlfanumerico(JTextField campo, String nombreCampo) {
        String texto = campo.getText();
       if (!texto.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜ0-9\\s]+")) {
        JOptionPane.showMessageDialog(null, "El campo " + nombreCampo + " solo puede contener letras, números, tildes y espacios.");
        return false;
    }
    return true;
     
    }

    public static boolean esCorreoValido(JTextField campo, String nombreCampo) {
        String texto = campo.getText();
        if (!texto.matches("[a-zA-Z0-9]+[a-zA-Z0-9._%+-]*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            JOptionPane.showMessageDialog(null, "El correo en el campo " + nombreCampo + " no es válido. Solo se permiten números, letras, @ y el punto");
            return false;
        }
        return true;
    }
    
   public static boolean esTelefonoValido(JTextField campo) {
    String texto = campo.getText();
    
   
    if (!texto.matches("[0-9]{8}")) {
        JOptionPane.showMessageDialog(null, "El número de teléfono debe contener exactamente 8 dígitos y solo se permiten números.");
        return false;
    }

    return true;
   
}
   
    public static boolean esRtnValido(JTextField campo, String nombreCampo) {
        String texto = campo.getText();
        if (!texto.matches("[0-9]{14}")) {
            JOptionPane.showMessageDialog(null, "El " + nombreCampo + " debe contener exactamente 14 dígitos numéricos.");
            return false;
        }
        return true;
    }
}
