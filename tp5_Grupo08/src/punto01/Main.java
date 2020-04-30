package punto01;

public class Main {

	public static void main(String[] args) {
		
		ImprimirFormaSecuencial();
		//Imprimir de Forma Concurrente	
		for (int i=0;i<20;i++) {
			imprimirX hilo1 = new imprimirX();
			imprimirY hilo2 = new imprimirY();

			hilo1.start();
			hilo2.start();
		
		try {
			hilo1.join();
			hilo2.join();
			System.out.println();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		try {
			Thread.sleep(2000);
			System.out.println("\n AL OBSERVAR LOS RESULTADOS DE LA EJECUCION CONCURRENTE\n"
					+ "NOTAMOS QUE LOS RESULTADOS NO SON EXACTAMENTE IGUALES\n"
					+ "ESTO SE DEBE A QUE NO ES POSIBLE SABER CUAL DE LOS 2 HILOS \n"
					+ " ES EL QUE SE EJECUTARA PRIMERO !!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void ImprimirFormaSecuencial() {
		System.out.println("FORMA SECUENCIAL: ");

		for (int i=0;i<100;i++) {
			System.out.print("."+i+"X"+".");
		}
		System.out.println();
		for (int i=0;i<100;i++) {
			System.out.print("."+i+"Y"+".");
		}
		System.out.println();
		System.out.println();
	}
	

}
