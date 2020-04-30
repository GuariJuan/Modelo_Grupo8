package punto01;

public class Hilo extends Thread {
	private String nombre;
	
	public Hilo (String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	

}
