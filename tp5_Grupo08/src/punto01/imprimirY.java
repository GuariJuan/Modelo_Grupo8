package punto01;

public class imprimirY extends Thread {
	
	public void run(){
		for (int i=0;i<100;i++) {
			System.out.print("."+i+"Y"+".");
		}
		
	}

}