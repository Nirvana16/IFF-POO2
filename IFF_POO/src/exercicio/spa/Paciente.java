package exercicio.spa;

import javax.swing.JOptionPane;

public class Paciente extends Pessoa {
	
	
	// atributos
	private String cpf, 
				   dataNascimento; 
				   //idade;
	private Float  peso,
				   altura;
	private int idade;
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/*	
 	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	*/
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Float getPeso() {
		return peso;
	}
	public void setPeso(float i) {
		this.peso = i;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(float i) {
		this.altura = i;
	}
	Paciente(){
		nome = JOptionPane.showInputDialog("Informe o nome do Paciente");
		email = JOptionPane.showInputDialog("Informe o email do Paciente");
		cpf = JOptionPane.showInputDialog("Informe o CPF");
		dataNascimento = JOptionPane.showInputDialog("Informe a Data de nascimento");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o Peso"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a Altura"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade"));
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
	
	
	public double calcularIMC(){
		double imc = peso/(Math.pow(altura, 2));
	return imc;
	}
	
	public void imprimirDados() {
		double valorIMC = calcularIMC();
		String categoria;
		if (valorIMC >= 40.0)
			categoria = "Obesidade Grau III";
		else 
			if (valorIMC <= 39.9 && valorIMC >= 35.0)
				categoria = "Obesidade Grau II";
			else
				if (valorIMC <= 34.9 && valorIMC >= 30.0)
					categoria = "Obesidade Grau I";
				else
					if (valorIMC <= 29.9 && valorIMC >= 25.0)
						categoria = "Sobre Peso";
					else
						if (valorIMC <= 24.9 && valorIMC >= 18.5)
							categoria = "Peso Normal";
						else
							categoria = "Abaixo do Peso";
						
		
		JOptionPane.showMessageDialog(null, "Nome: " + getNome() +
									  "\n Email: " + getEmail() +
									  "\n CPF: " + getCpf() +
									  "\n Data Nascimento: " + getDataNascimento() +
									  "\n Peso: " + getPeso() +
									  "\n Altura: " + getAltura() +
									  "\n Idade: " + getIdade() +
									  "\n -------------------------------"+
									  "\n Rua: " + end.getRua() +
									  "\n Numero " + end.getNumero() +
									  "\n Complemento " + end.getComplemento() +
									  "\n Bairro " + end.getBairro() +
									  "\n Cidade " + end.getCidade() +
									  "\n CEP " + end.getCep()+
									  "\n Estado " + end.getEstado() +
									  "\n -------------------------------"+
									  "\n DDI " + tel.getDdi() +
									  "\n DDD " + tel.getDdd()+
									  "\n Tel " + tel.getNumero() +
									  "\n Tipo " + tel.getTipo() +
									  "\n Operadora " + tel.getOperadora() +
									  "\n -------------------------------"+
									  "\n IMC: " + valorIMC +
									  "\n : " + categoria);
		
	}	
}
