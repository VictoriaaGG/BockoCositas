package simuladorAccesoCajeros;

public class Cliente implements Runnable {
	private CuentaBancaria cuenta;
	private String nombre;

	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente(CuentaBancaria cuenta, String nombre) {
		super();
		this.cuenta = cuenta;
		this.nombre = nombre;
	}

	
	public void run() {

	}
}
