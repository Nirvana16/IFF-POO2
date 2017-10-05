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

public class Triangulo {
	//atributos comuns
	private float base, altura;
	private String tipo;	
	
	// metodos de acesso 
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//metodo construtor
	public Triangulo(){
		base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do Triangulo"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do Triangulo"));
		tipo = JOptionPane.showInputDialog("Informe o tipo do Triangulo");
	}
		
	//metodos concretos
	public double calcularArea(){
		return (base*altura)/2;
	}
	public double calcularPerimentro(){
		if (tipo.equalsIgnoreCase("equilatero")){
			return 3*base;
		}
		else
			if (tipo.equalsIgnoreCase("isosceles")){
				double lado = Math.sqrt(Math.pow(base/2, 2)+Math.pow(altura,2));
				return base+(2*lado);
			}
			else{
				float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro lado do triangulo"));
				float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo lado do triangulo"));
				return base+lado1+lado2;
			}
	}
}
