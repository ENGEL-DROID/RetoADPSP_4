package mapping;
// Generated 17 dic 2021 10:41:17 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios implements java.io.Serializable {

	private String usuario;
	private String contrasenia;
	private Set favoritoses = new HashSet(0);
	private Set galerias = new HashSet(0);

	public Usuarios() {
	}

	public Usuarios(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}

	public Usuarios(String usuario, String contrasenia, Set favoritoses, Set galerias) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.favoritoses = favoritoses;
		this.galerias = galerias;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Set getFavoritoses() {
		return this.favoritoses;
	}

	public void setFavoritoses(Set favoritoses) {
		this.favoritoses = favoritoses;
	}

	public Set getGalerias() {
		return this.galerias;
	}

	public void setGalerias(Set galerias) {
		this.galerias = galerias;
	}

}
