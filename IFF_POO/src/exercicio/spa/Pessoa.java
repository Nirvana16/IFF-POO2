package exercicio.spa;

public abstract class Pessoa {
	//Att Comuns
	protected String nome,
					 email;
	// Att relacionamento entre classes
	protected Endereco end;
	protected Telefone tel;
	
	

	//Metodos de Acesso
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public Telefone getTel() {
		return tel;
	}
	public void setTel(Telefone tel) {
		this.tel = tel;
	}
	
	//Metodos Abstratos
	public abstract void imprimirDados();
	
	

}
