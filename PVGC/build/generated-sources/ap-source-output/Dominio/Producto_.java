package Dominio;

import Dominio.Categoria;
import Dominio.DetalleOrden;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-01T04:04:42")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile ListAttribute<Producto, DetalleOrden> detalleOrdenes;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SingularAttribute<Producto, Boolean> disponibilidad;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Long> id;
    public static volatile SingularAttribute<Producto, String> nombre;

}