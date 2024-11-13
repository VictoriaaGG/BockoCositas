package prueba;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class BienvenidaPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Prueba app;
	/**
	 * Create the panel.
	 */
	public BienvenidaPanel(Prueba app) {
		this.app = app;
		setLayout(null);
		
		JLabel lbWelcome = new JLabel("WELCOMETOTHENIKONESITICONESHION");
		lbWelcome.setBounds(116, 131, 275, 14);
		add(lbWelcome);
		
		JButton btnSalir = new JButton("SALIR YA");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirLogin();
			}
		});
		btnSalir.setBounds(166, 166, 89, 23);
		add(btnSalir);
		

	}

}
