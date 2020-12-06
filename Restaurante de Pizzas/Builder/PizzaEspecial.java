public class PizzaEspecial{
	
	private final Harina tipoHarina;
	private final int gramosTomate;
	private final Queso tipoQueso;
	private final int rebanadasPepperoni;
	private final int gramosJamon;
	private final int numeroChampiniones;
	private final int gramosCarne;
	private final int minutosHornear;

	public PizzaEspecial(Harina tipoHarina, int gramosTomate, Queso tipoQueso, int rebanadasPepperoni, int gramosJamon, int numeroChampiniones, int gramosCarne, int minutosHornear){
		this.tipoHarina = tipoHarina;
		this.gramosTomate = gramosTomate;
		this.tipoQueso = tipoQueso;
		this.rebanadasPepperoni = rebanadasPepperoni;
		this.gramosJamon = gramosJamon;
		this.numeroChampiniones = numeroChampiniones;
		this.gramosCarne = gramosCarne;
		this.minutosHornear = minutosHornear;
	}

	public String toString(){
		return "Pizza Especial con harina tipo "+tipoHarina+", "+gramosTomate+"\n\t"+
				"gramos de tomate, queso tipo "+tipoQueso+", "+rebanadasPepperoni+"\n\t"+
				"rebanadas de pepperoni, "+gramosJamon+" gramos de Jamon, \n\t"+
				numeroChampiniones+" champiniones, "+gramosCarne+" gramos de carne\n\t"+
				"y horneada en "+minutosHornear+" minutos\n";
	}

}