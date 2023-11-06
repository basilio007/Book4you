package clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mi_perfil extends JFrame{
	public mi_perfil() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1080, 720); //El tamaño de que de la ventana de la App
		setTitle("Pantalla Princial");
		setLocationRelativeTo(null); //permite que la ventana siempre se inicilice en el centro de la pantalla
		setMinimumSize(new Dimension (200, 200));//el tamaño minimo
		
			campos();
	}
	private void campos(){
		JPanel panel1 = new JPanel();
		//ImageIcon imagen  = new ImageIcon("pictures/Logo_Book4U.jpg"); 
		panel1.setBounds(0, 0, 1080, 200);
		//panel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
		panel1.setLayout(null);
		panel1.setBackground(new Color(15,82,15,255));
		this.getContentPane().add(panel1);
		
		
		JLabel Texto1 = new JLabel();
		Texto1.setText("Mi perfil");
		//Texto1.setForeground(Color.orange);//color teexto
		Texto1.setBounds(425, 30, 400, 50);
		Texto1.setFont(new Font("arial",Font.BOLD,40));
		panel1.add(Texto1);
		
	//////////////////////////////////////////////////
		///////////////////////////////////////////
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		this.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel Nombre = new JLabel();
		Nombre.setText("Nombre:");
		//Texto1.setForeground(Color.orange);//color teexto
		Nombre.setBounds(380, 220, 70, 20);
		Nombre.setForeground(Color.white);
		Nombre.setOpaque(true);
		Nombre.setBackground(Color.gray);
		Nombre.setFont(new Font("arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
		panel2.add(Nombre);
		Nombre.setVisible(true);
		
		JTextField NameField=new JTextField();
		NameField.setBounds(450, 220, 175, 21);
	    panel2.add(NameField);
	    
	    JButton EditName=new JButton("Editar");
	    EditName.setBounds(670, 220, 80, 20);
		//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
		//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
		panel2.add(EditName);
		EditName.setVisible(true);
	    
	    ////////////////////////////
	    
	    JLabel Apellidos = new JLabel();
	    Apellidos.setText("Apellidos:");
		//Texto1.setForeground(Color.orange);//color teexto
	    Apellidos.setBounds(380, 260, 70, 20);
	    Apellidos.setForeground(Color.white);
	    Apellidos.setOpaque(true);
	    Apellidos.setBackground(Color.gray);
	    Apellidos.setFont(new Font("arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
		panel2.add(Apellidos);
		Apellidos.setVisible(true);
		
		JTextField sortNameField=new JTextField();
		sortNameField.setBounds(450, 260, 175, 21);
	    panel2.add(sortNameField);
	    
	    JButton EditsortName=new JButton("Editar");
	    EditsortName.setBounds(670, 260, 80, 20);
		//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
		//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
		panel2.add(EditsortName);
		EditsortName.setVisible(true);
	    
	    /////////////////////////////////////
	    
	    JLabel DNI = new JLabel();
	    DNI.setText("DNI:");
		//Texto1.setForeground(Color.orange);//color teexto
	    DNI.setBounds(380, 300, 70, 20);
	    DNI.setForeground(Color.white);
	    DNI.setOpaque(true);
	    DNI.setBackground(Color.gray);
	    DNI.setFont(new Font("arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
		panel2.add(DNI);
		DNI.setVisible(true);
		
		JTextField DNAField=new JTextField();
		DNAField.setBounds(450, 300, 175, 21);
	    panel2.add(DNAField);
	    
	    JButton EditDNA=new JButton("Editar");
	    EditDNA.setBounds(670, 300, 80, 20);
		//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
		//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
		panel2.add(EditDNA);
		EditDNA.setVisible(true);
	    
	    ////////////////////////////////////////
	    JLabel Domicilio = new JLabel();
	    Domicilio.setText("Domicilio:");
		//Texto1.setForeground(Color.orange);//color teexto
	    Domicilio.setBounds(380, 340, 70, 20);
	    Domicilio.setForeground(Color.white);
	    Domicilio.setOpaque(true);
	    Domicilio.setBackground(Color.gray);
	    Domicilio.setFont(new Font("arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
		panel2.add(Domicilio);
		Domicilio.setVisible(true);
		
		JTextField AdressField=new JTextField();
		AdressField.setBounds(450, 340, 175, 21);
	    panel2.add(AdressField);
	    
	    JButton EditAdress=new JButton("Editar");
	    EditAdress.setBounds(670, 340, 80, 20);
		//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
		//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
		panel2.add(EditAdress);
		EditAdress.setVisible(true);
	    //////////////////////////////////////////
	    JLabel Contraseña = new JLabel();
	    Contraseña.setText("Contraseña:");
		//Texto1.setForeground(Color.orange);//color teexto
	    Contraseña.setBounds(380, 380, 70, 20);
	    Contraseña.setForeground(Color.white);
	    Contraseña.setOpaque(true);
	    Contraseña.setBackground(Color.gray);
	    Contraseña.setFont(new Font("arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
		panel2.add(Contraseña);
		Contraseña.setVisible(true);
		
		JTextField CodeField=new JTextField();
		CodeField.setBounds(450, 380, 175, 21);
	    panel2.add(CodeField);
	    
	    JButton EditCode=new JButton("Editar");
	    EditCode.setBounds(670, 380, 80, 20);
		//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
		//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
		panel2.add(EditCode);
		EditCode.setVisible(true);
		///////////////////////////////////
		
		 JButton SaveChanges=new JButton("Guardar Cambios");
		 SaveChanges.setBounds(520, 440, 150, 40);
			//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
			//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
			panel2.add(SaveChanges);
			SaveChanges.setVisible(true);
			
			
			 JButton BuyCredits=new JButton("Comprar Creditos");
			 BuyCredits.setBounds(150, 630, 135, 40);
				//ImageIcon botonimagen = new ImageIcon("Pictures/back5.png");
				//atras.setIcon(new ImageIcon(botonimagen.getImage().getScaledInstance(atras.getWidth(),atras.getHeight(),Image.SCALE_SMOOTH )));
				panel2.add(BuyCredits);
				BuyCredits.setVisible(true);
				
				JLabel Texto2 = new JLabel();
				Texto2.setText("Quieres Comprar");
				//Texto1.setForeground(Color.orange);//color teexto
				Texto2.setBounds(10, 610, 400, 50);
				Texto2.setFont(new Font("arial",Font.CENTER_BASELINE,15));
				panel2.add(Texto2);
				
				JLabel Texto3 = new JLabel();
				Texto3.setText("màs creditos?");
				//Texto1.setForeground(Color.orange);//color teexto
				Texto3.setBounds(10, 630, 400, 50);
				Texto3.setFont(new Font("arial",Font.CENTER_BASELINE,15));
				panel2.add(Texto3);
	}

}
