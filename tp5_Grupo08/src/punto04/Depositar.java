package punto04;

public class Depositar extends Thread{
	int monto;
	@Override
    public void run() {
    	//for (int i=0;i<5;i++) {
    	monto=monto+400;
    	System.out.println("Deposito "+monto+" Ahora: ");//+dineroEnCuenta);
    	//}
    }
	
	public void enviar(int monto) {
		this.monto=monto;
		
	}
}