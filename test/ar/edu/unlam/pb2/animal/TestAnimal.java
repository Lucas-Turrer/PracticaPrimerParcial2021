package ar.edu.unlam.pb2.animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAnimal {
	
	 @Test
	 public void QueElPerroHable() {
		 Perro perro1 = new Perro("dalmata");
		 
		  String datoEsperado = "Guau";
		  String datoObtenido = perro1.hablar();
		  assertEquals(datoEsperado, datoObtenido);
		 
	 }
	 @Test
	 public void QueElGatoHable(){
		 Animal animal1 = new Gato("siames");
		 
		  String datoEsperado = "Miau";
		  String datoObtenido = animal1.hablar();
		  assertEquals(datoEsperado, datoObtenido);
		 
	 }
	 @Test
	 public void QueLaVacaHable(){
		 Vaca vaca1 = new Vaca("de milka");
		 
		  String datoEsperado = "Muuu";
		  String datoObtenido = vaca1.hablar();
		  assertEquals(datoEsperado, datoObtenido);
		 
	 }
	 @Test
	 public void HablarPolimorfismo () {
		 Vaca vaca1 = new Vaca("toro");
		 
		 String datoEsperado = "Muuu";
		 String datoObtenido = vaca1.hacerloHablar(vaca1);
		 assertEquals(datoEsperado, datoObtenido);
	 }
	 @Test
	 public void ElPerroCome() {
		 Perro perro1 = new Perro("buldog");
		 
		  String datoEsperado = "Carne";
		  String datoObtenido = perro1.comerCarne();
		  assertEquals(datoEsperado, datoObtenido);
	 }
	 @Test
	 public void QueComaElAnimalOtroAnimal () {
		 Perro perro1 = new Perro("buldog");
		 Vaca vaca1 = new Vaca("negra");
		 
		 String datoEsperado = "negra";
		 String datoObtenido = perro1.alimentarseDeOtroAnimal(vaca1);
		 assertEquals(datoEsperado, datoObtenido);
		 
		 
	 }

}
