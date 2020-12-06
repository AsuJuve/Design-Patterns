public class Director{

	//Recetas para cada tipo de pizza y el pastel
	public void hornearPizzaEspecial(PizzeroEspecial empleado){
		System.out.println("\t* Preparando Pizza Especial *\n");
		empleado.prepararHarina(Harina.PIZZA);
		empleado.aniadirTomate(20);
		empleado.aniadirQueso(Queso.MOZZARELLA);
		empleado.aniadirPepperoni(10);
		empleado.aniadirJamon(20);
		empleado.aniadirChampiniones(10);
		empleado.aniadirCarne(50);
		empleado.hornear(30);
	}

	public void hornearPizzaPepperoni(PizzeroPepperoni empleado){
		System.out.println("\t* Preparando Pizza de Pepperoni *\n");
		empleado.prepararHarina(Harina.PIZZA);
		empleado.aniadirTomate(20);
		empleado.aniadirQueso(Queso.CHEDDAR);
		empleado.aniadirPepperoni(15);
		empleado.hornear(30);
	}

	public void hornearPizzaHawaiana(PizzeroHawaiana empleado){
		System.out.println("\t* Preparando Pizza Hawaiana *\n");
		empleado.prepararHarina(Harina.PIZZA);
		empleado.aniadirTomate(20);
		empleado.aniadirQueso(Queso.PARMESANO);
		empleado.aniadirJamon(20);
		empleado.aniadirPinia(15);
		empleado.hornear(30);
	}

	public void hornearPastelVainilla(Pastelero empleado){
		System.out.println("\t* Preparando Pastel de Vainilla *\n");
		empleado.prepararHarina(Harina.PASTEL);
		empleado.hornear(30);
		empleado.aniadirBetun(Sabor.VAINILLA);
		empleado.aniadirMensaje("Feliz Examen 3C!");
	}

	public void hornearPastelChocolate(Pastelero empleado){
		System.out.println("\t* Preparando Pastel de Chocolate *\n");
		empleado.prepararHarina(Harina.PASTEL);
		empleado.hornear(30);
		empleado.aniadirBetun(Sabor.CHOCOLATE);
		empleado.aniadirMensaje("Disfruta este pastel de Chocolate!");
	}

	public void hornearPastelZanahoria(Pastelero empleado){
		System.out.println("\t* Preparando Pastel de Zanahoria *\n");
		empleado.prepararHarina(Harina.PASTEL);
		empleado.hornear(30);
		empleado.aniadirBetun(Sabor.ZANAHORIA);
		empleado.aniadirMensaje("A nadie le gustan estos pasteles amigo, quierete");
	}

}