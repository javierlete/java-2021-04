package com.ipartek.formacion.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Calculadora {

	private JFrame frame;
	private JTextField tfOp1;
	private JTextField tfOp2;

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
	 * 
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public Calculadora() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 79);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfOp1 = new JTextField();
		tfOp1.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(tfOp1);
		tfOp1.setColumns(10);

		JButton btnIgual = new JButton("=");

		tfOp2 = new JTextField();
		tfOp2.setColumns(10);
		tfOp2.setBounds(154, 11, 86, 20);
		frame.getContentPane().add(tfOp2);

		JComboBox cbOp = new JComboBox();
		cbOp.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "x", "/" }));
		cbOp.setBounds(106, 10, 34, 22);
		frame.getContentPane().add(cbOp);

		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(301, 11, 123, 20);
		frame.getContentPane().add(lblResultado);

		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String op = (String) cbOp.getSelectedItem();

				int resultado = 0, op1, op2;

				op1 = Integer.parseInt(tfOp1.getText());
				op2 = Integer.parseInt(tfOp2.getText());

				switch (op) {
				case "+":
					resultado = op1 + op2;
					break;
				case "-":
					resultado = op1 - op2;
					break;
				case "x":
					resultado = op1 * op2;
					break;
				case "/":
					resultado = op1 / op2;
					break;
				}

				String strResultado = String.valueOf(resultado);

				lblResultado.setText(strResultado);

				// lblResultado.setText(String.valueOf(Integer.parseInt(tfOp1.getText()) * 2));
			}
		});
		btnIgual.setBounds(250, 10, 41, 23);
		frame.getContentPane().add(btnIgual);

	}
}
