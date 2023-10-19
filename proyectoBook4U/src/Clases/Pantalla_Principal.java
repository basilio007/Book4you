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

import com.sun.jdi.event.EventQueue;

public class Pantalla_Principal extends JFrame{
	private JPanel panel;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1080,720);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.green);
		panel1.setBounds(0, 0, 1080, 200);
		
		
		frame.add(panel1);
		frame.setVisible(true);
		
		JLabel label1 = new JLabel("PANTALLA PRINCIPAL");
		
	}
}