package modelo;

import javax.swing.JOptionPane;

import persistencia.DMPedido;

public class Pedido {
	private String codigo, dataEntrega, dataPedido, formaPG, prodCod;
	private float valorTotal, prodPreco, prodQuantidade ;

	private DMPedido dmPedido;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getFormaPG() {
		return formaPG;
	}

	public void setFormaPG(String formaPG) {
		this.formaPG = formaPG;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProdCod() {
		return prodCod;
	}

	public void setProdCod(String prodCod) {
		this.prodCod = prodCod;
	}

	public float getProdPreco() {
		return prodPreco;
	}

	public void setProdPreco(float prodPreco) {
		this.prodPreco = prodPreco;
	}

	public float getProdQuantidade() {
		return prodQuantidade;
	}

	public void setProdQuantidade(float prodQuantidade) {
		this.prodQuantidade = prodQuantidade;
	}
	
	public Pedido(String codigo, String dataEntrega, String dataPedido, String formaPG, float valorTotal, String prodCod, float prodPreco, float prodQuantidade){
		dmPedido = new DMPedido();
        dmPedido.conectaDataBase("confeitaria","root","root");
        System.out.println("1) Classe [Pedido] = Conexao feita a PEDIDOS com sucesso!");
        this.codigo = codigo;
        this.dataEntrega = dataEntrega;
        this.dataPedido = dataPedido;
        this.formaPG = formaPG;
        this.valorTotal = valorTotal;
        this.prodCod = prodCod;
        this.prodPreco = prodPreco;
        this.prodQuantidade = prodQuantidade;
        incluir(this);
    }
	
	public float CalcularValor(float preco, float quantidade){
		float total = preco*quantidade;
		return total;
	}
	
	
		
    //Consultar:
    public Object consultar(){
        return dmPedido.consultar(this);
    }    
    // INCLUIR ----
    public void incluir(Pedido objPedido){
        if (objPedido.getCodigo().equals("")){
            JOptionPane.showMessageDialog(null,"O CODIGO é obrigatório","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("2) Classe [Pedido] =  O CODIGO é obrigatório");
        }else{
            if (dmPedido.consultar(this)!= null){
                JOptionPane.showMessageDialog(null, "Cadastro do Pedido não realizado\n"
                                                    + "Já existe um cliente com este CODIGO",
                                                    "Messagem de Erro", JOptionPane.ERROR_MESSAGE);
                System.out.println("5) Classe [Pedido] = Cadastro de Pedido  nao realizado! Verifique no banco se existe a tabela correta!\nConferir Nome");
                System.out.println("6) Classe [Pedido] = Cadastro de Pedido  nao realizado! Ja existe um PEDIDO com este CODIGO!");                
            }else{
                System.out.println("entrei aqui");
            	dmPedido.incluir(this);
            }
        }
    }
    //Excluir =================================================================================
    public void excluir(Pedido objPedido)
    {   if (objPedido.getCodigo().equals(""))
        {   JOptionPane.showMessageDialog(null,"O CODIGO do Pedido é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O CODIGO do Pedido é obrigatório!");
        }
        else
        {   if (dmPedido.consultar(this)!= null)
            { dmPedido.excluir(this); }
            else
            {   JOptionPane.showMessageDialog(null,"Exclusão de Pedido não realizada!\n Este Pedido não existe!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Exclusao de Pedido nao realizada!\n Este Pedido nao existe!");
            }
        }    
    }

    // Alterar =================================================================================
    public void alterar()
    {   if (dmPedido.consultar(this)!= null)
        { dmPedido.alterar(this); }
        else
        {   JOptionPane.showMessageDialog(null,"Impossivel alterar este Pedido !");
            System.out.println("Impossivel alterar este Pedido !"); }
    }

    // pesquisar =================================================================================
    public Pedido pesquisar(Pedido objPedido)
    {   dmPedido.consultar(this);
        return objPedido;
    }

    public void shutDown()
    {   dmPedido.shutDown();   }
    
    
}
