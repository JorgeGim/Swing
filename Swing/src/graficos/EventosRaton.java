package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
		addMouseMotionListener(eventosDeRaton);
	}
}

class EventosDeRaton implements MouseListener, MouseMotionListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
		//System.out.println("Coordenada X:" + e.getX() + " Coordenada Y: " + e.getY());
		System.out.println(e.getClickCount()); //cantidad de clicks
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		//System.out.println(e.getModifiersEx()); //devuelve valores de las constantes
		if(e.getModifiersEx() == 1024) {
			
			System.out.println("Presionaste el boton izquierdo");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Presionaste la rueda");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Presionaste el boton derecho");
		}
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

	@Override
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Estas arrastrando!");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("Estas moviendo!");
	}
}
