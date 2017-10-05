package questao10;

import javax.swing.JOptionPane;

public class Triangulo
{
	//atributos comuns
	private float base;
	private float altura;
	private String tipo;
		
	//métodos de acesso
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
	
	//método construtor
	public Triangulo()
	{	base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do triângulo: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
		tipo = JOptionPane.showInputDialog("Informe o tipo do triângulo: ");
	}
		
	//métodos concretos
	public double calcularArea()
	{  return (base*altura)/2;  }
	
	public double calcularPerimetro()
	{	if (tipo.equalsIgnoreCase("equilatero"))
		{	return 3*base;	}
		else
		{	if(tipo.equalsIgnoreCase("isósceles"))
			{  	double lado = Math.sqrt(Math.pow(base/2,2)+Math.pow(altura,2));
				return base+(2*lado);
			}
			else
			{	float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro lado do triângulo: "));
				float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo lado do triângulo: "));
				return base+lado1+lado2;
			}
		}	
	}
}
