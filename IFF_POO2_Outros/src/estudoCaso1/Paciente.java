package estudoCaso1;

import javax.swing.JOptionPane;

public class Paciente extends Pessoa
{
	//atributos comuns
	private String cpf;
	private String dataNascimento;
	private float peso;
	private float altura;
	private int idade;
	
	//atributo de refer�ncia para conex�o com banco de dados
	private DMPaciente dmPaciente;
	
	//m�todos de acesso
	public String getCpf()
	{	return cpf;	}
	
	public void setCpf(String cpf)
	{	this.cpf = cpf;	}
	
	public String getDataNascimento()
	{	return dataNascimento;	}
	
	public void setDataNascimento(String dataNascimento)
	{	this.dataNascimento = dataNascimento;	}
	
	public float getPeso()
	{	return peso;	}
	
	public void setPeso(float peso)
	{	this.peso = peso;	}
	
	public float getAltura()
	{	return altura;	}
	
	public void setAltura(float altura)
	{	this.altura = altura;	}
	
	public int getIdade()
	{	return idade;	}
	
	public void setIdade(int idade)
	{	this.idade = idade;	}
	
	//m�todos construtores
	//m�todo construtor1 - usado na primeira fase
	public Paciente()
	{	nome = JOptionPane.showInputDialog("Informe o nome: ");
		email = JOptionPane.showInputDialog("Informe o email: ");
		cpf = JOptionPane.showInputDialog("Informe o cpf: ");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
		end = new Endereco();
		tel = new Telefone();		
	}
	
	//m�todo construtor2 - usado agora
	public Paciente(String nome,String email, String cpf, String dataNascimento, float peso, float altura, int idade, Endereco objE, Telefone objT)
	{ 	dmPaciente = new DMPaciente();
    	dmPaciente.conectaDataBase("aplicacao","root","root");//Fazer a Conexao com o BD
    	System.out.println("Conex�o feita � tabela Pacientes com sucesso!");
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.end = objE;
		this.tel = objT;
        incluir(this);
		this.imprimirDados();
	}
	
	//m�todos concretos
	public double calcularIMC()
	{	return peso/(Math.pow(altura,2));	}
	
	public void imprimirDados()
	{	JOptionPane.showMessageDialog(null,"NOME: "+nome);
		JOptionPane.showMessageDialog(null,"EMAIL: "+email);
		JOptionPane.showMessageDialog(null,"CPF: "+cpf);
		JOptionPane.showMessageDialog(null,"DATA DE NASCIMENTO: "+dataNascimento);
		JOptionPane.showMessageDialog(null,"PESO: "+peso);
		JOptionPane.showMessageDialog(null,"ALTURA: "+altura);
		JOptionPane.showMessageDialog(null,"IDADE: "+idade);
		JOptionPane.showMessageDialog(null,"ENDERE�O COMPLETO: "+end.getRua()+", "+end.getNumero()+" - "+end.getComplemento()+" - "+end.getBairro()+" - "+end.getCidade()+"/"+end.getUf()+" - CEP: "+end.getCep());
		JOptionPane.showMessageDialog(null,"TELEFONE COMPLETO: +"+tel.getDdi()+" ("+tel.getDdd()+") "+tel.getNumero()+" - "+tel.getTipo()+" - "+tel.getOperadora());
		double imc = calcularIMC();
		JOptionPane.showMessageDialog(null,"IMC: "+imc);
		if(imc<18.5)
			JOptionPane.showMessageDialog(null,"Abaixo do peso!");
		else if(imc>=18.5 && imc<=24.9)
				JOptionPane.showMessageDialog(null,"Peso normal!");
			 else if(imc>=25 && imc<=29.9)
					JOptionPane.showMessageDialog(null,"Sobrepeso!");
			  	  else if(imc>=30 && imc<=34.9)
						JOptionPane.showMessageDialog(null,"Obesidade Grau I!");
					   else if (imc>=35 && imc<=39.9)
							JOptionPane.showMessageDialog(null,"Obesidade Grau II");
						    else	
							JOptionPane.showMessageDialog(null,"Obesidade Grau III");
	}
		
    //m�todos para incluir, consultar, excluir e alterar dados da tabela pacientes do banco de dados
    public Object consultar()
    {   return dmPaciente.consultar(this);   }
    
    public void incluir(Paciente objPaciente)
    {   if (objPaciente.getCpf().equals(""))
        {   JOptionPane.showMessageDialog(null,"O cpf do paciente é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O cpf do paciente é obrigatório!");
        }
        else
        {   if (dmPaciente.consultar(this)!= null)
            {   JOptionPane.showMessageDialog(null,"Cadastro de paciente n�o realizado!\n J� existe um paciente com este cpf!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Cadastro de paciente n�o realizado! J� existe um paciente com este cpf!"); 
            }
            else
            { System.out.println("entrei aqui");
            dmPaciente.incluir(this); }
        }
    }   

    public void excluir(Paciente objPaciente)
    {   if (objPaciente.getCpf().equals(""))
        {   JOptionPane.showMessageDialog(null,"O cpf do paciente � obrigat�rio!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O cpf do paciente � obrigat�rio!");
        }
        else
        {   if (dmPaciente.consultar(this)!= null)
            { dmPaciente.excluir(this); }
            else
            {   JOptionPane.showMessageDialog(null,"Exclus�o de paciente n�o realizada!\n Este paciente n�o existe!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Exclus�o de paciente n�o realizada!\n Este paciente n�o existe!");
            }
        }    
    }

    public void alterar()
    {   if (dmPaciente.consultar(this)!= null)
        { dmPaciente.alterar(this); }
        else
        {   JOptionPane.showMessageDialog(null,"Impossivel alterar este paciente !");
            System.out.println("Impossivel alterar este paciente !"); }
    }

    public Paciente pesquisar(Paciente objPaciente)
    {   dmPaciente.consultar(this);
        return objPaciente;
    }

    public void shutDown()
    {   dmPaciente.shutDown();   }	
}