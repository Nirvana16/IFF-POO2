package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Pedido;

public class DMPedido extends DMGeral{
	// ATRIBUTOS =======================================================================================
		String codigo = null;

		
	// METODO INCLUIR =======================================================================================
	    public void incluir(Object obj){
	    	Pedido objPedido = (Pedido) obj;
	        try{
	        	Statement statement = getConnection().createStatement();
	            String incluirSQL = "INSERT INTO pedidos VALUES ('" +
			            objPedido.getCodigo() + "', '" +
			            objPedido.getDataEntrega() + "', '" +
			            objPedido.getDataPedido() + "', '" +
			            objPedido.getFormaPG() + "', '" +
			            objPedido.getValorTotal() + "', '" +
			            objPedido.getProdCod() + "', '" +
			            objPedido.getProdPreco() + "', '" +
	                    objPedido.getProdQuantidade() + "')";
	            System.out.println("Enviando codigo SQL: " + getConnection().nativeSQL(incluirSQL) + "\n");
	            int result = statement.executeUpdate(incluirSQL);
	            if (result == 1){
	            	JOptionPane.showMessageDialog(null,"Pedido cadastrado corretamente !","Mensagem de Informacao",JOptionPane.INFORMATION_MESSAGE);
	            }
	            else{
	            	JOptionPane.showMessageDialog(null,"Erro ao cadastrar Pedido !","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
	            	objPedido.setCodigo("");    
	            	objPedido.setDataEntrega("");
	            	objPedido.setDataPedido("");
	                objPedido.setFormaPG("");
	                objPedido.setValorTotal(0);
	                objPedido.setProdCod("");
	                objPedido.setProdPreco(0);
	                objPedido.setProdQuantidade(0);
	            }
	            statement.close();
	        }
	        catch (SQLException e){
	        	System.out.println("Problemas com o SQL de inclusao de Pedido!"); 
	        }
	    }

	 //metodo consultar =======================================================================================
	    public Object consultar(Object obj){   
	    	Pedido objPedido = (Pedido) obj;
	        try{
	        	Statement statement = getConnection().createStatement();
	            String consultarSQL = "SELECT * FROM pedidos WHERE (codigo = '"+objPedido.getCodigo()+"')";
	            System.out.println("3) Classe [DMPedido] = Enviando codigo SQL: " + getConnection().nativeSQL(consultarSQL));
	            ResultSet result = statement.executeQuery(consultarSQL);
	            if (result.next())
	            {   System.out.println("Pedido existente !");
	                System.out.println("Pedido");
	                System.out.println("codigo.............: "+ result.getString("codigo"));
	                System.out.println("DataEntrega...............: "+ result.getString("dataEntrega"));
	                System.out.println("dataPedido................: "+ result.getString("dataPedido"));
	                System.out.println("formaPG...................: "+ result.getString("formaPG"));
	                System.out.println("valorTotal................: "+ result.getString("valorTotal"));
	                System.out.println("CodigoProduto............: "+ result.getString("prodCod"));
	                System.out.println("prodPreco................: "+ result.getString("prodPreco"));
	                System.out.println("prodQuantidade...........: "+ result.getString("prodQuantidade"));
	                result.close();
	            }
	            else
	            {   System.out.println( "Pedido nao encontrada !\n" );
	                objPedido = null;
	            }
	            statement.close();
	        }
	        catch (SQLException e)
	        { System.out.println("4) Classe [DMPedido] = Problemas com o SQL de consulta de Pedido !"); }
	        return objPedido;
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