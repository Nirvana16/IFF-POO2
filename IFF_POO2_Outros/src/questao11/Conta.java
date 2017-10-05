package questao11;

import javax.swing.JOptionPane;

public class Conta
{
	//atributos comuns
	private double saldo;
	private String nome;
	
	//métodos de acesso
	public double getSaldo()
	{	return saldo;	}
	
	public void setSaldo(double saldo)
	{	this.saldo = saldo;	}
	
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	//métodos construtores
	public Conta(String n)
	{	nome = n;
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta: "));
	}
	
	public Conta(String n, double v)
	{	nome = n;
		saldo = v;		
	}
	
	//métodos concretos
	public void depositar(double v)
	{	saldo = saldo + v;
		JOptionPane.showMessageDialog(null,"Novo saldo atual = R$ "+saldo);
	}

	public void sacar(double v)
	{	if(v>saldo)
		{ JOptionPane.showMessageDialog(null,"Saldo insuficiente! Saque não realizado!"); }
		else
		{ saldo=saldo-v; }
		JOptionPane.showMessageDialog(null,"Saldo atual = R$ "+saldo);
	}
}
