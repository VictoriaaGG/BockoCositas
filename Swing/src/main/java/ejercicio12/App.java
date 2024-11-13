package ejercicio12;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App {

	private JFrame frame;
	private Pantalla1 pantallaVentana1;
	private Pantalla2 pantallaVentana2;
	private Pantalla3 pantallaVentana3;
	private BienvenidaPanel bienvenida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		pantallaVentana1 = new Pantalla1(this);
		pantallaVentana2 = new Pantalla2(this);
		pantallaVentana3 = new Pantalla3(this);
		bienvenida = new BienvenidaPanel(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(bienvenida);
	}

	public void abrirPantalla1(String texto) {
		if (bienvenida.mantener()) {
			pantallaVentana1.setTexto(texto);
		}
		frame.setContentPane(pantallaVentana1);
		frame.revalidate();
	}

	public void abrirPantalla2(String texto) {
		if (bienvenida.mantener()) {
			pantallaVentana2.setTexto(texto);
		}
		frame.setContentPane(pantallaVentana2);
		frame.revalidate();
	}

	public void abrirPantalla3(String texto) {
		if (bienvenida.mantener()) {
			pantallaVentana3.setTexto(texto);
		}
		frame.setContentPane(pantallaVentana3);
		frame.revalidate();
	}

}
