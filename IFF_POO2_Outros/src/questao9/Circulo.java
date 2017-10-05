package questao9;

public class Circulo
{
	//atributos comuns
	private float raio;

	//métodos de acesso
	public float getRaio()
	{	return raio;	}

	public void setRaio(float raio)
	{	this.raio = raio;	}
	
	//métodos concretos
	public double calcularArea()
	{    return Math.PI*Math.pow(raio,2); }
	
	public double calcularPerimetro()
	{	return 2*Math.PI*raio; }
	
	public float calcularDiametro()
	{	return 2*raio;	}
}
