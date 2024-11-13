package ejercicio5Interfaz;

import javax.swing.JPanel;

import ejercicios.ejercicio05.model.User;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ProfilePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private AppController app;
	private User user;

	/**
	 * Create the panel.
	 */
	public ProfilePanel(AppController app,User user) {
		this.app = app;
		this.user = user;
		setLayout(null);

		JLabel lblTitulo = new JLabel("BIENVENIDO OTRA VEZ" + user.getUsername());
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblTitulo.setBounds(77, 137, 343, 14);
		add(lblTitulo);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(176, 199, 89, 23);
		add(btnSalir);

		JLabel lblPregunta = new JLabel("¿Quieres cambiar la password?");
		lblPregunta.setBounds(54, 169, 198, 14);
		add(lblPregunta);

		JButton btnChangePass = new JButton("Cambiar Contraseña");
		btnChangePass.setBounds(268, 165, 152, 23);
		add(btnChangePass);

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirLogin();
			}
		});

		btnChangePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirchangePass();
			}
		});

	}
}
