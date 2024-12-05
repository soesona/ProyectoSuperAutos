/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author aleja
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRUDVehiculos {

    Conexionsqlnetbeans conexionSQL = new Conexionsqlnetbeans();
    
    
    public boolean eliminarVehiculoPorPlaca(String placa) {
    String query = "DELETE FROM VEHICULOS WHERE PLACA = ?";
    try (Connection con = conexionSQL.obtenerconexion();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, placa); // Usamos la placa como identificador
        return pst.executeUpdate() > 0;

    } catch (Exception ex) {
        System.out.println("Error al eliminar vehículo por placa: " + ex.getMessage());
        return false;
    }
}   
    
    public Vehiculo buscarVehiculoPorPlaca(String placa) {
    String query = "SELECT * FROM VEHICULOS WHERE PLACA = ?";
    try (Connection con = conexionSQL.obtenerconexion();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, placa); // Usamos la placa para buscar
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setIdMarca(rs.getInt("ID_MARCA"));
            vehiculo.setIdProveedor(rs.getInt("ID_PROVEEDOR"));
            vehiculo.setIdTipoVehiculo(rs.getInt("ID_TIPO_VEHICULO"));
            vehiculo.setIdTipoTransmision(rs.getInt("ID_TIPO_TRANSMISION"));
            vehiculo.setIdTipoMotor(rs.getInt("ID_TIPO_MOTOR"));
            vehiculo.setVin(rs.getString("VIN"));
            vehiculo.setColor(rs.getString("COLOR"));
            vehiculo.setAnioFabricacion(rs.getInt("ANIO_FABRICACION"));
            vehiculo.setPlaca(rs.getString("PLACA"));
            vehiculo.setAnioMatricula(rs.getInt("ANIO_MATRICULA"));
            vehiculo.setPrecioCosto(rs.getDouble("PRECIO_COSTO"));
            vehiculo.setPrecioVenta(rs.getDouble("PRECIO_VENTA"));
            return vehiculo;
        }

    } catch (Exception ex) {
        System.out.println("Error al buscar vehículo por placa: " + ex.getMessage());
    }
    return null;
}



    // Crear un nuevo vehículo
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        String query = "INSERT INTO VEHICULOS (ID_MARCA, ID_PROVEEDOR, ID_TIPO_VEHICULO, ID_TIPO_TRANSMISION, ID_TIPO_MOTOR, VIN, COLOR, ANIO_FABRICACION, PLACA, ANIO_MATRICULA, PRECIO_COSTO, PRECIO_VENTA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = conexionSQL.obtenerconexion();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, vehiculo.getIdMarca());
            pst.setInt(2, vehiculo.getIdProveedor());
            pst.setInt(3, vehiculo.getIdTipoVehiculo());
            pst.setInt(4, vehiculo.getIdTipoTransmision());
            pst.setInt(5, vehiculo.getIdTipoMotor());
            pst.setString(6, vehiculo.getVin());
            pst.setString(7, vehiculo.getColor());
            pst.setInt(8, vehiculo.getAnioFabricacion());
            pst.setString(9, vehiculo.getPlaca());
            pst.setInt(10, vehiculo.getAnioMatricula());
            pst.setDouble(11, vehiculo.getPrecioCosto());
            pst.setDouble(12, vehiculo.getPrecioVenta());

            return pst.executeUpdate() > 0;

        } catch (Exception ex) {
            System.out.println("Error al agregar vehículo: " + ex.getMessage());
            return false;
        }
    }

    // Leer todos los vehículos
    public List<Vehiculo> listarVehiculos() {
        List<Vehiculo> lista = new ArrayList<>();
        String query = "SELECT * FROM VEHICULOS";
        try (Connection con = conexionSQL.obtenerconexion();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setId(rs.getInt("ID"));
                vehiculo.setIdMarca(rs.getInt("ID_MARCA"));
                vehiculo.setIdProveedor(rs.getInt("ID_PROVEEDOR"));
                vehiculo.setIdTipoVehiculo(rs.getInt("ID_TIPO_VEHICULO"));
                vehiculo.setIdTipoTransmision(rs.getInt("ID_TIPO_TRANSMISION"));
                vehiculo.setIdTipoMotor(rs.getInt("ID_TIPO_MOTOR"));
                vehiculo.setVin(rs.getString("VIN"));
                vehiculo.setColor(rs.getString("COLOR"));
                vehiculo.setAnioFabricacion(rs.getInt("ANIO_FABRICACION"));
                vehiculo.setPlaca(rs.getString("PLACA"));
                vehiculo.setAnioMatricula(rs.getInt("ANIO_MATRICULA"));
                vehiculo.setPrecioCosto(rs.getDouble("PRECIO_COSTO"));
                vehiculo.setPrecioVenta(rs.getDouble("PRECIO_VENTA"));
                lista.add(vehiculo);
            }
        } catch (Exception ex) {
            System.out.println("Error al listar vehículos: " + ex.getMessage());
        }
        return lista;
    }

    // Actualizar un vehículo existente
    public boolean actualizarVehiculo(Vehiculo vehiculo) {
        String query = "UPDATE VEHICULOS SET ID_MARCA = ?, ID_PROVEEDOR = ?, ID_TIPO_VEHICULO = ?, ID_TIPO_TRANSMISION = ?, ID_TIPO_MOTOR = ?, VIN = ?, COLOR = ?, ANIO_FABRICACION = ?, PLACA = ?, ANIO_MATRICULA = ?, PRECIO_COSTO = ?, PRECIO_VENTA = ? WHERE ID = ?";
        try (Connection con = conexionSQL.obtenerconexion();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, vehiculo.getIdMarca());
            pst.setInt(2, vehiculo.getIdProveedor());
            pst.setInt(3, vehiculo.getIdTipoVehiculo());
            pst.setInt(4, vehiculo.getIdTipoTransmision());
            pst.setInt(5, vehiculo.getIdTipoMotor());
            pst.setString(6, vehiculo.getVin());
            pst.setString(7, vehiculo.getColor());
            pst.setInt(8, vehiculo.getAnioFabricacion());
            pst.setString(9, vehiculo.getPlaca());
            pst.setInt(10, vehiculo.getAnioMatricula());
            pst.setDouble(11, vehiculo.getPrecioCosto());
            pst.setDouble(12, vehiculo.getPrecioVenta());
            pst.setInt(13, vehiculo.getId());

            return pst.executeUpdate() > 0;

        } catch (Exception ex) {
            System.out.println("Error al actualizar vehículo: " + ex.getMessage());
            return false;
        }
    }

    // Eliminar un vehículo
    public boolean eliminarVehiculo(int id) {
        String query = "DELETE FROM VEHICULOS WHERE ID = ?";
        try (Connection con = conexionSQL.obtenerconexion();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);
            return pst.executeUpdate() > 0;

        } catch (Exception ex) {
            System.out.println("Error al eliminar vehículo: " + ex.getMessage());
            return false;
        }
    }
}




