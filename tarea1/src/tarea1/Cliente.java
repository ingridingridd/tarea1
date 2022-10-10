package tarea1;

public class Cliente {
    private String nombre;
    private String rut;
    public Direccion direc;
    
    public Cliente(String nom, String r){
        nombre = nom;
        rut = r;
    }
    public String getNombreCliente(){
        return this.nombre;
    }
    public void setNombreCliente(String nuevoNomCliente){
        this.nombre = nuevoNomCliente;
    }
     public String getRutCliente(){
        return this.rut;
    }
    public void setRutCliente(String nuevoRutCliente){
        this.nombre = nuevoRutCliente;
    }
    public String getDirCliente(){
        return this.direc.getDireccion();
    }
}
