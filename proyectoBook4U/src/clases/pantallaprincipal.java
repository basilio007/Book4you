package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pantallaprincipal extends JFrame{
	public pantallaprincipal() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1080, 720); //El tamaño de que de la ventana de la App
		setTitle("Pantalla Princial");
		setLocationRelativeTo(null); //permite que la ventana siempre se inicilice en el centro de la pantalla
		setMinimumSize(new Dimension (200, 200));//el tamaño minimo
		
			iniciarComponentes();			
					
	}
private void iniciarComponentes() {
	
	JPanel panel1 = new JPanel();
	//ImageIcon icon = new ImageIcon("pictures/Logo_Book4U.jpg");
	panel1.setBounds(0, 0, 1080, 200);
	//panel1.add(new JLabel(icon));
	panel1.setLayout(null);
	panel1.setBackground(new Color(213,232,212,255));
	this.getContentPane().add(panel1);
	
	JLabel etiqueta2 = new JLabel();
	ImageIcon imagen  = new ImageIcon("pictures/Logo_Book4U.jpg"); 
	etiqueta2.setBounds(05, 0, 170, 150);
	etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
	panel1.add(etiqueta2);
	
	
	JLabel Texto1 = new JLabel();
	Texto1.setText("Pantalla Principal");
	//Texto1.setForeground(Color.orange);//color teexto
	Texto1.setBounds(335, 30, 400, 50);
	Texto1.setFont(new Font("arial",Font.BOLD,40));
	panel1.add(Texto1);
	
	
	JLabel Texto2 = new JLabel();
	Texto2.setText("Nro de créditos");
	//Texto1.setForeground(Color.orange);//color teexto
	Texto2.setBounds(670, 45, 110, 20);
	Texto2.setForeground(Color.white);
	Texto2.setOpaque(true);
	Texto2.setBackground(new Color(15,82,15,255));
	Texto2.setFont(new Font("arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
	panel1.add(Texto2);
	
	JButton Nuevas=new JButton("Nuevas Reservas");
	Nuevas.setBounds(0, 150, 360, 50);
	Nuevas.setBackground(new Color(213,232,212,255));
	//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
	//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
	this.getContentPane().add(Nuevas);
	Nuevas.setVisible(true);
	
	JButton Reservas=new JButton("Reservas");
	Reservas.setBounds(360, 150, 360, 50);
	Reservas.setBackground(new Color(213,232,212,255));
	//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
	//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
	this.getContentPane().add(Reservas);
	Reservas.setVisible(true);
	
	JButton History=new JButton("Historial");
	History.setBounds(720, 150, 360, 50);
	History.setBackground(new Color(213,232,212,255));
	//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
	//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
	this.getContentPane().add(History);
	History.setVisible(true);
	
	JButton Search=new JButton("Buscar");
	Search.setBounds(60, 220, 100, 40);
	Search.setBackground(new Color(213,232,212,255));
	//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
	//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
	this.getContentPane().add(Search);
	Search.setVisible(true);
	
	
	
	JButton nomUsusario=new JButton("Nombre del usuario");
	nomUsusario.setBounds(670, 5, 280, 30);
     this.getContentPane().add(nomUsusario);
     
     nomUsusario.addActionListener(new ActionListener() {
    	 public void actionPerformed(ActionEvent arg0) {
    		 dispose();
    		 mi_perfil PERFIL = new mi_perfil();
    		 PERFIL.setVisible(true);
    	 }
    	 
     });
     
     
     
     
     JTextField numCredit=new JTextField();
     numCredit.setBounds(775, 45, 175, 21);
     this.getContentPane().add(numCredit);
     
     JTextField barBusqueda=new JTextField();
     barBusqueda.setBounds(180, 220, 200, 40);
     this.getContentPane().add(barBusqueda);
        
	
	
	
	JPanel panel2 = new JPanel();
	panel2.setBackground(Color.white);
	this.getContentPane().add(panel2);
	
	
	
	
	
	
	
	
}

	
}


