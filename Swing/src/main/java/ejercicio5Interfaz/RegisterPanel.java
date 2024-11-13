package ejercicio5Interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterPanel extends View {

	private static final long serialVersionUID = 1L;
	private JTextField tfUser;
	private JTextField tfEmail;
	private JPasswordField pfPassword;

	/**
	 * Create the panel.
	 */
	public RegisterPanel(AppController app) {
		super(app);
		setLayout(null);

		tfUser = new JTextField();
		tfUser.setColumns(10);
		tfUser.setBounds(256, 113, 86, 20);
		add(tfUser);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(256, 138, 86, 20);
		add(tfEmail);

		JLabel lblUser = new JLabel("Usuario");
		lblUser.setBounds(106, 116, 95, 14);
		add(lblUser);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(106, 141, 95, 14);
		add(lblEmail);

		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblRegistro.setBounds(176, 78, 122, 24);
		add(lblRegistro);

		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(106, 166, 95, 14);
		add(lblContraseña);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(177, 191, 89, 23);
		add(btnRegistrar);

		pfPassword = new JPasswordField();
		pfPassword.setBounds(256, 163, 86, 20);
		add(pfPassword);
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.setBounds(176, 215, 89, 23);
		add(btnAtras);

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.guardarUsuario(tfUser.getText(), tfEmail.getText(), pfPassword.getPassword().toString());
				app.abrirLogin();
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirLogin();
			}
		});

	}
}