package modelo.caballero;

import java.sql.Connection;

import modelo.conector.Conector;

public class Caballero {
	
	private Connection con;
	private int id;
	private String nombre;
	private int fuerza;
	private String foto;
	private int arma_id;
	private int experiencia;
	
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection connection) {
		this.con = connection;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getArma_id() {
		return arma_id;
	}
	public void setArma_id(int arma_id) {
		this.arma_id = arma_id;
	}
	
	@Override
	public String toString() {
		return "Caballero [con=" + con + ", id=" + id + ", nombre=" + nombre + ", fuerza=" + fuerza + ", foto=" + foto
				+ ", arma_id=" + arma_id + ", experiencia=" + experiencia + "]";
	}
	
	
	
}
