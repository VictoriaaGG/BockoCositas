package ejemplo1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;

public class App {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_4;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 122, 58, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(311, 88, 113, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 87, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_4 = new JTextField();
		textField_4.setBounds(311, 119, 113, 21);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);

		panel = new JPanel();
		panel.setBounds(0, 201, 433, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnNewButton = new JButton("New button");
		panel.add(btnNewButton);

		btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);

		textField_1 = new JTextField();
		textField_1.setBounds(311, 52, -46, 114);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
