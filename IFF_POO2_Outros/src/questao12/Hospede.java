package questao12;

import javax.swing.JOptionPane;

public class Hospede
{	
	//atributos comuns
	private String cpf;
	private String nome;
	private int numeroDiarias;
	
	//métodos de acesso
	public String getCpf()
	{	return cpf;	}
	
	public void setCpf(String cpf)
	{	this.cpf = cpf;	}
	
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public int getNumeroDiarias()
	{	return numeroDiarias;	}
	
	public void setNumeroDiarias(int numeroDiarias)
	{	this.numeroDiarias = numeroDiarias;	}
	
	//operações ou métodos concretos
	public void inicializar()
	{	cpf = JOptionPane.showInputDialog("Informe o cpf: ");
		nome = JOptionPane.showInputDialog("Informe o nome: ");
		numeroDiarias = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de diárias: "));	
	}
	
	public float calcularDespesa()
	{	float taxa;
		if (numeroDiarias<5)
			taxa=30;
		else 
			if (numeroDiarias==5)
				taxa=20;
			else 
				taxa=10;
		return(numeroDiarias*(300+taxa));
	}
	
	public void imprimirConta()
	{	JOptionPane.showMessageDialog(null,"CPF = "+cpf);
		JOptionPane.showMessageDialog(null,"NOME = "+nome);
		JOptionPane.showMessageDialog(null,"NÚMERO DE DIÁRIAS = "+numeroDiarias);
		JOptionPane.showMessageDialog(null,"DESPESA = R$ "+calcularDespesa());	
	}
	
	
	

}
