package simuladorAccesoCajeros;

import java.util.List;

public class CuentaBancaria {
	private int saldo;
	private List<String> registroTransacciones;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public List<String> getRegistroTransacciones() {
		return registroTransacciones;
	}

	public void setRegistroTransacciones(List<String> registroTransacciones) {
		this.registroTransacciones = registroTransacciones;
	}

	public CuentaBancaria(int saldo) {
		super();
		this.saldo = saldo;
	}

	public synchronized Boolean retirarDinero(int cantidad, String nombre) {
		if (cantidad >= 0 && (!(cantidad>saldo))) {
			saldo = saldo - cantidad;
			return true;
		}
		return false;

	}

	public int obtenerSaldo() {
		return saldo;
	}

	public void registrarTransaccion(String transaccion) {
		registroTransacciones.add(transaccion);
	}

	public void imprimirHistorialTransacciones() {
		System.out.println(registroTransacciones);
	}

}
