package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		
		MarcoConTeclas marco = new MarcoConTeclas();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {
		
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);
	}
}

class EventoTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
		char letra = e.getKeyChar();
		System.out.println(letra);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
//		int tecla = e.getKeyCode();
//		System.out.println(tecla);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
