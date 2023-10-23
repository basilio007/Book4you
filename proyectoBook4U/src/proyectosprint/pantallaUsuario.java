package proyectosprint;

import javax.swing.*;
import java.awt.*;

public class pantallaUsuario {
    public static void main(String[] args) {
        JFrame pagina = new JFrame("P�gina del Usuario");
        pagina.setSize(1080, 720);
        pagina.setLocationRelativeTo(null);
        pagina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Color de fondo
        Color colorDeFondo = new Color(15, 82, 15, 255);
        pagina.getContentPane().setBackground(colorDeFondo);

        // Panel superior (que cumple la funci�n de una barra de men�)
        JPanel barraMenu = new JPanel(new BorderLayout());
        barraMenu.setBackground(new Color(213, 232, 212, 255)); // Color verde lim�n
        barraMenu.setPreferredSize(new Dimension(1050, 80));

        // Icono
        ImageIcon icono = new ImageIcon("C:\\Users\\alumnat\\Documents\\GitHub\\Book4you\\proyectoBook4U\\src\\proyectosprint\\casa.png");
        icono = new ImageIcon(icono.getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH));
        JLabel iconoLabel = new JLabel(icono);
        barraMenu.add(iconoLabel, BorderLayout.WEST);

        // Texto "Mi perfil"
        JLabel labelTexto = new JLabel("Mi perfil");
        labelTexto.setFont(new Font(labelTexto.getFont().getName(), Font.PLAIN, 30));
        labelTexto.setHorizontalAlignment(SwingConstants.CENTER);
        barraMenu.add(labelTexto, BorderLayout.CENTER);

        // Panel inferior
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.setBackground(new Color(255, 255, 255, 255));

        // Icono de usuario en la parte izquierda del panel inferior
        ImageIcon usuarioIcono = new ImageIcon("C:\\Users\\alumnat\\Documents\\GitHub\\Book4you\\proyectoBook4U\\src\\proyectosprint\\usuario.png"); // Reemplaza con la ruta de tu imagen de usuario
        usuarioIcono = new ImageIcon(usuarioIcono.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
        JLabel usuarioLabel = new JLabel(usuarioIcono);
        panelInferior.add(usuarioLabel, BorderLayout.WEST);

        // Agregar el panel superior y el panel inferior al JFrame
        pagina.add(barraMenu, BorderLayout.NORTH);
        pagina.add(panelInferior, BorderLayout.CENTER);

        // Asegurarse de que el JFrame sea visible
        pagina.setVisible(true);
    }
}
