package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {
	
	public static void main(String [] args){
		
		MarcoBotones marco = new MarcoBotones();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		
		LaminaBotones lamina = new LaminaBotones();
		add(lamina);
	}
}

class LaminaBotones extends JPanel{
	
	JButton bttAzul = new JButton("Azul");
	JButton bttAmarillo = new JButton("Amarillo");
	JButton bttRojo = new JButton("Rojo");
	
	public LaminaBotones(){
		
		add(bttAzul);
		add(bttAmarillo);
		add(bttRojo);
		
		bttAzul.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				setBackground(Color.BLUE);
				
			}
			
		});
		
		bttRojo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				setBackground(Color.red);
				
			}
			
		});
		
		bttAmarillo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				setBackground(Color.yellow);
				
			}
			
		});
		
	}

	
}







