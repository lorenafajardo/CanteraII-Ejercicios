
/**
 *Ejercicio 4 : Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a
 * continuación por pantalla
 */
package exerciseiv;

/**Importacion de libreria Date y SimpleDateFormat, para ingresar una fecha y darle formato*/
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase Vehicle: Clase que contiene los aributos de un vehiculo y los  metodos para trabajar con ellos
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */
public class Vehicle {

	/**
	 * Atributos
	 * passenggersNumber : Numero de pasajeros
	 * withCrew          : Con tripulacion
	 * wheels            : Numero de llantas
	 * registrationDate  : Fecha de matricula
	 * moveMeans         : Medio por el que se desplaza
	 * weight            : Peso
	 * typeVehicle       : Tipo de vehiculo
	 */
	public int passenggersNumber;
	public boolean withCrew;
	public int wheels;
	public Date registrationDate;
	public String moveMeans;
	public double weight;
	public String typeVehicle;
	
	/**Declaracion de constructor vacio, para instanciarlo desde otras clases*/	
	public Vehicle() {
		super();
	}

	/**
	 * Constructor con los parametros definidos, excepto typeVehiculo, que es uilizado para el ejercicio 5 
	 * @param passenggersNumber : Numero de pasajeros
	 * @param withCrew          : Con tripulacion
	 * @param wheels            : Numero de llantas
	 * @param registrationDate  : Fecha de matricula
	 * @param moveMeans         : Medio por el que se desplaza
	 * @param weight            : Peso
	 */
	public Vehicle(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight) {
		super();
		this.passenggersNumber = passenggersNumber;
		this.withCrew = withCrew;
		this.wheels = wheels;
		this.registrationDate = registrationDate;
		this.moveMeans = moveMeans;
		this.weight = weight;
	}

	/**
	 * Constructor con todos los parametros, utilizado en el ejercicio 5
	 * @param passenggersNumber : Numero de pasajeros
	 * @param withCrew          : Con tripulacion
	 * @param wheels            : Numero de llantas
	 * @param registrationDate  : Fecha de matricula
	 * @param moveMeans         : Medio por el que se desplaza
	 * @param weight            : Peso
	 * @param typeVehicle       : Tipo de vehiculo
	 */
	public Vehicle(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight, String typeVehicle) {
		super();
		this.passenggersNumber = passenggersNumber;
		this.withCrew = withCrew;
		this.wheels = wheels;
		this.registrationDate = registrationDate;
		this.moveMeans = moveMeans;
		this.weight = weight;
		this.typeVehicle = typeVehicle;
	}

	/**
	 * Metodo getPassenggersNumber: Utilizado para obtener el valor de passenggersNumber
	 * @return passenggersNumber : Numero de pasajeros
	 */
	public int getPassenggersNumber() {
		return passenggersNumber;
	}

	/**
	 * Metodo setPassenggersNumber: Utilizado para modificar el valor de passenggersNumber
	 * @param passenggersNumber : Numero de pasajeros
	 */
	public void setPassenggersNumber(int passenggersNumber) {
		this.passenggersNumber = passenggersNumber;
	}

	/**
	 * Metodo isWithCrew: Utilizado para obtener el valor de withCrew
	 * @return withCrew : Con tripulacion
	 */
	public boolean isWithCrew() {
		return withCrew;
	}

	/**
	 * Metodo setWithCrew: Utilizado para modificar el valor de withCrew
	 * @param withCrew : Con tripulacion
	 */
	public void setWithCrew(boolean withCrew) {
		this.withCrew = withCrew;
	}

	/**
	 * Metodo getWheels: Utilizado para obtener el valor de wheels
	 * @return wheels : Numero de llantas
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * Metodo setWheels: Utilizado para modificar el valor de wheels
	 * @param wheels : Numero de llantas
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * Metodo getRegistrationDate: Utilizado para obtener el valor de registrationDate
	 * @return registrationDate : Fecha de matricula
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * Metodo setRegistrationDate: Utilizado para modificar el valor de registrationDate
	 * @param registrationDate : Fecha de matricula
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * Metodo getMoveMeans: Utilizado para obtener el valor de moveMeans
	 * @return moveMeans : Medio por el cual se desplaza
	 */
	public String getMoveMeans() {
		return moveMeans;
	}

	/**
	 * Metodo setMoveMeans: Utilizado para modificar el valor de moveMeans
	 * @param moveMeans : Medio por el cual se desplaza
	 */
	public void setMoveMeans(String moveMeans) {
		this.moveMeans = moveMeans;
	}

	/**
	 * Metodo getWeight: Utilizado para obtener el valor de weight
	 * @return weight : Peso del vehiculo
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Metodo setWeight: Utilizado para modificar el valor de weight
	 * @param weight : Peso del vehiculo
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Metodo getTypeVehicle: Utilizado para obtener el valor de typeVehicle
	 * @return typeVehicle : Tipo de vehiculo
	 */
	public String getTypeVehicle() {
		return typeVehicle;
	}

	/**
	 * Metodo setTypeVehicle: Utilizado para modificar el valor de typeVehicle
	 * @param typeVehicle: Tipo de vehiculo
	 */
	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}


	/**Sobreescriura del metodo toSring, uilizado para mostrar la informacion del vehiculo*/
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return "Vehicle [Numero de pasajeros=" + passenggersNumber + ", Con tripulacion?=" + withCrew + ", Numero de llantas=" + wheels
				+ ", Fecha de matricula=" + format.format(registrationDate) + ", Medio de desplazamiento=" + moveMeans + ", Peso=" + weight +", Tipo de vehiculo=" + typeVehicle + "]";
	}
	
	
	
}
