package controlador.caballero;

import java.util.Comparator;

import modelo.caballero.Caballero;

public class ComparadorNombre implements Comparator<Caballero>{

	@Override
	public int compare(Caballero o1, Caballero o2) {
		
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}
	
}
