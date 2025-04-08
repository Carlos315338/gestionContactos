/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ContactoDAO;
import model.Contacto;
import java.util.List;

/**
 *
 * @author carlos
 */
public class ContactoController {

    private final ContactoDAO dao;

    public ContactoController() {
        dao = new ContactoDAO();
    }

    public List<Contacto> listarContactos() {
        return dao.listar();
    }

    public List<Contacto> consultarIndentificacion(int identificacion) {
        return dao.consultarIdentificacion(identificacion);
    }

    public boolean agregarContacto(Contacto contacto) {
        return dao.insertar(contacto);
    }

    public boolean actualizarContacto(Contacto contacto) {
        return dao.actualizar(contacto);
    }

    public boolean eliminarContacto(int identificacion) {
        return dao.eliminar(identificacion);
    }
}
