package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		
		MarcoRaton marco = new MarcoRaton();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventosDeRaton eventosDeRaton = new EventosDeRaton();
		addMouseListener(eventosDeRaton);
	}
}

class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Hiciste click!");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		System.out.println("Acabas de levantar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		System.out.println("Acabas de entrar");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		System.out.println("Acabas de salir");
	}
}
