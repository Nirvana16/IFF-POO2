package revisao.ex15;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa {
	
	//attb
	
	private String cnpj, razaoSocial;


	
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


	public void inicializar() {
		// TODO Auto-generated method stub
		nome = JOptionPane.showInputDialog("Informe o seu nome");
		cnpj = JOptionPane.showInputDialog("Informe o seu CNPJ");
		razaoSocial = JOptionPane.showInputDialog("Informe a Razão Social");
		end = new Endereco();
		tel = new Telefone();
		
	}

	
	public void imprimir() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Nome : "+ nome);
		JOptionPane.showMessageDialog(null, "CNPJ : "+cnpj );
		JOptionPane.showMessageDialog(null, "RAZAO SOCIAL : "+razaoSocial );
		JOptionPane.showMessageDialog(null, "RUA : "+end.getRua() );
		JOptionPane.showMessageDialog(null, "NUMERO : "+end.getNumero() );
		JOptionPane.showMessageDialog(null, "COMPLEMENTO : "+end.getComplemento() );
		JOptionPane.showMessageDialog(null, "BAIRRO : "+end.getBairro() );
		JOptionPane.showMessageDialog(null, "CIDADE : "+end.getCidade() );
		JOptionPane.showMessageDialog(null, "CEP : "+ end.getCep());
		JOptionPane.showMessageDialog(null, "UF : "+ end.getEstado());
		JOptionPane.showMessageDialog(null, "DDI : "+ tel.getDdi());
		JOptionPane.showMessageDialog(null, "DDD : "+ tel.getDdd());
		JOptionPane.showMessageDialog(null, "NUMERO TEL : "+tel.getNumero() );
		JOptionPane.showMessageDialog(null, "TIPO : "+ tel.getTipo());
		JOptionPane.showMessageDialog(null, "OPERADORA : "+ tel.getOperadora());
				
	}	

}
