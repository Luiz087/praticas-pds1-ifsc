package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textCampo1;
	private JTextField textCampo2;
	private JButton btnSub;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCampo1 = new JTextField();
		textCampo1.setBounds(10, 11, 86, 20);
		contentPane.add(textCampo1);
		textCampo1.setColumns(10);
		
		textCampo2 = new JTextField();
		textCampo2.setBounds(125, 11, 86, 20);
		contentPane.add(textCampo2);
		textCampo2.setColumns(10);
		
		btnSub = new JButton("Subtração");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(textCampo1.getText());
				Long inp2 = Long.valueOf(textCampo2.getText());
				
				Long sub = inp1 - inp2;
				
				JOptionPane.showMessageDialog(btnSub, "A subtração de tudo foi: " + sub);
			}
		});
		btnSub.setBounds(122, 42, 89, 23);
		contentPane.add(btnSub);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(textCampo1.getText());
				Long inp2 = Long.valueOf(textCampo2.getText());
				
				Long soma = inp1 + inp2;
				
				JOptionPane.showMessageDialog(btnSoma, "A soma de tudo foi: " + soma);
			}
		});
		btnSoma.setBounds(10, 42, 89, 23);
		contentPane.add(btnSoma);
		
		JButton btnMulti = new JButton("Multiplicação");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(textCampo1.getText());
				Long inp2 = Long.valueOf(textCampo2.getText());
				
				Long mult = inp1 * inp2;
				
				JOptionPane.showMessageDialog(btnSoma, "A multiplicação de tudo foi: " + mult);
			}
		});
		btnMulti.setBounds(10, 76, 89, 23);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("Divisão");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(textCampo1.getText());
				Long inp2 = Long.valueOf(textCampo2.getText());
				
				Long div = inp1 / inp2;
				
				JOptionPane.showMessageDialog(btnSoma, "A divisão de tudo foi: " + div);
			}
		});
		btnDiv.setBounds(122, 76, 89, 23);
		contentPane.add(btnDiv);
	}
}
