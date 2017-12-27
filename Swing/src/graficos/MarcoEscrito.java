package graficos;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MarcoEscrito extends JFrame 
{	
	public MarcoEscrito()
	{
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer texto");
		
		Lamina lamina = new Lamina();
		add(lamina);
	}
	
	public static void main(String args[])
	{
		MarcoEscrito marco = new MarcoEscrito();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

@SuppressWarnings("serial")
class Lamina extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo Swing", 100, 50);
	}
}
