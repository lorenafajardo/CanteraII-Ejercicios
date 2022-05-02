
/**Ejercicio 3: Escriba un programa en java que genere aleatoriamente un array de números reales,
   y lo ordene mediante el algoritmo de la burbuja o mediante quick sort */

package exerciseiii;

/**
 * Interface Methods : Iterface declracio de los metodos para ordear el arreglo  
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */
public interface Methods {
	
	/**
	 * Metodo de la burbuja
	 * @param numbersArray : Arreglo de numeros aleatorios
	 */
	public void bubbleSortMehod(int numbersArray[]);
	
	/**
	 * Metodo Quick
	 * @param array : Arreglo de numeros aleatorios
	 * @param first : Numero de inicio
	 * @param last  : Numero final
	 */
	public void quickSortMethod(int[] array, int first, int last);
}
