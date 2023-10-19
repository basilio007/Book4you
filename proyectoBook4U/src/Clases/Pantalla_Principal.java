package Clases;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.jdi.event.EventQueue;

public class Pantalla_Principal extends JFrame{
	private JPanel panel;

	public static void main(String[] args) {
		 java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Pantalla_Principal  frame = new Pantalla_Principal();
					frame.setVisible(true);	
				}catch (Exception e){
					e.printStackTrace();
				}
				
			    }
			
		        });
	            }
	
	public Pantalla_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		setTitle("Pantalla de Bienvenida");
		
		JLabel label = new JLabel();
		Font font = new Font("Segoe Script", Font.TYPE1_FONT, 15);
		label.setFont(font);
		label.setBounds(330, 55, 100, 10);
		panel.add(label);
		

		
		setContentPane(panel);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//se cierra la ventana correctamente
		
		JLabel label1 = new JLabel("PANTALLA PRINCIPAL!!");
		
		Font font1 = new Font("Verdana", Font.TYPE1_FONT, 20);
		label1.setFont(font1);
		label1.setBounds(360, 5, 500, 60);
		add(label1);
		setTitle("Book4You");
		
		JLabel etiqueta2 = new JLabel();
		ImageIcon imagen  = new ImageIcon("Pictures/Logo Renuncios.png"); 
		etiqueta2.setBounds(0,0,500,400);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
		add(etiqueta2);
		
		JButton btn = new JButton("MENÚ");
	
	}
}