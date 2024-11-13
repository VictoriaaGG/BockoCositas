package swing.ejercicio3;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JRadioButton;

public class Ejercicio7 {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JComboBox cbColores;
	private JRadioButton rdb1;
	private JRadioButton rdb2;
	private JRadioButton rdb3;
	private ButtonGroup colorGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 window = new Ejercicio7();
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
	public Ejercicio7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String[] colores = {"Amarillo","Rosa","Azul"};

	
	
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 164, 105, 0 };
		gridBagLayout.rowHeights = new int[] { 20, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		tf1 = new JTextField();
		GridBagConstraints gbc_tf1 = new GridBagConstraints();
		gbc_tf1.insets = new Insets(0, 0, 5, 0);
		gbc_tf1.anchor = GridBagConstraints.NORTHWEST;
		gbc_tf1.gridx = 1;
		gbc_tf1.gridy = 1;
		frame.getContentPane().add(tf1, gbc_tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		GridBagConstraints gbc_tf2 = new GridBagConstraints();
		gbc_tf2.insets = new Insets(0, 0, 5, 0);
		gbc_tf2.anchor = GridBagConstraints.WEST;
		gbc_tf2.gridx = 1;
		gbc_tf2.gridy = 3;
		frame.getContentPane().add(tf2, gbc_tf2);
		tf2.setColumns(10);
		
		cbColores = new JComboBox<>(colores);
		GridBagConstraints gbc_cbColores = new GridBagConstraints();
		gbc_cbColores.anchor = GridBagConstraints.WEST;
		gbc_cbColores.insets = new Insets(0, 0, 5, 5);
		gbc_cbColores.fill = GridBagConstraints.VERTICAL;
		gbc_cbColores.gridx = 0;
		gbc_cbColores.gridy = 4;
		frame.getContentPane().add(cbColores, gbc_cbColores);
		cbColores.setFocusable(false);
		

		tf3 = new JTextField();
		GridBagConstraints gbc_tf3 = new GridBagConstraints();
		gbc_tf3.insets = new Insets(0, 0, 5, 0);
		gbc_tf3.anchor = GridBagConstraints.WEST;
		gbc_tf3.gridx = 1;
		gbc_tf3.gridy = 5;
		frame.getContentPane().add(tf3, gbc_tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		GridBagConstraints gbc_tf4 = new GridBagConstraints();
		gbc_tf4.anchor = GridBagConstraints.WEST;
		gbc_tf4.gridx = 1;
		gbc_tf4.gridy = 7;
		frame.getContentPane().add(tf4, gbc_tf4);
		tf4.setColumns(10);
		
		rdb1 = new JRadioButton("Amarillo");
		GridBagConstraints gbc_rdb1 = new GridBagConstraints();
		gbc_rdb1.anchor = GridBagConstraints.WEST;
		gbc_rdb1.insets = new Insets(0, 0, 5, 5);
		gbc_rdb1.gridx = 0;
		gbc_rdb1.gridy = 5;
		frame.getContentPane().add(rdb1, gbc_rdb1);
		
		rdb2 = new JRadioButton("Rosa");
		GridBagConstraints gbc_rdb2 = new GridBagConstraints();
		gbc_rdb2.anchor = GridBagConstraints.WEST;
		gbc_rdb2.insets = new Insets(0, 0, 5, 5);
		gbc_rdb2.gridx = 0;
		gbc_rdb2.gridy = 6;
		frame.getContentPane().add(rdb2, gbc_rdb2);
		
		rdb3 = new JRadioButton("Azul");
		GridBagConstraints gbc_rdb3 = new GridBagConstraints();
		gbc_rdb3.anchor = GridBagConstraints.WEST;
		gbc_rdb3.insets = new Insets(0, 0, 0, 5);
		gbc_rdb3.gridx = 0;
		gbc_rdb3.gridy = 7;
		frame.getContentPane().add(rdb3, gbc_rdb3);
		//11
		colorGroup = new ButtonGroup();
        colorGroup.add(rdb1);
        colorGroup.add(rdb2);
        colorGroup.add(rdb3);
        
        ActionListener c1 = new ActionListener() {
     	   
			@Override
			public void actionPerformed(ActionEvent e) {
				cbColores.setSelectedItem("Rosa");
			}
        };
        
		ActionListener c2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbColores.setSelectedItem("Amarillo");
			}
		};
		ActionListener c3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbColores.setSelectedItem("Azul");
			}
		};
		
		rdb1.addActionListener(c1);
		rdb2.addActionListener(c2);
		rdb3.addActionListener(c3);
		
		ActionListener ccolores = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cbColores.getSelectedItem().equals("Amarillo")) {
					colorGroup.setSelected(rdb1.getModel(), true);
				} else if (cbColores.getSelectedItem().equals("Cyan")) {
					colorGroup.setSelected(rdb2.getModel(), true);
				} else if (cbColores.getSelectedItem().equals("Verde")) {
					colorGroup.setSelected(rdb3.getModel(), true);
				}
			}
			};
		
		//7 y 8
		
		KeyAdapter key = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_ENTER) {
					((JTextField) e.getSource()).transferFocus();

				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					((JTextField) e.getSource()).transferFocusBackward();;
				}
			}

		};
		
		
		//9,10,11
		FocusAdapter focus = new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(cbColores.getSelectedItem().equals("Rosa") || colorGroup.isSelected(rdb2.getModel())) {
				e.getComponent().setBackground(Color.pink);
				}
				else if (cbColores.getSelectedItem().equals("Amarillo")) {
					e.getComponent().setBackground(Color.YELLOW);
				}
				else if(cbColores.getSelectedItem().equals("Azul")) {
					e.getComponent().setBackground(Color.BLUE);
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(null);
			}
			
		};
		
		
		
		
		//7,8
		tf1.addKeyListener(key);
		tf2.addKeyListener(key);
		tf3.addKeyListener(key);
		tf4.addKeyListener(key);
		
		//9,10
		
		tf1.addFocusListener(focus);
		tf2.addFocusListener(focus);
		tf3.addFocusListener(focus);
		tf4.addFocusListener(focus);
		

	}

}
