import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class InterfazRegistroDispositivo extends JFrame {

    private Map<String, Dispositivo> tablaHashDispositivos = new HashMap<>();
    private JTextArea salidaTextArea;
    private JTextField dispositivoTextField;
    private JTextField numeroTelefonoTextField;
    private JButton agregarDispositivoButton;

    public InterfazRegistroDispositivo() {
        // Configurar la interfaz gráfica
        setTitle("Servicio Telefónico - Dispositivos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        salidaTextArea = new JTextArea(15, 40);
        dispositivoTextField = new JTextField(20);
        numeroTelefonoTextField = new JTextField(15);
        agregarDispositivoButton = new JButton("Agregar Dispositivo");

        // Configurar el diseño
        setLayout(new BorderLayout());

        // Crear panel superior
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Dispositivo: "));
        topPanel.add(dispositivoTextField);
        topPanel.add(new JLabel("Número de Teléfono: "));
        topPanel.add(numeroTelefonoTextField);
        topPanel.add(agregarDispositivoButton);

        // Manejar la acción del botón Agregar Dispositivo
        agregarDispositivoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dispositivo = dispositivoTextField.getText();
                String numeroTelefono = numeroTelefonoTextField.getText();

                Dispositivo nuevoDispositivo = new Dispositivo(dispositivo, numeroTelefono);
                tablaHashDispositivos.put(numeroTelefono, nuevoDispositivo);
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
        for (Map.Entry<String, Dispositivo> entry : tablaHashDispositivos.entrySet()) {
            texto.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        salidaTextArea.setText(texto.toString());
    }

    // Limpiar los campos de entrada
    private void limpiarCampos() {
        dispositivoTextField.setText("");
        numeroTelefonoTextField.setText("");
    }

    // Clase para representar un dispositivo
    private static class Dispositivo {
        private String nombreDispositivo;
        private String numeroTelefono;

        public Dispositivo(String nombreDispositivo, String numeroTelefono) {
            this.nombreDispositivo = nombreDispositivo;
            this.numeroTelefono = numeroTelefono;
        }

        @Override
        public String toString() {
            return "Nombre del Dispositivo: " + nombreDispositivo +", Numero Telefono" + numeroTelefono;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ServicioTelefonicoGUI());
    }
}
