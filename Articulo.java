package tarea1;

public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;  
    public DetalleOrden detOrden;
    
    public Articulo(String nom, String desc, float peso, float prec){
       this.nombre = nom;
       this.descripcion = desc;
       this.precio = prec;
       this.peso = peso;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNom){
        this.nombre = nuevoNom;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String nuevaDesc){
        this.descripcion= nuevaDesc;
    }
    public Float getPrecio(){
        return this.precio;
    }
    public void setPrecio(Float nuevoPrecio){
        this.precio= nuevoPrecio;
    }
    public Float getPeso(){
        return this.peso;
    }
    public void setPeso(Float nuevoPeso){
        this.precio= nuevoPeso;
    }
}
