package access;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Cliente;
import utils.ConexionDB;

/**
 *
 * @author JULIAN C
 */
public class ClienteDAO implements IClienteDAO{
    private Connection conn = null;

    @Override
    public ArrayList<Cliente> obtenerClientes() {
       ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            if (conn == null) {
                conn = controller.ControlIngresoController.eventoBotonConectarDB(); //Abrir la conexion con DB
                System.out.println(conn);
                //Query de consulta para el objeto bibloteca
                String sql = "SELECT cli_tag \n"
                        + "FROM  cliente;";
                //Generar la consulta
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                //Crear los objetos de consulta y añadirlos a la lista bibliotecas
                while (result.next()) {
                    Cliente cliente = new Cliente(result.getString(1));
                    clientes.add(cliente);
                    System.out.println(cliente.getClienteNombre());
                }
                conn.close();
            }
        } catch (SQLException ex) {
        }
        return clientes;
    }
    
}
