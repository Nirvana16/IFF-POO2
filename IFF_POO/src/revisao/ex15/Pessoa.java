package revisao.ex15;

public abstract class Pessoa {
	
	// attd comuns
	protected String nome;
	
	// attb de referencia relacionamento entre classes
	protected Endereco end;
	protected Telefone tel;
	
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	// Metodos Abstratos
	public abstract void inicializar();
	public abstract void imprimir();
}
