package estudoCaso1;

import javax.swing.JOptionPane;

public class Clinica extends Pessoa
{
	//atributos comuns
	private String cnpj;
	private String razaoSocial;
	
	//atributo de refer�ncia para conex�o com banco de dados
	private DMClinica dmClinica;
	
	
	//m�todos de acesso
	public String getCnpj()
	{	return cnpj;	}
	
	public void setCnpj(String cnpj)
	{	this.cnpj = cnpj;	}
	
	public String getRazaoSocial()
	{	return razaoSocial;	}
	
	public void setRazaoSocial(String razaoSocial)
	{	this.razaoSocial = razaoSocial;	}
	
	//m�todo construtor
	public Clinica()
	{	nome = JOptionPane.showInputDialog("Informe o nome: ");
		email = JOptionPane.showInputDialog("Informe o email: ");
		cnpj = JOptionPane.showInputDialog("Informe o cnpj: ");
		razaoSocial = JOptionPane.showInputDialog("Informe a razao social: ");
		end = new Endereco();
		tel = new Telefone();		
	}
	
//	public Clinica(String nome,String email, String cnpj, String razaoSocial)
//	{ 	this.nome = nome;
//		this.email = email;
//		this.cnpj = cnpj;
//		this.razaoSocial = razaoSocial;
//		this.imprimirDados();
//	}
	
	//m�todo construtor2 - usado agora
	public Clinica(String nome,String email, String cnpj, String razaoSocial, Endereco objE, Telefone objT)
	{ 	dmClinica = new DMClinica();
    	dmClinica.conectaDataBase("aplicacao","root","root");//Fazer a Conexao com o BD
    	System.out.println("Conex�o feita � tabela Clinicas com sucesso!");
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.end = objE;
		this.tel = objT;
        incluir(this);
		this.imprimirDados();
	}
	
	//m�todo concreto
	public void imprimirDados()
	{	JOptionPane.showMessageDialog(null,"NOME: "+nome);
		JOptionPane.showMessageDialog(null,"EMAIL: "+email);
		JOptionPane.showMessageDialog(null,"CNPJ: "+cnpj);
		JOptionPane.showMessageDialog(null,"RAZ�O SOCIAL: "+razaoSocial);
		JOptionPane.showMessageDialog(null,"ENDERE�O COMPLETO: "+end.getRua()+", "+end.getNumero()+" - "+end.getComplemento()+" - "+end.getBairro()+" - "+end.getCidade()+"/"+end.getUf()+" - CEP: "+end.getCep());
		JOptionPane.showMessageDialog(null,"TELEFONE COMPLETO: +"+tel.getDdi()+" ("+tel.getDdd()+") "+tel.getNumero()+" - "+tel.getTipo()+" - "+tel.getOperadora());
	}
	
	
	//m�todos para incluir, consultar, excluir e alterar dados da tabela Clinicas do banco de dados
    public Object consultar()
    {   return dmClinica.consultar(this);   }
    
    public void incluir(Clinica objClinica)
    {   if (objClinica.getCnpj().equals(""))
        {   JOptionPane.showMessageDialog(null,"O CNPJ  do Clinica é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O CNPJ  da Clinica é obrigatório!");
        }
        else
        {   if (dmClinica.consultar(this)!= null)
            {   JOptionPane.showMessageDialog(null,"Cadastro de Clinica n�o realizado!\n J� existe um Clinica com este CNPJ!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Cadastro de Clinica n�o realizado! J� existe um Clinica com este CNPJ!"); 
            }
            else
            { System.out.println("entrei aqui");
            dmClinica.incluir(this); }
        }
    }   

    public void excluir(Clinica objClinica)
    {   if (objClinica.getCnpj().equals(""))
        {   JOptionPane.showMessageDialog(null,"O CNPJ do Clinica � obrigat�rio!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O CNPJ do Clinica � obrigat�rio!");
        }
        else
        {   if (dmClinica.consultar(this)!= null)
            { dmClinica.excluir(this); }
            else
            {   JOptionPane.showMessageDialog(null,"Exclus�o de Clinica n�o realizada!\n Este Clinica n�o existe!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Exclus�o de Clinica n�o realizada!\n Este Clinica n�o existe!");
            }
        }    
    }

    public void alterar()
    {   if (dmClinica.consultar(this)!= null)
        { dmClinica.alterar(this); }
        else
        {   JOptionPane.showMessageDialog(null,"Impossivel alterar este Clinica !");
            System.out.println("Impossivel alterar este Clinica !"); }
    }

    public Clinica pesquisar(Clinica objClinica)
    {   dmClinica.consultar(this);
        return objClinica;
    }

    public void shutDown()
    {   dmClinica.shutDown();   }	
}