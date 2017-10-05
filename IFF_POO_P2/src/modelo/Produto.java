package modelo;

import javax.swing.JOptionPane;
import persistencia.DMProduto;

public class Produto {
    //Atributos =================================================================================
    private String codigo, descricao, tipo, validade;
    private float peso, preco, quantidade;
    
    // Referencia
    private DMProduto dmProduto;
    
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	// Metodos -=================================================================================
    public Produto(String codigo, String descricao, String tipo, String validade, float peso, float preco, float quantidade){
        dmProduto = new DMProduto();
        dmProduto.conectaDataBase("confeitaria","root","root");
        System.out.println("1) Classe [Produto] = Conexao feita a PRODUTOS com sucesso!");
        
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.validade = validade;
        this.peso = peso;
        this.preco = preco;
        this.quantidade = quantidade;
        incluir(this);
    }
      
    //Consultar:
    public Object consultar(){
        return dmProduto.consultar(this);
    }    
    // INCLUIR ----
    public void incluir(Produto objProduto){
        if (objProduto.getCodigo().equals("")){
            JOptionPane.showMessageDialog(null,"O CODIGO é obrigatório","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("2) Classe [Produto] =  O CODIGO é obrigatório");
        }else{
            if (dmProduto.consultar(this)!= null){
                JOptionPane.showMessageDialog(null, "Cadastro do Produto não realizado\n"
                                                    + "Já existe um cliente com este CODIGO",
                                                    "Messagem de Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println("5) Classe [Produto] = Cadastro de Produto  nao realizado! Verifique no banco se existe a tabela correta!\nConferir Nome");
                System.out.println("6) Classe [Produto] = Cadastro de Produto  nao realizado! Ja existe um PRODUTO com este CODIGO!");                
            }else{
                System.out.println("entrei aqui");
            	dmProduto.incluir(this);
            }
        }
    }
    //Excluir =================================================================================
    public void excluir(Produto objProduto)
    {   if (objProduto.getCodigo().equals(""))
        {   JOptionPane.showMessageDialog(null,"O CODIGO da Produto é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O CODIGO do Produto é obrigatório!");
        }
        else
        {   if (dmProduto.consultar(this)!= null)
            { dmProduto.excluir(this); }
            else
            {   JOptionPane.showMessageDialog(null,"Exclusão de Produto não realizada!\n Este Produto não existe!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Exclusao de Produto nao realizada!\n Este Produto nao existe!");
            }
        }    
    }

    // Alterar =================================================================================
    public void alterar()
    {   if (dmProduto.consultar(this)!= null)
        { dmProduto.alterar(this); }
        else
        {   JOptionPane.showMessageDialog(null,"Impossivel alterar este Produto !");
            System.out.println("Impossivel alterar este Produto !"); }
    }

    // pesquisar =================================================================================
    public Produto pesquisar(Produto objProduto)
    {   dmProduto.consultar(this);
        return objProduto;
    }

    public void shutDown()
    {   dmProduto.shutDown();   }   
    
}
