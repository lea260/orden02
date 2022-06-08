package modelo;

import java.util.Comparator;

public class OrdenarPersonaEdad implements Comparator<Persona> {
	private String orden;

	public OrdenarPersonaEdad() {
		this.orden = "asc";
	}

	private int ordenarAs(Persona p1, Persona p2) {
		if (p1.getEdad() < p2.getEdad()) {
			return -1;
		} else if (p1.getEdad() > p2.getEdad()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		int res = this.ordenarAs(p1, p2);
		if (orden.equals("asc")) {
			return res;
		} else {
			if (res == 1) {
				res = -1;
			} else if (res == -1) {
				res = 1;
			}
		}
		return res;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

}
