package tarea1;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    
    public Transferencia(int i, String banc, String ncuenta){
        super(i);
        banco = banc;
        numCuenta= ncuenta;
    }
    
    public String getBanco(){
        return this.banco;
    }
}
