package punto04;

public class cajero {
	int dineroEnCuenta =1000;

	public static void main(String[] args) {
		String nombre="pablo";
		int dineroEnCuenta=1000;
		Depositar deposito = new Depositar();
		Extraccion extraccion = new Extraccion();
		//synchronized ()
		
		
		deposito.enviar(dineroEnCuenta);
		extraccion.enviar(dineroEnCuenta);
		
		deposito.start();
		dineroEnCuenta=dineroEnCuenta+deposito.monto;
		extraccion.start();	
		dineroEnCuenta=dineroEnCuenta-extraccion.monto;
		
		try {
			deposito.join();
			extraccion.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("el monto final es"+ dineroEnCuenta);
	}
}
