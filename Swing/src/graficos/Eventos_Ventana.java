package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Eventos_Ventana {
	
	public static void main(String [] args){
		
		MarcoVentana marco = new MarcoVentana();
		marco.setTitle("Ventana1");
		marco.setBounds(300, 300, 500, 350);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana marco2 = new MarcoVentana();
		marco2.setTitle("Ventana2");
		marco2.setBounds(900, 300, 500, 350);
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //solo desaparece el segundo marco
	}
	


}

class MarcoVentana extends JFrame{
	
	public MarcoVentana(){
		
		setVisible(true);
		M_Ventana ventanaOyente = new M_Ventana();
		addWindowListener(ventanaOyente);
	}
}

class M_Ventana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) { //al minimizar imprime un mensaje por consola
		System.out.println("Minimizo la pantalla");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada"); 
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada");
		
	}
	
	
}
