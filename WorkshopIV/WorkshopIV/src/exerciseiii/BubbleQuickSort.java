
/**Ejercicio 3: Escriba un programa en java que genere aleatoriamente un array de números reales,
*  y lo ordene mediante el algoritmo de la burbuja o mediante quick sort */

package exerciseiii;

/**
 * Clase BubbleQuickSort: Clase que implementa los metodos bubbleSortMehod y quickSortMethod para ordenar el arreglo
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */

public class BubbleQuickSort implements Methods {

	/**
	 * Metodo bubbleSortMehod: Recorre repetidamente la lista, compara elementos adyacentes y los intercambia si están en el orden incorrecto. 
	 * @param numbersArray : Arreglo de numeros*/
	
	@Override
	public void bubbleSortMehod(int numbersArray[]) {

		for (int j = 0; j < numbersArray.length - 1; j++) {
			for (int k = 0; k < numbersArray.length - j - 1; k++) {
				if (numbersArray[k + 1] < numbersArray[k]) {
					int aux = numbersArray[k + 1];
					numbersArray[k + 1] = numbersArray[k];
					numbersArray[k] = aux;

				}

			}

		}
	}

	/**
	 * Metodo QuickSort: Metodo que divide el arreglo segun el pivote y posteriormete va divivdiendo 
	 * comparando con el lado derecho o izquierdo y organizando los numeros del arreglo
	 * @param array : Arreglo
	 * @param first : Primer elemento
	 * @param last  : Ultimo elemento
	 */
	@Override
	public void quickSortMethod(int[] array, int first, int last) {
			
			if(first>=last){
				return;
			}
			
			int pivot = array[first];
			int left = first+1;
			int right =last;
			
			while(left<=right){
				
				while(left<=last && array[left]<pivot){
					left++;
				}
					
				while(right>first && array[right]>=pivot){
					right--;
				}
				
				if(left<=right){
					int aux= array[left];
					array[left]=array[right];
					array[right] = aux;
				}
					
			}
			
			if(right>first){
				int aux2 = array[first]; 
				array[first] = array[right];
				array[right] = aux2;
			}
			
			    /**Se llama el metodo para organizar el lado izquierdo*/
				quickSortMethod(array, first, right-1);
				
				/**Se llama el metodo para organizar el lado izquierdo*/
				quickSortMethod(array, right+1, last);
		
	}
}