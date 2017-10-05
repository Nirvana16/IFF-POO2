package modelo;

import javax.swing.JOptionPane;
import persistencia.DMCliente;

public class Cliente {
    //Atributos =================================================================================
    private String cpf, nome, telefone, endereco, cep, email;
    
    // Referencia =================================================================================
    private DMCliente dmCliente;

    // GET E SET =================================================================================
     public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    // Metodos -=================================================================================
    public Cliente(String cpf, String nome, String telefone, String endereco, String cep, String email){
        dmCliente = new DMCliente();
        dmCliente.conectaDataBase("confeitaria","root","root");
        System.out.println("1) Classe [Cliente] = Conexao feita a CLIENTES com sucesso!");
        
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
        incluir(this);
    }
    //Consultar:=================================================================================
    public Object consultar(){
        return dmCliente.consultar(this);
    }    
    // INCLUIR =================================================================================
    public void incluir(Cliente objCliente){
        if (objCliente.getCpf().equals("")){
            JOptionPane.showMessageDialog(null,"O CPF é obrigatório","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("2) Classe [Cliente] =  O CPF é obrigatório");
        }else{
            if (dmCliente.consultar(this)!= null){
                JOptionPane.showMessageDialog(null, "Cadastro do Cliente não realizado\n"
                                                    + "Já existe um cliente com este CPF",
                                                    "Messagem de Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println("5) Classe [Cliente] = Cadastro de Cliente  nao realizado! Verifique no banco se existe a tabela correta!\nConferir Nome");
                System.out.println("6) Classe [Cliente] = Cadastro de Cliente  nao realizado! Ja existe um CLIENTE com este CPF!");                
            }else{
                System.out.println("entrei aqui");
            	dmCliente.incluir(this);
            }
        }
    }
    //Excluir =================================================================================
    public void excluir(Cliente objCliente)
    {   if (objCliente.getCpf().equals(""))
        {   JOptionPane.showMessageDialog(null,"O CPF da Cliente é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O CPF do Cliente é obrigatório!");
        }
        else
        {   if (dmCliente.consultar(this)!= null)
            { dmCliente.excluir(this); }
            else
            {   JOptionPane.showMessageDialog(null,"Exclusão de Cliente não realizada!\n Este Cliente não existe!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Exclusao de Cliente nao realizada!\n Este Cliente nao existe!");
            }
        }    
    }

    // Alterar =================================================================================
    public void alterar()
    {   if (dmCliente.consultar(this)!= null)
        { dmCliente.alterar(this); }
        else
        {   JOptionPane.showMessageDialog(null,"Impossivel alterar este Cliente !");
            System.out.println("Impossivel alterar este Cliente !"); }
    }

    // pesquisar =================================================================================
    public Cliente pesquisar(Cliente objCliente)
    {   dmCliente.consultar(this);
        return objCliente;
    }

    public void shutDown()
    {   dmCliente.shutDown();   }
    
    
}
