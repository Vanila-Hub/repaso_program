package modelo.caballero;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import modelo.arma.ArmaModelo;
import modelo.conector.Conector;
import modelo.escudo.EscudoModelo;

public class CaballeroModelo {

	public ArrayList<Caballero> getCaballeros() {
		Conector con = new Conector();
		Caballero caballero = new Caballero();
		ArmaModelo modelo_Arma = new ArmaModelo();
		EscudoModelo modelo_escudo = new EscudoModelo();
		
		ArrayList<Caballero> caballeros = new ArrayList();

		caballero.setCon(con);

		String sql = "SELECT * FROM caballeros";
		try {
			PreparedStatement prst = caballero.getCon().conectar().prepareStatement(sql);
			ResultSet rst = prst.executeQuery();
			while(rst.next()) {
				caballero.setArma_id(rst.getInt("arma_id"));
				caballero.setEscudo_id(rst.getInt("escudo_id"));
				caballero.setFoto(rst.getString("foto"));
				caballero.setFuerza(rst.getInt("fuerza"));
				caballero.setExperiencia(rst.getInt("experiencia"));
				caballero.setId(rst.getInt("id"));
				caballero.setNombre(rst.getString("nombre"));
				//atributos relacionados
				System.out.println(caballero);
				caballero.setArma(modelo_Arma.getArmaBYID(caballero.getArma_id(),con));
				caballero.setEscudo(modelo_escudo.getEscudoById(caballero.getEscudo_id(),con));
				caballeros.add(caballero);
			}
			return caballeros;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
