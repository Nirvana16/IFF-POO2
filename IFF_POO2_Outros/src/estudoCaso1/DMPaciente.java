package estudoCaso1;

//import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DMPaciente extends DMGeral
{
    String cpf = null;
    
/*    public DMPaciente()
      {   Toolkit tk = Toolkit.getDefaultToolkit();
        //Image img = tk.getImage(+"home.gif");
        //JOptionPane.getRootFrame().setIconImage(img);
    //}
*/    
      
    //m�todo incluir
    public void incluir(Object obj)
    {   Paciente objPaciente = (Paciente) obj;
        try
        {   Statement statement = getConnection().createStatement();
            String incluirSQL = "INSERT INTO pacientes (" +
                                "cpf,nome,email,dataNascimento,peso,altura,idade," +
                                "rua,numero,complemento,bairro,cidade,cep,uf," +
                                "ddi,ddd,telefone,tipo,operadora" +
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
                                objPaciente.getEnd().getUf() + "', '" +
                                objPaciente.getTel().getDdi() + "', '" +
                                objPaciente.getTel().getDdd() + "', '" +
                                objPaciente.getTel().getNumero() + "', '" +
                                objPaciente.getTel().getTipo() + "', '" +
                                objPaciente.getTel().getOperadora() + "')";
            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
            int result = statement.executeUpdate(incluirSQL);
            if (result == 1)
            {   JOptionPane.showMessageDialog(null,"Paciente cadastrado corretamente !","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);}
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
        { System.out.println("Problemas com o SQL de inclusao de paciente!"); }
    }

    //m�todo consultar
    public Object consultar(Object obj)
    {   
    	Paciente objPaciente = (Paciente) obj;
        try
        {   Statement statement = getConnection().createStatement();
            String consultarSQL = "SELECT * FROM pacientes WHERE (cpf = '"+objPaciente.getCpf()+"')";
            System.out.println("Enviando c�digo SQL: " + getConnection().nativeSQL(consultarSQL));
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
            {   System.out.println( "Paciente n�o encontrado !\n" );
                objPaciente = null;
            }
            statement.close();
        }
        catch (SQLException e)
        { System.out.println("Problemas com o SQL de consulta de cliente !"); }
        return objPaciente;
    }

    //m�todo excluir
    public void excluir(Object obj)
    {   
    	/*Cliente objCliente = (Cliente) obj;
        try
        {   Statement statement = getConnection().createStatement();
            String excluirSQL = "DELETE FROM clientes WHERE (nome = '"+objCliente.getNome()+"')";
            System.out.println("Enviando c�digo SQL: " + getConnection().nativeSQL(excluirSQL) + "\n");
            int result = statement.executeUpdate(excluirSQL);
            if (result == 1)
            {   JOptionPane.showMessageDialog(null,"Cliente exclu�do corretamente !","Mensagem de Informa��o",JOptionPane.INFORMATION_MESSAGE); }
            else
            {   System.out.println( "\nErro ao excluir cliente !\n" );
                objCliente.setNome("");
            }
           statement.close();
        }
        catch (SQLException e)
        { System.out.println("Problemas com o SQL de exclus�o do cliente !"); }
        */
    }

    //m�todo alterar
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
        { System.out.println("Problemas com o SQL de atualiza��o do cliente !"); }
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