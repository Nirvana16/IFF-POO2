package modelo;

import javax.swing.JOptionPane;

public class Professor extends Usuario {

	private String titulacao, dataAdmissao;
	
	
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public Professor (){
		super();
		titulacao = JOptionPane.showInputDialog("Informe A Titulacao");
		dataAdmissao = JOptionPane.showInputDialog("Informe a Data de Admissao");
		//super.FazerEmprestimo(); 
		
	}
	@Override
	public void imprimirComprovante() {
		JOptionPane.showMessageDialog(null, "Nome: " +nome +
				  "\n Email: " + email +
				  "\n Matricula: " +matricula +
				  "\n -------------------------------"+
				  "\n Titulacao: " +titulacao +
				  "\n Data de Admissao"+dataAdmissao +
				  "\n -------------------------------"+
				  "\n Data Emprestimo " + emp.getDataEmprestimo() +
				  "\n prazo " + emp.getPrazo() +
				  "\n Data Devolucao " + emp.getDataDevolucao() +
				  "\n -------------------------------"+
				  "\n Codigo  " +emp.getLiv().getCodigo() +
				  "\n Titulo " +emp.getLiv().getTitulo()+
				  "\n Autor " +emp.getLiv().getAutor()+
				  "\n Editora " +emp.getLiv().getEditora()+
				  "\n Ano " +emp.getLiv().getAno()+
				  "\n Status " +emp.getLiv().getStatus());
	}
	

}
