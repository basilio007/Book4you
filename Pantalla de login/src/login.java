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
        // Crear una nueva ventana (JFrame) con el t�tulo "Login" y establecer su tama�o y operaci�n de cierre.
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
                super.paintComponent(g);
                /*
                 * Creaci�n de un rect�ngulo vertical con x = 450px, y = 550px
                 * Dibuja un rect�ngulo en el centro del panel
                 */
                int width = 450;
                int height = 550;
                int x = (getWidth() - width) / 2;
                int y = (getHeight() - height) / 2;
                g.setColor(Color.BLACK); // Color del borde del rect�ngulo
                g.drawRect(x, y, width, height);
                g.setColor(backgroundColor2); // Color del relleno del rect�ngulo
                g.fillRect(x, y, width, height);

                // Cargar una imagen
                try {
                    image = ImageIO.read(new File("images/Logo_Book4U.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Dibujar la imagen m�s peque�a en la parte superior del rect�ngulo blanco
                if (image != null) {
                    int imgWidth = 100;  // Ancho deseado de la imagen
                    int imgHeight = (image.getHeight() * imgWidth) / image.getWidth();  // Calcula la altura proporcional
                    int imgX = x + (width - imgWidth) / 2;  // Centra horizontalmente
                    int imgY = y + 10;  // Distancia desde la parte superior del rect�ngulo
                    g.drawImage(image, imgX, imgY, imgWidth, imgHeight, this);
                }
            }
        };
        panel.setBackground(backgroundColor);

        // Agregar el panel a la ventana y hacerla visible.
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Login y mostrar la imagen en el rect�ngulo blanco.
        SwingUtilities.invokeLater(Login::new);
    }
}
