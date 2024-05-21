package modelo.escudo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import modelo.arma.Arma;
import modelo.conector.Conector;

public class EscudoModelo {

	public Escudo getEscudoById(int escudo_id, Conector con) {
		String sql = "SELECT * FROM ESCUDOS WHERE ID = ?";
		Escudo escudo = new Escudo();
		escudo.setCon(con);
		try {
			PreparedStatement prst = escudo.getCon().conectar().prepareStatement(sql);
			prst.setInt(1, escudo_id);
			ResultSet rst = prst.executeQuery();
			while(rst.next()) {
				escudo.setCapacidad_defensa(rst.getInt("capacidad_defensa"));
				escudo.setId_escudo(rst.getInt("id"));
				escudo.setNombre(rst.getString("nombre"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return escudo;
	}

}
