package ar.edu.unlam.pb2.animal;

public class Gato extends Animal implements Carnivoros {
	private String nombre;

	public Gato(String nombre) {
		super(nombre);
		this.nombre=nombre;
		
	}

	@Override
	public String hablar() {
		return "Miau";	
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
