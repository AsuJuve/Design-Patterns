public class PizzaHawaiana{
	
	private final Harina tipoHarina;
	private final int gramosTomate;
	private final Queso tipoQueso;
	private final int gramosJamon;
	private final int trozosPinia;
	private final int minutosHornear;

	public PizzaHawaiana(Harina tipoHarina, int gramosTomate, Queso tipoQueso, int gramosJamon, int trozosPinia, int minutosHornear){
		this.tipoHarina = tipoHarina;
		this.gramosTomate = gramosTomate;
		this.tipoQueso = tipoQueso;
		this.gramosJamon = gramosJamon;
		this.trozosPinia = trozosPinia;
		this.minutosHornear = minutosHornear;
	}

	public String toString(){
		return "Pizza Hawaiana con harina tipo "+tipoHarina+", "+gramosTomate+"\n\t"+
				"gramos de tomate, queso tipo "+tipoQueso+", "+gramosJamon+"\n\t"+
				"gramos de Jamon, y horneada en "+minutosHornear+" minutos\n";
	}

}