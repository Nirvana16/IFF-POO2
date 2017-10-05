package revisao.ex09.correto;

public class circulo {
	
	private float raio;
	
	public float getRaio(){
		return raio;
	}
	public void setRaio(float raio){
		this.raio =raio;
	}
	
	public double calcularArea(){
		return 2*Math.PI*Math.pow(raio,2);
	}
	
	public double calcularPerimetro(){
		return 2*Math.PI*raio;
	}
	
	public float calcularDiametro(){
		return 2*raio;
	}

}
