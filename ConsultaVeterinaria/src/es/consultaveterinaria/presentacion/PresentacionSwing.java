package es.consultaveterinaria.presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import es.consultaveterinaria.accesodatos.DaoMascota;
import es.consultaveterinaria.entidades.Mascota;

public class PresentacionSwing {

	private JFrame frame;
	private JTextField tfId;
	private JTextField tfNombre;
	private JTextField tfFecha;
	private JTable tListado;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PresentacionSwing window = new PresentacionSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public PresentacionSwing() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		initialize();

		modelo = (DefaultTableModel) tListado.getModel();
		
		tListado.addMouseListener(new MouseAdapter() 
		   {
		      public void mouseClicked(MouseEvent e) 
		      {
		         int fila = tListado.rowAtPoint(e.getPoint());
		         int columna = tListado.columnAtPoint(e.getPoint());
		         if ((fila > -1) && (columna > -1)) {
		            //System.out.println(modelo.getValueAt(fila,columna));
		        	 Integer id = (Integer) modelo.getValueAt(fila, 0);
		        	 
		        	 Mascota mascota = DaoMascota.obtenerPorId(id);
		        	 
		        	 tfId.setText(mascota.getId().toString());
		        	 tfNombre.setText(mascota.getNombre());
		        	 tfFecha.setText(mascota.getFechaNacimiento().toString());
		         }
		      }
		   });
		refrescarTabla();
	}

	// http://chuwiki.chuidiang.org/index.php?title=JTable
	private void refrescarTabla() {
		modelo.setRowCount(0);
		
		for (Mascota mascota : DaoMascota.obtenerTodas()) {
			modelo.addRow(new Object[] { mascota.getId(), mascota.getNombre(), mascota.getFechaNacimiento() });
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblNewLabel_3 = new JLabel("Cl\u00EDnica Veterinaria Mascotas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("Id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		tfId = new JTextField();
		GridBagConstraints gbc_tfId = new GridBagConstraints();
		gbc_tfId.weightx = 5.0;
		gbc_tfId.insets = new Insets(0, 0, 5, 0);
		gbc_tfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfId.gridx = 1;
		gbc_tfId.gridy = 1;
		frame.getContentPane().add(tfId, gbc_tfId);
		tfId.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);

		tfNombre = new JTextField();
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombre.gridx = 1;
		gbc_tfNombre.gridy = 2;
		frame.getContentPane().add(tfNombre, gbc_tfNombre);
		tfNombre.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Fecha de nacimiento");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);

		tfFecha = new JTextField();
		GridBagConstraints gbc_tfFecha = new GridBagConstraints();
		gbc_tfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_tfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfFecha.gridx = 1;
		gbc_tfFecha.gridy = 3;
		frame.getContentPane().add(tfFecha, gbc_tfFecha);
		tfFecha.setColumns(10);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 4;
		frame.getContentPane().add(panel, gbc_panel);

		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Integer id = Integer.parseInt(tfId.getText());
				String nombre = tfNombre.getText();
				LocalDate fecha = LocalDate.parse(tfFecha.getText());
				
				Mascota mascota = new Mascota(null, nombre, fecha);
				
				DaoMascota.insertar(mascota);
				
				refrescarTabla();
			}
		});
		panel.add(btnInsertar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer id = Integer.parseInt(tfId.getText());
				String nombre = tfNombre.getText();
				LocalDate fecha = LocalDate.parse(tfFecha.getText());
				
				Mascota mascota = new Mascota(id, nombre, fecha);
				
				DaoMascota.modificar(mascota);
				
				refrescarTabla();
			}
		});
		panel.add(btnModificar);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer id = Integer.parseInt(tfId.getText());
				
				DaoMascota.borrar(id);
				
				refrescarTabla();
			}
		});
		panel.add(btnBorrar);

		tListado = new JTable();
		tListado.setModel(new DefaultTableModel(
				new Object[][] { },
				new String[] { "Id", "Nombre", "Fecha de nacimiento" }));
		GridBagConstraints gbc_tListado = new GridBagConstraints();
		gbc_tListado.gridwidth = 2;
		gbc_tListado.fill = GridBagConstraints.BOTH;
		gbc_tListado.gridx = 0;
		gbc_tListado.gridy = 5;
		frame.getContentPane().add(tListado, gbc_tListado);
	}

}
