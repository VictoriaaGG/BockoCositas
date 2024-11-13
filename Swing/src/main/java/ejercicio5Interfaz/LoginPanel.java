package ejercicio5Interfaz;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ejercicio5Interfaz.components.MyTextLimitField;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginPanel extends View {

	private static final long serialVersionUID = 1L;
	private MyTextLimitField tfUsuario;
	private JPasswordField pfContraseña;

	/**
	 * Create the panel.
	 * 
	 */
	public LoginPanel(AppController app) {
		super(app);
		setLayout(null);

		JLabel lblTitulo = new JLabel("BIENVENIDO");
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblTitulo.setBounds(137, 38, 122, 24);
		add(lblTitulo);

		tfUsuario = new MyTextLimitField(tfUsuario);
		tfUsuario.setBounds(193, 95, 86, 20);
		add(tfUsuario);
		tfUsuario.setColumns(10);

		JLabel lblUsuario = new JLabel("Usuario o email:");
		lblUsuario.setBounds(77, 98, 95, 14);
		add(lblUsuario);

		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(77, 129, 95, 14);
		add(lblContraseña);

		JLabel lblPregunta = new JLabel("¿No tienes usuario?");
		lblPregunta.setBounds(28, 195, 172, 14);
		add(lblPregunta);

		JButton btnLogin = new JButton("Entrar");
		btnLogin.setBounds(137, 157, 89, 23);
		add(btnLogin);

		JButton btnRegistrar = new JButton("Registrate aquí");
		btnRegistrar.setBounds(242, 191, 152, 23);
		add(btnRegistrar);

		pfContraseña = new JPasswordField();
		pfContraseña.setBounds(193, 126, 86, 20);
		add(pfContraseña);

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.logearse(tfUsuario.getText(), new String(pfContraseña.getPassword()));
			}
		});

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirRegister();
			}
		});

	}
}