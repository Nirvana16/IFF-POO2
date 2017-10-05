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

public class Aluno {
	
	//Atributos
	private int matricula;
	private String nome,disciplina;
	private float notaP1, notaP2;
	
	
	//metodos de acesso
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public float getNotaP1() {
		return notaP1;
	}
	public void setNotaP1(float notaP1) {
		this.notaP1 = notaP1;
	}
	public float getNotaP2() {
		return notaP2;
	}
	public void setNotaP2(float notaP2) {
		this.notaP2 = notaP2;
	}
	//metodos concretos
	
	public void incializar(){
		matricula = Integer.parseInt(JOptionPane.showInputDialog("insira sua Matricula "));
		nome = JOptionPane.showInputDialog("insira sua Nome ");
		disciplina = JOptionPane.showInputDialog("insira a Disciplina ");
		notaP1 = Float.parseFloat(JOptionPane.showInputDialog("insira a nota da P1 "));
		notaP2 = Float.parseFloat(JOptionPane.showInputDialog("insira a nota da P2 "));
	}
	public float calcularMedia(){
		return ((notaP1+notaP2)/2);
	}
	
	
	
	
	

}
