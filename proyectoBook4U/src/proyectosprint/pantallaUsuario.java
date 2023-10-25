package proyectosprint;

import javax.swing.*;
import java.awt.*;

public class pantallaUsuario {
    public static void main(String[] args) {
        JFrame pagina = new JFrame("Página del Usuario");
        pagina.setSize(1080, 720);
        pagina.setLocationRelativeTo(null);
        pagina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Color de fondo
        Color colorDeFondo = new Color(15, 82, 15, 255);
        pagina.getContentPane().setBackground(colorDeFondo);

        // Panel superior (que cumple la función de una barra de menú)
        JPanel barraMenu = new JPanel(new BorderLayout());
        barraMenu.setBackground(new Color(213, 232, 212, 255)); // Color verde limón
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

        // Panel para campos de entrada
        JPanel panelCampos = new JPanel(new GridLayout(5, 3)); // 5 filas y 3 columnas
        panelCampos.setBackground(new Color(255, 255, 255)); // Color blanco (puedes cambiarlo a tu preferencia)

        // Tamaño de los campos de entrada
        Dimension campoDimension = new Dimension(200, 20); // Tamaño personalizado

        // Agregar campos de entrada y ajustar su tamaño
        JTextField NombreCampo = new JTextField();
        NombreCampo.setPreferredSize(campoDimension);
        JTextField ApellidosCampo = new JTextField();
        ApellidosCampo.setPreferredSize(campoDimension);
        JTextField DNICampo = new JTextField();
        DNICampo.setPreferredSize(campoDimension);
        JTextField DomicilioCampo = new JTextField();
        DomicilioCampo.setPreferredSize(campoDimension);
        JTextField ContraseñaCampo = new JTextField();
        ContraseñaCampo.setPreferredSize(campoDimension);

        // Etiquetas para los campos con fuente más pequeña
        Font fuenteEtiqueta = new Font("Arial", Font.PLAIN, 16); // Tamaño de fuente para las etiquetas
        JLabel NombreTexto = new JLabel("Nombre:");
        NombreTexto.setFont(fuenteEtiqueta);
        JLabel ApellidosTexto = new JLabel("Apellidos:");
        ApellidosTexto.setFont(fuenteEtiqueta);
        JLabel DNITexto = new JLabel("DNI:");
        DNITexto.setFont(fuenteEtiqueta);
        JLabel DomicilioTexto = new JLabel("Domicilio:");
        DomicilioTexto.setFont(fuenteEtiqueta);
        JLabel ContraseñaTexto = new JLabel("Contraseña:");
        ContraseñaTexto.setFont(fuenteEtiqueta);
        
        //Agregar los botones de editar
        
        JButton BotonEditar = new JButton("Editar");

        // Agregar etiquetas y campos al panel de campos (uno debajo del otro)
        panelCampos.add(NombreTexto);
        panelCampos.add(NombreCampo);
        panelCampos.add(ApellidosTexto);
        panelCampos.add(ApellidosCampo);
        panelCampos.add(DNITexto);
        panelCampos.add(DNICampo);
        panelCampos.add(DomicilioTexto);
        panelCampos.add(DomicilioCampo);
        panelCampos.add(ContraseñaTexto);
        panelCampos.add(ContraseñaCampo);

        panelInferior.add(panelCampos, BorderLayout.CENTER);

        // Agregar el panel superior y el panel inferior al JFrame
        pagina.add(barraMenu, BorderLayout.NORTH);
        pagina.add(panelInferior, BorderLayout.CENTER);

        // Asegurarse de que el JFrame sea visible
        pagina.setVisible(true);
    }
}
