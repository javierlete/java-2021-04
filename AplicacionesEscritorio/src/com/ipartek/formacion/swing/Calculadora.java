package com.ipartek.formacion.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frame;
	private JTextField tfOp1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfOp1 = new JTextField();
		tfOp1.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(tfOp1);
		tfOp1.setColumns(10);

		JButton btnIgual = new JButton("=");
		
		JComboBox cbOp = new JComboBox();
		cbOp.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", "/"}));
		cbOp.setBounds(106, 10, 89, 22);
		frame.getContentPane().add(cbOp);

		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(205, 14, 46, 14);
		frame.getContentPane().add(lblResultado);

		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String op = (String) cbOp.getSelectedItem();
				
				JOptionPane.showMessageDialog(frame, op);
				
				String texto = tfOp1.getText();

				int num = Integer.parseInt(texto);
				int resultado = num * 2;

				String strResultado = String.valueOf(resultado);

				lblResultado.setText(strResultado);
				
				JOptionPane.showMessageDialog(frame, strResultado);
				System.out.println(JOptionPane.showConfirmDialog(frame, "¿Estás seguro?"));
				System.out.println(JOptionPane.showInputDialog(frame, "Introduce tu nombre:"));

				// lblResultado.setText(String.valueOf(Integer.parseInt(tfOp1.getText()) * 2));
			}
		});
		btnIgual.setBounds(204, 10, 89, 23);
		frame.getContentPane().add(btnIgual);

	}
}
