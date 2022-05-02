/**
 * Ejercicio 1: Desarrolle una clase en Java que realice la abstracci�n de un sistema planetario,
 */

package exercisei;

/**
 * Clase planetarySystem : Clase abstracta que contiene los atributos de un sistema planetario y el m�todo de fuerza de atraccion
 * @author LORENA FAJARDO
 * @Version: 1.0.0
 */

public abstract class PlanetarySystem {
	
	/**
	 * Definici�n de atributos de la clase planetarySystem
	 * 
	 * id : Identificador unico del planeta
	 * name : Nombre del planeta
	 * mass : Masa del planeta
	 * density : Desidad del planeta
	 * diameter : Diametro
	 * sunDistance : Distancia al sol
	 */
	
	private int id;
	private String name;
	private double mass;
	private double density;
	private double diameter;
	private double sunDistance;
	
	
	/**
	 * Declaraci�n de constructor vacio, para ser llamado desde la clase extendida Attraction 
	 */
	
	public PlanetarySystem() {
		super();
	}

	/**
	 * Declaraci�n de constructor, con todos los parametros de entrada 
	 * @param id
	 * @param name
	 * @param mass
	 * @param density
	 * @param diameter
	 * @param sunDistance
	 */
	public PlanetarySystem(int id, String name, double mass, double density, double diameter, double sunDistance) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.density = density;
		this.diameter = diameter;
		this.sunDistance = sunDistance;
	}
	
	/**
	 * M�todo getId: M�todo para obtener valor de id 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * M�todo setId: M�todo para modificar el valor de id  
	 * @param id : Identificador
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * M�todo getName: M�todo para obtener valor de Name 
	 * @return name : Nombre
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * M�todo setName: M�todo para modificar el valor de Name  
	 * @param name : Nombre
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * M�todo getMass: M�todo para obtener valor de Mass 
	 * @return mass : Masa
	 */
	public double getMass() {
		return mass;
	}
	
	/**
	 * M�todo setMass: M�todo para modificar el valor de Mass  
	 * @param mass : Masa
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	/**
	 * M�todo getDensity: M�todo para obtener valor de density 
	 * @return density : Densidad
	 */
	public double getDensity() {
		return density;
	}
	
	/**
	 * M�todo setDensity: M�todo para modificar el valor de density  
	 * @param density : Densidad
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	
	/**
	 * M�todo getDiameter: M�todo para obtener valor de diameter 
	 * @return diameter : Diametro
	 */
	public double getDiameter() {
		return diameter;
	}
	
	/**
	 * M�todo setDiameter: M�todo para modificar el valor de diameter  
	 * @param diameter : Diametro
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	/**
	 * M�todo getSunDistance: M�todo para obtener valor de sunDistance
	 * @return sunDistance : Distancia al sol
	 */
	public double getSunDistance() {
		return sunDistance;
	}
	
	/**
	 * M�todo setSunDistance: M�todo para modificar el valor de sunDistance 
	 * @param sunDistance : Distancia al sol
	 */
	public void setSunDistance(double sunDistance) {
		this.sunDistance = sunDistance;
	}
	
	
	
	/**
	 * Declaraci�n de m�todo para obtener la atraccio grabitaoria etre dos cuerpos
	 * @param planet1 : Objeto 1 de tipo de esta clase, planetarySystem
	 * @param planet2 : Objeto 2 de tipo de esta clase, planetarySystem
	 */
	public void gravitationalAttraction(PlanetarySystem planet1, PlanetarySystem planet2){
	}

	/**
	 * Sobreescritura del m�todo To String
	 */
	@Override
	public String toString() {
		return "Nombre del cuerpo= "+ name + "   Id= " + id + ", Masa= " + mass + " kg"+ ", Densidad= " + density
				+ " kg/m3"+", Diametro= " + diameter + " km" + ", Distacia al sol= " + sunDistance+" km";
	}

	
	
	
	

	
}
