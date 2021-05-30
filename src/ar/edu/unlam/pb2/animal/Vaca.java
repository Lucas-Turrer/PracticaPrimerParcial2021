package ar.edu.unlam.pb2.animal;

public class Vaca extends Animal implements Hervibora{
	String nombre;

	public Vaca(String nombre) {
		super(nombre);
		this.nombre=nombre;
	}

	@Override
	public String hablar() {
		
		return "Muuu";
	}

	public String comer() {
		return comerHierba();
	}

	@Override
	public String comerHierba() {
		return "Se alimenta de hierba";
	}

}
