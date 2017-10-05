 package modelo;

import javax.swing.JOptionPane;

public abstract class Usuario {
	protected String matricula, nome, email;
	
	protected Emprestimo emp;

	// GET SET
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Emprestimo getEmp() {
		return emp;
	}

	public void setEmp(Emprestimo emp) {
		this.emp = emp;
	}
	
	public Usuario(){
		matricula = JOptionPane.showInputDialog("Informe a Matricula");
		nome = JOptionPane.showInputDialog("Informe o nome");
		email = JOptionPane.showInputDialog("Informe o Email");
	}
	
	public void FazerEmprestimo(){
		emp = new Emprestimo();
	}
	
	public abstract void imprimirComprovante();
	
	

}
