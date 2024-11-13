package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prueba {

	private JFrame frame;
	private JPanel login;
	private JPanel bienvenida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
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
	public Prueba() {
		login = new LoginPanel(this);
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
	
	public void abrirBienvenida() {
		frame.setContentPane(bienvenida);
		frame.revalidate();
	}
	
	public void abrirLogin() {
		frame.setContentPane(login);
		frame.revalidate();
	}

}
