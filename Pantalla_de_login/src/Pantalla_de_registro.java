import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.GridLayout;

public class Pantalla_de_registro {
    public static void main(String[] args) {
        // JFrame background
        ImageIcon image = new ImageIcon("a14e9b1870f7dfab1e2c26659ee36b74.jpg");
        JLabel background = new JLabel(image);
        background.setBounds(0, 0, 1080, 720);
        background.setLayout(null);

        /* Create a white JPanel for login components */
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.WHITE);

        int panelWidth = 300; // Ancho del panel blanco
        int panelHeight = 500; // Alto del panel blanco
        int panelX = (background.getWidth() - panelWidth) / 2; // Centrado horizontalmente
        int panelY = (background.getHeight() - panelHeight) / 2; // Centrado verticalmente
        loginPanel.setBounds(panelX, panelY, panelWidth, panelHeight);
        
        ////////////////////////////////7/*RECTÁNGULO BLANCO*////////////////////////////////////////
        
        // Image (resized)
        ImageIcon logoImage = new ImageIcon("src/Logo_Book4U_NO_fondo.png");
        Image img = logoImage.getImage();
        Image newImg = img.getScaledInstance(150, 100, Image.SCALE_SMOOTH); // Ajustar el tamaño a 150x100
        logoImage = new ImageIcon(newImg);
        JLabel imageLabel = new JLabel(logoImage);
        imageLabel.setBounds(80, 50, 150, 100); // Tamaño nuevo
        loginPanel.add(imageLabel);

        // Iniciar sesión label
        JLabel loginLabel = new JLabel("Registro");
        loginLabel.setBounds(110, 180, 150, 25); // 100 es la nueva altura de la imagen
        loginPanel.add(loginLabel);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Fuente en negrita y tamaño 16

        // User label
        JLabel usernameLabel = new JLabel("Usuario");
        usernameLabel.setBounds(50, 210, 80, 25);
        loginPanel.add(usernameLabel);

        // Password label
        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(50, 250, 80, 25);
        loginPanel.add(passwordLabel);
        
        // Password label
        JLabel conLabel = new JLabel("Confirmar contraseña");
        conLabel.setBounds(50, 290, 80, 25);
        loginPanel.add(conLabel);
        
        // User textField
        JTextField username2Field = new JTextField();
        username2Field.setBounds(150, 210, 120, 25);
        loginPanel.add(username2Field);
        
        // User textField
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 250, 120, 25);
        loginPanel.add(usernameField);

        // Password textField
        JTextField passwordField = new JTextField();
        passwordField.setBounds(150, 290, 120, 25);
        loginPanel.add(passwordField);

        // Login Enter button
        JButton loginButton = new JButton("Registrarse");
        loginButton.setBounds(100, 350, 100, 30);
        loginPanel.add(loginButton);

        // Panel para el mensaje y el botón de registrarse
        JPanel registrationPanel = new JPanel(new GridLayout(1, 2, 5, 0)); // 1 fila, 2 columnas



        loginPanel.add(registrationPanel);

        background.add(loginPanel);

        // JFrame configuration
        JFrame frame = new JFrame();
        frame.setTitle("BOOK4U");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.add(background);

        ImageIcon appIcon = new ImageIcon("Logo_Book4U_NO_fondo.png");
        frame.setIconImage(appIcon.getImage());
        frame.getContentPane().setBackground(new Color(0x0F520F));
    }
}
