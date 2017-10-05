package estudoCaso1;


//import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DMClinica extends DMGeral
{
    String cnpj = null;
   

    public void incluir(Object obj)
    {   Clinica objClinica = (Clinica) obj;
        try
        {   Statement statement = getConnection().createStatement();
            String incluirSQL = "INSERT INTO clinicas (" +
                                "cnpj,nome,email,razaoSocial," +
                                "rua,numero,complemento,bairro,cidade,cep,uf," +
                                "ddi,ddd,telefone,tipo,operadora" +
                                ") VALUES ('" +
                                objClinica.getCnpj() + "', '" +
                                objClinica.getNome() + "', '" +
                                objClinica.getEmail() + "', '" +
                                objClinica.getRazaoSocial() + "', '" +
                                objClinica.getEnd().getRua() + "', '" +
                                objClinica.getEnd().getNumero() + "', '" +
                                objClinica.getEnd().getComplemento() + "', '" +
                                objClinica.getEnd().getBairro() + "', '" +
                                objClinica.getEnd().getCidade() + "', '" +
                                objClinica.getEnd().getCep() + "', '" +
                                objClinica.getEnd().getUf() + "', '" +
                                objClinica.getTel().getDdi() + "', '" +
                                objClinica.getTel().getDdd() + "', '" +
                                objClinica.getTel().getNumero() + "', '" +
                                objClinica.getTel().getTipo() + "', '" +
                                objClinica.getTel().getOperadora() + "')";
            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
            int result = statement.executeUpdate(incluirSQL);
            if (result == 1)
            {   JOptionPane.showMessageDialog(null,"Clinica cadastrada corretamente !","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);}
            else
            {   JOptionPane.showMessageDialog(null,"Erro ao cadastrar cliente !","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
            	objClinica.setCnpj("");    
            	objClinica.setNome("");
                objClinica.setEmail("");
                objClinica.setRazaoSocial("");
                objClinica.setEnd(null);
                objClinica.setTel(null);
            }
            statement.close();
        }
        catch (SQLException e)
        { System.out.println("Problemas com o SQL de inclusao de Clinica!"); }
    }

    //m�todo consultar
    public Object consultar(Object obj)
    {   
    	Clinica objClinica = (Clinica) obj;
        try
        {   Statement statement = getConnection().createStatement();
            String consultarSQL = "SELECT * FROM Clinicas WHERE (cnpj = '"+objClinica.getCnpj()+"')";
            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(consultarSQL));
            ResultSet result = statement.executeQuery(consultarSQL);
            if (result.next())
            {   System.out.println( "Clinica existente !" );
                System.out.println("Clinica");
                System.out.println("CNPJ.............: "+ result.getString("cnpj"));
                System.out.println("Nome...............: "+ result.getString("nome"));
                System.out.println("Email...............: "+ result.getString("email"));
                System.out.println("Razão Social "+ result.getString("razaoSocial"));
                result.close();
            }
            else
            {   System.out.println( "Clinica nao encontrado !\n" );
                objClinica = null;
            }
            statement.close();
        }
        catch (SQLException e)
        { System.out.println("Problemas com o SQL de consulta de cliente !"); }
        return objClinica;
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
