/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import utils.DatosConexion;
import view.ControlIngresoView;

/**
 *
 * @author daniel davila
 */
public class ControlIngresoController {

    public static ControlIngresoView ingresoVentana = new ControlIngresoView();

    public static void mostrar() {
        ingresoVentana.setVisible(true);
    }

    public static void ocultar() {
        ingresoVentana.setVisible(false);
    }
/*   

    */

    /**
     *
     * @return Obtiene los datos necesarios para conectarse con la Base de datos para realizar transacciones (Crear,Leer,Actualizar,Borrar)
     */

    public static Connection eventoBotonConectarDB() {  
        String host = ingresoVentana.getTxtHost().getText();
        String port = ingresoVentana.getTxtPuerto().getText();
        String username = ingresoVentana.getTxtUsuario().getText();
        String password = ingresoVentana.getTxtContrasena().getText();
        String nameDB = ingresoVentana.getTxtDB().getText();
        DatosConexion datos= new DatosConexion(host,port,username,password,nameDB);
        return utils.ConexionDB.getConnection(datos);
    }
}
