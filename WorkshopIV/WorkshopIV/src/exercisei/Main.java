/**
 * Ejercicio 1: Sistema planetario
 */

package exercisei;

/**
 * Clase Main : Clase pricipal desde donde se ejecutar� el programa
 * @author LORENA FAJARDO
 * @Version: 1.0.0
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		 /**Creaci�n de los objetos planet1 y planet2, mediante la instancia de la clase abstracta planetarySystem*/
		PlanetarySystem planet1 = new PlanetarySystem(1, "Mercurio", 330000000, 5.43, 4874.9, 57910000) {
		};
		
		PlanetarySystem planet2 = new PlanetarySystem(2, "Venus", 6100000, 5.24, 12104, 108200000) {
		};
		
		System.out.println(planet1);
		System.out.println(planet2);

		/**Instancia de la clase AttractionForce, para llamar el m�todo que deermina la fuerza de atracci�n*/
		AttractionForce attraction = new AttractionForce();
		
		 /**
		 * M�todo gravitationalAttraction: Utilizado para determinar la fuerza de atracci�n de dos planetas
		 * @param  planet1 : Objeto 1
		 * @param  planet2 : Objeto 2
		 */
		
		System.out.println("");
		System.out.println("La atracci�n gravitatoria entre "+ planet1.getName()+ " y "+planet2.getName()+ " es: ");
		attraction.gravitationalAttraction(planet1, planet2);

	}

}
