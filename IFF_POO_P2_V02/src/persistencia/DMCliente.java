package persistencia;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Cliente;

public class DMCliente extends DMGeral{
// ATRIBUTOS =======================================================================================
	String cpf = null;

	
// METODO INCLUIR =======================================================================================
    public void incluir(Object obj){
    	Cliente objCliente = (Cliente) obj;
        try{
        	Statement statement = getConnection().createStatement();
            String incluirSQL = "INSERT INTO clientes VALUES ('" +
		            objCliente.getCpf() + "', '" +
		            objCliente.getNome() + "', '" +
		            objCliente.getTelefone() + "', '" +
		            objCliente.getEndereco() + "', '" +                           
		            objCliente.getCep() + "', '" +
                    objCliente.getEmail() + "')";
            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
            int result = statement.executeUpdate(incluirSQL);
            if (result == 1){
            	JOptionPane.showMessageDialog(null,"Cliente cadastrado corretamente !","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            	JOptionPane.showMessageDialog(null,"Erro ao cadastrar Cliente !","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
            	objCliente.setCpf("");    
            	objCliente.setNome("");
                objCliente.setTelefone("");
                objCliente.setEndereco("");
                objCliente.setCep("");
                objCliente.setEmail("");
            }
            statement.close();
        }
        catch (SQLException e){
        	System.out.println("Problemas com o SQL de inclusao de Cliente!"); 
        }
    }

 //metodo consultar =======================================================================================
    public Object consultar(Object obj){   
    	Cliente objCliente = (Cliente) obj;
        try{
        	Statement statement = getConnection().createStatement();
            String consultarSQL = "SELECT * FROM clientes WHERE (cpf = '"+objCliente.getCpf()+"')";
            System.out.println("3) Classe [DMCLIENTE] = Enviando codigo SQL: " + getConnection().nativeSQL(consultarSQL));
            ResultSet result = statement.executeQuery(consultarSQL);
            if (result.next())
            {   System.out.println("Cliente existente !");
                System.out.println("Cliente");
                System.out.println("cpf.............: "+ result.getString("cpf"));
                System.out.println("Nome...............: "+ result.getString("nome"));
                System.out.println("Telefone...............: "+ result.getString("telefone"));
                System.out.println("Endereco...............: "+ result.getString("endereco"));
                System.out.println("Cep...............: "+ result.getString("cep"));
                System.out.println("Email...............: "+ result.getString("email"));
                result.close();
            }
            else
            {   System.out.println( "Cliente nao encontrada !\n" );
                objCliente = null;
            }
            statement.close();
        }
        catch (SQLException e)
        { System.out.println("4) Classe [DMCLIENTE] = Problemas com o SQL de consulta de cliente !"); }
        return objCliente;
    }

//metodo excluir =======================================================================================
    public void excluir(Object obj){}
//metodo alterar =======================================================================================
    public void alterar(Object obj){}
    
    public void shutDown(){
        try{
            getConnection().close();
        }
        catch (SQLException sqlex){
            System.err.println("Problemas ao desconectar !");
            sqlex.printStackTrace();
        }
    }
}