
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mycompany.gestorbiblioteca.Libro;

import javax.swing.JScrollPane;

public class Biblioteca extends JFrame implements ActionListener {

    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextArea txtAreaResulado;
    @SuppressWarnings("unused")
    private List<Libro> Libros;

    /**
     * 
     */
    public Biblioteca() {
        super("Biblioteca");

        Libros = new ArrayList<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());
        setResizable(false);
        setLocationRelativeTo(null);

        // Panel de formulario para agregar libros//

        JPanel panelFormulario = new JPanel(new GridLayout(2, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        JLabel lblTitulo = new JLabel("Titulo: ");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        txtTitulo = new JTextField();
        txtTitulo.setFont(new Font("Arial", Font.PLAIN, 16));

        JLabel lblAutor = new JLabel("Autor: ");
        lblAutor.setFont(new Font("Arial", Font.BOLD, 16));
        txtAutor = new JTextField();
        txtAutor.setFont(new Font("Arial", Font.PLAIN, 16));

        panelFormulario.add(lblTitulo);
        panelFormulario.add(txtTitulo);
        panelFormulario.add(lblAutor);
        panelFormulario.add(txtAutor);

        // Boton añadir libro//

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        btnAgregar.setFont(new Font("Roboto", Font.BOLD, 16));
        btnAgregar.setBackground(new Color(0, 139, 139));
        btnAgregar.setForeground(Color.WHITE);
        btnAgregar.setPreferredSize(new Dimension(200, 40));

        // Boton Eliminar libro//

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);
        btnEliminar.setFont(new Font("Roboto", Font.BOLD, 16));
        btnEliminar.setBackground(new Color(220, 20, 60));
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setPreferredSize(new Dimension(200, 40));

        // Boton Buscar libro//

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        btnBuscar.setFont(new Font("Roboto", Font.BOLD, 16));
        btnBuscar.setBackground(new Color(0, 100, 0));
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.setPreferredSize(new Dimension(200, 40));

        // Boton Inventario libro//

        JButton btnInventario = new JButton("Inventario");
        btnInventario.addActionListener(this);
        btnInventario.setFont(new Font("Roboto", Font.BOLD, 16));
        btnInventario.setBackground(new Color(255, 165, 0));
        btnInventario.setForeground(Color.WHITE);
        btnInventario.setPreferredSize(new Dimension(200, 40));

        panelFormulario.add(btnAgregar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnBuscar);
        panelFormulario.add(btnInventario);

        // Área de Resultado

        txtAreaResulado = new JTextArea();
        txtAreaResulado.setEditable(false);
        txtAreaResulado.setFont(new Font("Monserrat", Font.PLAIN, 20));
        txtAreaResulado.setLineWrap(true);
        txtAreaResulado.setWrapStyleWord(true);
        txtAreaResulado.setBackground(new Color(240, 240, 240));
        txtAreaResulado.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        JScrollPane scrollPane = new JScrollPane(txtAreaResulado);
        scrollPane.setPreferredSize(new Dimension(560, 200));

        // Panel Principal

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
        panelPrincipal.add(scrollPane, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}