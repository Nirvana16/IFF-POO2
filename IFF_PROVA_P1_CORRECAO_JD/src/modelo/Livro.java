package modelo;

import javax.swing.JOptionPane;

import persistencia.DMLivro;

public class Livro {
	//Atributos ====================================================================
	private String codigo, titulo, autor, editora, status;
	private int ano;
	
	// Referenciando as classes para conexao com BD
	DMLivro dmLivro;
		
		
	// Get e Set
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Construtor ======================================================================
	public Livro(String codigo, String titulo, String autor, String editora, int ano, String status){
		dmLivro = new DMLivro();
		dmLivro.conectaDataBase("aplicacao","root","root");
		
		System.out.println("Conexao feita a tabela Livro com sucesso!");
		this.codigo = codigo; //MUDOU AQUI faltou isso aqui porra
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.status = status;
		incluir(this);
	}
	public Object consultar(){
    	return dmLivro.consultar(this);
    }
    
    // INCLUIR =================================================================================
    public void incluir(Livro objLivro){
    	if (objLivro.getCodigo().equals("")){ 
    		JOptionPane.showMessageDialog(null,"O Codigo  do Livro é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O Codigo  da Livro é obrigatório!");
        }
        else{ 
        	if (dmLivro.consultar(this)!= null){
        		JOptionPane.showMessageDialog(null,"Cadastro de Livro nao realizado!\n "
        											+ "Ja existe uma Livro com este codigo!",
        											"Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Cadastro de Livro nao realizado! Ja existe um Livro com este cdoigo!"); 
            }
            else{ 
            	System.out.println("entrei aqui");
            	dmLivro.incluir(this); 
            }
        }
    }   
    
    //Excluir =================================================================================
    public void excluir(Livro objLivro)
    {   if (objLivro.getCodigo().equals(""))
        {   JOptionPane.showMessageDialog(null,"O Codigo da Livro é obrigatório!","Mensagem de alerta",JOptionPane.WARNING_MESSAGE);
            System.out.println("O Codigo do Livro é obrigatório!");
        }
        else
        {   if (dmLivro.consultar(this)!= null)
            { dmLivro.excluir(this); }
            else
            {   JOptionPane.showMessageDialog(null,"Exclusão de Livro não realizada!\n Este Livro não existe!","Mensagem de Erro",JOptionPane.ERROR_MESSAGE);
                System.out.println("Exclusao de Livro nao realizada!\n Este Livro nao existe!");
            }
        }    
    }

    // Alterar =================================================================================
    public void alterar()
    {   if (dmLivro.consultar(this)!= null)
        { dmLivro.alterar(this); }
        else
        {   JOptionPane.showMessageDialog(null,"Impossivel alterar este Livro !");
            System.out.println("Impossivel alterar este Livro !"); }
    }

    // pesquisar =================================================================================
    public Livro pesquisar(Livro objLivro)
    {   dmLivro.consultar(this);
        return objLivro;
    }

    public void shutDown()
    {   dmLivro.shutDown();   }
}