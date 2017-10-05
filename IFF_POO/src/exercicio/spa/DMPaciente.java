package exercicio.spa;

//import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DMPaciente extends DMGeral
{
    String cpf = null;
    
    public DMPaciente()
    {   Toolkit tk = Toolkit.getDefaultToolkit();
	  //Image img = tk.getImage(+"home.gif");
	  //JOptionPane.getRootFrame().setIconImage(img);
    }

    
    //método que pega o valor do campo código de uma tabela 
    public String obterCpf(String nmTabela)
    {   try
	  {   Statement statement = getConnection().createStatement();
	      String consultarSQL = "select cpf as id from "+nmTabela;
	      System.out.println("Enviando código SQL: " + getConnection().nativeSQL(consultarSQL));
	      ResultSet result = statement.executeQuery(consultarSQL);
	      String teste;
	      if (result.next())
	      {   teste=String.valueOf(result.getInt(1));             
		  System.out.println( "\nCpf encontrado !" );
		  if (teste == null) 
		  {   cpf = "0"; }
		  else
		  {   cpf = teste;   }
		  result.close();
	      }
	      else
	      {   System.out.println( "\nErro!\n" );      }
	      statement.close();
	  }
	  catch (SQLException e)
	  { System.out.println("Problemas com o SQL de consulta!"); }
    
	  return cpf;
    }
    
    
    //método incluir
    public void incluir(Object obj)
    {   Paciente objPaciente = (Paciente) obj;
	  try
	  {   //int cod = obterCodigo("clientes");
	      //objCliente.setCodigo(this.gerarCodigo(cod));
	      //System.out.println("VALOR DO CODIGO="+objCliente.getCodigo());
	      Statement statement = getConnection().createStatement();
	      String incluirSQL = "INSERT INTO pacientes (" +
				  "cpf,nome,email,datanascimento,peso,altura,idade " +
				  "rua,numero,complemento,bairro,cidade,cep,uf " +
				  "ddi,ddd,telefone,tipo,operadora " +
				  ") VALUES ('" +
				  objPaciente.getCpf() + "', '" +
				  objPaciente.getNome() + "', '" +
				  objPaciente.getEmail() + "', '" +
				  objPaciente.getDataNascimento() + "', '" +
				  objPaciente.getPeso() + "', '" +                                 
				  objPaciente.getAltura() + "', '" +
				  objPaciente.getIdade() + "', '" +
				  objPaciente.getEnd().getRua() + "', '" +
				  objPaciente.getEnd().getNumero() + "', '" +
				  objPaciente.getEnd().getComplemento() + "', '" +
				  objPaciente.getEnd().getBairro() + "', '" +
				  objPaciente.getEnd().getCidade() + "', '" +
				  objPaciente.getEnd().getCep() + "', '" +
				  objPaciente.getEnd().getEstado() + "', '" +
				  objPaciente.getTel().getDdi() + "', '" +
				  objPaciente.getTel().getDdd() + "', '" +
				  objPaciente.getTel().getNumero() + "', '" +
				  objPaciente.getTel().getTipo() + "', '" +
				  objPaciente.getTel().getOperadora() + "')";
	      System.out.println("Enviando código SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
	      int result = statement.executeUpdate(incluirSQL);
	      if (result == 1)
	      {   JOptionPane.showMessageDialog(null,"Paciente cadastrado corretamente !","Mensagem de Informação",JOptionPane.INFORMATION_MESSAGE);}
	      else
	      {   JOptionPane.showMessageDialog(null,"Erro ao cadastrar cliente !","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
		  objPaciente.setCpf("");    
		  objPaciente.setNome("");
		  objPaciente.setEmail("");
		  objPaciente.setDataNascimento("");
		  objPaciente.setPeso(0);
		  objPaciente.setAltura(0);
		  objPaciente.setIdade(0);
		  objPaciente.setEnd(null);
		  objPaciente.setTel(null);
	      }
	      statement.close();
	  }
	  catch (SQLException e)
	  { System.out.println("Problemas com o SQL de inclusão de paciente!"); }
    }


    //método consultar
    public Object consultar(Object obj)
    {   
	  Paciente objPaciente = (Paciente) obj;
	  try
	  {   Statement statement = getConnection().createStatement();
	      String consultarSQL = "SELECT * FROM pacientes WHERE (cpf = '"+objPaciente.getCpf()+"')";
	      System.out.println("Enviando código SQL: " + getConnection().nativeSQL(consultarSQL));
	      ResultSet result = statement.executeQuery(consultarSQL);
	      if (result.next())
	      {   System.out.println( "Paciente existente !" );
		  System.out.println("Paciente");
		  System.out.println("Cpf.............: "+ result.getString("cpf"));
		  System.out.println("Nome...............: "+ result.getString("nome"));
		  System.out.println("Email...............: "+ result.getString("email"));
		  System.out.println("Data de Nascimento.: "+ result.getString("dataNascimento"));
		  result.close();
	      }
	      else
	      {   System.out.println( "Paciente não encontrado !\n" );
		  objPaciente = null;
	      }
	      statement.close();
	  }
	  catch (SQLException e)
	  { System.out.println("Problemas com o SQL de consulta de cliente !"); }
	  return objPaciente;
    }


    //método excluir
    public void excluir(Object obj)
    {   
	  /*Cliente objCliente = (Cliente) obj;
	  try
	  {   Statement statement = getConnection().createStatement();
	      String excluirSQL = "DELETE FROM clientes WHERE (nome = '"+objCliente.getNome()+"')";
	      System.out.println("Enviando código SQL: " + getConnection().nativeSQL(excluirSQL) + "\n");
	      int result = statement.executeUpdate(excluirSQL);
	      if (result == 1)
	      {   JOptionPane.showMessageDialog(null,"Cliente excluído corretamente !","Mensagem de Informação",JOptionPane.INFORMATION_MESSAGE); }
	      else
	      {   System.out.println( "\nErro ao excluir cliente !\n" );
		  objCliente.setNome("");
	      }
	    statement.close();
	  }
	  catch (SQLException e)
	  { System.out.println("Problemas com o SQL de exclusão do cliente !"); }
	  */
    }


    //método alterar
    public void alterar(Object obj)
    {   /*
	  Cliente objCliente = (Cliente) obj;
	  try
	  {   Statement statement = getConnection().createStatement();
	      String alterarSQL = "UPDATE clientes SET sexo = '"+objCliente.getSexo()+"' ,"+
				  "tipo = '"+objCliente.getTipo()+"' ,"+
				  "dtnasc = '"+objCliente.getDtNascimento()+"'"+
				  "email = '"+objCliente.getEmail()+"'"+
				  "WHERE (nome = '"+objCliente.getNome()+"')";
	      int result = statement.executeUpdate(alterarSQL);
	      if (result == 1)
	      { System.out.println( "Cliente alterado corretamente !"); }
	      else
	      {   System.out.println( "\nErro ao alterar cliente !\n" );
		  objCliente.setNome("");
	      }
	  }
	  catch (SQLException e)
	  { System.out.println("Problemas com o SQL de atualização do cliente !"); }
	  */
    }



    public void shutDown()
    {   try
	  { getConnection().close(); }
	  catch (SQLException sqlex)
	  {   System.err.println("Problemas ao desconectar !");
	      sqlex.printStackTrace();
	  }
    }




}