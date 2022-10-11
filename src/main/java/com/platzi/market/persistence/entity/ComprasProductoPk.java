package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/*
    Esta clase es para cuando una tabla tiene mas de una PK
    Entonces aqui solo se declaran las PK
    Funcionado esta clase como una PK compuesta para otra clase
 */

@Embeddable
public class ComprasProductoPk implements Serializable {

    /*
    Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo
     */
    @Column(name = "id_compra")
    private Integer idCompra;

    /*
    Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo
    */
    @Column(name = "id_producto")
    private Integer idProducto;


    //Getters and Setters

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
