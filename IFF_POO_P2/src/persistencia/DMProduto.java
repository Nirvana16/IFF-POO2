package persistencia;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Produto;

public class DMProduto extends DMGeral{
// ATRIBUTOS =======================================================================================
	String codigo = null;

	
// METODO INCLUIR =======================================================================================
    public void incluir(Object obj){
    	Produto objProduto = (Produto) obj;
        try{
        	Statement statement = getConnection().createStatement();
            String incluirSQL = "INSERT INTO produtos VALUES ('" +
		            objProduto.getCodigo() + "', '" +
		            objProduto.getDescricao() + "', '" +
		            objProduto.getTipo() + "', '" +
		            objProduto.getValidade() + "', '" +
		            objProduto.getPeso() + "', '" +                           
		            objProduto.getPreco() + "', '" +
                    objProduto.getQuantidade() + "')";
            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
            int result = statement.executeUpdate(incluirSQL);
            if (result == 1){
            	JOptionPane.showMessageDialog(null,"Produto cadastrado corretamente !","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            	JOptionPane.showMessageDialog(null,"Erro ao cadastrar Produto !","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
            	objProduto.setCodigo("");    
            	objProduto.setDescricao("");
            	objProduto.setTipo("");
                objProduto.setValidade("");
                objProduto.setPeso(0);
                objProduto.setPreco(0);
                objProduto.setQuantidade(0);
            }
            statement.close();
        }
        catch (SQLException e){
        	System.out.println("Problemas com o SQL de inclusao de Produto!"); 
        }
    }

 //metodo consultar =======================================================================================
    public Object consultar(Object obj){   
    	Produto objProduto = (Produto) obj;
        try{
        	Statement statement = getConnection().createStatement();
            String consultarSQL = "SELECT * FROM produtos WHERE (codigo = '"+objProduto.getCodigo()+"')";
            System.out.println("3) Classe [DMProduto] = Enviando codigo SQL: " + getConnection().nativeSQL(consultarSQL));
            ResultSet result = statement.executeQuery(consultarSQL);
            if (result.next())
            {   System.out.println("Produto existente !");
                System.out.println("Produto");
                System.out.println("codigo.............: "+ result.getString("codigo"));
                System.out.println("descricao...............: "+ result.getString("descricao"));
                System.out.println("tipo...............: "+ result.getString("tipo"));
                System.out.println("validade...............: "+ result.getString("validade"));
                result.close();
            }
            else
            {   System.out.println( "Produto nao encontrada !\n" );
                objProduto = null;
            }
            statement.close();
        }
        catch (SQLException e)
        { System.out.println("4) Classe [DMProduto] = Problemas com o SQL de consulta de Produto !"); }
        return objProduto;
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