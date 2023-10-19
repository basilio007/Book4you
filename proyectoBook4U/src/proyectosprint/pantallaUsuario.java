package proyectosprint;

import java.awt.*;

import javax.swing.*;

public class pantallaUsuario {
    public static void main(String[] args) {

        JFrame pagina = new JFrame("Página del Usuario");
        pagina.setSize(1080, 720);
        pagina.setLocationRelativeTo(null);
        pagina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel de fondo
        JPanel paneldeFondo = new JPanel();
        paneldeFondo.setBackground(new Color(15,82,15,255));
        
        // Panel de adelante        
        JPanel panelAdelante = new JPanel();
        panelAdelante.setBackground(new Color(213,232,212,255));
        
        panelAdelante.setPreferredSize(new Dimension(600, 400));
        
     // Crear un LayeredPane
        JLayeredPane layeredPane = new JLayeredPane();

        // Agregar el panel de fondo (verde oscuro) en la capa inferior
        layeredPane.add(paneldeFondo, JLayeredPane.DEFAULT_LAYER);

        // Agregar el panel adelante en una capa superior
        layeredPane.add(panelAdelante, JLayeredPane.PALETTE_LAYER);

        // Agregar componentes a tu página de usuario
        JLabel label = new JLabel();
        paneldeFondo.add(label);

        // Barra de menú de clor verde limón
        JMenuBar menuBarra = new JMenuBar();        
        menuBarra.setOpaque(true);
        menuBarra.setBackground(new Color(173, 255, 47));

        ImageIcon icono = new ImageIcon("C:\\proyectosprint\\src\\proyectosprint\\casa.png"); // Reemplaza con la ruta de tu imagen
        
        
     // Escalar el icono a un tamaño deseado
        icono = new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)); // Ajusta el tamaño según tus necesidades

        // Crear un elemento de menú personalizado con el icono
        JMenuItem iconoItem = new JMenuItem(icono);
        
        // Agregar el icono a la izquierda de la barra de menú
        menuBarra.add(Box.createRigidArea(new Dimension(10, 0))); // Espacio en blanco
        menuBarra.add(iconoItem);
        
        // Configurar la barra de menú en el JFrame
        pagina.setJMenuBar(menuBarra);

        // Agregar el panel al JFrame
        pagina.add(paneldeFondo);

        // Asegurarse de que el JFrame sea visible
        pagina.setVisible(true);
    }
}
