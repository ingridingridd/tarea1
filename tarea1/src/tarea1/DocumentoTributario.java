package tarea1;

import java.util.Date;

public class DocumentoTributario {
    private String numero;
    private String rut;
    private Date fecha;
    public Direccion direc; 
    
    public DocumentoTributario(String num, String rutt){
        numero = num;
        rut = rutt;
    }
    
    public String getNumero(){
        return this.numero;
    }
    public String getRut(){
        return this.rut;
    }
    public String getDirec(){
        return this.direc.getDireccion();
    }
}
