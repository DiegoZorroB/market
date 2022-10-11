package com.platzi.market.persistence.entity;


import javax.persistence.*;
import java.util.List;

/*
   +Con entity se indica que es una entidad, osea, una tabla
   +Con table se indica el nombre de la tabla de la BD que se relacionará
 */
@Entity
@Table(name = "clientes")
public class Cliente {


    //Con ID se indica que esta variable sera la llave primaria
    @Id
    private String id;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private String nombre;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private String apellidos;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private Integer celular;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private String direccion;

    /*
   Con column se indica el nombre de la columna a relacionar la variable
   indicada justo debajo
   */
    @Column(name = "correo_electronico")
    private String correoElectronico;


    /*
    +Aqui se vincula la relacion de tablas entre Cliente y Compra

    +Se declara una lista de tipo Compra(Clase con la que se relacionrará)

    +El OneToMany es la relacion que tiene con la clase Compra
    y el mappedBy se usa para vincularlo con la variable de la clase
    Compra que vincula a esta clase
    */
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    //Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
