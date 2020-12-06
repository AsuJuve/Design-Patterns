public class Pastelero implements Empleado{

	private Harina tipoHarina;
	private int minutosHornear;
	private Sabor sabor;
	private String mensaje;

	public void prepararHarina(Harina tipoHarina){
		this.tipoHarina = tipoHarina;
		System.out.println("\t* Preparando harina *");
	}

	public void hornear(int minutosHornear){
		this.minutosHornear = minutosHornear;
		System.out.println("\t* Horneando *");
	}

	public void aniadirBetun(Sabor sabor){
		this.sabor = sabor;
		System.out.println("\t* Aniadiendo betun al pastel *");
	}

	public void aniadirMensaje(String mensaje){
		this.mensaje = mensaje;
		System.out.println("\t* Escribiendo mensaje en el pastel :) *");
	}

	public Pastel getPastel(){
		return new Pastel(tipoHarina,minutosHornear,sabor,mensaje);
	}
}