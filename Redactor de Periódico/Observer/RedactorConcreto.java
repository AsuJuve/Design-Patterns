import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class RedactorConcreto implements Redactor{

	private int estadoNuevoPeriodico = 0;
	private List<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
	private String urlSitio = "www.periodicoperron.com.mx";

	@Override
	public void agregarSuscriptor(Suscriptor suscriptor){
		System.out.println("\t\t+++ "+suscriptor+" se a aniadido como nuevo suscriptor del periodico +++");
		suscriptores.add(suscriptor);
	}

	@Override
	public void eliminarSuscriptor(Suscriptor suscriptor){
		System.out.println("\t\t---"+suscriptor+" ya no es un suscriptor del periodico ---");
		suscriptores.remove(suscriptor);
	}

	@Override
	public void notificarNuevoPeriodico(){
		if (this.getSuscriptores().size() < 1) {
			System.out.println("\t\t!!! No hay suscriptores para notificar !!!\n");
		}else{
			System.out.println("\t\t!!! Notificando suscriptores sobre el nuevo periodico !!!\n");
			for (Suscriptor suscriptor : suscriptores) {
				suscriptor.serNotificado(this);
			}
		}
	}

	public void escribirNuevoPeriodico(){
		System.out.println("\t\t*** Redactor escribiendo nuevo periodico ***");
		Random rand = new Random(); 

		//Utilizamos el numero aleatorio, para que se vea como que el redactor se tarda mas en "escribir", y no sea a la primera llamada del metodo
		estadoNuevoPeriodico = rand.nextInt(3);
		
		if (estadoNuevoPeriodico == 1) {
			System.out.println("\t\t>>> El periodico a sido terminado <<<");
			this.notificarNuevoPeriodico();
		}else{
			this.escribirNuevoPeriodico();
		}
	}

	public String getUrlSitio(){
		return this.urlSitio;
	}

	public List<Suscriptor> getSuscriptores(){
		return this.suscriptores;
	}

	public void mostrarSuscriptores(){
		int contadorLista = -1; 
		System.out.println("\t/Lista de Suscriptores/");

		if (this.getSuscriptores().size() < 1 ) {
			System.out.println("\n\t-----Lista vacia-----\n");
		}else{
			for (Suscriptor suscriptor : this.suscriptores ) {
				contadorLista++;
				System.out.println(contadorLista+". "+suscriptor);
			}
		}

		System.out.println();
	}

}