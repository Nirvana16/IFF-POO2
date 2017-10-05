/*
 * . Implemente em Java uma superclasse abstrata chamada Polígono contendo os métodos abstratos calcularArea() e
calcularPerimetro(). 

Implemente as subclasses Retângulo, Triângulo e Quadrado.

Implemente os métodos abstratos dentro de cada uma das subclasses. Além dos métodos herdados, a subclasse Retângulo também deve
conter o método calcularDiagonal(). ATENÇÃO: implemente os métodos de acesso SET e GET para cada atributo
de cada classe; defina a visibilidade de cada membro de cada classe; os valores dos atributos de todas as classes
devem ser solicitados ao usuário dentro do método construtor de cada classe, onde o usuário deverá informá-los
através do uso método showInputDialog( ) de JOptionPane. 

Feito isto, crie uma classe GuiTeste com um método main() que, por sua vez, deverá instanciar cada subclasse e 
fazer chamada a cada um dos seus respectivos métodos, mostrando os resultados produzidos por cada um deles 
na tela através do método showMessageDialog( ) de JOptionPane. 
Crie o diagrama UML com a modelagem de cada uma das classes citadas acima.

 */

package revisao.ex10;

import javax.swing.JOptionPane;

public class GuiTeste {

	public static void main(String[] args) {
		Quadrado objQ = new Quadrado();
		JOptionPane.showMessageDialog(null, "Area do Quadrado = " + objQ.calcularArea());
		JOptionPane.showMessageDialog(null, "Perimetro do Quadrado = " + objQ.calcularPerimetro());
		
		Retangulo objR = new Retangulo();
		JOptionPane.showMessageDialog(null, "Area do Retangulo = " + objR.calcularArea());
		JOptionPane.showMessageDialog(null, "Perimetro do Retangulo = " + objR.calcularPerimetro());
		JOptionPane.showMessageDialog(null, "Area do Retangulo = " + objR.calcularDiagonal());
		
		Triangulo objT = new Triangulo();
		JOptionPane.showMessageDialog(null, "Area do Triangulo = " + objT.calcularArea());
		JOptionPane.showMessageDialog(null, "Perimetro do Triangulo = " + objT.calcularPerimentro());
		
	}
}
