package ejercicio5Interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import ejercicios.ejercicio05.model.User;

public class ProfilePanel extends View {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ProfilePanel(AppController app, User user) {
		super(app);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("BIENVENIDO  " + app.getUser().getUsername());
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
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Selecciona un csv");
		
		
		JButton btnImportarUsuarios = new JButton("Importar usuarios");
		btnImportarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				app.openFileChooser();
			}
		});
		btnImportarUsuarios.setBounds(113, 233, 218, 23);
		add(btnImportarUsuarios);

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