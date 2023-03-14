package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textCadProf;
	private JTextField textCadAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		ArrayList<String> professores = new ArrayList<>();
		ArrayList<String> alunos = new ArrayList<>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 127);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Professor");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textCadProf = new JTextField();
		textCadProf.setBounds(66, 8, 86, 20);
		contentPane.add(textCadProf);
		textCadProf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Aluno");
		lblNewLabel_1.setBounds(10, 50, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textCadAluno = new JTextField();
		textCadAluno.setBounds(66, 47, 86, 20);
		contentPane.add(textCadAluno);
		textCadAluno.setColumns(10);
		
		JButton btnCadAluno = new JButton("CADASTRAR");
		btnCadAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = textCadAluno.getText();
				alunos.add(p1);
			}
		});
		btnCadAluno.setBounds(174, 46, 104, 23);
		contentPane.add(btnCadAluno);
		
		JButton btnCadProf = new JButton("CADASTRAR");
		btnCadProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = textCadProf.getText();
				professores.add(p1);
			}
		});
		btnCadProf.setBounds(174, 7, 104, 23);
		contentPane.add(btnCadProf);
		
		JButton btnExibirProf = new JButton("EXIBIR");
		btnExibirProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, professores);
			}
		});
		btnExibirProf.setBounds(288, 7, 104, 23);
		contentPane.add(btnExibirProf);
		
		JButton btnExibirAluno = new JButton("EXIBIR");
		btnExibirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, alunos);
			}
		});
		btnExibirAluno.setBounds(288, 46, 104, 23);
		contentPane.add(btnExibirAluno);
	}

}
