package com.platzi.market.persistence.entity;

import javax.persistence.*;

/*
   +Con entity se indica que es una entidad, osea, una tabla
   +Con table se indica el nombre de la tabla de la BD que se relacionará
 */
@Entity
@Table(name = "productos")
public class Producto {

    /*
    +Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo

    +Con ID se indica que esta variable sera la llave primaria

    +Con GeneratedValue genera automaticamente este valor del indice
    tal como en la BD
     */
    @Column(name = "id_producto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private String nombre;

    /*
    Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo
     */
    @Column(name = "id_categoria")
    private Integer idCategoria;

    /*
   Con column se indica el nombre de la columna a relacionar la variable
   indicada justo debajo
    */
    @Column(name = "codigo_barras")
    private String codigoBarras;

    /*
    Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo
    */
    @Column(name = "precio_venta")
    private Double precioVenta;

    /*
    Con column se indica el nombre de la columna a relacionar la variable
    indicada justo debajo
    */
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    //Aqui no se indica a que columna pertenece ya que es igual a la de la BD
    private Boolean estado;

    /*
    +Aqui se hace la relacion de la tabla producto con la tabla categoria

    +ManyToOne indicando que la relacion es muchos a uno

    +JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    indicando con cual columna esta relacionada(en esta clase),
    ademas diciendo que no se va a actualizar ni insertar datos

    +La variable se crea de tipo Categoria ya que de esa clase se saca
    la columna con la que se relaciona esta clase
     */
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    //Getters and Setters

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
