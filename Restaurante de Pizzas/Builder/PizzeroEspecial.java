public class PizzeroEspecial implements Empleado{

	private Harina tipoHarina;
	private int gramosTomate;
	private Queso tipoQueso;
	private int rebanadasPepperoni;
	private int gramosJamon;
	private int numeroChampiniones;
	private int gramosCarne;
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
	public void aniadirJamon(int gramosJamon){
		this.gramosJamon = gramosJamon;
		System.out.println("\t* Aniadiendo jamon *");
	}
	public void aniadirChampiniones(int numeroChampiniones){
		this.numeroChampiniones = numeroChampiniones;
		System.out.println("\t* Aniadiendo champiniones *");
	}
	public void aniadirCarne(int gramosCarne){
		this.gramosCarne = gramosCarne;
		System.out.println("\t* Aniadiendo carne *");
	}
	public void hornear(int minutosHornear){
		this.minutosHornear = minutosHornear;
		System.out.println("\t* Horneando :) *");
	}

	public PizzaEspecial getPizza(){
		return new PizzaEspecial(tipoHarina,gramosTomate,tipoQueso,rebanadasPepperoni,gramosJamon,numeroChampiniones,gramosCarne,minutosHornear);
	}
}