import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class RegistroUsuarioInterfaz extends JFrame {

    private Map<String, Cliente> tablaHashClientes = new HashMap<>();
    private JTextArea salidaTextArea;
    private JTextField nombreTextField;
    private JTextField numeroTelefonoTextField;
    private JTextField planTextField;

    public RegistroUsuarioInterfaz() {
        // Configurar la interfaz gráfica
        setTitle("Servicio Telefónico - Clientes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        salidaTextArea = new JTextArea(15, 40);
        nombreTextField = new JTextField(20);
        numeroTelefonoTextField = new JTextField(15);
        planTextField = new JTextField(20);
        JButton agregarClienteButton = new JButton("Agregar Cliente");

        // Configurar el diseño
        setLayout(new BorderLayout());

        // Crear panel superior
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Nombre: "));
        topPanel.add(nombreTextField);
        topPanel.add(new JLabel("Número de Teléfono: "));
        topPanel.add(numeroTelefonoTextField);
        topPanel.add(new JLabel("Plan: "));
        topPanel.add(planTextField);
        topPanel.add(agregarClienteButton);

        // Manejar la acción del botón Agregar Cliente
        agregarClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String numeroTelefono = numeroTelefonoTextField.getText();
                String plan = planTextField.getText();

                Cliente cliente = new Cliente(nombre, numeroTelefono, plan);
                tablaHashClientes.put(numeroTelefono, cliente);
                actualizarTextArea();
                limpiarCampos();
            }
        });

        // Agregar componentes al panel principal
        add(topPanel, BorderLayout.NORTH);

        // Crear panel central con área de texto
        add(new JScrollPane(salidaTextArea), BorderLayout.CENTER);

        // Mostrar la interfaz gráfica
        setVisible(true);
    }

    // Actualizar el contenido del área de texto
    private void actualizarTextArea() {
        StringBuilder texto = new StringBuilder();
        for (Map.Entry<String, Cliente> entry : tablaHashClientes.entrySet()) {
            texto.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        salidaTextArea.setText(texto.toString());
    }

    // Limpiar los campos de entrada
    private void limpiarCampos() {
        nombreTextField.setText("");
        numeroTelefonoTextField.setText("");
        planTextField.setText("");
    }

    // Clase para representar un cliente
    private static class Cliente {
        private String nombre;
        private String numeroTelefono;
        private String plan;

        public Cliente(String nombre, String numeroTelefono, String plan) {
            this.nombre = nombre;
            this.numeroTelefono = numeroTelefono;
            this.plan = plan;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Telefono: "+ numeroTelefono + ", Plan: " + plan;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ServicioTelefonicoGUI());
    }
}
