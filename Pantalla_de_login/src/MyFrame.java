import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	MyFrame(){
		ImageIcon image = new ImageIcon("a14e9b1870f7dfab1e2c26659ee36b74.jpg");
		
		JLabel label = new JLabel();
		label.setText("Hola!");//set text of label
		this.add(label);
		label.setIcon(image);
		
		JFrame frame = new JFrame();
		this.setTitle("BOOK4U");//title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//prevent frame from being resized
		this.setSize(1080,720);// x dimension, y dimension
		this.setVisible(true); //make frame visible
		
		ImageIcon Image = new ImageIcon("Logo_Book4U_NO_fondo.png"); //Create an ImageIcon
		this.setIconImage(image.getImage());//Change Icon of frame
		this.getContentPane().setBackground(new Color(0x0F520F));//change color background in a hexadecimal value

	}

}
