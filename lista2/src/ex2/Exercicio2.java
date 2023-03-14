package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textMaior;
	private JTextField textMenor;
	private JButton btnExibir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		ArrayList<Double> num = new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(93, 11, 86, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		textMaior = new JTextField();
		textMaior.setEditable(false);
		textMaior.setBounds(93, 64, 86, 20);
		contentPane.add(textMaior);
		textMaior.setColumns(10);
		
		textMenor = new JTextField();
		textMenor.setEditable(false);
		textMenor.setBounds(93, 113, 86, 20);
		contentPane.add(textMenor);
		textMenor.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.valueOf(textNum.getText());
				
				num.add(n1);
			}
		});
		btnCadastrar.setBounds(82, 158, 101, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("Número");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Maior");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Menor");
		lblNewLabel_2.setBounds(10, 116, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		btnExibir = new JButton("EXIBIR");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double menor = Double.MAX_VALUE;
				Double maior = Double.MIN_VALUE;
				for (int i = 0; i < num.size(); i++) {
					if(num.get(i)>maior) {
						maior = num.get(i);
					}
					if(num.get(i)<menor) {
						menor = num.get(i);
					}
				}
				
				textMaior.setText(String.valueOf(maior));
				textMenor.setText(String.valueOf(menor));
			}
		});
		btnExibir.setBounds(82, 195, 101, 23);
		contentPane.add(btnExibir);
	}

}
