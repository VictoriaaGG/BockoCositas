package prueba;

public class Test{

	public static void main(String[] args) {
		ActorService a = new ActorService();
		String filtro = "PENELOPE";
		try {
			System.out.println(a.consultarActores(filtro));
			
		} catch (NoHayActoresException e) {
			
			e.printStackTrace();
		}

	}

}
