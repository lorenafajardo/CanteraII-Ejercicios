/**Ejercicio 5: A partir de la clase Vehiculo cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un
camión, una bicicleta, una lancha.*/

package exercisev;

/**Importacion de libreria y clase
 * ParseException   : Utilizada para que no se generen errores cuando se usa el tipo de dato Date
 * Vehicle          : Utilizada para llamar los metodos de la clase Vehicle
 */
import java.text.ParseException;
import exerciseiv.Vehicle;

/**
 * Clase Main: Clase para llamar los metodos de crear vehiculos y mostrarlos, que se encuentran en la clase Array.
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */
public class Main {

	public static void main(String[] args) throws ParseException {
		
		/**Istacia de clase Array*/
		Array array = new Array();
		
		/**arrayVehicles = Lista donde se almacena la lista generada en el metodo addArray*/
		Vehicle[] arrayVehicles = array.addArray();
		
		/**Mostrar la lista de vehiculos creados*/
		array.show(arrayVehicles);

	}

}
