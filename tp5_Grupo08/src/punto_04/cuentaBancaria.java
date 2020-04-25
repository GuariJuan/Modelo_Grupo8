package punto_04;

public class cuentaBancaria {
	private int saldoActual=10000;

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}
	public void extraer(int valorRetiro) {
		saldoActual-=valorRetiro;
	}
	public void depositar(int valorDeposito) {
		saldoActual+=valorDeposito;
	}

}
