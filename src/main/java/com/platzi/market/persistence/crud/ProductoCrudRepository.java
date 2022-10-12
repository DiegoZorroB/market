package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/*
    Con CrudRepository<Producto,Integer> se pueden realizar operaciones
    tipo crud, indicando en los parametros requeridos el nombre de la
    tabla y el tipo de dato del ID de la tabla
 */
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    /*
    +Metodo para obtener los productos segun su categoria

    +Aqui se indica que se encontrara los productos segun el
    idCategoria(Nombre de variable en la clase Producto),
    como parametro se pasa el nombre de la variable de la
    clase Producto y su tipo de dato, todo esto ordenado segun
    su nombre ascendentemente

     */
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    /*
    +Metodo para obtener la cantidad los productos y su estado

    +Aqui se indica que se obtendrá los productos escasos segun
    cantidadStock(Nombre de variable en la clase Producto)
    y Estado, como parametro se pasa el nombre de las
    variables de la clase indicados en el Query(cantidadStock y Estado)
    */
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
