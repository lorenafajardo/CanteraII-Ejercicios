
/**
* Ejercicio 2: �Es posible ejecutar un programa en java que contenga varias clases con m�todos main?
* 
* Al ejecutar el pograma, es posible demostrar que si se puede tener un programa con varias clases que contenga el metodo main, 
* se debe ejecutar desde la clase que se cosidere principal y abarque todo el programa, se puede diferenciarla con el nombre y 
* la ubicacion en otro paquete.
*/

package exerciseii;

/**
 * Clase Fruits: Clase que contiene la declaraci�n de atributos, m�todos get y set.
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */

public class Fruits {

	public int applePrice;
	public int bananaPrice;
	public int lemonPrice;
	public int cherryPrice;

	/**
	 * Declaraci�n de constructor vacio que sera llamado en las clases que
	 * contienen los m�todos main
	 */
	public Fruits() {
		super();
	}

	/**
	 * M�todo getApplePrice: M�todo que muestra el valor de applePrice
	 * 
	 * @return applePrice : Precio de la manzana
	 */
	public int getApplePrice() {
		return applePrice;
	}

	/**
	 * M�todo setApplePrice = M�todo que permite modificar el valor de
	 * applePrice
	 * 
	 * @param applePrice
	 *            : Precio manzana
	 */
	public void setApplePrice(int applePrice) {
		this.applePrice = 1000;
	}

	/**
	 * M�todo getBananaPrice: M�todo que muestra el valor de BananaPrice
	 * 
	 * @return bananaPrice : Precio del banano
	 */
	public int getBananaPrice() {
		return bananaPrice;
	}

	/**
	 * M�todo setBananaPrice = M�todo que permite modificar el valor de
	 * BananaPrice
	 * 
	 * @param bananaPrice
	 *            : Precio del banano
	 */
	public void setBananaPrice(int bananaPrice) {
		this.bananaPrice = 2000;
	}

	/**
	 * M�todo getLemonPrice: M�todo que muestra el valor de LemonPrice
	 * 
	 * @return lemonPrice : Precio del limon
	 */
	public int getLemonPrice() {
		return lemonPrice;
	}

	/**
	 * M�todo setLemonPrice = M�todo que permite modificar el valor de
	 * LemonPrice
	 * 
	 * @param lemonPrice
	 *            : Precio del limon
	 */
	public void setLemonPrice(int lemonPrice) {
		this.lemonPrice = lemonPrice;
	}

	/**
	 * M�todo getCherryPrice: M�todo que muestra el valor de CherryPrice
	 * 
	 * @return cherryPrice : Precio de la cereza
	 */
	public int getCherryPrice() {
		return cherryPrice;
	}

	/**
	 * M�todo setCherryPrice = M�todo que permite modificar el valor de
	 * cherryPrice
	 * 
	 * @param cherryPrice
	 *            : Precio de la cereza
	 */
	public void setCherryPrice(int cherryPrice) {
		this.cherryPrice = cherryPrice;
	}

}
