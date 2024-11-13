package ejemplo.app;

import ejemplo.modelo.Politico;

public class App {

	public static void main(String[] args) {
		Politico a = new Politico();
		a.setNombre("Perro Sanxe");
		System.out.println(a.getNombre());
	}

}
