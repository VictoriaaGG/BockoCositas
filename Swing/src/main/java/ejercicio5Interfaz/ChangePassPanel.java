package ejercicio5Interfaz;

import javax.swing.JPanel;
import javax.swing.JTextField;

import ejercicios.ejercicio05.model.User;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ChangePassPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfIdUsuario;
	private AppController app;
	private JPasswordField pfOldPass;
	private JPasswordField pfNewPass;
	private User user;

	/**
	 * Create the panel.
	 */
	public ChangePassPanel(AppController app,User user) {
		this.app = app;
		this.user =user;
		setLayout(null);

		tfIdUsuario = new JTextField();
		tfIdUsuario.setColumns(10);
		tfIdUsuario.setBounds(257, 111, 86, 20);
		add(tfIdUsuario);

		JLabel lblIdUser = new JLabel("Id de Usuario");
		lblIdUser.setBounds(107, 114, 95, 14);
		add(lblIdUser);

		JLabel lblOldPassword = new JLabel("Old Password");
		lblOldPassword.setBounds(107, 139, 95, 14);
		add(lblOldPassword);

		JLabel lblTitulo = new JLabel("CAMBIAR CONTRASEÑA");
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblTitulo.setBounds(124, 76, 211, 24);
		add(lblTitulo);

		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setBounds(107, 164, 95, 14);
		add(lblNewPassword);

		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(113, 189, 89, 23);
		add(btnGuardar);

		pfOldPass = new JPasswordField();
		pfOldPass.setBounds(257, 136, 86, 20);
		add(pfOldPass);

		pfNewPass = new JPasswordField();
		pfNewPass.setBounds(257, 161, 86, 20);
		add(pfNewPass);
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.setBounds(229, 189, 89, 23);
		add(btnAtras);

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long numero = Long.parseLong(tfIdUsuario.getText());
				app.guardarNewPass(numero, new String (pfOldPass.getPassword()), new String (pfNewPass.getPassword()));
				app.abrirLogin();
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.abrirProfile(user);
			}
		});
	}
}
