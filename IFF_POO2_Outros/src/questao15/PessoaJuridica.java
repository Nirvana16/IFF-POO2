package questao15;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa
{
	//atributos
	private String cnpj;
	private String razaoSocial;
	
	//m�todos de acesso
	public String getCnpj()
	{	return cnpj;	}

	public void setCnpj(String cnpj)
	{	this.cnpj = cnpj;	}

	public String getRazaoSocial()
	{	return razaoSocial;	}

	public void setRazaoSocial(String razaoSocial)
	{	this.razaoSocial = razaoSocial;	}

	//opera��es e m�todos concretos
	public void inicializar()
	{	nome = JOptionPane.showInputDialog("Informe o nome: ");
		cnpj = JOptionPane.showInputDialog("Informe o cnpj: ");
		razaoSocial = JOptionPane.showInputDialog("Informe a raz�o social: ");
		end = new Endereco();
		tel = new Telefone();		
	}

	public void imprimir()
	{	JOptionPane.showMessageDialog(null,"NOME: "+nome);
		JOptionPane.showMessageDialog(null,"CNPJ: "+cnpj);
		JOptionPane.showMessageDialog(null,"RAZ�O SOCIAL: "+razaoSocial);
		JOptionPane.showMessageDialog(null,"RUA: "+end.getRua());
		JOptionPane.showMessageDialog(null,"N�MERO: "+end.getNumero());
		JOptionPane.showMessageDialog(null,"COMPLEMENTO: "+end.getComplemento());
		JOptionPane.showMessageDialog(null,"BAIRRO: "+end.getBairro());
		JOptionPane.showMessageDialog(null,"CIDADE: "+end.getCidade());
		JOptionPane.showMessageDialog(null,"CEP: "+end.getCep());
		JOptionPane.showMessageDialog(null,"UF: "+end.getUf());
		JOptionPane.showMessageDialog(null,"DDI: "+tel.getDdi());
		JOptionPane.showMessageDialog(null,"DDD: "+tel.getDdd());
		JOptionPane.showMessageDialog(null,"N�MERO: "+tel.getNumero());
		JOptionPane.showMessageDialog(null,"TIPO: "+tel.getTipo());
		JOptionPane.showMessageDialog(null,"OPERADORA: "+tel.getOperadora());
	}
}
