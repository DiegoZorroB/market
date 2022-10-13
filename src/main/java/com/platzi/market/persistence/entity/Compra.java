package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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


    /*
    +Aqui se hace la relacion de la tabla compra con la tabla cliente

    +ManyToOne indicando que la relacion es muchos a uno

    +JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    indicando con cual columna esta relacionada(En esta clase),
    ademas diciendo que no se va a actualizar ni insertar datos

    +La variable se crea de tipo Cliente ya que de esa clase se saca
    la columna con la que se relaciona esta clase
    */
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    /*
    +Aqui se vincula la relacion de tablas entre Compra y ComprasProducto

    +Se declara una lista de tipo ComprasProducto(Clase con la que
     se relacionrará)

    +El OneToMany es la relacion que tiene con la clase ComprasProducto
    y el mappedBy se usa para vincularlo con la variable de la clase
    ComprasProducto que vincula a esta clase
    */
    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ComprasProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<ComprasProducto> productos) {
        this.productos = productos;
    }
}
