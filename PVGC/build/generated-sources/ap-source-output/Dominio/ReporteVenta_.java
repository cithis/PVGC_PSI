package Dominio;

import Dominio.Empleado;
import Dominio.Venta;
import Enums.Periodo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-25T18:18:02")
@StaticMetamodel(ReporteVenta.class)
public class ReporteVenta_ { 

    public static volatile SingularAttribute<ReporteVenta, Periodo> periodo;
    public static volatile SingularAttribute<ReporteVenta, Empleado> empleado;
    public static volatile ListAttribute<ReporteVenta, Venta> ventas;
    public static volatile SingularAttribute<ReporteVenta, Long> id;

}