package ejercicio12;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class Pantalla1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfTexto;
	private App app;

	public Pantalla1(App app) {
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

		JButton btnPantalla1 = new JButton("Ir a Pantalla1");
		btnPantalla1.setBounds(0, 165, 157, 23);
		add(btnPantalla1);
		btnPantalla1.setEnabled(false);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSalir.setBounds(173, 221, 89, 23);
		add(btnSalir);

		btnPantalla3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirPantalla3(tfTexto.getText());
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
