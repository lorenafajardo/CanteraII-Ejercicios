
/**
* Ejercicio 2: ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main?
* 
* Al ejecutar el pograma, es posible demostrar que si se puede tener un programa con varias clases que contenga el metodo main, 
* se debe ejecutar desde la clase que se cosidere principal y abarque todo el programa, se puede diferenciarla con el nombre y 
* la ubicacion en otro paquete.
*/

package exerciseii;

/**
 * Clase Fruits: Clase que contiene la declaración de atributos, métodos get y set.
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */

public class Fruits {

	public int applePrice;
	public int bananaPrice;
	public int lemonPrice;
	public int cherryPrice;

	/**
	 * Declaración de constructor vacio que sera llamado en las clases que
	 * contienen los métodos main
	 */
	public Fruits() {
		super();
	}

	/**
	 * Método getApplePrice: Método que muestra el valor de applePrice
	 * 
	 * @return applePrice : Precio de la manzana
	 */
	public int getApplePrice() {
		return applePrice;
	}

	/**
	 * Método setApplePrice = Método que permite modificar el valor de
	 * applePrice
	 * 
	 * @param applePrice
	 *            : Precio manzana
	 */
	public void setApplePrice(int applePrice) {
		this.applePrice = 1000;
	}

	/**
	 * Método getBananaPrice: Método que muestra el valor de BananaPrice
	 * 
	 * @return bananaPrice : Precio del banano
	 */
	public int getBananaPrice() {
		return bananaPrice;
	}

	/**
	 * Método setBananaPrice = Método que permite modificar el valor de
	 * BananaPrice
	 * 
	 * @param bananaPrice
	 *            : Precio del banano
	 */
	public void setBananaPrice(int bananaPrice) {
		this.bananaPrice = 2000;
	}

	/**
	 * Método getLemonPrice: Método que muestra el valor de LemonPrice
	 * 
	 * @return lemonPrice : Precio del limon
	 */
	public int getLemonPrice() {
		return lemonPrice;
	}

	/**
	 * Método setLemonPrice = Método que permite modificar el valor de
	 * LemonPrice
	 * 
	 * @param lemonPrice
	 *            : Precio del limon
	 */
	public void setLemonPrice(int lemonPrice) {
		this.lemonPrice = lemonPrice;
	}

	/**
	 * Método getCherryPrice: Método que muestra el valor de CherryPrice
	 * 
	 * @return cherryPrice : Precio de la cereza
	 */
	public int getCherryPrice() {
		return cherryPrice;
	}

	/**
	 * Método setCherryPrice = Método que permite modificar el valor de
	 * cherryPrice
	 * 
	 * @param cherryPrice
	 *            : Precio de la cereza
	 */
	public void setCherryPrice(int cherryPrice) {
		this.cherryPrice = cherryPrice;
	}

}
