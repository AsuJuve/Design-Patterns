import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

public class PruebaObserver{

	public static void main(String[] args) {

		RedactorConcreto redactor = new RedactorConcreto();

		Scanner scan = new Scanner(System.in);

		//Menu principal
		while(true){
			System.out.println("________________________________________________________________________________________");
			System.out.println("______________________________Administracion del Periodico______________________________");
			System.out.println("________________________________________________________________________________________");
			System.out.print("\n0.Escribir periodico de la semana\n1.Agregar un nuevo suscriptor\n2.Eliminar un suscriptor\n3.Mostrar suscriptores actuales\n\n Elija una opcion: ");
	    	String op = scan.next();
	    	System.out.println();

	    	switch (op) {
	    		case "0":
	    			redactor.escribirNuevoPeriodico();
	    			break;
	    		case "1":

	    			System.out.print("Ingrese el Nombre del suscriptor a agregar (si aniade un espacio la segunda palabra sera el Correo): ");
	    			String nombreS = scan.next();

	    			System.out.print("Ingrese el Correo del suscriptor a agregar (solo se tomara en cuenta la primer palabra): ");
	    			String correoS = scan.next();
	    			System.out.println();

	    			Suscriptor suscriptor = new SuscriptorConcreto(nombreS,correoS);
	    			redactor.agregarSuscriptor(suscriptor);
	    			break;
	    		case "2":

	    			List<Suscriptor> suscriptores = redactor.getSuscriptores();
	    			redactor.mostrarSuscriptores();

	    			//No se pueden eliminar suscriptores si la no hay suscriptores
	    			if (redactor.getSuscriptores().size() >= 1) {
		    			System.out.print("Ingrese el indice del Suscriptor a eliminar: ");

		    			try {
					        int idEliminar = scan.nextInt();
			    			//No se elimina el suscriptor si el indice excede al tamnio de la lista

			    			if (idEliminar < 0 || redactor.getSuscriptores().size() <= idEliminar) {
			    				System.out.println("\t---Indice de Suscriptor no encontrado---");
			    			}else{
			    				redactor.eliminarSuscriptor(suscriptores.get(idEliminar));
			    			}

					    } catch (InputMismatchException  e){
					        System.out.println("\t---Indice de Suscriptor no encontrado---");
					    }
		    			System.out.println();
	    			}

	    			break;
	    		case "3":
	    			redactor.mostrarSuscriptores();
	    			break;
	    		default:
	    			System.out.println("\n\t||| Opcion no valida |||\n");
	    			break;
	    	}
		}
	}
	
}