package quadrado;

public class Quadrado {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado (){
		this.lado = 0;
	}
// Metodos
	
	public double calcularArea(){
		return lado*lado;
	}
	public double calcularPerimetro(){
		return lado*4;
	}
	public double calcularDiagonal(){
		return Math.sqrt(Math.pow(lado,2)+Math.pow(lado,2));  
	}
	
}
