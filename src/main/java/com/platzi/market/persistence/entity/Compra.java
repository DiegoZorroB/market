package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
   +Con entity se indica que es una entidad, osea, una tabla
   +Con table se indica el nombre de la tabla de la BD que se relacionará
 */
@Entity
@Table(name = "compras")
public class Compra {

    /*
    +Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo

    +Con ID se indica que esta variable sera la llave primaria

    +Con GeneratedValue(strategy = GenerationType.IDENTITY)
    genera automaticamente este valor del indice tal como en la BD
     */

    @Column(name = "id_compra")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;

    /*
    Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo
     */
    @Column(name = "id_cliente")
    private String idCliente;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private LocalDateTime fecha;

    /*
    Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo
    */
    @Column(name = "medio_pago")
    private String medioPago;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private String comentario;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private String estado;

    //Getters and Setters

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
