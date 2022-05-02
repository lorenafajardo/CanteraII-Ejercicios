
/**Ejercicio 3: Escriba un programa en java que genere aleatoriamente un array de números reales,
*  y lo ordene mediante el algoritmo de la burbuja o mediante quick sort */

package exerciseiii;

/**
 * Importación de libreria Scanner para capturar valores que digite el usuario
 */
import java.util.Scanner;

/**
 * Clase Array: Clase que contiene la declaración del arreglo y los métodos para
 * llenar y mostrar el arreglo
 * 
 * @author LORENA FAJARDO
 * @Version: 1.0.0
 */

public class Array {

	/**
	 * array[] : Declaración del arreglo
	 */
	private int array[];

	/**
	 * Método para llenar el arreglo con números reales
	 * 
	 * @return array : Arreglo de números aleatorios
	 */
	public int[] fillArray() {

		System.out.println("----------------------------------------------------");
		System.out.println("Escriba cuantos números desea ingresar en el sistema");
		Scanner inputNumber = new Scanner(System.in);

		/**
		 * numberSize: Captura del número que ingresa el usuario
		 */
		int numberSize = inputNumber.nextInt();
		array = new int[numberSize];

		/**
		 * Ciclo For para llenar el arreglo usando la libreria Math
		 */
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 0);
		}
		return array;
	}

	/**
	 * Método Show: Utilizado para mostrar el arreglo 
	 * @param array: Arreglo de números aleatorios
	 */
	public void show(int[] array) {
		
		/** Bucle for: Utilizado para recorrer el arreglo e imprimir cada elemento*/
		for (int l = 0; l < array.length; l++) {
			System.out.println(array[l]);
		}
	}

}
