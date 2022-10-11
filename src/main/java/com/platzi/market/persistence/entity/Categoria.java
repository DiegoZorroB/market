package com.platzi.market.persistence.entity;

import javax.persistence.*;

/*
   +Con entity se indica que es una entidad, osea, una tabla
   +Con table se indica el nombre de la tabla de la BD que se relacionará
 */
@Entity
@Table(name = "categorias")
public class Categoria {

    /*
    +Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo

    +Con ID se indica que esta variable sera la llave primaria

    +Con GeneratedValue(strategy = GenerationType.IDENTITY)
    genera automaticamente este valor del indice tal como en la BD
    */
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private String descripcion;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private Boolean estado;

    //Getters and Setters

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
