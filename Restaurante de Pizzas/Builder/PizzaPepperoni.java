public class PizzaPepperoni{
	
	private final Harina tipoHarina;
	private final int gramosTomate;
	private final Queso tipoQueso;
	private final int rebanadasPepperoni;
	private final int minutosHornear;

	public PizzaPepperoni(Harina tipoHarina, int gramosTomate, Queso tipoQueso, int rebanadasPepperoni, int minutosHornear){
		this.tipoHarina = tipoHarina;
		this.gramosTomate = gramosTomate;
		this.tipoQueso = tipoQueso;
		this.rebanadasPepperoni = rebanadasPepperoni;
		this.minutosHornear = minutosHornear;
	}

	public String toString(){
		return "Pizza de Pepperoni con harina tipo "+tipoHarina+", "+gramosTomate+"\n\t"+
		 		"gramos de tomate, queso tipo "+tipoQueso+", "+rebanadasPepperoni+"\n\t"+
		 		"rebanadas de pepperoni y horneada en "+minutosHornear+" minutos\n";
	}

}