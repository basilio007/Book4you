package proyectosprint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // Bot�n "Cerrar sesi�n"
        JButton botonCerrarSesion = new JButton("Cerrar sesi�n");
        barraMenu.add(botonCerrarSesion, BorderLayout.EAST);

        // Panel inferior
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.setBackground(new Color(255, 255, 255, 255));

        // Icono de usuario en la parte izquierda del panel inferior
        ImageIcon usuarioIcono = new ImageIcon("C:\\Users\\alumnat\\Documents\\GitHub\\Book4you\\proyectoBook4U\\src\\proyectosprint\\usuario.png");
        usuarioIcono = new ImageIcon(usuarioIcono.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
        JLabel usuarioLabel = new JLabel(usuarioIcono);
        panelInferior.add(usuarioLabel, BorderLayout.WEST);

        // Panel para campos de entrada
        JPanel panelCampos = new JPanel(new GridLayout(5, 1)); // 5 filas y 1 columna
        panelCampos.setBackground(new Color(255, 255, 255)); // Color blanco (puedes cambiarlo a tu preferencia)

        // Tama�o de los campos de entrada
        Dimension campoDimension = new Dimension(200, 20); // Tama�o personalizado

        // Etiquetas para los campos con fuente m�s peque�a
        Font fuenteEtiqueta = new Font("Arial", Font.PLAIN, 16); // Tama�o de fuente para las etiquetas

        // Agregar campos de entrada, botones "Editar" y l�gica de edici�n
        JTextField[] campos = new JTextField[5];
        JButton[] botonesEditar = new JButton[5];

        for (int i = 0; i < 5; i++) {
            campos[i] = new JTextField();
            campos[i].setPreferredSize(campoDimension);
            campos[i].setEditable(false);

            JLabel etiqueta = new JLabel();
            switch (i) {
                case 0:
                    etiqueta.setText("Nombre:");
                    break;
                case 1:
                    etiqueta.setText("Apellidos:");
                    break;
                case 2:
                    etiqueta.setText("DNI:");
                    break;
                case 3:
                    etiqueta.setText("Domicilio:");
                    break;
                case 4:
                    etiqueta.setText("Contrase�a:");
                    break;
            }
            etiqueta.setFont(fuenteEtiqueta);

            botonesEditar[i] = new JButton("Editar");
            final int index = i;
            botonesEditar[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    campos[index].setEditable(true);
                }
            });

            JPanel filaPanel = new JPanel(new BorderLayout());
            filaPanel.setBackground(new Color(255, 255, 255));

            filaPanel.add(etiqueta, BorderLayout.WEST);
            filaPanel.add(campos[index], BorderLayout.CENTER);
            filaPanel.add(botonesEditar[index], BorderLayout.EAST);
            panelCampos.add(filaPanel);
        }

        panelInferior.add(panelCampos, BorderLayout.CENTER);

        // Panel de "Guardar cambios"
        JPanel panelGuardarCambios = new JPanel(new BorderLayout());
        panelGuardarCambios.setBackground(new Color(255, 255, 255));

        // Textfield "N�mero de cr�ditos actuales"
        JTextField numCreditos = new JTextField("0");
        numCreditos.setEditable(false);
        numCreditos.setPreferredSize(campoDimension);
        JLabel numCreditosLabel = new JLabel("N�mero de cr�ditos actuales:");

        // Textfield "�Quieres comprar m�s cr�dito?"
        JTextField comprarCreditos = new JTextField();
        comprarCreditos.setPreferredSize(campoDimension);
        JLabel comprarCreditosLabel = new JLabel("�Quieres comprar m�s cr�dito?");

        // Bot�n "Comprar cr�ditos"
        JButton botonComprarCreditos = new JButton("Comprar cr�ditos");

        // Bot�n "Guardar cambios"
        JButton botonGuardarCambios = new JButton("Guardar cambios");

        // Agregar elementos al panel de "Guardar cambios"
        JPanel panelIzquierdo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelIzquierdo.add(numCreditosLabel);
        panelIzquierdo.add(numCreditos);
        panelIzquierdo.add(comprarCreditosLabel);
        panelIzquierdo.add(botonComprarCreditos);

        panelGuardarCambios.add(panelIzquierdo, BorderLayout.WEST);

        // Agregar el bot�n "Guardar cambios" al panel "Guardar cambios"
        JPanel panelBotonGuardarCambios = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBotonGuardarCambios.add(botonGuardarCambios);
        panelGuardarCambios.add(panelBotonGuardarCambios, BorderLayout.SOUTH);

        panelInferior.add(panelGuardarCambios, BorderLayout.SOUTH);

        // Agregar el panel superior y el panel inferior al JFrame
        pagina.add(barraMenu, BorderLayout.NORTH);
        pagina.add(panelInferior, BorderLayout.CENTER);
        pagina.setVisible(true);
    }
}
