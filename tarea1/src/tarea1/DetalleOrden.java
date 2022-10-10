package tarea1;

import java.util.ArrayList;

public class DetalleOrden {
    private int cantidad;
    private ArrayList<Articulo> detalle;
    public OrdenCompra ordenCompra;
    public Articulo producto;
    
    public DetalleOrden(int c){
        cantidad = c;
        detalle = new ArrayList();
    }
    
    public double calcPrecio(Articulo art){
        //calcular precio total
        double calcularPrecio = (float)cantidad*art.getPrecio()*1.19;
        return calcularPrecio;
    }
    public double calcPrecioSinIva(Articulo art){
//        double iva = art.getPrecio()*0.19;
//        return cantidad*art.getPrecio() - cantidad*iva;
          return cantidad*art.getPrecio();
    }
    public double calcIva(Articulo art){
        double iva= art.getPrecio()*0.19;
        return iva*cantidad;
    }
    public float calcPeso(Articulo art){
        return art.getPeso()*cantidad;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
}
