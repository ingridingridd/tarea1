package tarea1;

import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    public DetalleOrden detOrden; //para asociar las clases
    
    public OrdenCompra(String est){
      //  fecha = f;
        estado = est;
    }
    
    public void calcularPrecioSinIva(){
       
    }
    public double calcularIva(float precio){
        double iva = precio*(1.19);
        return iva;
    }
    public void calcularPrecio(){
        
    }
    public void calcularPeso(){
        
    }

    public String getEstado(){
        return this.estado;
    }
}
