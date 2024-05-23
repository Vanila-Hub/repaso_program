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
				caballero = new Caballero();
				caballero.setArma_id(rst.getInt("arma_id"));
				caballero.setEscudo_id(rst.getInt("escudo_id"));
				caballero.setFoto(rst.getString("foto"));
				caballero.setFuerza(rst.getInt("fuerza"));
				caballero.setExperiencia(rst.getInt("experiencia"));
				caballero.setId(rst.getInt("id"));
				caballero.setNombre(rst.getString("nombre"));
				//atributos relacionados
				caballero.setArma(modelo_Arma.getArmaBYID(caballero.getArma_id(),con));
				caballero.setEscudo(modelo_escudo.getEscudoById(caballero.getEscudo_id(),con));
				caballeros.add(caballero);
			}
			caballero.getCon().CERRAR();
			return caballeros;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void crearCaballero(Caballero caballero) {
		String sql = "INSERT INTO CABALLEROS(NOMBRE,FUERZA,FOTO,ARMA_ID,ESCUDO_ID,EXPERIENCIA) VALUES (?,?,?,?,?,?)";
		Conector con = new Conector();
		caballero.setCon(con);
		try {
			PreparedStatement prst = caballero.getCon().conectar().prepareStatement(sql);
			prst.setString(1, caballero.getNombre());
			prst.setInt(2, caballero.getFuerza());
			prst.setString(3, caballero.getFoto());
			prst.setInt(4, caballero.getArma_id());
			prst.setInt(5, caballero.getEscudo_id());
			prst.setInt(6, caballero.getExperiencia());
			prst.executeUpdate();
			caballero.getCon().CERRAR();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

//	public boolean getCaballeroNombreById(Caballero caballero) {
//		String sql = "SELECT * FROM CABALLEROS WHERE NOMBRE = '?'";
//		Conector con = new Conector();
//		
//		caballero.setCon(con);
//		try {
//			PreparedStatement prst = caballero.getCon().conectar().prepareStatement(sql);
//			prst.setString(1, caballero.getNombre());
//			ResultSet rst = prst.executeQuery();
//			if (rst.next()) {
//				caballero.getCon().conectar().close();
//				return true;
//			}else {
//				caballero.getCon().conectar().close();
//				return false;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
	
	
}
