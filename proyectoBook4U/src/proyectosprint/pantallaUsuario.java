package proyectosprint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class pantallaUsuario {
    public static void main(String[] args) {
        JFrame pagina = new JFrame("Página del Usuario");
        pagina.setSize(1080, 720);
        pagina.setLocationRelativeTo(null);
        pagina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel de fondo (verde oscuro)
        JPanel paneldeFondo = new JPanel();
        paneldeFondo.setBackground(new Color(15, 82, 15, 255));
        

        // Panel superior (que cumple la función de una barra de menú)
        JPanel barraMenu = new JPanel(new BorderLayout());
        barraMenu.setBackground(new Color(173, 255, 47)); // Color verde limón
        barraMenu.setPreferredSize(new Dimension(1080, 40));

        // Icono
        ImageIcon icono = new ImageIcon("C:\\Users\\alumnat\\Documents\\GitHub\\Book4you\\proyectoBook4U\\src\\proyectosprint\\casa.png");
        icono = new ImageIcon(icono.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        JLabel iconoLabel = new JLabel(icono);
        barraMenu.add(iconoLabel, BorderLayout.WEST);

        // Texto "Mi perfil"
        JLabel labelTexto = new JLabel("Mi perfil");
        labelTexto.setFont(new Font(labelTexto.getFont().getName(), Font.PLAIN, 24));
        labelTexto.setHorizontalAlignment(SwingConstants.CENTER);
        barraMenu.add(labelTexto, BorderLayout.CENTER);

        // Agregar el panel superior y el panel de fondo al JFrame
        pagina.add(barraMenu, BorderLayout.NORTH);
        pagina.add(paneldeFondo, BorderLayout.CENTER);

        // Asegurarse de que el JFrame sea visible
        pagina.setVisible(true);
    }
}