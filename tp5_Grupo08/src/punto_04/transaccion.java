package punto_04;

public class transaccion implements Runnable{
	cuentaBancaria miCuentaBancaria = new cuentaBancaria();
		
	@Override
	public void run() {
		int valor;
		int numero= (int) (Math.random() * 100) + 1;
		
		
		for(int i=0;i<3;i++) {
			try {
				if( (Thread.currentThread().getName()=="Padre")||(Thread.currentThread().getName()=="Madre")||
				 (Thread.currentThread().getName()=="Tio")){
					valor =  (int) (Math.random()*(5000-100+1)+100);
					depositarDineroCuenta(valor);
					valor =  (int) (Math.random()*(15000-10000+1)+10000);
					Thread.sleep(valor);
					//System.out.println("demoro "+(valor/1000)+" segundos");
				}
				else {
					valor =  (int) (Math.random()*(10000-5000+1)+5000);
					retirarDineroCuenta(valor);	
					valor =  (int) (Math.random()*(10000-5000+1)+5000);
					Thread.sleep(valor);
					//System.out.println("demoro "+(valor/1000)+" segundos");
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	private synchronized void retirarDineroCuenta(int valorRetirar) {
		if(miCuentaBancaria.getSaldoActual()>=valorRetirar) {
			System.out.println("SaldoActual = $"+miCuentaBancaria.getSaldoActual());
			System.out.println("El usuario: "+Thread.currentThread().getName()+" Esta Retirando: $"+valorRetirar);
			miCuentaBancaria.extraer(valorRetirar);
			System.out.println("Extraccion Exitosa !!  Saldo = $"+miCuentaBancaria.getSaldoActual());
			System.out.println();
		}
		else {
			System.out.println(" "+Thread.currentThread().getName()+" No hay Dinero suficiente en Cuenta ! para retirar $"+valorRetirar);
			System.out.println();
		}
 
	}
	
	private synchronized void depositarDineroCuenta(int valorDepositar) {
		System.out.println("SaldoActual = $"+miCuentaBancaria.getSaldoActual());
		System.out.println("El usuario: "+Thread.currentThread().getName()+" Esta depositando: $"+valorDepositar);
		miCuentaBancaria.depositar(valorDepositar);
		System.out.println("Deposito Exitoso !!  Saldo = $"+miCuentaBancaria.getSaldoActual());
		System.out.println();
	}
	
}