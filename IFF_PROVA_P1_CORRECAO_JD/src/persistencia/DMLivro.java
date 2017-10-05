package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import modelo.Livro;

public class DMLivro extends DMGeral{
	String codigo = null;

	
	public void incluir(Object obj) {
		Livro objLivro = (Livro) obj;
		try{
			Statement statement = getConnection().createStatement();
			String incluirSQL = "INSERT INTO livros (" +
			                    "codigo,titulo,autor,editora,ano,status"+
								") VALUES ('" +
			        objLivro.getCodigo() + "', '" +
			        objLivro.getTitulo() + "', '" +
			        objLivro.getAutor() + "', '" +
			        objLivro.getEditora() + "', '" +                           
			        objLivro.getAno() + "', '" +
			        objLivro.getStatus() + "')";
			System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
            int result = statement.executeUpdate(incluirSQL);
            if (result == 1){
            	JOptionPane.showMessageDialog(null,"Livro cadastrado corretamente !","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            	JOptionPane.showMessageDialog(null,"Erro ao cadastrar LIVRO !","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
            	objLivro.setCodigo("");    
            	objLivro.setTitulo("");
                objLivro.setAutor("");
                objLivro.setEditora("");
                objLivro.setAno(0);
                objLivro.setStatus("");
            }
            statement.close();
        }
        catch (SQLException e){
        	System.out.println("Problemas com o SQL de inclusao de LIVRO!"); 
        }
	}

	@Override
	public Object consultar(Object obj)
    {   
    	Livro objLivro = (Livro) obj;
        try
        {   Statement statement = getConnection().createStatement();
            String consultarSQL = "SELECT * FROM livros WHERE (codigo = '"+objLivro.getCodigo()+"')"; //MUDOU AQUI tava pacientes
            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(consultarSQL));
            ResultSet result = statement.executeQuery(consultarSQL);
            if (result.next())
            {   System.out.println( "Livro existente !" );
                System.out.println("Livro");
                System.out.println("codigo.............: "+ result.getString("codigo"));
                System.out.println("Titulo...............: "+ result.getString("titulo"));
                System.out.println("autor...............: "+ result.getString("autor"));
                System.out.println("editora.: "+ result.getString("editora"));
                System.out.println("Ano...............: "+ result.getString("ano"));// faltouo isso aqui
                System.out.println("Status.: "+ result.getString("Status")); // faltouo isso aqui
                result.close();
            }
            else
            {   System.out.println( "Livro nao encontrado !\n" );
                objLivro = null;
            }
            statement.close();
        }
        catch (SQLException e)
        { System.out.println("Problemas com o SQL de consulta de cliente !"); }
        return objLivro;
	}
	public void excluir(Object obj)
	{   
	
	}
	
	//metodo alterar =======================================================================================
	public void alterar(Object obj)
	{  
		
	}
	
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