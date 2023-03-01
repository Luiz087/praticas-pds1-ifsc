package ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		String palavra;
		
		for (int i = 0; i < 10; i++) {
			palavra = JOptionPane.showInputDialog("Digite uma palavra abaixo:");
			lista.add(palavra);
		}
		
		JOptionPane.showMessageDialog(null, lista);

	}

}
