import java.util.Scanner;
import java.util.InputMismatchException;

public class PruebaBuilder{

	public static void main(String[] args) {
		
		//Se crea la clase del director y de los empleados
		Director directorPizzeria = new Director();
		PizzeroEspecial pizzeroEspecial = new PizzeroEspecial();
		PizzeroPepperoni pizzeroPepperoni = new PizzeroPepperoni();
		PizzeroHawaiana pizzeroHawaiana = new PizzeroHawaiana();
		Pastelero pastelero = new Pastelero();

		//Objeto necesario para leer la entreada del usuario
		Scanner scan = new Scanner(System.in);

		//Menu principal para escoger que hornear
		while (true) {
			
			System.out.println("________________________________________________________________________________________");
			System.out.println("________________________________Ordenes del Restaurante_________________________________");
			System.out.println("________________________________________________________________________________________");
			System.out.print("\n0.Pizza Especial\n1.Pizza de Pepperoni\n2.Pizza Hawaiana\n3.Pastel de Vainilla\n4.Pastel de Chocolate\n"
							+"5.Pastel de Zanahoria\n\n Seleccione un elemento a hornear: ");
	    	String op = scan.next();
	    	System.out.println();

	    	switch (op) {
	    		case "0":
					directorPizzeria.hornearPizzaEspecial(pizzeroEspecial);
					System.out.println("\n\t===Se preparo lo siguiente===\n\n\t>"+pizzeroEspecial.getPizza());
					break;
	    		case "1":
					directorPizzeria.hornearPizzaPepperoni(pizzeroPepperoni);
					System.out.println("\n\t===Se preparo lo siguiente===\n\n\t>"+pizzeroPepperoni.getPizza());
	    			break;
	    		case "2":
					directorPizzeria.hornearPizzaHawaiana(pizzeroHawaiana);
					System.out.println("\n\t===Se preparo lo siguiente===\n\n\t>"+pizzeroHawaiana.getPizza());
	    			break;
	    		case "3":
					directorPizzeria.hornearPastelVainilla(pastelero);
					System.out.println("\n\t===Se preparo lo siguiente===\n\n\t>"+pastelero.getPastel());
	    			break;
	    		case "4":
					directorPizzeria.hornearPastelChocolate(pastelero);
					System.out.println("\n\t===Se preparo lo siguiente===\n\n\t>"+pastelero.getPastel());
	    			break;
	    		case "5":
					directorPizzeria.hornearPastelZanahoria(pastelero);
					System.out.println("\n\t===Se preparo lo siguiente===\n\n\t>"+pastelero.getPastel());
	    			break;
	    		default:
	    			System.out.println("\n\t ||| Opcion invalida |||\n");
	    			break;
	    	}
		}
	}
}