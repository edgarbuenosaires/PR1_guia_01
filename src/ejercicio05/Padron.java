package ejercicio05;

import java.util.ArrayList;

public class Padron {
	private ArrayList<Escuela> escuelas;

	public Padron() {
		super();
		this.escuelas = new ArrayList<Escuela>();
	}

	@Override
	public String toString() {
		return "Padron [escuelas=" + escuelas + "]";
	}

}
