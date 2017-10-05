/*13. Implemente as classes conforme o diagrama UML abaixo, atendendo as seguintes recomendações:
a. A Classe ALUNO, além dos seus atributos, deve conter os métodos de acesso SET e GET para cada um deles.
Além disso, todos os membros desta classe devem ter sua visibilidade definida.
b) A operação inicializar() da Classe ALUNO deve solicitar ao usuário que informe os valores de todos os seus
atributos através do método showInputDialog de JOptionPane.
c) A operação calcularMedia() da Classe ALUNO deve calcular e retornar a média de um determinado aluno em
uma determinada disciplina.
d) A Classe GUIALUNO deve conter o método main() dentro do qual deve-se criar uma instância da Classe
ALUNO, fazer chamada às suas operações inicializar() e calcularMedia(). Ao chamar a operação
calcularMedia(), deve-se exibir o valor da média retornado e informando a situação do aluno (aprovado ou
reprovado), considerando para efeitos de aprovação média >=6. Use o método showMessageDialog de
JOptionPane para exibir na tela os dados solicitados.
*/

package revisao.ex13;

import javax.swing.JOptionPane;

public class GuiAluno {

	public static void main(String[] args) {
		Aluno objA = new Aluno();
		objA.incializar();
		
		if (objA.calcularMedia() >=6)
			JOptionPane.showMessageDialog(null, "O Aluno "+ objA.getNome() + 
										" foi APROVADO na \n" + " Disciplina:  " + objA.getDisciplina()
										+"\n P1 = " + objA.getNotaP1()+"\n P2 = " + objA.getNotaP2());
		else
			JOptionPane.showMessageDialog(null, "O Aluno "+ objA.getNome() + 
										"foi REPROVADO na \n" + " Disciplina:"
												+ " " + objA.getDisciplina()
										+"\n P1 = " + objA.getNotaP1()+"\n P2 = " + objA.getNotaP2());
		

	}

}
