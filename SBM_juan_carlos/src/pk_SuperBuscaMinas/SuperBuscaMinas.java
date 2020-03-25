package pk_SuperBuscaMinas;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SuperBuscaMinas {

	private JFrame frmBuscaMinas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperBuscaMinas window = new SuperBuscaMinas();
					window.frmBuscaMinas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SuperBuscaMinas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int WINDOW_VERTICAL_SIZE=500;
		int WINDOW_HORIZONTAL_SIZE= 500;
		frmBuscaMinas = new JFrame();
		frmBuscaMinas.setTitle("Busca Minas");
		frmBuscaMinas.setBounds(0, 0, WINDOW_VERTICAL_SIZE, WINDOW_HORIZONTAL_SIZE);
		frmBuscaMinas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmBuscaMinas.getContentPane().setLayout(null);	
		Tablero tablero = new Tablero();
		frmBuscaMinas.getContentPane().add(tablero.crearPanelBuscaMinas());		
	}
}
