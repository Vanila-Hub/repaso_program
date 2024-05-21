package modelo.escudo;

import modelo.conector.Conector;

public class Escudo {
	private int id_escudo;
	private String nombre;
	private int capacidad_defensa;
	private Conector con;
	
	public int getId_escudo() {
		return id_escudo;
	}
	public void setId_escudo(int id_escudo) {
		this.id_escudo = id_escudo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad_defensa() {
		return capacidad_defensa;
	}
	public void setCapacidad_defensa(int string) {
		this.capacidad_defensa = string;
	}
	public Conector getCon() {
		return con;
	}
	public void setCon(Conector con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "Escudo [id_escudo=" + id_escudo + ", nombre=" + nombre + ", capacidad_defensa=" + capacidad_defensa
				+ ", con=" + con + "]";
	}
	
}
