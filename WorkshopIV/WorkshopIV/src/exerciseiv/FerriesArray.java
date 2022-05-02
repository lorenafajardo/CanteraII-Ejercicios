
/**
 *Ejercicio 4 : Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a
 * continuación por pantalla
 */

package exerciseiv;

/**Importacion de librerias
 * ParseException          : Utilizada para evitar errores al usar el tipo de dato Date
 * Date y SimpleDateFormat : Utilizadas para el ingreso de una fecha y la modificacion de su formato
 * Scanner                 : Utilizada para la capura de datos digitados por el usuario
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase FerriesArray : Clase utilizada para la creacion de objetos tipo
 * vehiculo y almacenarlos en una lista
 * 
 * @author LORENA FAJARDO
 * @Version: 1.0.0
 */
public class FerriesArray {

	/** Instancia de unn arreglo tipo Vehiculo */
	Vehicle[] Vehicles = new Vehicle[10];

	/** Instancia del formato de la fecha */
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	/** Instancia de la clase vehiculo */
	Vehicle vehicle = new Vehicle();

	/**
	 * Metodo addArray: Utilizado para recibir la informacion de los 10 objetos
	 * y añadirlos en una lista
	 */
	public Vehicle[] addArray() throws ParseException {

		/**
		 * Instacia de Scanner, utilizada para capturar la informacion ingresada
		 * por el usuario
		 */
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("----------------------------------------------");
			System.out.println("Ingrese la siguiente iformacion del vehiculo ");
			System.out.println("");

			/** Captura del valor de numero de pasajeros */
			System.out.println("Número de pasajeros: ");
			vehicle.setPassenggersNumber(input.nextInt());

			/** Captura del valor de tripulacion */
			System.out.println("Con tripulación: (true/false)");
			vehicle.setWithCrew(input.nextBoolean());

			/** Captura del valor de numero de ruedas */
			System.out.println("Número de ruedas: ");
			vehicle.setWheels(input.nextInt());

			/** Captura del valor de la fecha de matricula */
			System.out.println("Fecha de matricula (dd/MM/yyyy): ");
			Date date = format.parse(input.next());
			input.nextLine();
			vehicle.setRegistrationDate(date);

			/** Captura del valor de medio por el que se desplaza */
			System.out.println("Medio por el cual se desplaza ");
			vehicle.setMoveMeans(input.nextLine());

			/** Captura del valor de peso */
			System.out.println("Peso ");
			vehicle.setWeight(input.nextDouble());

			Vehicle v = new Vehicle(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(), vehicle.getRegistrationDate(), vehicle.moveMeans, vehicle.getWeight());
			
			Vehicles[i] = v;

		}
		return Vehicles;
	}

	/** Metodo show: Utilizado para mostrar los datos de cada objeto */
	public void show(Vehicle[] Vehicles) {
		for (int j = 0; j < Vehicles.length; j++) {
			System.out.println("Vehiculo [Numero de pasajeros=" + Vehicles[j].getPassenggersNumber() + ", Con tripulacion?="
					+ Vehicles[j].isWithCrew() + ", Llantas=" + Vehicles[j].getWheels() + ", Fecha de matricula="
					+ format.format(Vehicles[j].getRegistrationDate()) + ", Medio de desplazamieno=" + Vehicles[j].getMoveMeans()
					+ ", Peso=" + Vehicles[j].getWeight() + "]");
		}

	}

}
