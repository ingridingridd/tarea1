package tarea1;

import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    public DetalleOrden detOrden;

    public Pago(float mont){
        monto = mont;
    }
    public Float getMonto(){
        return this.monto;
    }
    public String metodoPago(){
        return "Metodo Pago: ";
    }
}
