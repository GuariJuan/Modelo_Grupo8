package punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String frase;
		Scanner escaner = new Scanner (System.in); 
	    
		System.out.print("INGRESE UNA FRASE: ");
		frase=escaner.nextLine();
		escaner.close();
		for(int ronda =0;ronda<10;ronda++) {	
		for (int i=0;i<frase.length();i++) {
			Impresion hilo1=new Impresion();
			hilo1.setCaracater(frase.charAt(i));
			hilo1.start();
			try {
				hilo1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		}
	}

}
