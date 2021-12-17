package mapping;
// Generated 17 dic 2021 9:57:51 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Lugares generated by hbm2java
 */
public class Lugares implements java.io.Serializable {

	private Integer id;
	private Favoritos favoritos;
	private String descripcion;
	private String tipo;
	private String marks;
	private String municipio;
	private String territorio;
	private Set puebloses = new HashSet(0);

	public Lugares() {
	}

	public Lugares(Favoritos favoritos, String descripcion, String tipo, String marks, String municipio,
			String territorio) {
		this.favoritos = favoritos;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.marks = marks;
		this.municipio = municipio;
		this.territorio = territorio;
	}

	public Lugares(Favoritos favoritos, String descripcion, String tipo, String marks, String municipio,
			String territorio, Set puebloses) {
		this.favoritos = favoritos;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.marks = marks;
		this.municipio = municipio;
		this.territorio = territorio;
		this.puebloses = puebloses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Favoritos getFavoritos() {
		return this.favoritos;
	}

	public void setFavoritos(Favoritos favoritos) {
		this.favoritos = favoritos;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public Set getPuebloses() {
		return this.puebloses;
	}

	public void setPuebloses(Set puebloses) {
		this.puebloses = puebloses;
	}

}