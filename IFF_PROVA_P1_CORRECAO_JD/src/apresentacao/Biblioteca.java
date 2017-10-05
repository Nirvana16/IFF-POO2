package apresentacao;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Professor;

public class Biblioteca {

	public static void main(String[] args) {
		String resposta = JOptionPane.showInputDialog("Aluno ou Professor? ");
		if (resposta.equalsIgnoreCase("aluno")){
			Aluno objA = new Aluno();
			objA.FazerEmprestimo(); //MUDOU AQUI
			objA.imprimirComprovante();
		}
		else{
			Professor objP = new Professor();
			objP.FazerEmprestimo(); //MUDOU AQUI
			objP.imprimirComprovante();
		}
		
		

	}

}
