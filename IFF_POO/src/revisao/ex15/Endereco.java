package revisao.ex15;

import javax.swing.JOptionPane;

public class Endereco {
	private String rua, numero, complemento,
			bairro, cidade, cep, uf;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return uf;
	}

	public void setEstado(String uf) {
		this.uf = uf;
	}
	
	//metodo construtor
	public Endereco(){
		rua = JOptionPane.showInputDialog("Informe a rua");
		numero = JOptionPane.showInputDialog("Informe numero");
		complemento = JOptionPane.showInputDialog("Informe o complemento");
		bairro = JOptionPane.showInputDialog("Informe o bairro");
		cidade = JOptionPane.showInputDialog("Informe a cidade");
		cep = JOptionPane.showInputDialog("Informe o CEP");
		uf = JOptionPane.showInputDialog("Informe o Estado");
	}
	

}
