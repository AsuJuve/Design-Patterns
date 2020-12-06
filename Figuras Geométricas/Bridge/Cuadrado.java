public class Cuadrado implements Forma{

	private Color color;
	private int lado;

	public Cuadrado(Color color, int lado){
		this.color = color;
		this.lado = lado;
	}

	@Override
	public double calcularArea(){
		return this.lado*this.lado;
	}

	@Override
	public double calcularPerimetro(){
		return this.lado*4;
	}

	@Override
	public String getColor(){
		return this.color.toString();
	}

	public int getLado(){
		return this.lado;
	}

	@Override
	public String toString(){
		return "\t| Cuadrado con lados de tamano "+this.getLado()+", un area de "+this.calcularArea()+", perimetro de "+this.calcularPerimetro()+" y un color "+this.getColor();
	}

}