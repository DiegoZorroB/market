package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Con Repository indicamos que esta clase interactua con la BD, ya que
//aqui hacemos operaciones que aplicaran en nuestras tablas de la BD
@Repository
public class ProductoRepository {

    //Atributo creado a partir de la interfaz ProductoCrudRepository
    private ProductoCrudRepository productoCrudRepository;

    //Metodo para obtener todos los productos de la BD
    public List<Producto> getAll(){
        /*
           usando la varible previamente creada usamos el metodo
           de la interfaz ProductoCrudRepository findAll()
           para obtener todos los registros
         */
        return (List<Producto>) productoCrudRepository.findAll();
    }

    /*
    Metodo para obtener los productos segun su categoria
    Recibe como parametro el idCategoria(Variable de la clase Producto)
     */
    public List<Producto> getByCategoria(int idCategoria){
        /*
        Usando la variable creada hacemos llamado del metodo
        findByIdCategoriaOrderByNombreAsc(idCategoria)
        pasando como parametro el
        idCategoria(Variable de la clase producto)
         */
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    /*
    Metodo para obtener los productos escasos y su estado
    Recibe como parametro cantidad(Variable de la clase Producto)
     */
    public Optional<List<Producto>> getEscasos(int cantidad){
        /*
        Usando la variable creada hacemos llamado del metodo
        findByCantidadStockLessThanAndEstado(cantidad,true)
        pasando como parametro cantidad(Variable de la clase producto)
        y true diciendo que se obtendran los productos que son escasos
         */
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    //Metodo para obtener un producto segun el id dado
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }


    //Metodo para guardar un producto, recibe el producto como parametro
    public Producto save(Producto producto){
       return productoCrudRepository.save(producto);
    }

    //Metodo para borrar un producto segun su idProducto
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }


}
