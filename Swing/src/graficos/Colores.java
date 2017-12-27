package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Colores
{

	public static void main(String[] args) 
	{
		MarcoConColor marco = new MarcoConColor();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

@SuppressWarnings("serial")
class MarcoConColor extends JFrame
{
	public MarcoConColor()
	{
		setTitle("Prueba con colores");
		setSize(400, 400);
		
		LaminaConColor miLamina = new LaminaConColor();
		add(miLamina);
		
		miLamina.setBackground(Color.pink);
	}
}

@SuppressWarnings("serial")
class LaminaConColor extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);
		g2.setPaint(Color.RED); //Color del trazo
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(109, 172, 59));
		g2.fill(elipse);
	}
}