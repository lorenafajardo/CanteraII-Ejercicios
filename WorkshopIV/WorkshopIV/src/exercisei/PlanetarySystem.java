/**
 * Ejercicio 1: Desarrolle una clase en Java que realice la abstracción de un sistema planetario,
 */

package exercisei;

/**
 * Clase planetarySystem : Clase abstracta que contiene los atributos de un sistema planetario y el método de fuerza de atraccion
 * @author LORENA FAJARDO
 * @Version: 1.0.0
 */

public abstract class PlanetarySystem {
	
	/**
	 * Definición de atributos de la clase planetarySystem
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
	 * Declaración de constructor vacio, para ser llamado desde la clase extendida Attraction 
	 */
	
	public PlanetarySystem() {
		super();
	}

	/**
	 * Declaración de constructor, con todos los parametros de entrada 
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
	 * Método getId: Método para obtener valor de id 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Método setId: Método para modificar el valor de id  
	 * @param id : Identificador
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Método getName: Método para obtener valor de Name 
	 * @return name : Nombre
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Método setName: Método para modificar el valor de Name  
	 * @param name : Nombre
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Método getMass: Método para obtener valor de Mass 
	 * @return mass : Masa
	 */
	public double getMass() {
		return mass;
	}
	
	/**
	 * Método setMass: Método para modificar el valor de Mass  
	 * @param mass : Masa
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	/**
	 * Método getDensity: Método para obtener valor de density 
	 * @return density : Densidad
	 */
	public double getDensity() {
		return density;
	}
	
	/**
	 * Método setDensity: Método para modificar el valor de density  
	 * @param density : Densidad
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	
	/**
	 * Método getDiameter: Método para obtener valor de diameter 
	 * @return diameter : Diametro
	 */
	public double getDiameter() {
		return diameter;
	}
	
	/**
	 * Método setDiameter: Método para modificar el valor de diameter  
	 * @param diameter : Diametro
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	/**
	 * Método getSunDistance: Método para obtener valor de sunDistance
	 * @return sunDistance : Distancia al sol
	 */
	public double getSunDistance() {
		return sunDistance;
	}
	
	/**
	 * Método setSunDistance: Método para modificar el valor de sunDistance 
	 * @param sunDistance : Distancia al sol
	 */
	public void setSunDistance(double sunDistance) {
		this.sunDistance = sunDistance;
	}
	
	
	
	/**
	 * Declaración de método para obtener la atraccio grabitaoria etre dos cuerpos
	 * @param planet1 : Objeto 1 de tipo de esta clase, planetarySystem
	 * @param planet2 : Objeto 2 de tipo de esta clase, planetarySystem
	 */
	public void gravitationalAttraction(PlanetarySystem planet1, PlanetarySystem planet2){
	}

	/**
	 * Sobreescritura del método To String
	 */
	@Override
	public String toString() {
		return "Nombre del cuerpo= "+ name + "   Id= " + id + ", Masa= " + mass + " kg"+ ", Densidad= " + density
				+ " kg/m3"+", Diametro= " + diameter + " km" + ", Distacia al sol= " + sunDistance+" km";
	}

	
	
	
	

	
}
