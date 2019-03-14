package application;

import model.entities.Cachorro;

public class Program {

	public static void main(String[] args) {

		Cachorro pingo = new Cachorro("Pingo", 5);
		Cachorro shrek = new Cachorro("Shrek", 6);
		Cachorro apolo = new Cachorro("Apolo", 7);

		System.out.println(pingo.toString());
		pingo.latir();
		pingo.correr();

		System.out.println(shrek.toString());
		shrek.latir();
		shrek.correr();

		System.out.println(apolo.toString());
		apolo.latir();
		apolo.correr();
	}

}
