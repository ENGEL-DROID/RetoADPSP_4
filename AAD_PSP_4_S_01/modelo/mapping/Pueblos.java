package mapping;
// Generated 17 dic 2021 10:41:17 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Pueblos generated by hbm2java
 */
public class Pueblos implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String descripcion;
	private String marks;
	private String municipio;
	private String territorio;
	private Set estacioneses = new HashSet(0);
	private Set lugareses = new HashSet(0);

	public Pueblos() {
	}

	public Pueblos(String nombre, String descripcion, String marks, String municipio, String territorio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marks = marks;
		this.municipio = municipio;
		this.territorio = territorio;
	}

	public Pueblos(String nombre, String descripcion, String marks, String municipio, String territorio,
			Set estacioneses, Set lugareses) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marks = marks;
		this.municipio = municipio;
		this.territorio = territorio;
		this.estacioneses = estacioneses;
		this.lugareses = lugareses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarks() {
		return this.marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getTerritorio() {
		return this.territorio;
	}

	public void setTerritorio(String territorio) {
		this.territorio = territorio;
	}

	public Set getEstacioneses() {
		return this.estacioneses;
	}

	public void setEstacioneses(Set estacioneses) {
		this.estacioneses = estacioneses;
	}

	public Set getLugareses() {
		return this.lugareses;
	}

	public void setLugareses(Set lugareses) {
		this.lugareses = lugareses;
	}

}
