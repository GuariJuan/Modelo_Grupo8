package punto04;

public class Extraccion extends Thread{
	 int monto;
	 @Override
	public void run() {
    	//for (int i=0;i<5;i++) {
        	monto=monto-300;
        	System.out.println("Extraccion "+monto+" Ahora: ");//+dineroEnCuenta);
    	//}
    }
	
	public void enviar(int monto) {
		this.monto=monto;
	}
}