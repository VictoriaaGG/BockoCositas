package ejercicio5Interfaz;

import javax.swing.JPanel;

public abstract class View extends JPanel {
	/**
		 * 
		 */
	private static final long serialVersionUID = 6608275640503402226L;
	protected AppController app;

	public View(AppController app) {
		this.app = app;
	}
}