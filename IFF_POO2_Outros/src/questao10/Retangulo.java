package questao10;

import javax.swing.JOptionPane;

public class Retangulo
{
	//atributos comuns
	private float base;
	private float altura;
	
	//métodos de acesso
	public float getBase()
	{	return base;	}
	
	public void setBase(float base)
	{	this.base = base;	}
	
	public float getAltura()
	{	return altura;	}
	
	public void setAltura(float altura)
	{	this.altura = altura;	}
	
	//método construtor
	public Retangulo()
	{	base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do retângulo: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do retângulo: "));
	}
	
	//métodos concretos
	public double calcularArea()
	{  return base*altura;  }
	
	public float calcularPerimetro()
	{ return 2*(base+altura); }
	
	public double calcularDiagonal()
	{ return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)); }
}
