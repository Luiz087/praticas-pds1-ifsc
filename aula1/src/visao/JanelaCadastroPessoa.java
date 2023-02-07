package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		setBounds(100, 100, 461, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeFuncionario = new JLabel("Nome do Funcionário");
		lblNomeFuncionario.setBounds(10, 14, 100, 14);
		contentPane.add(lblNomeFuncionario);
		
		txtNomeFuncionario = new JTextField();
		txtNomeFuncionario.setBounds(120, 11, 86, 20);
		contentPane.add(txtNomeFuncionario);
		txtNomeFuncionario.setColumns(10);
		
		JButton btnNomeFuncionario = new JButton("Adicionar");
		btnNomeFuncionario.setBounds(216, 10, 77, 23);
		contentPane.add(btnNomeFuncionario);
		
		JLabel lblCpfFuncionario = new JLabel("CPF do Funcionário");
		lblCpfFuncionario.setBounds(10, 39, 100, 14);
		contentPane.add(lblCpfFuncionario);
		
		txtCpfFuncionario = new JTextField();
		txtCpfFuncionario.setBounds(120, 36, 86, 20);
		contentPane.add(txtCpfFuncionario);
		txtCpfFuncionario.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(216, 35, 77, 23);
		contentPane.add(btnNewButton);
	}
}
