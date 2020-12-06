public class PizzeroPepperoni implements Empleado{

	private Harina tipoHarina;
	private int gramosTomate;
	private Queso tipoQueso;
	private int rebanadasPepperoni;
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
	public void aniadirPepperoni(int rebanadasPepperoni){
		this.rebanadasPepperoni = rebanadasPepperoni;
		System.out.println("\t* Aniadiendo pepperoni *");
	}
	public void hornear(int minutosHornear){
		this.minutosHornear = minutosHornear;
		System.out.println("\t* Horneando :) *");
	}

	public PizzaPepperoni getPizza(){
		return new PizzaPepperoni(tipoHarina,gramosTomate,tipoQueso,rebanadasPepperoni,minutosHornear);
	}
}