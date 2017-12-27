package graficos;

import javax.swing.*;

public class Marco	  
{
	public static void main(String[] args) 
	{
		MiMarco marco = new MiMarco();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra el programa
	}														  //Variable de clase
}

@SuppressWarnings("serial")
class MiMarco extends JFrame
{
	public MiMarco()
	{
		//setSize(500, 300); //dimensiones, ancho y alto
		//setLocation(500, 300); //localización en X e Y, maneja un eje de coordenadas
		
		setBounds(500, 300, 550, 250); //location y size todo junto
		//setResizable(false); //permitir si se puede redimensionar
		//setExtendedState(Frame.MAXIMIZED_BOTH); //frame del tamaño de la pantalla
		setTitle("Mi ventana"); //título
	}
}
