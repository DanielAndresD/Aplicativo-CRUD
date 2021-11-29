/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import model.Biblioteca;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author daniel davila
 */
public class BibliotecaDAO implements IBibliotecaDAO {

    private Connection conn = null;

    /**
     *
     * @param biblioteca
     */
    @Override
    public void agregarBiblioteca(Biblioteca biblioteca) {
        try {
            if (conn == null) {
                conn = controller.ControlIngresoController.eventoBotonConectarDB();
                String sql = "INSERT INTO biblioteca(bib_tag,bib_contenido,bib_fecha) VALUES(?,?,?);";
                PreparedStatement statement = conn.prepareStatement(sql);
                //Inyeccion de datos
                statement.setString(1, biblioteca.getBibliotecaTag());
                statement.setInt(2, biblioteca.getBibliotecaContenidoId());
                statement.setString(3, biblioteca.getBibliotecaFecha());
                int filaInsertada = statement.executeUpdate();
                if (filaInsertada > 0) {
                    System.out.println("Registro agregado");
                } else {
                    System.out.println("No se agregó el registro");
                }
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo agregar el registro");
            ex.getStackTrace();
        }

    }

    /**
     *
     * @param biblioteca
     */
    @Override
    public void eliminarBiblioteca(Biblioteca biblioteca) {
        try {
            if (conn == null) {
                conn = controller.ControlIngresoController.eventoBotonConectarDB();
                String sql = "DELETE FROM biblioteca\n"
                        + "WHERE (bib_id=?);";
                PreparedStatement statement = conn.prepareStatement(sql);
                //Inyeccion de datos
                statement.setInt(1, biblioteca.getBibliotecaId());
                int filaInsertada = statement.executeUpdate();
                if (filaInsertada > 0) {
                    System.out.println("Eliminacion exitosa!");
                } else {
                    System.out.println("No se pudo eliminar el registro");
                }
                conn.close();
            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }

    @Override
    public ArrayList<Biblioteca> obtenerBiblioteca() {
        ArrayList<Biblioteca> bibliotecas = new ArrayList<>();
        try {
            if (conn == null) {
                conn = controller.ControlIngresoController.eventoBotonConectarDB(); //Abrir la conexion con DB
                System.out.println(conn);
                //Query de consulta para el objeto bibloteca
                String sql = "SELECT bib_id,bib_fecha,bib_tag,cli_nombre,con_id,con_titulo \n"
                        + "from biblioteca JOIN cliente JOIN contenido\n"
                        + "ON biblioteca.bib_tag=cliente.cli_tag and biblioteca.bib_contenido=contenido.con_id\n"
                        + " order by bib_id desc ;";
                //Generar la consulta
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                //Crear los objetos de consulta y añadirlos a la lista bibliotecas
                while (result.next()) {
                    Biblioteca biblioteca = new Biblioteca(result.getInt(1),
                            result.getString(2), result.getString(3), result.getString(4), result.getInt(5), result.getString(6));
                    bibliotecas.add(biblioteca);
                    System.out.print(biblioteca.getBibliotecaId() + "\t");
                    System.out.print(biblioteca.getBibliotecaFecha() + "\t");
                    System.out.print(biblioteca.getBibliotecaTag() + "\t");
                    System.out.print(biblioteca.getBibliotecaNombreCliente() + "\t");
                    System.out.print(biblioteca.getBibliotecaTituloContenido() + "\t");
                    System.out.println();
                }
                conn.close();
            }
        } catch (SQLException ex) {
        }
        return bibliotecas;
    }

    /**
     *
     * @param biblioteca Recibe un objeto de clase biblioteca
     */
    @Override
    public void actualizarBiblioteca(Biblioteca biblioteca) {
        try {
            if (conn == null) {
                conn = controller.ControlIngresoController.eventoBotonConectarDB();
                String sql = "UPDATE biblioteca\n"
                        + "SET bib_tag=?,\n"
                        + "SET bib_contenido=?\n"
                        + "WHERE bib_id=?;";
                PreparedStatement statement = conn.prepareStatement(sql);
                //Inyeccion de datos
                statement.setString(1, biblioteca.getBibliotecaTag());
                statement.setInt(2, biblioteca.getBibliotecaContenidoId());
                statement.setInt(3, biblioteca.getBibliotecaId());

                int filaInsertada = statement.executeUpdate();
                if (filaInsertada > 0) {
                    System.out.println("Actualización exitosa!");
                } else {
                    System.out.println("No se pudo actulaizar el registro");
                }
                conn.close();
            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }

    public ArrayList<Biblioteca> obtenerBibliotecaFecha() {
      ArrayList<Biblioteca> bibliotecas = new ArrayList<>();
        try {
            if (conn == null) {
                conn = controller.ControlIngresoController.eventoBotonConectarDB(); //Abrir la conexion con DB
                System.out.println(conn);
                //Query de consulta para el objeto bibloteca
                String sql = "SELECT DISTINCT bib_fecha\n"
                        + "FROM biblioteca\n"
                        + " order by bib_fecha desc;";
                //Generar la consulta
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                //Crear los objetos de consulta y añadirlos a la lista bibliotecas
                while (result.next()) {
                    Biblioteca biblioteca = new Biblioteca(result.getString(1));
                    bibliotecas.add(biblioteca);
                }
                conn.close();
            }
        } catch (SQLException ex) {
        }
        return bibliotecas;}

}
