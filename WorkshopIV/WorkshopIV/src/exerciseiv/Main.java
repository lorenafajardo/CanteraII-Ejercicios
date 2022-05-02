
/**
 *Ejercicio 4 : Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a
 * continuación por pantalla
 */

package exerciseiv;

/**Imporacion de la excepcion ParseException, utilizada para evitar errores por el uso de Date*/
import java.text.ParseException;

/**
 * Clase Main: Clase ejecutora, donde se llama el metodo para crear los diez
 * vehiculos solicitados
 * 
 * @author LORENA FAJARDO
 * @Version: 1.0.0
 */
public class Main {

	public static void main(String[] args) throws ParseException {

		/** Instancia de la clase FerriesArray */
		FerriesArray array = new FerriesArray();

		/** Llamado del metodo addArray para crear los diez vehiculos */
		Vehicle[] arrayVehicles = array.addArray();

		/**
		 * Llamado del metodo show, para mostrar la lista de los 10 vehiculos
		 * creados
		 * 
		 * @param arrayVehicles
		 *            : Lisa de vehiculos
		 */
		array.show(arrayVehicles);

	}
}
