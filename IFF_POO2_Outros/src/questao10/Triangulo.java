package questao10;

import javax.swing.JOptionPane;

public class Triangulo
{
	//atributos comuns
	private float base;
	private float altura;
	private String tipo;
		
	//m�todos de acesso
	public float getBase()
	{	return base;	}
		
	public void setBase(float base)
	{	this.base = base;	}
		
	public float getAltura()
	{	return altura;	}
		
	public void setAltura(float altura)
	{	this.altura = altura;	}
	
	public String getTipo()
	{	return tipo;	}

	public void setTipo(String tipo)
	{	this.tipo = tipo;	}
	
	//m�todo construtor
	public Triangulo()
	{	base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do tri�ngulo: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do tri�ngulo: "));
		tipo = JOptionPane.showInputDialog("Informe o tipo do tri�ngulo: ");
	}
		
	//m�todos concretos
	public double calcularArea()
	{  return (base*altura)/2;  }
	
	public double calcularPerimetro()
	{	if (tipo.equalsIgnoreCase("equilatero"))
		{	return 3*base;	}
		else
		{	if(tipo.equalsIgnoreCase("is�sceles"))
			{  	double lado = Math.sqrt(Math.pow(base/2,2)+Math.pow(altura,2));
				return base+(2*lado);
			}
			else
			{	float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro lado do tri�ngulo: "));
				float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo lado do tri�ngulo: "));
				return base+lado1+lado2;
			}
		}	
	}
}
