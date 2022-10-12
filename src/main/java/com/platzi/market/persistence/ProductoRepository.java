package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

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


}
