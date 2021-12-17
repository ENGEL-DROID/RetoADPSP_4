package mapping;
// Generated 17 dic 2021 9:57:51 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Estaciones generated by hbm2java
 */
public class Estaciones implements java.io.Serializable {

	private Integer id;
	private Pueblos pueblos;
	private String nombre;
	private String provincia;
	private String pueblo;
	private String direcion;
	private float coordX;
	private float coordY;
	private float latitud;
	private float longitud;
	private Set datoses = new HashSet(0);

	public Estaciones() {
	}

	public Estaciones(Pueblos pueblos, String nombre, String provincia, String pueblo, String direcion, float coordX,
			float coordY, float latitud, float longitud) {
		this.pueblos = pueblos;
		this.nombre = nombre;
		this.provincia = provincia;
		this.pueblo = pueblo;
		this.direcion = direcion;
		this.coordX = coordX;
		this.coordY = coordY;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Estaciones(Pueblos pueblos, String nombre, String provincia, String pueblo, String direcion, float coordX,
			float coordY, float latitud, float longitud, Set datoses) {
		this.pueblos = pueblos;
		this.nombre = nombre;
		this.provincia = provincia;
		this.pueblo = pueblo;
		this.direcion = direcion;
		this.coordX = coordX;
		this.coordY = coordY;
		this.latitud = latitud;
		this.longitud = longitud;
		this.datoses = datoses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pueblos getPueblos() {
		return this.pueblos;
	}

	public void setPueblos(Pueblos pueblos) {
		this.pueblos = pueblos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPueblo() {
		return this.pueblo;
	}

	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
	}

	public String getDirecion() {
		return this.direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public float getCoordX() {
		return this.coordX;
	}

	public void setCoordX(float coordX) {
		this.coordX = coordX;
	}

	public float getCoordY() {
		return this.coordY;
	}

	public void setCoordY(float coordY) {
		this.coordY = coordY;
	}

	public float getLatitud() {
		return this.latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return this.longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public Set getDatoses() {
		return this.datoses;
	}

	public void setDatoses(Set datoses) {
		this.datoses = datoses;
	}

}
