package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.sun.jdi.event.EventQueue;

public class Pantalla_Principal extends JFrame{
	public static void main(String[] args) {
		
		
		
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0, 0, 1080, 225);
		
		JLabel jlabel = new JLabel("Pantalla Principal");
		jlabel.setFont(new Font("Verdana",1,20));
		//jlabel.setBorder(new LineBorder(Color.BLACK));
		
		JPanel whitepanel = new JPanel();
		
		whitepanel.setBackground(Color.white);
		whitepanel.setBounds(0, 225, 1080, 440);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(1080,701);
		frame.setVisible(true);
		frame.add(greenpanel);
		frame.add(whitepanel);
		greenpanel.add(jlabel);
		
		
	}
}