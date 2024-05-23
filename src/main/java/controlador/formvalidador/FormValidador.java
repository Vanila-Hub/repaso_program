package controlador.formvalidador;

import java.util.ArrayList;

import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;

public class FormValidador {

	public boolean CaballeroValido(Caballero caballero, CaballeroModelo modelo_caballero) {
		ArrayList<Caballero> caballero2 = modelo_caballero.getCaballeros();
		boolean repetido = false;
		if (caballero2!=null) {
			for (Caballero caballero_nombre : caballero2) {
				if (caballero_nombre.getNombre().equalsIgnoreCase(caballero.getNombre())) {
					System.out.println("Soy repetido nombre");
					repetido = true;
				}else {
					repetido= false;
				}
			}
			
		} else {
			repetido = false;
		}
		//System.out.println(repetido);
		if (repetido==true) {
			System.out.println("Soy repetido");
			return false;
		}
		else if (caballero.getNombre().isEmpty() || caballero.getNombre()==null ) {
			System.out.println("Soy nombre no Valido");
			return false;
		} else if(caballero.getFuerza() <0 || caballero.getFuerza()>100){
			System.out.println("Soy fuerza no valida");
			return false;
		}else if(caballero.getArma_id() < 0 || caballero.getEscudo_id() <0) {
			System.out.println("Soy arma mno Valida");
			return false;
		}else if(caballero.getExperiencia() <0 || caballero.getExperiencia() >100) {
			System.out.println("Soy exp no Valido");
			return false;
		}else {
			return true;
		}
	}

}
