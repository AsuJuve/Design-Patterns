import java.lang.Math;

public class Circulo implements Forma{

	private Color color;
	private int radio;

	public Circulo(Color color, int radio){
		this.color = color;
		this.radio = radio;
	}

	@Override
	public double calcularArea(){
		return Math.PI*(this.radio*this.radio);
	}

	@Override
	public double calcularPerimetro(){
		return Math.PI*(this.radio*2);
	}

	@Override
	public String getColor(){
		return this.color.toString();
	}

	public int getRadio(){
		return this.radio;
	}

	@Override
	public String toString(){
		return "\t| Circulo con radio de tamano "+this.getRadio()+", un area de "+this.calcularArea()+", perimetro de "+this.calcularPerimetro()+" y un color "+this.getColor();
	}

}