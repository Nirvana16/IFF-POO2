package questao15;

import javax.swing.JOptionPane;

public class Endereco
{
	//atributos
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	
	//métodos de acesso
	public String getRua()
	{	return rua;	}
	
	public void setRua(String rua)
	{	this.rua = rua;	}
	
	public String getNumero()
	{	return numero;	}
	
	public void setNumero(String numero)
	{	this.numero = numero;	}
	
	public String getComplemento()
	{	return complemento;	}
	
	public void setComplemento(String complemento)
	{	this.complemento = complemento;	}
	
	public String getBairro() 
	{	return bairro;	}
	
	public void setBairro(String bairro)
	{	this.bairro = bairro;	}
	
	public String getCidade()
	{	return cidade;	}
	
	public void setCidade(String cidade)
	{	this.cidade = cidade;	}
	
	public String getCep()
	{	return cep;	}
	
	public void setCep(String cep)
	{	this.cep = cep;	}
	
	public String getUf()
	{	return uf;	}
	
	public void setUf(String uf)
	{	this.uf = uf;	}
	
	//método construtor
	public Endereco()
	{	rua = JOptionPane.showInputDialog("Informe a rua: ");
		numero = JOptionPane.showInputDialog("Informe o número: ");
		complemento = JOptionPane.showInputDialog("Informe o complemento: ");
		bairro = JOptionPane.showInputDialog("Informe o bairro: ");
		cidade = JOptionPane.showInputDialog("Informe a cidade: ");
		cep = JOptionPane.showInputDialog("Informe o cep: ");
		uf = JOptionPane.showInputDialog("Informe o estado: ");
	}
}