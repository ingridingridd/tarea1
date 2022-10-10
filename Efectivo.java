
package tarea1;

public class Efectivo extends Pago {
    public Efectivo(int i){
        super(i);
    }
    public float calcDevolucion(float pagado){
        //vuelto
        return super.getMonto();
    }
}
