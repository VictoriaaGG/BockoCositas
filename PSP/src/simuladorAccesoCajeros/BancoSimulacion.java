package simuladorAccesoCajeros;

public class BancoSimulacion {

	public static void main(String[] args) {
		CuentaBancaria a = new CuentaBancaria(1000);
		
		Cliente juan = new Cliente(a,"Juan");
		Cliente martin = new Cliente(a,"Martin");
	}

}
