package ejercicio7Cafeteria;

public class Run {

	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria();
		for (int i = 1; i <= 100; i++) {
			new Thread(new Alumno(cafeteria)).start();
		}
		for (int i = 1; i <= 20; i++) {
			new Thread(new Profesor(cafeteria)).start();
		}

	}

}
