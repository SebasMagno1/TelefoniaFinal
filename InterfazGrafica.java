import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica {

    public static void main(String[] args) {

        // Crear un marco (ventana principal)
        JFrame frame = new JFrame("Telefonia");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear un menú
        JMenu fileMenu = new JMenu("Archivos");

        // Crear elementos del menú (opciones)
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        JMenuItem exitItem = new JMenuItem("Salir");

        // Agregar acciones a los elementos del menú
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Abrir"
                JOptionPane.showMessageDialog(frame, "Abrir archivo");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Guardar"
                JOptionPane.showMessageDialog(frame, "Guardar archivo");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });

        // Agregar elementos al menú
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Separador entre opciones
        fileMenu.add(exitItem);

        JMenu fileMenu1 = new JMenu("Clientes");

        JMenuItem CrearCliente = new JMenuItem("CrearCliente");
        JMenuItem MostrarCliente = new JMenuItem("MostrarCliente");
        //JMenuItem exitItem = new JMenuItem("Salir");

        // Agregar acciones a los elementos del menú
        CrearCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroUsuarioInterfaz listaUsuarios = new RegistroUsuarioInterfaz();
            }
        });

        MostrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Guardar"
                JOptionPane.showMessageDialog(frame, "Guardar archivo");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });

        // Agregar elementos al menú
        fileMenu1.add(CrearCliente);
        //fileMenu1.add(MostrarCliente);

        JMenu fileMenu2 = new JMenu("DispositivosNumeros");

        // Crear elementos del menú (opciones)
        JMenuItem AgregarDispNumeros = new JMenuItem("AgregarDispNumeros");
        JMenuItem MostrarDispNumeros = new JMenuItem("MostrarDispNumeros");
        //JMenuItem exitItem = new JMenuItem("Salir");

        // Agregar acciones a los elementos del menú
        AgregarDispNumeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazRegistroDispositivo Dispositivos = new InterfazRegistroDispositivo();
            }
        });

        MostrarDispNumeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Guardar"
                JOptionPane.showMessageDialog(frame, "Guardar archivo");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });

        // Agregar elementos al menú
        fileMenu2.add(AgregarDispNumeros);
        //fileMenu2.add(MostrarDispNumeros);

        JMenu fileMenu3 = new JMenu("RedConexiones");

        // Crear elementos del menú (opciones)
        JMenuItem AgregarConexiones = new JMenuItem("NuevaConexion");
        JMenuItem MostrarConexiones = new JMenuItem("Conexiones");
        //JMenuItem exitItem = new JMenuItem("Salir");

        // Agregar acciones a los elementos del menú
        AgregarConexiones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        MostrarConexiones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Guardar"
                JOptionPane.showMessageDialog(frame, "Guardar archivo");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });

        // Agregar elementos al menú
        //fileMenu3.add(AgregarConexiones);
        //fileMenu3.add(MostrarConexiones);

        JMenu fileMenu4 = new JMenu("RegistroLlamadasMensajes");

        // Crear elementos del menú (opciones)
        JMenuItem NuevasLlamadas = new JMenuItem("NuevaLlamada");
        JMenuItem MostrarLlamadas = new JMenuItem("MostrarLlamada");
        JMenuItem NuevosMensajes = new JMenuItem("NuevoMensaje");
        JMenuItem MostrarMensajes = new JMenuItem("MostrarLlamada");

        // Agregar acciones a los elementos del menú
        NuevasLlamadas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroLlamadasMensajesGUI llamadas = new RegistroLlamadasMensajesGUI();
            }
        });

        MostrarLlamadas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Guardar"
                JOptionPane.showMessageDialog(frame, "Guardar archivo");
            }
        });

        NuevosMensajes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });

        MostrarMensajes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });

        // Agregar elementos al menú
        fileMenu4.add(NuevasLlamadas);
        //fileMenu4.add(MostrarLlamadas);
        //fileMenu4.add(NuevosMensajes);
        //fileMenu4.add(MostrarMensajes);

        JMenu fileMenu5 = new JMenu("PlanesFacturacion");

        // Crear elementos del menú (opciones)
        JMenuItem Planes = new JMenuItem("AgregarPlanes");
        JMenuItem MostrarPlanes = new JMenuItem("ListaPlanes");
        JMenuItem Facturacion = new JMenuItem("Facturacion");

        // Agregar acciones a los elementos del menú
        Planes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ServicioTelefonicoGUI servicio = new ServicioTelefonicoGUI();
            }
        });

        MostrarPlanes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Guardar"
                JOptionPane.showMessageDialog(frame, "Guardar archivo");
            }
        });

        Facturacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la acción de "Salir"
                System.exit(0);
            }
        });

        // Agregar elementos al menú
        fileMenu5.add(Planes);
        //fileMenu5.add(MostrarPlanes);
        //fileMenu5.add(Facturacion);



        // Agregar el menú a la barra de menú
        menuBar.add(fileMenu);
        menuBar.add(fileMenu1);
        menuBar.add(fileMenu2);
        //menuBar.add(fileMenu3);
        menuBar.add(fileMenu4);
        menuBar.add(fileMenu5);

        // Establecer la barra de menú en el marco
        frame.setJMenuBar(menuBar);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
