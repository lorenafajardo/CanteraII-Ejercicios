/**Ejercicio 6: Realizar un programa que lea números del teclado hasta que se introduce dos veces
seguidas el mismo número. Entonces el programa muestra todos los números introducidos y termina*/

package exercisevi;

/**Importacion de librerias y clases
 * InputMismatchException: Utilizada para permitir solamente el ingreso de numeros
 * Scanner               : Utilizada para la captura de datos ingresados por el usuario
 * Vector                : Utilizada para la creacion del vector de array dinamico solicitado.
 * */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Clase VectorClass: Clase que define los metodos para crear el vector con los
 * numeros ingresados por el usuario y el metodo para mostrar dicho vector.
 * 
 * @author LORENA FAJARDO 
 * @version 1.0.0
 */
public class VectorClass {

	/** Instancia de la clase vector */
	Vector vector = new Vector();

	/** Metodo vectorCreate: Metodo utilizado para crear el vector */
	public Vector vectorCreate() {

		/**
		 * input : Variable que captura los numeros ingresados por el usuario
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println(
				"Por favor, ingrese los números que quiera, el sistema se detendra cuando ingrese  dos veces seguidas el mismo número  ");

		/**
		 * Try - catch : Utilizado para generar la excepcion
		 * InputMismatchException, la cual permite ingresar valores numericos
		 * unicamente
		 */
		try {

			int i = 0;

			/** nro1 = El primer numero ingresado y anadido al vector */
			int nro1 = input.nextInt();
			vector.addElement(nro1);

			/**
			 * Condicional Do - While : Añade los numeros ingresados por el
			 * usuario hasta que el numero ingresado sea igual al anterior
			 */
			do {
				int nro = input.nextInt();
				vector.addElement(nro);
				i = i + 1;
			} while (vector.get(i) != vector.get(i - 1));

		} catch (InputMismatchException ex) {
			System.out.println("Solamente se permiten ingresar caracteres numericos");

		}
		return vector;

	}

	/** Metodo vectorShow : Metodo uilizado para mostrar el vector creado */
	public void vectorShow(Vector vector) {

		/** Bucle For: Recorre el vector e imprime sus elementos */
		for (int j = 0; j < vector.size(); j++) {
			System.out.println(vector.get(j));
		}
	}
}
