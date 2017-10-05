package persistencia;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Admin;

public class DMAdmin extends DMGeral{
// ATRIBUTOS =======================================================================================
	String id = null;	
// METODO INCLUIR =======================================================================================
    public void incluir(Object obj){
    	Admin objAdmin = (Admin) obj;
        try{
        	Statement statement = getConnection().createStatement();
        	String incluirSQL = "INSERT INTO admins VALUES ('" +
		            objAdmin.getId() + "', '" +
		            objAdmin.getLogin() + "', '" +
		            objAdmin.getSenha() + "')";
            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
            int result = statement.executeUpdate(incluirSQL);
            if (result == 1){
            	JOptionPane.showMessageDialog(null,"ADMINSITRADOR cadastrado corretamente !","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            	JOptionPane.showMessageDialog(null,"Erro ao cadastrar ADMINSITRADOR !","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
            	objAdmin.setId("");    
            	objAdmin.setLogin("");
                objAdmin.setSenha("");
            }
            statement.close();
        }
        catch (SQLException e){
        	System.out.println("Problemas com o SQL de inclusao de Admin!"); 
        }
    }

 //metodo consultar =======================================================================================
    public Object consultar(Object obj){   
    	Admin objAdmin = (Admin) obj;
        try{
        	Statement statement = getConnection().createStatement();
            String consultarSQL = "SELECT * FROM admins WHERE (id = '"+objAdmin.getId()+"')";
            System.out.println("3) Classe [DMADMIN] = Enviando codigo SQL: " + getConnection().nativeSQL(consultarSQL));
            ResultSet result = statement.executeQuery(consultarSQL);
            if (result.next())
            {   System.out.println("Admin existente !");
                System.out.println("Admin");
                System.out.println("id.............: "+ result.getString("id"));
                System.out.println("Login...............: "+ result.getString("login"));
                System.out.println("Senha...............: "+ result.getString("senha"));       
                result.close();
            }
            else
            {   System.out.println( "Admin nao encontrado !\n" );
                objAdmin = null;
            }
            statement.close();
        }
        catch (SQLException e)
        { System.out.println("4) Classe [DMADMIN] = Problemas com o SQL de consulta de cliente !"); }
        return objAdmin;
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