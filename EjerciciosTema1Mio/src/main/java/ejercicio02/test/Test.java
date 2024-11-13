package ejercicio02.test;

import java.util.Map;

import ejercicio02.modelo.Cliente;
import ejercicio02.services.ClientesException;
import ejercicio02.services.ClientesService;

public class Test {

	public static void main(String[] args) {
		
		ClientesService service = new ClientesService();
		try {
			Map<String,Cliente> mapa = service.devolverMapa();
			for (Map.Entry<String, Cliente> entry : mapa.entrySet()) {
				String email = entry.getKey();
				Cliente cliente = entry.getValue();
				if ( email.equals("MARILYN.ROSS@sakilacustomer.org")) {
				System.out.println("Email: " + email + ", Cliente: " + cliente);
				}
			}
		}catch (ClientesException e) {
			e.printStackTrace();
		}
	}

}
