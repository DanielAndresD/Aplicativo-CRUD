/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import access.BibliotecaDAO;
import access.ClienteDAO;
import access.ContenidoDAO;
import java.util.ArrayList;
import model.Biblioteca;
import model.Cliente;
import model.Contenido;
import view.vistaRegistros;

/**
 *
 * @author daniel davila
 */
public class vistaVentanaController {

    public static vistaRegistros ventanaRegistros = new vistaRegistros();

    public static void mostrar() {
        ventanaRegistros.setVisible(true);
    }

    public static void ocultar() {
        ventanaRegistros.setVisible(false);
    }

    public static ArrayList<Biblioteca> buscarRegistros() {
        BibliotecaDAO transaccion = new BibliotecaDAO();
        return transaccion.obtenerBiblioteca();
    }

    public static ArrayList<Contenido> buscarContenidos() {
        ContenidoDAO transaccion = new ContenidoDAO();
        return transaccion.obtenerContenido();
    }

    public static ArrayList<Cliente> buscarClientes() {
        ClienteDAO transaccion = new ClienteDAO();
        return transaccion.obtenerClientes();
    }

    public static ArrayList<Biblioteca> buscarFechas() {
        BibliotecaDAO transaccion = new BibliotecaDAO();
        return transaccion.obtenerBibliotecaFecha();
    }

}
