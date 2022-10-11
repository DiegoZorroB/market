package com.platzi.market.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/*
   +Con entity se indica que es una entidad, osea, una tabla
   +Con table se indica el nombre de la tabla de la BD que se relacionará
 */
@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    /*
    EmbeddedId se usa cuando la PK es compuesta y  se da por otra clase
    en este caso por la clase ComprasProductoPK

    Se crea una variable de la clase ComprasProductoPK porque esa clase
    contiene la clave primaria,  que son dos, osea es una PK compuesta
    de 2 variables
     */
    @EmbeddedId
    private ComprasProductoPk id;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private Integer cantidad;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private Double total;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private Boolean estado;

    //Getters and Setters

    public ComprasProductoPk getId() {
        return id;
    }

    public void setId(ComprasProductoPk id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
