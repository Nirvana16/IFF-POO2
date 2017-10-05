package modelo;

import javax.swing.JOptionPane;

public class Aluno extends Usuario{
	private String curso, dataNascimento;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Aluno(){
		super();
		curso = JOptionPane.showInputDialog("Informe o Curso");
		dataNascimento = JOptionPane.showInputDialog("Informe a Data de Nascimento");
//		super.FazerEmprestimo(); //MUDOU AQUI
	}

	@Override
	public void imprimirComprovante() {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + //MUDOU AQUI
				  "\n Email: " + email + //MUDOU AQUI
				  "\n Matricula: " + matricula + //MUDOU AQUI
				  "\n -------------------------------"+
				  "\n Curso: " + curso +
				  "\n Data de Nascimento"+ dataNascimento +
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
