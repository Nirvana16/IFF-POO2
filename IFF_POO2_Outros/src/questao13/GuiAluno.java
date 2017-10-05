package questao13;

import javax.swing.JOptionPane;

public class GuiAluno
{
	public static void main(String[] args)
	{
		Aluno objA = new Aluno();
		objA.inicializar();
		float media = objA.calcularMedia();
		if (media>=6)
			JOptionPane.showMessageDialog(null,"Aluno aprovado com média "+media);
		else
			JOptionPane.showMessageDialog(null,"Aluno reprovado com média "+media);
	}

}
