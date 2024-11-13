package ejercicio12;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Pantalla3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfTexto;
	private App app;


	/**
	 * Create the panel.
	 */
	public Pantalla3(App app) {
		this.app = app;
		setLayout(null);
		
		tfTexto = new JTextField();
		tfTexto.setBounds(173, 106, 86, 20);
		add(tfTexto);
		tfTexto.setColumns(10);
		
		JButton btnPantalla2 = new JButton("Ir a Pantalla2");
		btnPantalla2.setBounds(152, 165, 126, 23);
		add(btnPantalla2);
		
		JButton btnPantalla3 = new JButton("Ir a Pantalla3");
		btnPantalla3.setBounds(274, 165, 160, 23);
		add(btnPantalla3);
		btnPantalla3.setEnabled(false);
		
		JButton btnPantalla1 = new JButton("Ir a Pantalla1");
		btnPantalla1.setBounds(0, 165, 157, 23);
		add(btnPantalla1);
		
		btnPantalla1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirPantalla1(tfTexto.getText());
			}
		});
		btnPantalla2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirPantalla2(tfTexto.getText());
			}
		});

	}
	public void setTexto(String texto) {
		tfTexto.setText(texto);
	}

}
