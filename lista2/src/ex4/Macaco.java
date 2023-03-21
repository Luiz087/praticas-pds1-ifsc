package ex4;

public class Macaco extends Animal {

	String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Classe: " + super.getClasseAnimal() + " Ordem: " + super.getOrdem() +  " Bioma: " + super.getBioma() + " Cor: " + this.getCor();
	}
	
}
