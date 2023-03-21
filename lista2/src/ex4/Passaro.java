package ex4;

public class Passaro extends Animal {

	String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		return "\nClasse: " + super.getClasseAnimal() + " Ordem: " + super.getOrdem() + " Bioma: " + super.getBioma() + " Alimento: " + this.getAlimento();
	}
	
}
