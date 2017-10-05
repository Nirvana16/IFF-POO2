package exercicio.spaV2S;

import javax.swing.JOptionPane;

public class Paciente extends Pessoa
{
	//atributos
	private String cpf;
	private String dataNascimento;
	private float peso;
	private float altura;
	private int idade;
	
	//métodos de acesso
	public String getCpf()
	{	return cpf;	}
	
	public void setCpf(String cpf)
	{	this.cpf = cpf;	}
	
	public String getDataNascimento()
	{	return dataNascimento;	}
	
	public void setDataNascimento(String dataNascimento)
	{	this.dataNascimento = dataNascimento;	}
	
	public float getPeso()
	{	return peso;	}
	
	public void setPeso(float peso)
	{	this.peso = peso;	}
	
	public float getAltura()
	{	return altura;	}
	
	public void setAltura(float altura)
	{	this.altura = altura;	}
	
	public int getIdade()
	{	return idade;	}
	
	public void setIdade(int idade)
	{	this.idade = idade;	}
	
	//métodos construtores
	public Paciente()
	{	nome = JOptionPane.showInputDialog("Informe o nome: ");
		email = JOptionPane.showInputDialog("Informe o email: ");
		cpf = JOptionPane.showInputDialog("Informe o cpf: ");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
		end = new Endereco();
		tel = new Telefone();	
	}
	
	public Paciente(String nome,String email, String cpf, String dataNascimento, float peso, float altura, int idade)
	{ 	this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}
	
	//métodos concretos
	public double calcularIMC()
	{	return peso/(Math.pow(altura,2));	}
	
	public void imprimirDados()
	{	
		
		JOptionPane.showMessageDialog(null,"DADOS PESSOAIS:\n\nNOME: "+nome+"\nEMAIL: "+email+"\nCPF: "+cpf+"\nDATA DE NASCIMENTO: "+dataNascimento+"\nPESO: "+peso+"\nALTURA: "+altura+"\nIDADE: "+idade);
		double imc = calcularIMC();
		JOptionPane.showMessageDialog(null,"IMC: "+imc);
		if(imc<18.5)
			JOptionPane.showMessageDialog(null,"Abaixo do peso!");
		else if(imc>=18.5 && imc<=24.9)
			JOptionPane.showMessageDialog(null,"Peso normal!");
		else if(imc>=25 && imc<=29.9)
			JOptionPane.showMessageDialog(null,"Sobrepeso!");
		else if(imc>=30 && imc<=34.9)
			JOptionPane.showMessageDialog(null,"Obesidade Grau I!");
		else if (imc>=35 && imc<=39.9)
			JOptionPane.showMessageDialog(null,"Obesidade Grau II");
		else	
			JOptionPane.showMessageDialog(null,"Obesidade Grau III");
	}
}