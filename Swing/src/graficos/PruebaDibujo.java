package graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;


@SuppressWarnings("serial")
public class PruebaDibujo extends JFrame
{
	public PruebaDibujo()
	{
		setTitle("Prueba de dibujo");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConFiguras lamina = new LaminaConFiguras();
		add(lamina);
	}

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		PruebaDibujo dibujo = new PruebaDibujo();
	}
}

@SuppressWarnings("serial")
class LaminaConFiguras extends JPanel
{
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200);  //dibuja un rectangulo
		//g.drawLine(100, 100, 300, 200);  //dibuja una linea recta
		//g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double centroX = rectangulo.getCenterX();
		
		double centroY = rectangulo.getCenterY();
		
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX + radio, centroY + radio);
		
		g2.draw(circulo);
		
		//video 61 
	}
}
