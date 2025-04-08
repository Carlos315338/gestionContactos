/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import dao.UsuarioDAO;
/**
 *
 * @author carlos
 */
public class AuthController {

    private final UsuarioDAO usuarioDAO;

    // Método que controla la lógica de autenticación
    public AuthController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        // Delegamos la validación de credenciales al UsuarioDAO
        return usuarioDAO.validarCredenciales(usuario, contrasena);
    }
}
