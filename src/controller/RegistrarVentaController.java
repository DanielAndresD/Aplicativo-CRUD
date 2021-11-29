/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import access.BibliotecaDAO;
import access.ContenidoDAO;
import static controller.vistaVentanaController.ventanaRegistros;
import java.util.ArrayList;
import model.Biblioteca;
import model.Contenido;
import view.RegistrarVenta;

/**
 *
 * @author daniel davila
 */
public class RegistrarVentaController {

    public static RegistrarVenta ventanaRegistros = new RegistrarVenta();

    public static void mostrar() {
        ventanaRegistros.setVisible(true);
    }

    public static void ocultar() {
        ventanaRegistros.setVisible(false);
    }

    public static void agregarRegistros(ArrayList<Biblioteca> registrosAgregar) {
        BibliotecaDAO transaccion = new BibliotecaDAO();
        for (Biblioteca bib : registrosAgregar) {
            transaccion.agregarBiblioteca(bib);
        }
    }

    public static ArrayList<Contenido> buscarRegistros() {
        ContenidoDAO transaccion = new ContenidoDAO();
        return transaccion.obtenerContenido();
    }

}
