package Dominio;

import Dominio.DetalleOrden;
import Dominio.Venta;
import Enums.Estado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-27T20:15:42")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-27T23:34:16")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-27T20:15:42")
>>>>>>> d1417f6f56c2826856ec3b6638e7b576f9bacba7
>>>>>>> Stashed changes
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile ListAttribute<Orden, DetalleOrden> detalleOrdenes;
    public static volatile SingularAttribute<Orden, Estado> estado;
    public static volatile SingularAttribute<Orden, Venta> venta;
    public static volatile SingularAttribute<Orden, Integer> numMesa;
    public static volatile SingularAttribute<Orden, Long> id;

}