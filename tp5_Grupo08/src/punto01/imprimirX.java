package punto01;

public class imprimirX extends Thread {
	
	public void run(){
		for (int i=0;i<100;i++) {
			System.out.print("."+i+"X"+".");
		}
		
	}

}