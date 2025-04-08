/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.Conexion;
import model.Contacto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class ContactoDAO {

    public List<Contacto> listar() {
        List<Contacto> lista = new ArrayList<>();
        String SQL_SELECT_FROM_CONTACTO = "SELECT * FROM contactos";

        try (Connection conn = Conexion.getConexion(); PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_FROM_CONTACTO); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Contacto contacto = new Contacto();
                contacto.setId(rs.getInt("Id"));
                contacto.setNombre(rs.getString("Nombre"));
                contacto.setApellido(rs.getString("Apellido"));
                contacto.setTelefono(rs.getString("Telefono"));
                contacto.setCorreo(rs.getString("Correo"));
                contacto.setDireccion(rs.getString("Direccion"));
                lista.add(contacto);
            }

        } catch (SQLException e) {
            System.err.println("Error al mostrar la lista de contactos: " + e.getMessage());
        }

        return lista;
    }

    public List<Contacto> consultarIdentificacion(int identificacion) {
        List<Contacto> resultado = new ArrayList<>();
        String SQL_SELECT_FROM_WHERE_CONTACTO = "SELECT * FROM contactos WHERE id = ?";

        try (Connection conn = Conexion.getConexion(); PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_FROM_WHERE_CONTACTO)) {

            System.out.println("ContactoDAO" + identificacion);
            stmt.setInt(1, identificacion);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Contacto contacto = new Contacto();
                    contacto.setId(rs.getInt("Id"));
                    contacto.setNombre(rs.getString("Nombre"));
                    contacto.setApellido(rs.getString("Apellido"));
                    contacto.setTelefono(rs.getString("Telefono"));
                    contacto.setCorreo(rs.getString("Correo"));
                    contacto.setDireccion(rs.getString("Direccion"));
                    resultado.add(contacto);
                    System.out.println(contacto);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al mostrar el contacto de contactos: " + e.getMessage());
        }

        return resultado;
    }

    public boolean insertar(Contacto contacto) {
        String SQL_INSERT_CONTACTO = "INSERT INTO contactos (Id, Nombre, Apellido, Telefono, Correo, Direccion) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion(); PreparedStatement stmt = conn.prepareStatement(SQL_INSERT_CONTACTO)) {

            String id = String.valueOf(contacto.getId());
            stmt.setString(1, id);
            stmt.setString(2, contacto.getNombre());
            stmt.setString(3, contacto.getApellido());
            stmt.setString(4, contacto.getTelefono());
            stmt.setString(5, contacto.getCorreo());
            stmt.setString(6, contacto.getDireccion());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al insertar contacto: " + e.getMessage());
        }
        return false;
    }

    public boolean actualizar(Contacto contacto) {
        final String SQL_UPDATE_CONTACTO
                = "UPDATE contactos SET Nombre = ?, Apellido = ?, Telefono = ?, Correo = ?, Direccion = ? WHERE Id = ?";

        try (Connection conn = Conexion.getConexion(); PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE_CONTACTO)) {

            stmt.setString(1, contacto.getNombre());
            stmt.setString(2, contacto.getApellido());
            stmt.setString(3, contacto.getTelefono());
            stmt.setString(4, contacto.getCorreo());
            stmt.setString(5, contacto.getDireccion());
            stmt.setInt(6, contacto.getId());

            int filasActualizadas = stmt.executeUpdate();
            return filasActualizadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar contacto: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int identificacion) {
        String sql = "DELETE FROM contactos WHERE Id = ?";

        try (Connection conn = Conexion.getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, identificacion);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al eliminar contacto: " + e.getMessage());
        }
        return false;
    }
}
