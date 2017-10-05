package questao15;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa
{
	//atributos
	private String cpf;
	private String dataNascimento;
	
	//métodos de acesso
	public String getCpf()
	{	return cpf;	}
	
	public void setCpf(String cpf)
	{	this.cpf = cpf;	}
	
	public String getDataNascimento()
	{	return dataNascimento; }
	
	public void setDataNascimento(String dataNascimento)
	{	this.dataNascimento = dataNascimento;	}

	public void inicializar()
	{	nome = JOptionPane.showInputDialog("Informe o nome: ");
		cpf = JOptionPane.showInputDialog("Informe o cpf: ");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		end = new Endereco();
		tel = new Telefone();		
	}

	public void imprimir()
	{	JOptionPane.showMessageDialog(null,"NOME: "+nome);
		JOptionPane.showMessageDialog(null,"CPF: "+cpf);
		JOptionPane.showMessageDialog(null,"DATA DE NASCIMENTO: "+dataNascimento);
		JOptionPane.showMessageDialog(null,"RUA: "+end.getRua());
		JOptionPane.showMessageDialog(null,"NÚMERO: "+end.getNumero());
		JOptionPane.showMessageDialog(null,"COMPLEMENTO: "+end.getComplemento());
		JOptionPane.showMessageDialog(null,"BAIRRO: "+end.getBairro());
		JOptionPane.showMessageDialog(null,"CIDADE: "+end.getCidade());
		JOptionPane.showMessageDialog(null,"CEP: "+end.getCep());
		JOptionPane.showMessageDialog(null,"UF: "+end.getUf());
		JOptionPane.showMessageDialog(null,"DDI: "+tel.getDdi());
		JOptionPane.showMessageDialog(null,"DDD: "+tel.getDdd());
		JOptionPane.showMessageDialog(null,"NÚMERO: "+tel.getNumero());
		JOptionPane.showMessageDialog(null,"TIPO: "+tel.getTipo());
		JOptionPane.showMessageDialog(null,"OPERADORA: "+tel.getOperadora());
	}
}