package questao10;

import javax.swing.JOptionPane;

public class Retangulo
{
	//atributos comuns
	private float base;
	private float altura;
	
	//m�todos de acesso
	public float getBase()
	{	return base;	}
	
	public void setBase(float base)
	{	this.base = base;	}
	
	public float getAltura()
	{	return altura;	}
	
	public void setAltura(float altura)
	{	this.altura = altura;	}
	
	//m�todo construtor
	public Retangulo()
	{	base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do ret�ngulo: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do ret�ngulo: "));
	}
	
	//m�todos concretos
	public double calcularArea()
	{  return base*altura;  }
	
	public float calcularPerimetro()
	{ return 2*(base+altura); }
	
	public double calcularDiagonal()
	{ return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)); }
}
