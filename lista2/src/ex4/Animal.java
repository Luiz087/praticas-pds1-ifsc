package ex4;

public abstract class Animal {
	
	String classeAnimal;
	String ordem;
	String bioma;
	
	public String getClasseAnimal() {
		return classeAnimal;
	}
	
	public String getOrdem() {
		return ordem;
	}
	
	public String getBioma() {
		return bioma;
	}
	
	public void setClasseAnimal(String classeAnimal) {
		this.classeAnimal = classeAnimal;
	}
	
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	public void setBioma(String bioma) {
		this.bioma = bioma;
	}

}
