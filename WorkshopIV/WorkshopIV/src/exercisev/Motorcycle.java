/**
 * Ejercicio 5: A partir de la clase Vehiculo cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un
cami�n, una bicicleta, una lancha.
 */

package exercisev;

/**Importacion de clases
 * Date    : Utilizada para el tipo de dato de las fechas
 * Vehicle : Clase vehiculo donde se extieden los demas vehiculos
 */
import java.util.Date;
import exerciseiv.Vehicle;

/**
 * Clase Motorcycle: Clase extendida de vehicle, con la implementacion de atributo para identificar una motocicleta 
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */
public class Motorcycle extends Vehicle{
	
	/**
	 * Aributo
	 * licenseA : Licencia Tipo A
	 */
	public boolean licenseA;

	/** Declaracion de costructor vacio*/
	public Motorcycle() {
		super();
	}

	/**
	 * Constructor con todos los parametros de la clase vehicle
	 * @param passenggersNumber
	 * @param withCrew
	 * @param wheels
	 * @param registrationDate
	 * @param moveMeans
	 * @param weight
	 * @param typeVehicle
	 */
	public Motorcycle(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight, String typeVehicle) {
		super(passenggersNumber, withCrew, wheels, registrationDate, moveMeans, weight, typeVehicle);
	}

	/**
	 * Metodo isLicenseA : Metodo para obtener el valor de licencia de conduccion A
	 * @return licenseA : Tipo de licencia A
	 */
	public boolean isLicenseA() {
		return licenseA;
	}

	/**
	 * Metodo setLicenseA : Metodo para modificar el valor de licencia de conduccion A
	 * @param licenseA : Tipo de licencia A
	 */
	public void setLicenseA(boolean licenseA) {
		this.licenseA = licenseA;
	}
	
	

}
