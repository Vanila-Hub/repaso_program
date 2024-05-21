package modelo.caballero;

import java.sql.Connection;
import java.util.ArrayList;

import modelo.arma.Arma;
import modelo.conector.Conector;
import modelo.escudo.Escudo;

public class Caballero {
	
	private Conector con;
	private int id;
	private String nombre;
	private int fuerza;
	private String foto;
	private int arma_id;
	private int escudo_id;
	private int experiencia;
	private Escudo escudo;
	private Arma arma;
	
	public Escudo getEscudo() {
		return escudo;
	}
	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public Conector getCon() {
		return con;
	}
	public void setCon(Conector con2) {
		this.con = con2;
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
	
	public int getEscudo_id() {
		return escudo_id;
	}
	public void setEscudo_id(int escudo_id) {
		this.escudo_id = escudo_id;
	}
	@Override
	public String toString() {
		return "Caballero [con=" + con + ", id=" + id + ", nombre=" + nombre + ", fuerza=" + fuerza + ", foto=" + foto
				+ ", arma_id=" + arma_id + ", escudo_id=" + escudo_id + ", experiencia=" + experiencia + ", escudo="
				+ escudo + ", arma=" + arma + "]";
	}
	
}
