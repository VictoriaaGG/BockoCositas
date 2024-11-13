package ejercicio5Interfaz.components;

import javax.swing.JTextField;
import javax.swing.text.Document;

public class JTextLimitField extends JTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTextLimitField() {
		super();

	}

	public JTextLimitField(Document doc, String text, int columns) {
		super(doc, text, columns);

	}

	public JTextLimitField(int columns) {
		super(columns);

	}

	public JTextLimitField(String text, int columns) {
		super(text, columns);

	}

	public JTextLimitField(String text) {
		super(text);

	}

}
