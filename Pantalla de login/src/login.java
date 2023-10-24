import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Login {
    private JFrame frame;
    private JPanel panel;
    private BufferedImage image;

    public Login() {
        // Crear una nueva ventana (JFrame) con el título "Login" y establecer su tamaño y operación de cierre.
        frame = new JFrame("Login");
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un objeto Color con los valores RGB y transparencia
        Color backgroundColor = new Color(15, 82, 15, 255);
        Color backgroundColor2 = new Color(255, 255, 255, 255);

        // Crear un panel (JPanel) y establecer el color de fondo.
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Llamada a super.paintComponent(g)

                /*
                 * Creación de un rectángulo vertical con x = 450px, y = 550px
                 * Dibuja un rectángulo en el centro del panel
                 */
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(10, 10, 10, 10);
                
                int width = 450;
                int height = 550;
                int x = (getWidth() - width) / 2;
                int y = (getHeight() - height) / 2;
                g.setColor(Color.BLACK); // Color del borde del rectángulo
                g.drawRect(x, y, width, height);
                g.setColor(backgroundColor2); // Color del relleno del rectángulo
                g.fillRect(x, y, width, height);

                // Cargar una imagen
                try {
                    image = ImageIO.read(new File("images/Logo_Book4U.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Dibujar la imagen más pequeña en la parte superior del rectángulo blanco
                if (image != null) {
                    int imgWidth = 100;  // Ancho deseado de la imagen
                    int imgHeight = (image.getHeight() * imgWidth) / image.getWidth();  // Calcula la altura proporcional
                    int imgX = x + (width - imgWidth) / 2;  // Centra horizontalmente
                    int imgY = y + 10;  // Distancia desde la parte superior del rectángulo
                    g.drawImage(image, imgX, imgY, imgWidth, imgHeight, this);
               // Agregar el texto "Iniciar sesión" debajo de la imagen
                    g.setColor(Color.BLACK);
                    g.setFont(new Font("Arial", Font.PLAIN, 18));
                    String text = "Iniciar sesión";
                    int textX = x + (width - g.getFontMetrics().stringWidth(text)) / 2;
                    int textY = imgY + imgHeight + 20;  // 20 píxeles de separación desde la imagen
                    g.drawString(text, textX, textY);                                   
                }
            }
        };
        panel.setBackground(backgroundColor);

        // Agregar el panel a la ventana y hacerla visible.
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Login y mostrar la imagen, texto, botón y campo de entrada.
        SwingUtilities.invokeLater(Login::new);
    }
}
