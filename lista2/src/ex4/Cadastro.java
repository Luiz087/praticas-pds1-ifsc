package ex4;

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
import javax.swing.SwingConstants;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtClasseP;
	private JTextField txtClasseM;
	private JTextField txtOrdemM;
	private JTextField txtOrdemP;
	private JTextField txtBiomaM;
	private JTextField txtBiomaP;
	private JTextField txtCor;
	private JTextField txtAlimento;
	private JButton btnMostrarP;
	private JButton btnMostrarM;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		ArrayList<Macaco> macacos = new ArrayList<>();
		ArrayList<Passaro> passaros = new ArrayList<>();
		Passaro passaro = new Passaro();
		Macaco macaco = new Macaco();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Pássaro");
		lblNewLabel.setBounds(104, 5, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblMacaco = new JLabel("Macaco");
		lblMacaco.setBounds(210, 5, 46, 14);
		contentPane.add(lblMacaco);

		txtClasseP = new JTextField();
		txtClasseP.setBounds(74, 25, 100, 20);
		contentPane.add(txtClasseP);
		txtClasseP.setColumns(10);

		txtClasseM = new JTextField();
		txtClasseM.setBounds(184, 25, 100, 20);
		contentPane.add(txtClasseM);
		txtClasseM.setColumns(10);

		txtOrdemM = new JTextField();
		txtOrdemM.setColumns(10);
		txtOrdemM.setBounds(184, 56, 100, 20);
		contentPane.add(txtOrdemM);

		txtOrdemP = new JTextField();
		txtOrdemP.setColumns(10);
		txtOrdemP.setBounds(74, 56, 100, 20);
		contentPane.add(txtOrdemP);

		txtBiomaM = new JTextField();
		txtBiomaM.setColumns(10);
		txtBiomaM.setBounds(184, 87, 100, 20);
		contentPane.add(txtBiomaM);

		txtBiomaP = new JTextField();
		txtBiomaP.setColumns(10);
		txtBiomaP.setBounds(74, 87, 100, 20);
		contentPane.add(txtBiomaP);

		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(184, 118, 100, 20);
		contentPane.add(txtCor);

		txtAlimento = new JTextField();
		txtAlimento.setColumns(10);
		txtAlimento.setBounds(74, 118, 100, 20);
		contentPane.add(txtAlimento);

		JButton btnCadastrarP = new JButton("CADASTRAR");
		btnCadastrarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alimento = txtAlimento.getText();
				String ordemP = txtOrdemP.getText();
				String biomaP = txtBiomaP.getText();
				String classeP = txtClasseP.getText();

				passaro.setAlimento(alimento);
				passaro.setBioma(biomaP);
				passaro.setClasseAnimal(classeP);
				passaro.setOrdem(ordemP);

				passaros.add(passaro);

			}
		});
		btnCadastrarP.setBounds(74, 149, 100, 23);
		contentPane.add(btnCadastrarP);

		JButton btnCadastrarM = new JButton("CADASTRAR");
		btnCadastrarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cor = txtCor.getText();
				String ordemM = txtOrdemM.getText();
				String biomaM = txtBiomaM.getText();
				String classeM = txtClasseM.getText();

				macaco.setBioma(biomaM);
				macaco.setClasseAnimal(classeM);
				macaco.setCor(cor);
				macaco.setOrdem(ordemM);

				macacos.add(macaco);
			}
		});
		btnCadastrarM.setBounds(184, 149, 100, 23);
		contentPane.add(btnCadastrarM);

		btnMostrarP = new JButton("MOSTRAR");
		btnMostrarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Dados Inseridos:: " + passaros.toString());
			}
		});
		btnMostrarP.setBounds(74, 184, 100, 23);
		contentPane.add(btnMostrarP);

		btnMostrarM = new JButton("MOSTRAR");
		btnMostrarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Dados Inseridos:" + macacos.toString());

			}
		});
		btnMostrarM.setBounds(184, 184, 100, 23);
		contentPane.add(btnMostrarM);

		lblNewLabel_1 = new JLabel("Classe");
		lblNewLabel_1.setBounds(10, 28, 46, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Ordem");
		lblNewLabel_2.setBounds(10, 59, 46, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Bioma");
		lblNewLabel_3.setBounds(10, 90, 46, 14);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Alimento");
		lblNewLabel_4.setBounds(10, 121, 46, 14);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Cor");
		lblNewLabel_5.setBounds(289, 118, 46, 14);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Classe");
		lblNewLabel_6.setBounds(289, 25, 46, 14);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Ordem");
		lblNewLabel_7.setBounds(289, 56, 46, 14);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("Bioma");
		lblNewLabel_8.setBounds(289, 87, 46, 14);
		contentPane.add(lblNewLabel_8);
	}
}
