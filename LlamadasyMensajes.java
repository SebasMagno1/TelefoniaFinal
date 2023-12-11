import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

class RegistroLlamadasMensajesGUI extends JFrame {

    private LinkedList<String> llamadas = new LinkedList<>();
    private LinkedList<String> mensajes = new LinkedList<>();

    private JTextArea llamadasTextArea;
    private JTextArea mensajesTextArea;
    private JTextField entradaTextField;
    private JTextField salidaTextField;

    public RegistroLlamadasMensajesGUI() {
        // Configurar la interfaz gráfica
        setTitle("Registro de Llamadas y Mensajes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        llamadasTextArea = new JTextArea(10, 20);
        mensajesTextArea = new JTextArea(10, 20);
        entradaTextField = new JTextField(20);
        salidaTextField = new JTextField(20);
        JButton agregarLlamadaButton = new JButton("Agregar Llamada");
        JButton agregarMensajeButton = new JButton("Agregar Mensaje");

        // Configurar el diseño
        setLayout(new BorderLayout());

        // Crear panel superior
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Numero Origen: "));
        topPanel.add(entradaTextField);
        topPanel.add(new JLabel("Numero Destino: "));
        topPanel.add(salidaTextField);
        topPanel.add(agregarLlamadaButton);
        topPanel.add(agregarMensajeButton);

        // Manejar la acción del botón Agregar Llamada
        agregarLlamadaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String llamada = entradaTextField.getText();
                String llamada1 = salidaTextField.getText();
                llamadas.addFirst("Origen: "+ llamada + " Destino: "+llamada1);
                actualizarTextAreas();
                entradaTextField.setText("");
                salidaTextField.setText("");
            }
        });

        // Manejar la acción del botón Agregar Mensaje
        agregarMensajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = entradaTextField.getText();
                String mensaje1 = salidaTextField.getText();
                mensajes.addFirst("Origen: " + mensaje + " Destino: " + mensaje1);
                actualizarTextAreas();
                entradaTextField.setText("");
                salidaTextField.setText("");
            }
        });

        // Agregar componentes al panel principal
        add(topPanel, BorderLayout.NORTH);

        // Crear panel central con pestañas
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Llamadas", new JScrollPane(llamadasTextArea));
        tabbedPane.addTab("Mensajes", new JScrollPane(mensajesTextArea));
        add(tabbedPane, BorderLayout.CENTER);

        // Mostrar la interfaz gráfica
        setVisible(true);
    }

    // Actualizar el contenido de las áreas de texto
    private void actualizarTextAreas() {
        StringBuilder llamadasText = new StringBuilder();
        for (String llamada : llamadas) {
            llamadasText.append(llamada).append("\n");
        }
        llamadasTextArea.setText(llamadasText.toString());

        StringBuilder mensajesText = new StringBuilder();
        for (String mensaje : mensajes) {
            mensajesText.append(mensaje).append("\n");
        }
        mensajesTextArea.setText(mensajesText.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistroLlamadasMensajesGUI());
    }
}

