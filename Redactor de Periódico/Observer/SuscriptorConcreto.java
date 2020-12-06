public class SuscriptorConcreto implements Suscriptor{

	private String nombreCompleto;
	private String correoElectronico;

	public SuscriptorConcreto(String nombreCompleto, String correoElectronico){
		this.nombreCompleto = nombreCompleto;
		this.correoElectronico= correoElectronico;
	}

	@Override
	public void serNotificado(RedactorConcreto redactor){
		//La notificacion simula un correo que le llega al suscriptor
		System.out.println("\n============================= Bandeja de entrada del correo: "+correoElectronico+" ===============================");
		System.out.println("\tHola! "+nombreCompleto+", el periodico de la semana esta listo, visita nuestra pagina web para leerlo: ");
		System.out.println("\t-Pagina de nuestro sitio: "+redactor.getUrlSitio());
		System.out.println("====================================================================================================================\n");
	}

	public String toString(){
		return nombreCompleto;
	}

}