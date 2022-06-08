package modelo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Persona01", 18));
		lista.add(new Persona("Persona02", 5));
		lista.add(new Persona("Persona03", 10));
		lista.add(new Persona("Persona04", 59));
		OrdenarPersonaEdad ord = new OrdenarPersonaEdad();
		ord.setOrden("des");
		lista.sort(ord);

		for (Persona persona : lista) {
			System.out.println(persona.toString());
		}

	}

}
