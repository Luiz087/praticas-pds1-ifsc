package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textNota1;
	private JTextField textNota3;
	private JTextField textNota2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio6 frame = new Exercicio6();
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
	public Exercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(52, 14, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textNota1 = new JTextField();
		textNota1.setBounds(254, 14, 86, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		textNota3 = new JTextField();
		textNota3.setColumns(10);
		textNota3.setBounds(254, 100, 86, 20);
		contentPane.add(textNota3);
		
		textNota2 = new JTextField();
		textNota2.setColumns(10);
		textNota2.setBounds(254, 59, 86, 20);
		contentPane.add(textNota2);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 14, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(212, 14, 46, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(212, 59, 46, 14);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setBounds(212, 100, 46, 14);
		contentPane.add(lblNota3);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				Double n1 = Double.valueOf(textNota1.getText());
				Double n2 = Double.valueOf(textNota1.getText());
				Double n3 = Double.valueOf(textNota1.getText());
				
				Double mediaF = (n1+n2+n3)/3.0;
				
				if(mediaF<0 || mediaF>10) {
					JOptionPane.showMessageDialog(btnNewButton, "Erro!\nDigite denovo");
				}
				if(mediaF>0 && mediaF<6) {
					JOptionPane.showMessageDialog(btnNewButton, "Reprovou! Nome: "+nome+", Nota: "+mediaF);
				}
				if(mediaF>=6 && mediaF<=10) {
					JOptionPane.showMessageDialog(btnNewButton, "Aprovado! Nome: "+nome+", Nota: "+mediaF);
				}
			}
		});
		btnNewButton.setBounds(251, 149, 89, 23);
		contentPane.add(btnNewButton);
	}

}
