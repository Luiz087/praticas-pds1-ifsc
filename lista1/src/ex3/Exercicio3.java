package ex3;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Double nota[] = new Double[3];
		
		for (int i = 0; i < 3; i++) {
			nota[i] = Double.valueOf(JOptionPane.showInputDialog("Digite a nota: "));
		}
		
		Double mediaF = (nota[0] + nota [1] + nota[2])/3;
		
		if(mediaF>=6) {
			JOptionPane.showMessageDialog(null, "Aproado(a)");
		} else {
			if((mediaF>=4) && (mediaF<6)){
				JOptionPane.showMessageDialog(null, "Recuperação");
			} else {
				JOptionPane.showMessageDialog(null, "Reprovado(a)");
			}
		}
		
	}

}
