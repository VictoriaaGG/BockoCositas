package ejercicio5Interfaz.components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.text.Document;

public class MyTextLimitField extends JTextLimitField implements KeyListener{
	JTextLimitField campo = new JTextLimitField();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyTextLimitField(JTextLimitField campo) {
		super();
		this.campo= campo;
		
	}

	public MyTextLimitField(Document doc, String text, int columns) {
		super(doc, text, columns);
		
	}

	public MyTextLimitField(int columns) {
		super(columns);
		
	}

	public MyTextLimitField(String text, int columns) {
		super(text, columns);
		
	}

	public MyTextLimitField(String text) {
		super(text);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (campo.getText().length()>=50) {
			e.consume();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
