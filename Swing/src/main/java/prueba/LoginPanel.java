package prueba;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Prueba app;

	/**
	 * Create the panel.
	 */
	public LoginPanel(Prueba app) {
		this.app = app;
		setLayout(null);
		
		JLabel lbLogin = new JLabel("Login");
		lbLogin.setBounds(210, 133, 113, 14);
		add(lbLogin);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirBienvenida();
			}
		});
		btnEntrar.setBounds(187, 158, 89, 23);
		add(btnEntrar);

	}
}
