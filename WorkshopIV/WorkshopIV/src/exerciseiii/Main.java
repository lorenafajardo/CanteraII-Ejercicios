
/**Ejercicio 3: Escriba un programa en java que genere aleatoriamente un array de números reales,
   y lo ordene mediante el algoritmo de la burbuja o mediante quick sort */

package exerciseiii;

import java.util.InputMismatchException;
/**Importacion de libreria Scanner, utilizada para capturar los datos que digita el usuario */
import java.util.Scanner;

/**
 * Clase Main: Clase ejecutoria, desde donde se llaman los dos metodos
 * 
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Instancia de clases Scanner : Utilzada para captura la opcion del
		 * usuario Array : Utilzada para llamar el arreglo y sus metodos.
		 * BubbleQuickSort : Utilizada para llamar al metodo bubbleSort y
		 * quickSort
		 */
		Scanner input = new Scanner(System.in);
		Array numbersArray = new Array();
		BubbleQuickSort sort = new BubbleQuickSort();

		int[] array = numbersArray.fillArray();
		numbersArray.show(array);

		System.out.println("Como desea ordenar el arreglo");
		System.out.println("1. Algoritmo de la burbuja");
		System.out.println("2. Quick sort");

		/**Try-Catch: Condicional para generar la excepcion de ingresar solamente valores numericos*/
		try {

			/** option : Opcion escogida por el usuario */
			int option = input.nextInt();

			/**
			 * Condicional swith-case: Utilizado para redireccionar al usuario a
			 * la opcion escogida
			 */
			switch (option) {

			/**
			 * Metodo BubbleSort : Se instancia la clase BubbleSort y se llama
			 * el metodo bubbleSortMehod para ordenar el arreglo
			 */
			case 1:
				sort.bubbleSortMehod(array);

				/**
				 * Se llama el metodo show, de la clase Array para mostrar el
				 * arreglo
				 */
				numbersArray.show(array);
				break;

			/**
			 * Metodo quick : Se instancia la clase QuickSort y se llama el
			 * metodo quickSortMethod, enviando los parametros: arreglo, inicio
			 * y fin, ordena el arreglo
			 */

			case 2:
				sort.quickSortMethod(array, 0, (array.length - 1));

				/**
				 * Se llama el metodo show, de la clase Array para mostrar el
				 * arreglo
				 */
				numbersArray.show(array);
				break;
				
			default:
				System.out.println("Valor incorrecto");
			}

		} catch (InputMismatchException ex) {
			System.out.println("Solo se permite ingresar valores numericos");

		}
	}
}
