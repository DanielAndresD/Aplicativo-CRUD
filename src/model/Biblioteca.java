/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author daniel davila
 *
 *
 * +---------------+----------+------+-----+---------+-------+ 
 * | Field | Type |Null | Key | Default | Extra |
 * +---------------+----------+------+-----+---------+-------+ | bib_id | int |
 * NO | PRI | NULL | | | bib_tag | char(40) | NO | MUL | NULL | | |
 * bib_contenido | int | NO | MUL | NULL | | | bib_fecha | datetime | NO | |
 * NULL | | +---------------+----------+------+-----+---------+-------+
 */
public class Biblioteca {

    //Atributes
    private int bibliotecaId; //Llave de la Tabla biblioteca
    private String bibliotecaFecha;//Fecha de registro
    private String bibliotecaTag;//Usuario
    private String bibliotecaNombreCliente;//Nombre del usuario
    private int bibliotecaContenidoId;//ID de la tabla contenido
    private String bibliotecaTituloContenido;//Titulo de la tabla contenido

    public Biblioteca(String bibliotecaFecha) {
        this.bibliotecaFecha = bibliotecaFecha;
    }

    public Biblioteca(int bibliotecaId, String bibliotecaFecha, String bibliotecaTag, String bibliotecaNombreCliente, int bibliotecaContenidoId, String bibliotecaTituloContenido) {
        this.bibliotecaId = bibliotecaId;
        this.bibliotecaFecha = bibliotecaFecha;
        this.bibliotecaTag = bibliotecaTag;
        this.bibliotecaNombreCliente = bibliotecaNombreCliente;
        this.bibliotecaContenidoId = bibliotecaContenidoId;
        this.bibliotecaTituloContenido = bibliotecaTituloContenido;
    }

    public int getBibliotecaId() {
        return bibliotecaId;
    }

    public String getBibliotecaFecha() {
        return bibliotecaFecha;
    }

    public String getBibliotecaTag() {
        return bibliotecaTag;
    }

    public String getBibliotecaNombreCliente() {
        return bibliotecaNombreCliente;
    }

    public int getBibliotecaContenidoId() {
        return bibliotecaContenidoId;
    }

    public String getBibliotecaTituloContenido() {
        return bibliotecaTituloContenido;
    }

    public Object[] toArray() {
        Object[] data ={bibliotecaId,bibliotecaFecha,bibliotecaTag,bibliotecaNombreCliente,bibliotecaContenidoId,bibliotecaTituloContenido};
        return data;
}

    //Setters y Getters
    /**
     *
     * @return bibliotecaId
     */
}
