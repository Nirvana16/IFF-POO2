package estudoCaso1;

public abstract class Pessoa
{
	//atributos comuns
	protected String nome;
	protected String email;
	
	//atributos de refer�ncia
	protected Endereco end;
	protected Telefone tel;
	
	//m�todos de acesso comuns
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public String getEmail()
	{	return email;	}
	
	public void setEmail(String email)
	{	this.email = email;	}
	
	//m�todos de acesso de refer�ncia
	public Endereco getEnd()
	{	return end;	}
	
	public void setEnd(Endereco end)
	{	this.end = end;	}
	
	public Telefone getTel()
	{	return tel;	}
	
	public void setTel(Telefone tel)
	{	this.tel = tel;	}
	
	//m�todo abstrato
	public abstract void imprimirDados();
}