package questao14;

import javax.swing.JOptionPane;

public class Cliente
{
	//atributos
	private String nome;
	private float altura;
	private float peso;
	
	//m�todos de acesso
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome) 
	{	this.nome = nome;	}
	
	public float getAltura()
	{	return altura;	}
	
	public void setAltura(float altura)
	{	this.altura = altura;	}
	
	public float getPeso()
	{	return peso;	}
	
	public void setPeso(float peso)
	{	this.peso = peso;	}
	
	//opera��es e m�todos concretos
	public void inicializar()
	{	nome = JOptionPane.showInputDialog("Informar o nome: ");
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informar a altura: "));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informar o peso: "));
	}
	
	public double calcularIMC()
	{  return (peso/Math.pow(altura,2)); }
}