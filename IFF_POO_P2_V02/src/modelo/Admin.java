package modelo;

import javax.swing.JOptionPane;

import persistencia.DMAdmin;

public class Admin {
    //Atributos =================================================================================
    private String id, login, senha;
    
    // Referencia=================================================================================
    private DMAdmin dmAdmin;

    // Get e Set =================================================================================
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	// Metodos -=================================================================================
    public Admin(String id, String login, String senha){
        dmAdmin = new DMAdmin();
        dmAdmin.conectaDataBase("confeitaria","root","root");
        System.out.println("1) Classe [Cliente] = Conexao feita a CLIENTES com sucesso!");
        
        this.id = id;
        this.login = login;
        this.senha = senha;
        incluir(this);
    }
  
    
    //Consultar:=================================================================================
    public Object consultar(){
        return dmAdmin.consultar(this);
    }    
    // INCLUIR =================================================================================
    public void incluir(Admin objCliente){
        if (objCliente.getId().equals("")){
            JOptionPane.showMessageDialog(null,"O ID é obrigatório","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("2) Classe [Cliente] =  O ID é obrigatório");
        }else{
            if (dmAdmin.consultar(this)!= null){
                JOptionPane.showMessageDialog(null, "Cadastro do Cliente não realizado\n"
                                                    + "Já existe um cliente com este ID",
                                                    "Messagem de Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println("5) Classe [Cliente] = Cadastro de Cliente  nao realizado! Verifique no banco se existe a tabela correta!\nConferir Nome");
                System.out.println("6) Classe [Cliente] = Cadastro de Cliente  nao realizado! Ja existe um CLIENTE com este ID!");                
            }else{
                System.out.println("entrei aqui");
            	dmAdmin.incluir(this);
            }
        }
    }
    //Excluir =================================================================================
    public void excluir(Admin objCliente)
    {   if (objCliente.getId().equals(""))
        {   JOptionPane.showMessageDialog(null,"O ID da Cliente é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O ID do Cliente é obrigatório!");
        }
        else
        {   if (dmAdmin.consultar(this)!= null)
            { dmAdmin.excluir(this); }
            else
            {   JOptionPane.showMessageDialog(null,"Exclusão de Cliente não realizada!\n Este Cliente não existe!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Exclusao de Cliente nao realizada!\n Este Cliente nao existe!");
            }
        }    
    }

    // Alterar =================================================================================
    public void alterar()
    {   if (dmAdmin.consultar(this)!= null)
        { dmAdmin.alterar(this); }
        else
        {   JOptionPane.showMessageDialog(null,"Impossivel alterar este Cliente !");
            System.out.println("Impossivel alterar este Cliente !"); }
    }

    // pesquisar =================================================================================
    public Admin pesquisar(Admin objCliente)
    {   dmAdmin.consultar(this);
        return objCliente;
    }

    public void shutDown()
    {   dmAdmin.shutDown();   }    
    
}
