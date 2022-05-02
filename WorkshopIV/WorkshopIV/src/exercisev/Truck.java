/**Ejercicio 5: A partir de la clase Vehiculo cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un
cami�n, una bicicleta, una lancha.*/

package exercisev;

/**Importacion de clases
 * Date    : Utilizada para el tipo de dato de las fechas
 * Vehicle : Clase vehiculo donde se extieden los demas vehiculos
 */
import java.util.Date;
import exerciseiv.Vehicle;

/**
 * Clase Truck: Clase extendida de vehiculo y contiene atributo identificador para un camion
 * @author LORENA FAJARDO 
 * Version: 1.0.0
 */
public class Truck extends Vehicle{
	
	/**
	 * Atributo
	 * heavyLoad : Carga pesada
	 */
	public boolean heavyLoad;

	
	/** Declaracion de costructor vacio*/
	public Truck() {
		super();
	}

	/**
	 * Constructor con todos los parametros de la clase vehicle
	 * @param passenggersNumber : Numero de pasajeros
	 * @param withCrew          : Con tripulacion
	 * @param wheels            : Numero de llantas
	 * @param registrationDate  : Fecha de matricula
	 * @param moveMeans         : Medio por el que se desplaza
	 * @param weight            : Peso
	 * @param typeVehicle       : Tipo de vehiculo
	 */
	public Truck(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight, String typeVehicle) {
		super(passenggersNumber, withCrew, wheels, registrationDate, moveMeans, weight, typeVehicle);
	
	}

	/**
	 * Metodo isHeavyLoad : Metodo para obtener el valor de carga pesada
	 * @return heavyLoad : Carga pesada
	 */
	public boolean isHeavyLoad() {
		return heavyLoad;
	}

	/**
	 * Metodo setHeavyLoad : Metodo para modificar el valor de carga pesada 
	 * @param heavyLoad : Carga pesada
	 */
	public void setHeavyLoad(boolean heavyLoad) {
		this.heavyLoad = heavyLoad;
	}
	
	
	
	

}
