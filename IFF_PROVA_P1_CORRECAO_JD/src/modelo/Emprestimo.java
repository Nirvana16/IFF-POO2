package modelo;

import java.text.ParseException;

import javax.swing.JOptionPane;

import apresentacao.TelaLivro;

public class Emprestimo {
	private String dataEmprestimo, dataDevolucao;
	private int prazo; //MUDOU AQUI
	
	private Livro liv;
	
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public Livro getLiv() {
		return liv;
	}

	public void setLiv(Livro liv) {
		this.liv = liv;
	}

	public Emprestimo(){
		dataEmprestimo = JOptionPane.showInputDialog("Informe a data de Emprestimo: ");
		prazo = Integer.parseInt(JOptionPane.showInputDialog("Informe o prazo "));  //MUDOU AQUI
		dataDevolucao = JOptionPane.showInputDialog("Informe a Data de Devolucao");
		this.pegarLivro();
	}
	
	public void pegarLivro(){
		TelaLivro Teli = new TelaLivro();		
	}
	

}
