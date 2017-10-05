package questao13;

import javax.swing.JOptionPane;

public class Aluno
{
	//atributos
	private String matricula;
	private String nome;
	private String disciplina;
	private float notaP1;
	private float notaP2;
	
	//métodos de acesso
	public String getMatricula()
	{	return matricula;	}
	
	public void setMatricula(String matricula)
	{	this.matricula = matricula;	}
	
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public String getDisciplina()
	{	return disciplina;	}
	
	public void setDisciplina(String disciplina)
	{	this.disciplina = disciplina;	}
	
	public float getNotaP1()
	{	return notaP1;	}
	
	public void setNotaP1(float notaP1)
	{	this.notaP1 = notaP1;	}
	
	public float getNotaP2()
	{	return notaP2;	}
	
	public void setNotaP2(float notaP2)
	{	this.notaP2 = notaP2;	}
	
	//operações e métodos concretos
	public void inicializar()
	{	matricula = JOptionPane.showInputDialog("Informe a matrícula: ");
		nome = JOptionPane.showInputDialog("Informe o nome: ");
		disciplina = JOptionPane.showInputDialog("Informe a disciplina: ");
		notaP1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota P1: "));
		notaP2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota P2: "));
	}
	
	public float calcularMedia()
	{	return (notaP1+notaP2)/2; }
}
