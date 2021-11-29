/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Contenido;


/**
 *
 * @author daniel davila
 */
public class ContenidoDAO implements IContenidoDAO {
    private Connection conn = null;
        @Override
    public ArrayList<Contenido> obtenerContenido() {
       ArrayList<Contenido> contenidos = new ArrayList<>();
        try {
            if (conn == null) {
                conn = controller.ControlIngresoController.eventoBotonConectarDB(); //Abrir la conexion con DB
                System.out.println(conn);
                //Query de consulta para el objeto contenido
                String sql = "SELECT con_id,con_titulo,con_descripcion \n"
                        + "FROM  contenido;";
                //Generar la consulta
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                //Crear los objetos de consulta y añadirlos a la lista contenidos
                while (result.next()) {
                    Contenido contenido = new Contenido(result.getInt(1), result.getString(2),result.getString(3));
                    contenidos.add(contenido);
                }
                conn.close();
            }
        } catch (SQLException ex) {
        }
        return contenidos;
    }
}
