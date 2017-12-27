package JMap;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;
import org.openstreetmap.gui.jmapviewer.interfaces.MapPolygon;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class Mapa {

	private JFrame frame;
	private JMapViewer mapa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa window = new Mapa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mapa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(54, 11, 300, 200);
		frame.getContentPane().add(internalFrame);
		internalFrame.setVisible(true);
		
		JButton btnCrearMapa = new JButton("Crear mapa");
		btnCrearMapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				mapa = new JMapViewer();
				mapa.setZoomContolsVisible(true);
				mapa.setDisplayPositionByLatLon(-34.521, -58.7008, 11);
				
				MapMarker marker = new MapMarkerDot(-34.521,-58.7008);
				marker.getStyle().setBackColor(Color.RED);
				
				mapa.addMapMarker(marker);
				
				ArrayList<Coordinate> coordenadas = new ArrayList<Coordinate>();
				
				coordenadas.add(new Coordinate(-34.532, -58.7128));
				coordenadas.add(new Coordinate(-34.546, -58.719));
				coordenadas.add(new Coordinate(-34.559, -58.721));
				coordenadas.add(new Coordinate(-34.569, -58.725));
				coordenadas.add(new Coordinate(-34.532, -58.730));
				
				MapPolygon polygon = new MapPolygonImpl(coordenadas);
				mapa.addMapPolygon(polygon);
				
				for(Coordinate c: coordenadas)
					mapa.addMapMarker(new MapMarkerDot(c));
				
				internalFrame.setContentPane(mapa);	
			}
		});
		btnCrearMapa.setBounds(24, 222, 89, 23);
		frame.getContentPane().add(btnCrearMapa);
		
		JButton btnAgregarCiudad = new JButton("Agregar Ciudad");
		btnAgregarCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				MapMarker marker = new MapMarkerDot(-34.490,-58.7008);
				marker.getStyle().setBackColor(Color.GREEN);
				mapa.addMapMarker(marker);
			}
		});
		btnAgregarCiudad.setBounds(140, 222, 89, 23);
		frame.getContentPane().add(btnAgregarCiudad);
		
	
	}
}
