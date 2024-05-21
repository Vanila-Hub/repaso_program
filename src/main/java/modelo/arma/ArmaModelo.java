package modelo.arma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import modelo.conector.Conector;

public class ArmaModelo {

	public Arma getArmaBYID(int arma_id, Conector con) {
		String sql = "SELECT * FROM ARMAS WHERE ID = ?";
		Arma arma = new Arma();
		arma.setCon(con);
		try {
			PreparedStatement prst = arma.getCon().conectar().prepareStatement(sql);
			prst.setInt(1, arma_id);
			ResultSet rst = prst.executeQuery();
			while(rst.next()) {
				arma.setCapacidad_danio(rst.getInt("capacidad_danio"));
				arma.setFoto(rst.getString("foto"));
				arma.setId_arma(rst.getInt("id"));
				arma.setNombre(rst.getString("nombre"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arma;
	}
	
}
