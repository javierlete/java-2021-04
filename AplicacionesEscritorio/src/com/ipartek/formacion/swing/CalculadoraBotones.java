package com.ipartek.formacion.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalculadoraBotones {

	private static final Font TIPO_LETRA = new Font("Tahoma", Font.PLAIN, 18);
	private JFrame frame;
	private JTextField tfPantalla;
	private JPanel pNumeros;
	private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

	private double op1, op2;
	private String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBotones window = new CalculadoraBotones();
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
	public CalculadoraBotones() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		initialize();

		String[] etiquetas = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "CE", "0", "." };

		JButton boton;

		for (String etiqueta : etiquetas) {
			boton = new JButton(etiqueta);
			boton.setFont(TIPO_LETRA);

			boton.addActionListener((e) -> {
				JButton b = (JButton) e.getSource();
				String texto = b.getText();

				if ("CE".equals(texto)) {
					tfPantalla.setText("");
				} else {
					tfPantalla.setText(tfPantalla.getText() + texto);
				}
			});

			pNumeros.add(boton);
		}

		ActionListener operaciones = (e) -> {
			JButton b = (JButton) e.getSource();
			
			op = b.getText();
			op1 = Double.parseDouble(tfPantalla.getText());
			
			tfPantalla.setText("");
		};

		btnSumar.addActionListener(operaciones);
		btnRestar.addActionListener(operaciones);
		btnMultiplicar.addActionListener(operaciones);
		btnDividir.addActionListener(operaciones);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tfPantalla = new JTextField();
		tfPantalla.setFont(TIPO_LETRA);
		tfPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		tfPantalla.setEnabled(false);
		frame.getContentPane().add(tfPantalla, BorderLayout.NORTH);
		tfPantalla.setColumns(10);

		JPanel pOperaciones = new JPanel();
		frame.getContentPane().add(pOperaciones, BorderLayout.EAST);
		pOperaciones.setLayout(new GridLayout(0, 1, 0, 0));

		btnSumar = new JButton("+");
		btnSumar.setFont(TIPO_LETRA);
		pOperaciones.add(btnSumar);

		btnRestar = new JButton("-");
		btnRestar.setFont(TIPO_LETRA);
		pOperaciones.add(btnRestar);

		btnMultiplicar = new JButton("x");
		btnMultiplicar.setFont(TIPO_LETRA);
		pOperaciones.add(btnMultiplicar);

		btnDividir = new JButton("/");
		btnDividir.setFont(TIPO_LETRA);
		pOperaciones.add(btnDividir);

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op2 = Double.parseDouble(tfPantalla.getText());
				
				double resultado = 0;
				
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
				
				tfPantalla.setText(strResultado);
			}
		});
		pOperaciones.add(btnIgual);

		pNumeros = new JPanel();
		frame.getContentPane().add(pNumeros, BorderLayout.CENTER);
		pNumeros.setLayout(new GridLayout(4, 3, 0, 0));
	}

}
