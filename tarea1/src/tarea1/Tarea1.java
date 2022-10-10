package tarea1;

import java.util.ArrayList;
import java.util.Date;

public class Tarea1 {

    public static void main(String[] args) {
        //Orden1
        //cliente1
        Cliente cliente1 = new Cliente("Selena Gomez", "11234567-8");
        Direccion direc1 = new Direccion("Las violetas 1234");
        cliente1.direc = direc1;
        System.out.println(cliente1.getNombreCliente()+" " + cliente1.getRutCliente()+ " " + cliente1.getDirCliente());
        
        //cliente2
        Cliente cliente2 = new Cliente("Taylor Swift", "12345678-9");
        Direccion direc2 = new Direccion("Los Lirios 189");
        cliente2.direc = direc2;
        
        //orden1
        OrdenCompra orden1 = new OrdenCompra("Pagado");
        DetalleOrden det1 = new DetalleOrden(2);
        DetalleOrden det2 = new DetalleOrden(5);
        DetalleOrden det3 = new DetalleOrden(3);
        Articulo art1 = new Articulo("milka", "chocolate con relleno de trufa", 150, 1600);
        Articulo art2 = new Articulo("super8", "galleta cubierta de chocolate", 80, 300);
        Articulo art3 = new Articulo("ramitas", "ramitas sabor queso", 100, 600);
        Articulo art4 = new Articulo("chocman", "Bizcocho bañado de chocolate", 70, 300);
        Articulo art5 = new Articulo("chocochips", "con chips de chocolate", 200, 1000);
        Articulo art6 = new Articulo("Sprite", "bebida salor limon", 500, 1200);
        
        System.out.println("---Detalle compra---");
        System.out.println("Cantidad: " + det1.getCantidad()+ " " +art1.getNombre() + " " + art1.getDescripcion() + " " + art1.getPeso()+ "gr " + art1.getPrecio()+" PRECIO:"+ det1.calcPrecioSinIva(art1)+" IVA:"+ det1.calcIva(art1)+" TOTAL:"+ det1.calcPrecio(art1));
        System.out.println("Cantidad: " + det2.getCantidad()+" " + art2.getNombre() + " " + art2.getDescripcion() + " " + art2.getPeso()+ "gr " + art2.getPrecio()+" PRECIO:"+ det2.calcPrecioSinIva(art2)+" IVA:"+ det2.calcIva(art2)+" TOTAL:"+ det2.calcPrecio(art2));
        System.out.println("Cantidad: " + det3.getCantidad()+" " +art4.getNombre() + " " + art4.getDescripcion() + " " + art4.getPeso()+ "gr " + art4.getPrecio()+" PRECIO:"+ det3.calcPrecioSinIva(art4)+" IVA:"+ det3.calcIva(art4)+" TOTAL:"+ det3.calcPrecio(art4));
        
        double total= det1.calcPrecio(art1)+ det2.calcPrecio(art2)+det3.calcPrecio(art4);
        System.out.println("TOTAL: " + total);
        System.out.println("Estado: " + orden1.getEstado());
        
        
        System.out.println("---Detalle Pago---"); 
        //"Tipo Documento:"
         DocumentoTributario doc = new DocumentoTributario("123", "12345-6");
         Factura factura = new Factura("13", "12345-6"); 
         if(doc.getNumero().equals(factura.getNumero())){
             System.out.println("Tipo Documento: Factura");
         }
         else System.out.println("Tipo Documento: Boleta");

        Pago pa = new Pago(6664);
        Efectivo e = new Efectivo(10000);
        System.out.println("Tipo pago: Efectivo");
        //pa.getMonto();
        System.out.println("vuelto: " + (e.calcDevolucion(10000) - pa.getMonto()));
        
        //orden2
        System.out.println();
        System.out.println(cliente2.getNombreCliente()+" " + cliente2.getRutCliente()+ " " + cliente2.getDirCliente());
        System.out.println("---Detalle compra---");
        
        OrdenCompra orden2 = new OrdenCompra("Pagado");
        DetalleOrden det4 = new DetalleOrden(1);
        DetalleOrden det5 = new DetalleOrden(3);
        
        System.out.println("Cantidad: " + det4.getCantidad()+ " " +art6.getNombre() + " " + art6.getDescripcion() + " " + art6.getPeso()+ "gr " + art6.getPrecio()+" PRECIO:"+ det4.calcPrecioSinIva(art6)+" IVA:"+ det4.calcIva(art6)+" TOTAL:"+ det4.calcPrecio(art6));
        System.out.println("Cantidad: " + det5.getCantidad()+" " + art5.getNombre() + " " + art5.getDescripcion() + " " + art5.getPeso()+ "gr " + art5.getPrecio()+" PRECIO:"+ det5.calcPrecioSinIva(art5)+" IVA:"+ det5.calcIva(art5)+" TOTAL:"+ det5.calcPrecio(art5));
        
        double total2 = det4.calcPrecio(art6)+ det5.calcPrecio(art5);
        System.out.println("TOTAL: " + total2);
        System.out.println("Estado: " + orden1.getEstado());
        
        System.out.println("---Detalle Pago---");
         Transferencia tr = new Transferencia(2, "Banco Estado", "18902893");
         System.out.println("Tipo de pago: transferencia");
         System.out.println("Banco: " + tr.getBanco());
        //"Tipo Documento:"
         DocumentoTributario docu2 = new DocumentoTributario("12", "1232845-6");
         Factura factura2 = new Factura("13", "123405-6"); 
         if(docu2.getNumero().equals(factura2.getNumero())){
             System.out.println("Tipo Documento: Factura");
         }
         else System.out.println("Tipo Documento: Boleta");
        //Pago pa2 = new Pago(10000);
        //Efectivo e2 = new Efectivo(10000);
        
        //orden3
        System.out.println();
        System.out.println(cliente1.getNombreCliente()+" " + cliente1.getRutCliente()+ " " + cliente1.getDirCliente());
        System.out.println("---Detalle compra---");
        
        OrdenCompra orden3 = new OrdenCompra("Pagado");
        DetalleOrden det6 = new DetalleOrden(3);
        DetalleOrden det7 = new DetalleOrden(3);
        
        System.out.println("Cantidad: " + det6.getCantidad()+ " " +art6.getNombre() + " " + art6.getDescripcion() + " " + art6.getPeso()+ "gr " + art6.getPrecio()+" PRECIO:"+ det6.calcPrecioSinIva(art6)+" IVA:"+ det6.calcIva(art6)+" TOTAL:"+ det6.calcPrecio(art6));
        System.out.println("Cantidad: " + det7.getCantidad()+" " + art3.getNombre() + " " + art3.getDescripcion() + " " + art3.getPeso()+ "gr " + art3.getPrecio()+" PRECIO:"+ det7.calcPrecioSinIva(art3)+" IVA:"+ det7.calcIva(art5)+" TOTAL:"+ det7.calcPrecio(art3));
        
        double total3 = det6.calcPrecio(art6)+ det7.calcPrecio(art3);
        System.out.println("TOTAL: " + total3);
        System.out.println("Estado: " + orden3.getEstado());
        
        System.out.println("---Detalle Pago---");
         Tarjeta tar = new Tarjeta(2, "Debito", "15");
         System.out.println("Tipo de pago: tarjeta");
         System.out.println(tar.getTipoTarj());
      
        //"Tipo Documento:"
         DocumentoTributario docu3 = new DocumentoTributario("15", "1232845-6");
         Factura factura3 = new Factura("13", "123405-6"); 
         if(docu2.getNumero().equals(factura3.getNumero())){
             System.out.println("Tipo Documento: Factura");
         }
         else System.out.println("Tipo Documento: Boleta");

    }
    
}
