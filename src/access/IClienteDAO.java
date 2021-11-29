package access;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author JULIAN C
 */
public interface IClienteDAO {    
    /**
     * SELECT *
     * @return Devuelve lista de todos los clientes
     */
    ArrayList<Cliente> obtenerClientes();
     
}
