package ar.edu.unlam.pb2.animal;

public class Perro extends Animal implements Carnivoros{
	String nombre;

	public Perro(String nombre) {
		super(nombre);
		this.nombre=nombre;
	}
	@Override
	public String hablar() {
		return "Guau";
		
	}
	@Override
	public String comer() {
		return comerCarne();
	}
	@Override
	public String comerCarne() {
		return "Se alimenta de carne";
	}
	@Override
	public String alimentarseDeOtroAnimal(Animal animal) {
		String animalComido= animal.getNombre();
		return animalComido;
	}

}
