package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MarcoConFuente extends JFrame 
{
	public MarcoConFuente()
	{
		setTitle("Prueba con fuentes");
		setSize(400, 400);
		
		LaminaConFuente lamina = new LaminaConFuente();
		
		add(lamina);
		
		lamina.setForeground(Color.blue); //color para todo
	}
}

@SuppressWarnings("serial")
class LaminaConFuente extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font fuente = new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(fuente);
		g2.drawString("Jorge", 100, 100);
		
		
		g2.setFont(new Font("Arial", Font.ITALIC, 14));	
		
		
		g2.drawString("Curso de java", 100, 200);
	}
}

//video 63
