package questao11;

import javax.swing.JOptionPane;

public class Conta
{
	//atributos comuns
	private double saldo;
	private String nome;
	
	//m�todos de acesso
	public double getSaldo()
	{	return saldo;	}
	
	public void setSaldo(double saldo)
	{	this.saldo = saldo;	}
	
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	//m�todos construtores
	public Conta(String n)
	{	nome = n;
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta: "));
	}
	
	public Conta(String n, double v)
	{	nome = n;
		saldo = v;		
	}
	
	//m�todos concretos
	public void depositar(double v)
	{	saldo = saldo + v;
		JOptionPane.showMessageDialog(null,"Novo saldo atual = R$ "+saldo);
	}

	public void sacar(double v)
	{	if(v>saldo)
		{ JOptionPane.showMessageDialog(null,"Saldo insuficiente! Saque n�o realizado!"); }
		else
		{ saldo=saldo-v; }
		JOptionPane.showMessageDialog(null,"Saldo atual = R$ "+saldo);
	}
}
