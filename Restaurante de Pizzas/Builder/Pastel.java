public class Pastel{
	
	private final Harina tipoHarina;
	private final int minutosHornear;
	private final Sabor sabor;
	private final String mensaje;

	public Pastel(Harina tipoHarina, int minutosHornear, Sabor sabor, String mensaje){
		this.tipoHarina = tipoHarina;
		this.minutosHornear = minutosHornear;
		this.sabor = sabor;
		this.mensaje = mensaje;
	}

	public String toString(){
		return "Pastel con harina tipo "+tipoHarina+", sabor "+sabor+",\n\t"+
				"con un mensaje que dice: '"+mensaje+"', y horneado en \n\t"+
				minutosHornear+" minutos\n";
	}

}