package ejerciciosRepaso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio1 {

	private JFrame frame;
	private JTextField tfEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
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
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfEdad = new JTextField();
		tfEdad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == (KeyEvent.VK_DOWN)) {
					if (!(Integer.parseInt(tfEdad.getText()) == 1)) {
						int a = Integer.parseInt(tfEdad.getText()) - 1;
						tfEdad.setText(a + "");
					}
				}
				if (e.getKeyCode() == (KeyEvent.VK_UP)) {
					int a = Integer.parseInt(tfEdad.getText()) + 1;
					tfEdad.setText(a + "");
				}

			}
		});
		tfEdad.setBounds(243, 113, 86, 20);
		frame.getContentPane().add(tfEdad);
		tfEdad.setColumns(10);

		JLabel lblEdad = new JLabel("Introduce tu edad:");
		lblEdad.setBounds(59, 116, 142, 14);
		frame.getContentPane().add(lblEdad);
	}
}
