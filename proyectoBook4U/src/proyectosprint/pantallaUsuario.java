package proyectosprint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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

        // Botón "Cerrar sesión"
        JButton botonCerrarSesion = new JButton("Cerrar sesión");
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

        // Tamaño de los campos de entrada
        Dimension campoDimension = new Dimension(200, 20); // Tamaño personalizado

        // Etiquetas para los campos con fuente más pequeña
        Font fuenteEtiqueta = new Font("Arial", Font.PLAIN, 16); // Tamaño de fuente para las etiquetas

        // Agregar campos de entrada, botones "Editar" y lógica de edición
        JTextField[] campos = new JTextField[5];
        JToggleButton[] botonesEditar = new JToggleButton[5];
        String[] valoresOriginales = new String[5];

        try {
            // Conectar a la base de datos Oracle
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.26:1521:xe", "DW2_2324_BOOK4U_ESECODI", "AESECODI");

            // Consulta para recuperar datos del usuario (reemplaza con tu consulta SQL)
            String consulta = "SELECT nombre, apellidos, telefono, dni, contrasenya FROM usuario WHERE id_cliente = ?";

            // Preparar la consulta
            PreparedStatement preparedStatement = connection.prepareStatement(consulta);
            // Asumiendo que tienes el ID del usuario, reemplaza el valor 1 con el ID correcto
            preparedStatement.setInt(1, 1); // Cambia 1 por el ID de tu usuario

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Si se encuentra un registro, mostrar los datos en los campos de texto
            if (resultSet.next()) {
                for (int i = 0; i < 5; i++) {
                    campos[i] = new JTextField(resultSet.getString(i + 1)); // Indices en ResultSet comienzan en 1
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
                            etiqueta.setText("Teléfono:");
                            break;
                        case 3:
                            etiqueta.setText("DNI:");
                            break;
                        case 4:
                            etiqueta.setText("Contraseña:");
                            break;
                    }
                    etiqueta.setFont(fuenteEtiqueta);

                    botonesEditar[i] = new JToggleButton("Editar");
                    botonesEditar[i].setFont(fuenteEtiqueta);
                    final int index = i;
                    botonesEditar[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (botonesEditar[index].isSelected()) {
                                botonesEditar[index].setText("Cancelar");
                                valoresOriginales[index] = campos[index].getText(); // Guardar el valor original
                                campos[index].setEditable(true);
                            } else {
                                botonesEditar[index].setText("Editar");
                                campos[index].setText(valoresOriginales[index]); // Restaurar el valor original
                                campos[index].setEditable(false);
                            }
                        }
                    });

                    JPanel filaPanel = new JPanel(new BorderLayout());
                    filaPanel.setBackground(new Color(255, 255, 255));

                    filaPanel.add(etiqueta, BorderLayout.WEST);
                    filaPanel.add(campos[index], BorderLayout.CENTER);
                    filaPanel.add(botonesEditar[index], BorderLayout.EAST);
                    panelCampos.add(filaPanel);
                }
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        
    
        panelInferior.add(panelCampos, BorderLayout.CENTER);

        // Panel de "Guardar cambios"
        JPanel panelGuardarCambios = new JPanel(new BorderLayout());
        panelGuardarCambios.setBackground(new Color(255, 255, 255));

        // Textfield "Número de créditos actuales"
        JTextField numCreditos = new JTextField("0");
        numCreditos.setEditable(false);
        numCreditos.setPreferredSize(campoDimension);
        JLabel numCreditosLabel = new JLabel("Número de créditos actuales:");

        // Textfield "¿Quieres comprar más crédito?"
        JTextField comprarCreditos = new JTextField();
        comprarCreditos.setPreferredSize(campoDimension);
        JLabel comprarCreditosLabel = new JLabel("¿Quieres comprar más crédito?");

        // Botón "Comprar créditos"
        JButton botonComprarCreditos = new JButton("Comprar créditos");

        // Botón "Guardar cambios"
     // Botón "Guardar cambios"
        JButton botonGuardarCambios = new JButton("Guardar cambios");
        botonGuardarCambios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para actualizar la base de datos con los nuevos valores
                try {
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.3.26:1521:xe", "DW2_2324_BOOK4U_ESECODI", "AESECODI");
                    for (int i = 0; i < 5; i++) {
                        if (campos[i].isEditable()) {
                            String nuevoValor = campos[i].getText();
                            // Realizar la actualización en la base de datos
                            String consulta = "UPDATE usuario SET ";
                            switch (i) {
                                case 0:
                                    consulta += "nombre = ?";
                                    break;
                                case 1:
                                    consulta += "apellidos = ?";
                                    break;
                                case 2:
                                    consulta += "telefono = ?";
                                    break;
                                case 3:
                                    consulta += "dni = ?";
                                    break;
                                case 4:
                                    consulta += "contrasenya = ?";
                                    break;
                            }
                            consulta += " WHERE id_cliente = ?";

                            PreparedStatement preparedStatement = connection.prepareStatement(consulta);
                            preparedStatement.setString(1, nuevoValor);
                            preparedStatement.setInt(2, 1); // Cambia 1 por el ID de tu usuario
                            preparedStatement.executeUpdate();
                            preparedStatement.close();

                            // Actualizar el campo de texto con el nuevo valor
                            campos[i].setText(nuevoValor);
                            campos[i].setEditable(false);
                            botonesEditar[i].setText("Editar");
                        }
                    }
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Agregar elementos al panel de "Guardar cambios"
        JPanel panelIzquierdo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelIzquierdo.add(numCreditosLabel);
        panelIzquierdo.add(numCreditos);
        panelIzquierdo.add(comprarCreditosLabel);
        panelIzquierdo.add(botonComprarCreditos);

        panelGuardarCambios.add(panelIzquierdo, BorderLayout.WEST);

        // Agregar el botón "Guardar cambios" al panel "Guardar cambios"
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

