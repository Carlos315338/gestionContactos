/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import database.Conexion;
/**
 *
 * @author carlos
 */
public class UsuarioDAO {

    public boolean validarCredenciales(String usuario, String contrasena) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";

        try (Connection conn = Conexion.getConexion(); PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql)) {

            // Configuración de parámetros
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);

            // Ejecutamos la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                // Si encontramos un resultado, las credenciales son válidas
                return rs.next();
            }
        } catch (Exception e) {
            System.err.println("Error al validar credenciales: " + e.getMessage());
        }

        return false; // Si ocurre un error o no se encuentra registro
    }
}
