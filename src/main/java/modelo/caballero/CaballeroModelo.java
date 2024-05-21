package modelo.caballero;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import modelo.conector.Conector;

public class CaballeroModelo {

	public ArrayList<Caballero> getCaballeros() {
		Conector con = new Conector();
		Caballero caballero = new Caballero();
		ArrayList<Caballero> caballeros = new ArrayList();

		caballero.setCon(con.conectar());

		String sql = "SELECT * FROM caballeros";
		try {
			PreparedStatement prst = caballero.getCon().prepareStatement(sql);
			ResultSet rst = prst.executeQuery();
			while(rst.next()) {
				caballero.setArma_id(rst.getInt("arma_id"));
				caballero.setFoto(rst.getString("foto"));
				caballero.setFuerza(rst.getInt("fuerza"));
				caballero.setExperiencia(rst.getInt("experiencia"));
				caballero.setId(rst.getInt("id"));
				caballero.setNombre(rst.getString("nombre"));
				caballeros.add(caballero);
			}
			return caballeros;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
