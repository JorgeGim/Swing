package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MarcoCentrado extends JFrame 
{
	public MarcoCentrado()
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize(); //almacena tamaño de la pantalla
		int alturaPantalla = tamanoPantalla.height; //alto de la pantalla
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco centrado");
		
		Image icono = miPantalla.getImage("icono.gif"); //icono de la pantalla
		setIconImage(icono); //establezco icono
	}
	
	public static void main(String args[])
	{
		MarcoCentrado marco = new MarcoCentrado();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}
