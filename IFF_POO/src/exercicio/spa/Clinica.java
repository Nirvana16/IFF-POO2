package exercicio.spa;

import javax.swing.JOptionPane;

public class Clinica extends Pessoa {
	
	private String cnpj,
				   razaoSocial;

	// Metodos de Acesso
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	Clinica (){
		nome = JOptionPane.showInputDialog("Informe o seu nome");
		cnpj = JOptionPane.showInputDialog("Informe o seu CNPJ");
		razaoSocial = JOptionPane.showInputDialog("Informe a Razão Social");
		end = new Endereco();
		tel = new Telefone();
	}
	Clinica(String nome, String cnpj, String razaoSocial){
		this.nome = nome;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		
	}
	
	
	
	public void imprimirDados(){
		JOptionPane.showMessageDialog(null, "Nome: " + getNome() +
				  "\n Email: " + getEmail() +
				  "\n CNPJ: " + getCnpj() +
				  "\n Razao Social: " + getRazaoSocial() +
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
				  "\n -------------------------------");

	}
	

}
