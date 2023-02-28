package ex1;

import javax.swing.JOptionPane;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double precoLitro = 0.0;
		Integer qtdLitro = 0;
		
		precoLitro = Double.valueOf(JOptionPane.showInputDialog("Insira o preço da gasolina: "));
		qtdLitro = Integer.valueOf(JOptionPane.showInputDialog("Insira a quantidade de gasolina: "));
		
		JOptionPane.showMessageDialog(null, "Preço total: "+ calculaTotal(qtdLitro, precoLitro));
		
		
	}
	
	public static Double calculaTotal (Integer qtdLitros, Double precoLitros) {
		Double totalPagamento = qtdLitros * precoLitros;
		return totalPagamento;
	}

}
