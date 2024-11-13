package swing.ejercicio3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

public class Ejercicio4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 window = new Ejercicio4();
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
	public Ejercicio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 0, 0, 0));

		JButton btn1 = new JButton("1");

		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		frame.getContentPane().add(btn3);

		JLabel lblTexto = new JLabel("");
		lblTexto.setLabelFor(lblTexto);
		frame.getContentPane().add(lblTexto);

		MouseAdapter botonesAcciones = new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JButton button = (JButton) e.getSource();
				button.setBackground(Color.PINK);
			}

			public void mouseExited(MouseEvent e) {
				JButton button = (JButton) e.getSource();
				button.setBackground(null);

			}
		};

		ActionListener texto = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				button.setText(button.getText() + "!");
				lblTexto.setText("Has pulsado el botón 3");

			}

		};
		btn1.addMouseListener(botonesAcciones);
		btn2.addMouseListener(botonesAcciones);
		btn3.addMouseListener(botonesAcciones);
		btn1.addActionListener(texto);
		btn2.addActionListener(texto);
		btn3.addActionListener(texto);

	}

}
