package questao10;

import javax.swing.JOptionPane;

public class Quadrado extends Poligono
{
	//atributos comuns
	private float lado;

	//m�todos de acesso
	public float getLado()
	{	return lado;	}

	public void setLado(float lado)
	{	this.lado = lado;	}
	
	//m�todo construtor
	public Quadrado()
	{	lado = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado do quadrado: "));   }
	
	//m�todos concretos
	public double calcularArea()
	{	return Math.pow(lado,2); }
	
	public double calcularPerimetro()
	{ return 4*lado; }
}
