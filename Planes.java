import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class ServicioTelefonicoGUI extends JFrame {

    private Map<String, PlanServicio> tablaHash = new HashMap<>();
    private JTextArea salidaTextArea;
    private JTextField nombrePlanTextField;
    private JTextField tarifaTextField;
    private JTextField tipoFacturacionTextField;

    public ServicioTelefonicoGUI() {
        // Configurar la interfaz gráfica
        setTitle("Servicio Telefónico");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        salidaTextArea = new JTextArea(15, 40);
        nombrePlanTextField = new JTextField(20);
        tarifaTextField = new JTextField(10);
        tipoFacturacionTextField = new JTextField(20);
        JButton agregarPlanButton = new JButton("Agregar Plan");

        // Configurar el diseño
        setLayout(new BorderLayout());

        // Crear panel superior
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Nombre del Plan: "));
        topPanel.add(nombrePlanTextField);
        topPanel.add(new JLabel("Tarifa: "));
        topPanel.add(tarifaTextField);
        topPanel.add(new JLabel("Tipo de Facturación: "));
        topPanel.add(tipoFacturacionTextField);
        topPanel.add(agregarPlanButton);

        // Manejar la acción del botón Agregar Plan
        agregarPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombrePlan = nombrePlanTextField.getText();
                double tarifa = Double.parseDouble(tarifaTextField.getText());
                String tipoFacturacion = tipoFacturacionTextField.getText();

                PlanServicio plan = new PlanServicio(nombrePlan, tarifa, tipoFacturacion);
                tablaHash.put(nombrePlan, plan);
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
        for (Map.Entry<String, PlanServicio> entry : tablaHash.entrySet()) {
            texto.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        salidaTextArea.setText(texto.toString());
    }

    // Limpiar los campos de entrada
    private void limpiarCampos() {
        nombrePlanTextField.setText("");
        tarifaTextField.setText("");
        tipoFacturacionTextField.setText("");
    }

    // Clase para representar un plan de servicio
    private static class PlanServicio {
        private String nombrePlan;
        private double tarifa;
        private String tipoFacturacion;

        public PlanServicio(String nombrePlan, double tarifa, String tipoFacturacion) {
            this.nombrePlan = nombrePlan;
            this.tarifa = tarifa;
            this.tipoFacturacion = tipoFacturacion;
        }

        @Override
        public String toString() {
            return "Tarifa: " + tarifa + ", Tipo de Facturación: " + tipoFacturacion;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ServicioTelefonicoGUI());
    }
}

