package paquete_1_5;

public class LSorteoSimulator {

	public static void main(String[] args) {
		SorteoSimulator bonolotoAl = new SorteoSimulator("bonoloto alemana", 1, 40, 6);
		bonolotoAl.generarUnaCombinacionGanadora(300);
	}

}
