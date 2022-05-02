
/**
* Ejercicio 2: ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main?
* 
* Al ejecutar el pograma, es posible demostrar que si se puede tener un programa con varias clases que contenga el metodo main, 
* se debe ejecutar desde la clase que se cosidere principal y abarque todo el programa, se puede diferenciarla con el nombre y 
* la ubicacion en otro paquete.
*/

package exerciseii;

/**
 * Clase Main1: Clase que contiene método Main donde muestra los precios de las frutas
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */

public class Main1 {

	/**
	 * @param args : Argumento del método main
	 */
	public static void main(String[] args) {

		/**
		 * Instancia de la clase Fruits
		 */
		Fruits fruits = new Fruits();

		/**
		 * llamado del método set para cada fruta
		 */
		fruits.setApplePrice(1500);
		fruits.setBananaPrice(600);
		fruits.setCherryPrice(5000);
		fruits.setLemonPrice(400);

		/**
		 * Impresión en connsola de los precios de las frutas
		 */
		System.out.println("            Venta de Frutas");
		System.out.println(" Manzana       $" + fruits.getApplePrice());
		System.out.println(" Banano        $" + fruits.getBananaPrice());
		System.out.println(" Cereza        $" + fruits.getCherryPrice());
		System.out.println(" Limon         $" + fruits.getLemonPrice());

	}
}
