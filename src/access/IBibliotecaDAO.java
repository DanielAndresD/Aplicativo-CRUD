/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.util.ArrayList;
import model.Biblioteca;

/**
 *
 * @author daniel davila
 */
public interface IBibliotecaDAO {
    //Añadir un registro en la biblioteca
    public void agregarBiblioteca(Biblioteca biblioteca);
    //Obtener los registros de la biblioteca
    public ArrayList <Biblioteca> obtenerBiblioteca();
    // Eliminar un regitro en la biblioteca
    public void eliminarBiblioteca(Biblioteca biblioteca);
    public void actualizarBiblioteca(Biblioteca biblioteca);
    
}
