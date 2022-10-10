package tarea1;

public class Direccion {
    private String direccion;
    public Cliente dirCliente;
    public DocumentoTributario docTributario;
    
    public Direccion(String direc){
        direccion = direc;
    } 
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String newDireccion){
        this.direccion = newDireccion;
    }
}
