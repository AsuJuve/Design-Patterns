public class PizzeroHawaiana implements Empleado{

	private Harina tipoHarina;
	private int gramosTomate;
	private Queso tipoQueso;
	private int gramosJamon;
	private int trozosPinia;
	private int minutosHornear;

	public void prepararHarina(Harina tipoHarina){
		this.tipoHarina = tipoHarina;
		System.out.println("\t* Preparando harina *");
	}
	public void aniadirTomate(int gramosTomate){
		this.gramosTomate = gramosTomate;
		System.out.println("\t* Aniadiendo tomate *");
	}
	public void aniadirQueso(Queso tipoQueso){
		this.tipoQueso = tipoQueso;
		System.out.println("\t* Aniadiendo queso *");
	}
	public void aniadirJamon(int gramosJamon){
		this.gramosJamon = gramosJamon;
		System.out.println("\t* Aniadiendo jamon *");
	}
	public void aniadirPinia(int trozosPinia){
		this.trozosPinia = trozosPinia;
		System.out.println("\t* Aniadiendo pinia *");
	}
	public void hornear(int minutosHornear){
		this.minutosHornear = minutosHornear;
		System.out.println("\t* Horneando :) *");
	}

	public PizzaHawaiana getPizza(){
		return new PizzaHawaiana(tipoHarina,gramosTomate,tipoQueso,gramosJamon,trozosPinia,minutosHornear);
	}
}