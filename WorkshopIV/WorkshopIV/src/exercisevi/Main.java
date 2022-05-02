/**Ejercicio 6: Realizar un programa que lea números del teclado hasta que se introduce dos veces
seguidas el mismo número. Entonces el programa muestra todos los números introducidos y termina*/

package exercisevi;

/**Importacion de clase
 * Vector                : Utilizada para la creacion del vector de array dinamico solicitado.
 * */
import java.util.Vector;

/**
 * Clase Array: Clase para crear los 10 vehiculos solicitados, identificando el
 * tipo de vehiculo al que corresponde.
 * 
 * @author LORENA FAJARDO
 * @version 1.0.0
 */
public class Main {

	public static void main(String[] args) {

		/** Instancia de la clase Vector */
		VectorClass vector = new VectorClass();

		/**
		 * vecorArray: Vector donde se almacena el vector creado en el metodo
		 * vectorCreate
		 */
		Vector vectorArray = vector.vectorCreate();

		/** Impresion del vector */
		System.out.println("---------------------------------");
		System.out.println("Vector Creado");
		System.out.println("---------------------------------");
		vector.vectorShow(vectorArray);
		System.out.println("---------------------------------");

	}

}
