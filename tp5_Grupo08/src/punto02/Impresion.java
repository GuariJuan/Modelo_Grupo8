package punto02;

public class Impresion extends Thread {
	
	private char caracater;
	@Override
	public void run() {	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 //System.out.print(""+currentThread().getName()+"= "+getCaracater()+" ");
		System.out.print(""+getCaracater()+" ");	
	}
	
	public char getCaracater() {
		return caracater;
	}
	public void setCaracater(char caracater) {
		this.caracater = caracater;
	}
}
