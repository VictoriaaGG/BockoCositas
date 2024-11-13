package ejercicio12;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class BienvenidaPanel extends JPanel {
	private App app;
	private JComboBox<String> cbPantallas;
	private JCheckBox chcbxMantenerTexto;
	private static final long serialVersionUID = 1L;

	public BienvenidaPanel(App app) {
		this.app = app;
		setLayout(null);

		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(212, 227, 89, 23);
		add(btnEntrar);

		JLabel lblBienvenida = new JLabel("Bienvenidao a mi aplicación");
		lblBienvenida.setBounds(195, 124, 237, 14);
		add(lblBienvenida);

		String[] pantallas = { "Pantalla1", "Pantalla2", "Pantalla3" };
		cbPantallas = new JComboBox<>(pantallas);
		cbPantallas.setBounds(195, 177, 117, 22);
		add(cbPantallas);

		chcbxMantenerTexto = new JCheckBox("Mantener texto");
		chcbxMantenerTexto.setBounds(182, 94, 158, 23);
		add(chcbxMantenerTexto);

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbPantallas.getSelectedItem().equals("Pantalla1")) {
					app.abrirPantalla1("");
				}
				if (cbPantallas.getSelectedItem().equals("Pantalla2")) {
					app.abrirPantalla2("");
				} else
					app.abrirPantalla3("");
			}
		});

	}

	public Boolean mantener() {
		Boolean mantener = chcbxMantenerTexto.isSelected();
		return mantener;
	}
}
