package swing.ejercicio3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ejercicio5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 window = new Ejercicio5();
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
	public Ejercicio5() {
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
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setBounds(167, 138, 97, 31);
		frame.getContentPane().add(btnSumar);
		
		JLabel lbltexto = new JLabel("");
		lbltexto.setBounds(167, 108, 267, 22);
		frame.getContentPane().add(lbltexto);
		
		
		ActionListener sumar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lbltexto.getText().equals("")) {
					lbltexto.setText("1");
				}
				else {
					int number = Integer.parseInt(lbltexto.getText());
					int suma = number+1;
					String texto = suma+"";
					lbltexto.setText(texto);
				}
			}
		
		};
		
		btnSumar.addActionListener(sumar);
	}

	
}
