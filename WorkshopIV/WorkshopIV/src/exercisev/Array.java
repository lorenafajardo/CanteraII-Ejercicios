/**Ejercicio 5: A partir de la clase Vehiculo cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un
camión, una bicicleta, una lancha.*/

package exercisev;

/**Importacion de librerias y clases
 * ParseException   : Utilizada para que no se generen errores cuando se usa el tipo de dato Date
 * SimpleDateFormat : Utilizada para dar formato a la fecha
 * Date             : Utilizada como tipo de dato para fechas
 * Scanner          : Utilizada para capturar la informacion ingresada por el usuario
 * Vehicle          : Utilizada para llamar los metodos de la clase Vehicle
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import exerciseiv.Vehicle;

/**
 * Clase Array: Clase para crear los 10 vehiculos solicitados, identificando el
 * tipo de vehiculo al que corresponde.
 * 
 * @author LORENA FAJARDO
 * @Version: 1.0.0
 */
public class Array {

	/** Instancia de clases */
	Vehicle[] Vehicles = new Vehicle[10];
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	Vehicle vehicle = new Vehicle();
	Bicycle bicycle = new Bicycle();
	Truck truck = new Truck();
	Car car = new Car();
	Motorcycle motorcycle = new Motorcycle();
	Boat boat = new Boat();
	Scanner input = new Scanner(System.in);

	/**
	 * Metodo addArray: Metodo utilizado para recibir los datos que igresa el
	 * usuario y almacenarlos en una lista
	 */
	public Vehicle[] addArray() throws ParseException {

		for (int i = 0; i < 10; i++) {

			System.out.println("----------------------------------------------");
			System.out.println("Ingrese la siguiente informacion del vehiculo ");
			System.out.println("----------------------------------------------");
			;

			/**
			 * Captura del valor de numero de pasajeros y es almacenado en el
			 * metodo setPassenggersNumber
			 */
			System.out.println("Número de pasajeros: ");
			vehicle.setPassenggersNumber(input.nextInt());

			/**
			 * Captura del valor de tripulación y esalmacenado en el metodo
			 * setWithCrew
			 */
			System.out.println("Con tripulación: (True/False)");
			vehicle.setWithCrew(input.nextBoolean());

			/**
			 * Captura del valor de numero de ruedas y es almacenado en el metodo
			 * setWheels
			 */
			System.out.println("Numero de ruedas: ");
			vehicle.setWheels(input.nextInt());

			/**
			 * Captura del valor de fecha de matricula y almacenado en el metodo
			 * setRegistrationDate
			 */
			System.out.println("Fecha de matricula (dd/MM/yyyy): ");
			Date date = format.parse(input.next());
			input.nextLine();
			vehicle.setRegistrationDate(date);

			/**
			 * Captura del valor de medio por el cual se desplaza y es almacenado
			 * en el metodo setMoveMeans
			 */
			System.out.println("Medio por el cual se desplaza ");
			vehicle.setMoveMeans(input.nextLine());

			/** Captura del valor de peso y es almacenado en el metodo setWeight */
			System.out.println("Peso ");
			vehicle.setWeight(input.nextDouble());

			/**
			 * Captura del valor de uso de combustible y es almacenado en el metodo
			 * setUsesFuel
			 */
			System.out.println("El vehiculo usa combustible? (True/False) ");
			bicycle.setUsesFuel(input.nextBoolean());

			/**
			 * Captura del valor de carga pesada y es almacenado en el metodo
			 * setHeavyLoad
			 */
			System.out.println("El vehiculo es de carga pesada? (True/False)");
			truck.setHeavyLoad(input.nextBoolean());

			/**
			 * Captura del valor de ventanas y es almacenado en el metodo
			 * setWindows
			 */
			System.out.println("El vehiculo tiene dos ventanas en cada lateral? (True/False) ");
			car.setWindows(input.nextBoolean());

			/**
			 * Captura del valor de licencia de conduccion A y es almacenado en el
			 * metodo setLicenseA
			 */
			System.out.println("El vehiculo requiere licencia de conduccion A1 o A2 (True/False) ");
			motorcycle.setLicenseA(input.nextBoolean());

			/**
			 * Captura del valor de transporte maritimo y es almacenado en el
			 * metodo setMarineTransport
			 */
			System.out.println("El vehiculo es utilizado como transporte maritimo (True/False) ");
			boat.setMarineTransport(input.nextBoolean());

			/**
			 * condicional if : Se evalua el aributo isUsesFuel,si la respuesta es false, le
			 * asignara tipo de vehiculo igual a bicicleta
			 */
			if (bicycle.isUsesFuel() == false) {
				vehicle.setTypeVehicle("Bicicleta");
				Bicycle bike = new Bicycle(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = bike;

				/**
				 * condicional else-if : Se evalua el aributo isHeavyLoad, si la respuesta es true, le asignara tipo de vehiculo igual a
				 * camion
				 */
			} else if (truck.isHeavyLoad() == true) {
				vehicle.setTypeVehicle("Camion");
				Truck truck = new Truck(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = truck;

				/**
				 * condicional else-if : Se evalua el aributo isWindows, si
				 * la respuesta es true, le asignara tipo de vehiculo igual a
				 * carro
				 */
			} else if (car.isWindows() == true) {
				vehicle.setTypeVehicle("Coche");
				Car car = new Car(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = car;

				/**
				 * condicional else-if : Se evalua el aributo isLicenseA,  si la respuesta es true, le asignara tipo de vehiculo
				 * igual a Motocicleta
				 */
			} else if (motorcycle.isLicenseA() == true) {
				vehicle.setTypeVehicle("Motocicleta");
				Motorcycle motorcycle = new Motorcycle(vehicle.getPassenggersNumber(), vehicle.isWithCrew(),
						vehicle.getWheels(), vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = motorcycle;

				/**
				 * condicional else-if : Se evalua el aributo isLicenseA, si la respuesta es true, le asignara tipo de
				 * vehiculo igual a lancha
				 */
			} else if (boat.isMarineTransport() == true) {
				vehicle.setTypeVehicle("Lancha");
				Boat boat = new Boat(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = boat;
			}
		}
		return Vehicles;
	}

	/** Impresion de la lista de vehiculos creados */
	public void show(Vehicle[] Vehicles) {
		for (int j = 0; j < Vehicles.length; j++) {
			System.out.println(Vehicles[j]);
		}
	}
}
