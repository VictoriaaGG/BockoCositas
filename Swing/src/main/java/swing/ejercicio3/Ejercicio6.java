package swing.ejercicio3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejercicio6 {

	private JFrame frame;
	private JTextField tfNumeros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 window = new Ejercicio6();
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
	public Ejercicio6() {
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
		
		tfNumeros = new JTextField();
		tfNumeros.setBounds(274, 138, 97, 31);
		frame.getContentPane().add(tfNumeros);
		tfNumeros.setColumns(10);
		
		

		ActionListener sumar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				if (tfNumeros.getText().equals("")) {
					lbltexto.setText("1");
				} 
				else {
					int number = Integer.parseInt(tfNumeros.getText());
					int suma = number + 1;
					String texto = suma + "";
					lbltexto.setText(texto);
				}
				}catch(NumberFormatException a) {
					JOptionPane.showMessageDialog( null,"Eres tontísimo y feísimo.");
		        }
				}
					
				
			};


		btnSumar.addActionListener(sumar);
	}

}
