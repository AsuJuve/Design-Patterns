public class Color{

	//Se refiere al color en sí mismo
	protected String matiz;
	//0% sería negro y 100% sería blanco
	protected int porcentajeLuminosidad;
	//0% no saturado y 100% saturado
	protected int porcentajeSaturacion;

	public Color(){
		this.matiz = "Blanco";
		this.porcentajeLuminosidad = 100;
		this.porcentajeSaturacion = 100;
	}

	public String getMatiz(){
		return this.matiz;
	} 
	
	public int getLuminosidad(){
		return this.porcentajeLuminosidad;
	}

	public int getSaturacion(){
		return this.porcentajeSaturacion;
	}

	public String toString(){
		return "\n\t| "+this.getMatiz()+" con una saturacion del "+this.getSaturacion()+"% y una luminosidad del "+this.getLuminosidad()+"%\n";
	}
}