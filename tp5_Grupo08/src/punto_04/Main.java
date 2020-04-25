package punto_04;

public class Main {

	public static void main(String[] args) {

		transaccion transaccion = new transaccion();
		Thread persona[]=new Thread[7];
		int turno;

		persona[0]= new Thread(transaccion,"Padre");
		persona[1]= new Thread(transaccion,"Madre");
		persona[2]= new Thread(transaccion,"Tio");
		persona[3]= new Thread(transaccion,"Hijo Mayor");
		persona[4]= new Thread(transaccion,"Hijo Medio");
		persona[5]= new Thread(transaccion,"Hijo Menor");
		persona[6]= new Thread(transaccion,"Hija");
		
		persona[0].start();
		persona[1].start();
		persona[2].start();
		persona[3].start();
		persona[4].start();
		persona[5].start();
		persona[6].start();


	}

}
