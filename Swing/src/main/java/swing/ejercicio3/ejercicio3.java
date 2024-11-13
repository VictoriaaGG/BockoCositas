package swing.ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3 window = new ejercicio3();
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
	public ejercicio3() {
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

		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lblTexto.setText("Has pulsado el botón 1");
			}
		});
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lblTexto.setText("Has pulsado el botón 2");
			}
		});
		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lblTexto.setText("Has pulsado el botón 3");
			}
		});
	}

}
