package mapping;
// Generated 17 dic 2021 10:41:17 by Hibernate Tools 5.5.7.Final

/**
 * Galeria generated by hbm2java
 */
public class Galeria implements java.io.Serializable {

	private Integer id;
	private Usuarios usuarios;
	private byte[] foto;

	public Galeria() {
	}

	public Galeria(Usuarios usuarios, byte[] foto) {
		this.usuarios = usuarios;
		this.foto = foto;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
