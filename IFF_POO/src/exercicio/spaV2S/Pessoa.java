package exercicio.spaV2S;

public abstract class Pessoa
{
	//atributos comuns
	protected String nome;
	protected String email;
	
	//atributos de referência
	protected Endereco end;
	protected Telefone tel;
	
	//métodos de acesso comuns
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public String getEmail()
	{	return email;	}
	
	public void setEmail(String email)
	{	this.email = email;	}
	
	//métodos de acesso de referência
	public Endereco getEnd()
	{	return end;	}
	
	public void setEnd(Endereco end)
	{	this.end = end;	}
	
	public Telefone getTel()
	{	return tel;	}
	
	public void setTel(Telefone tel)
	{	this.tel = tel;	}
	
	//método abstrato
	public abstract void imprimirDados();
}