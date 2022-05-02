
/**
* Ejercicio 2: ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main?
* 
* Al ejecutar el pograma, es posible demostrar que si se puede tener un programa con varias clases que contenga el metodo main, 
* se debe ejecutar desde la clase que se cosidere principal y abarque todo el programa, se puede diferenciarla con el nombre y 
* la ubicacion en otro paquete.
*     
*/

package exerciseii;

 /**
 * Importación de libreria Scanner, utilizada para capturar datos
 */
import java.util.Scanner;

 /**
 * Clase Main2: Clase que contiene otro método Main, donde instancia el otro main de la clase Main1 y solicita seleccionar la fruta a comprar
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */

public class Main2 {

	 /**
	 * @param args : Argumento del método main
	 */
	public static void main(String[] args) {

		 /**
		 * Instancia de la libreria Scanner
		 */
		Scanner input = new Scanner(System.in);
		
		 /**
		 * Llamado del método main de la clase Main1, para demostrar que se puede tener varias clases con el método main
		 */
		Main1.main(args);
		
		 /**
		 * Mostrar al usuario las opciones que tiene
		 */
		System.out.println("");
		System.out.println("Escriba la opción de fruta que desea comprar: ");
		System.out.println("1. Manzana");
		System.out.println("2. Banano");
		System.out.println("3. Limon");
		System.out.println("4. Cereza");
		
		 /**
		 * Captura de la opcion escogida por el usuario
		 */
		int option = input.nextInt();
		
		 /**
		 * Uso del condicional Switch -case, para imprimir el precio respectivo de la fruta escogida
		 */
		switch (option) {

		case 1:
			System.out.println("El precio a pagar es $1500");
			break;
		case 2:
			System.out.println("El precio a pagar es $600");
			break;
		case 3:
			System.out.println("El precio a pagar es $400");
			break;
		case 4:
			System.out.println("El precio a pagar es $5000");
			break;

		}
	}

}
