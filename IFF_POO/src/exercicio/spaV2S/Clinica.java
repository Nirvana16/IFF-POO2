package exercicio.spaV2S;

import javax.swing.JOptionPane;

public class Clinica extends Pessoa
{
	//atributos
	private String cnpj;
	private String razaoSocial;
	
	//métodos de acesso
	public String getCnpj()
	{	return cnpj;	}
	
	public void setCnpj(String cnpj)
	{	this.cnpj = cnpj;	}
	
	public String getRazaoSocial()
	{	return razaoSocial;	}
	
	public void setRazaoSocial(String razaoSocial)
	{	this.razaoSocial = razaoSocial;	}
	
	//método construtor
	Clinica()
	{	nome = JOptionPane.showInputDialog("Informe o nome: ");
		email = JOptionPane.showInputDialog("Informe o email: ");
		cnpj = JOptionPane.showInputDialog("Informe o cnpj: ");
		razaoSocial = JOptionPane.showInputDialog("Informe a razão social: ");
		end = new Endereco();
		tel = new Telefone();		
	}
	
	//método concreto
	public void imprimirDados()
	{	JOptionPane.showMessageDialog(null,"NOME: "+nome);
		JOptionPane.showMessageDialog(null,"EMAIL: "+email);
		JOptionPane.showMessageDialog(null,"CNPJ: "+cnpj);
		JOptionPane.showMessageDialog(null,"RAZÃO SOCIAL: "+razaoSocial);
		JOptionPane.showMessageDialog(null,"ENDEREÇO COMPLETO: "+end.getRua()+", "+end.getNumero()+" - "+end.getComplemento()+" - "+end.getBairro()+" - "+end.getCidade()+"/"+end.getUf()+" - CEP: "+end.getCep());
		JOptionPane.showMessageDialog(null,"TELEFONE COMPLETO: +"+tel.getDdi()+" ("+tel.getDdd()+") "+tel.getNumero()+" - "+tel.getTipo()+" - "+tel.getOperadora());
	}
}