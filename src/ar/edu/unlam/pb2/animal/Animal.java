package ar.edu.unlam.pb2.animal;

public abstract class Animal{
	private String nombre;
	
	public Animal (String nombre) {
		this.nombre=nombre;
	}
	
	public abstract String hablar();
	
	public String hacerloHablar(Animal animal) {
		return animal.hablar();
	}
	
	public abstract String comer();
	
	public String getNombre() {
		return nombre;
	}
	
}
