package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField textL1;
	private JTextField textL2;
	private JTextField textL3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textL1 = new JTextField();
		textL1.setBounds(10, 11, 86, 20);
		contentPane.add(textL1);
		textL1.setColumns(10);

		textL2 = new JTextField();
		textL2.setBounds(106, 11, 86, 20);
		contentPane.add(textL2);
		textL2.setColumns(10);

		textL3 = new JTextField();
		textL3.setBounds(202, 11, 86, 20);
		contentPane.add(textL3);
		textL3.setColumns(10);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double l1 = Double.valueOf(textL1.getText());
				double l2 = Double.valueOf(textL2.getText());
				double l3 = Double.valueOf(textL3.getText());

				if ((l1 == l2) && (l1 == l3)) {
					JOptionPane.showMessageDialog(btnConfirmar, "Triângulo equilátero!");
				}
				if (((l1 == l2) && (l1 != l3)) || ((l2 != l1) && (l2 == l3)) || ((l1 == l3) && (l1 != l2))) {
					JOptionPane.showMessageDialog(btnConfirmar, "Triângulo isóceles!");
				}
				if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
					JOptionPane.showMessageDialog(btnConfirmar, "Triângulo escaleno!");
				}
			}
		});
		btnConfirmar.setBounds(298, 10, 126, 23);
		contentPane.add(btnConfirmar);

		JLabel lblNewLabel = new JLabel("Lado 1");
		lblNewLabel.setBounds(10, 42, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblLado = new JLabel("Lado 2");
		lblLado.setBounds(106, 42, 46, 14);
		contentPane.add(lblLado);

		JLabel lblLado_2 = new JLabel("Lado 3");
		lblLado_2.setBounds(202, 42, 46, 14);
		contentPane.add(lblLado_2);
	}
}
