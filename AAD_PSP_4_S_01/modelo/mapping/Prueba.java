package mapping;
// Generated 17 dic 2021 10:41:17 by Hibernate Tools 5.5.7.Final

/**
 * Prueba generated by hbm2java
 */
public class Prueba implements java.io.Serializable {

	private String nombre;
	private String lugar;

	public Prueba() {
	}

	public Prueba(String nombre, String lugar) {
		this.nombre = nombre;
		this.lugar = lugar;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

}
