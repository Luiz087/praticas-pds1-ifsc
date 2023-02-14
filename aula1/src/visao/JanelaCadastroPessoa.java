package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeFuncionario;
	private JTextField txtCpfFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 201);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeFuncionario = new JLabel("Nome do Funcionário");
		lblNomeFuncionario.setBounds(10, 14, 100, 14);
		contentPane.add(lblNomeFuncionario);
		
		txtNomeFuncionario = new JTextField();
		txtNomeFuncionario.setBounds(143, 11, 86, 20);
		contentPane.add(txtNomeFuncionario);
		txtNomeFuncionario.setColumns(10);
		
		JLabel lblCpfFuncionario = new JLabel("CPF do Funcionário");
		lblCpfFuncionario.setBounds(10, 39, 100, 14);
		contentPane.add(lblCpfFuncionario);
		
		txtCpfFuncionario = new JTextField();
		txtCpfFuncionario.setBounds(143, 36, 86, 20);
		contentPane.add(txtCpfFuncionario);
		txtCpfFuncionario.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNomeFuncionario.getText();
				String cpf = txtCpfFuncionario.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				
				if(cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF preenchido!");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
				bdPessoa.inserir(func);
				
			}
		});
		btnNewButton.setBounds(140, 67, 89, 23);
		contentPane.add(btnNewButton);
	}
}
