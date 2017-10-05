package questao15;

public abstract class Pessoa
{	
	//atributos
	protected String nome;
	
	//atributos de refer�ncia (relacionamento entre classes)
	protected Endereco end;
	protected Telefone tel;
	
	//m�todos de acesso
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public Endereco getEnd()
	{	return end;	}
	
	public void setEnd(Endereco end)
	{	this.end = end;	}
	
	public Telefone getTel()
	{	return tel;	}
	
	public void setTel(Telefone tel)
	{	this.tel = tel;	}
	
	//m�todos abstratos
	public abstract void inicializar();
	
	public abstract void imprimir();
}