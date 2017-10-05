package revisao.ex15;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {
	
	//attb
	
	private String cpf, dataNascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	public void inicializar() {
		// TODO Auto-generated method stub
		nome = JOptionPane.showInputDialog("Informe o seu nome");
		cpf = JOptionPane.showInputDialog("Informe o seu CPF");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento");
		end = new Endereco();
		tel = new Telefone();
		
	}

	
	public void imprimir() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Nome : "+ nome);
		JOptionPane.showMessageDialog(null, "CPF : "+cpf );
		JOptionPane.showMessageDialog(null, "DATA NASC : "+dataNascimento );
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
