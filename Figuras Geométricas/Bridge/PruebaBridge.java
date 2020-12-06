public class PruebaBridge{
	public static void main(String[] args) {

		//Aqui se crean algunas formas de prueba con sus colores 

		Azul azul = new Azul();
		Rojo rojo = new Rojo();
		Verde verde = new Verde();
		Cuadrado cuadrado0 = new Cuadrado(azul,5);
		Circulo circulo0 = new Circulo(verde,3);
		Cuadrado cuadrado1 = new Cuadrado(rojo,10);
		Circulo circulo1 = new Circulo(azul,8);
		Cuadrado cuadrado2 = new Cuadrado(verde,15);
		Circulo circulo2 = new Circulo(rojo,2);

		System.out.println("\n---------------------------------------Formas y Colores-----------------------------------\n");
		System.out.println(cuadrado0);
		System.out.println("------------------------------------------------------------------------------------------\n");
		System.out.println(cuadrado1);
		System.out.println("------------------------------------------------------------------------------------------\n");
		System.out.println(cuadrado2);
		System.out.println("------------------------------------------------------------------------------------------\n");
		System.out.println(circulo0);
		System.out.println("------------------------------------------------------------------------------------------\n");
		System.out.println(circulo1);
		System.out.println("------------------------------------------------------------------------------------------\n");
		System.out.println(circulo2);
		System.out.println("------------------------------------------------------------------------------------------");

	}
}