package modelo.arma;

import java.sql.Connection;

import modelo.conector.Conector;

public class Arma {
	private int id_arma;
	private String nombre;
	private int capacidad_danio;
	private String foto;
	private Conector con;
	
	public int getId_arma() {
		return id_arma;
	}
	public void setId_arma(int id_arma) {
		this.id_arma = id_arma;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad_danio() {
		return capacidad_danio;
	}
	public void setCapacidad_danio(int i) {
		this.capacidad_danio = i;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Conector getCon() {
		return con;
	}
	public void setCon(Conector con2) {
		this.con = con2;
	}
	@Override
	public String toString() {
		return "Arma [id_arma=" + id_arma + ", nombre=" + nombre + ", capacidad_danio=" + capacidad_danio + ", foto="
				+ foto + ", con=" + con + "]";
	}
	
}
