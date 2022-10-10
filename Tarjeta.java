package tarea1;

public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;
    
    public Tarjeta(int i, String tipoTarj, String numTrans){
        super(i);
        tipo= tipoTarj;
        numTransaccion = numTrans; 
    }
    
    public String getTipoTarj(){
        return this.tipo;
    }
    public String getTransaccion(){
        return this.getTransaccion();
    }
}
