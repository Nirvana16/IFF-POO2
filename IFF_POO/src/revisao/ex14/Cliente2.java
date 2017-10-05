/*Implemente as classes de acordo com o diagrama UML abaixo, atendendo as seguintes recomendações:
a) A classe Cliente, além dos seus atributos, deve conter os métodos de acesso SET e GET para cada UM
DELES. Além disso, todos os membros desta classe devem ter sua visibilidade definida.
b) O método inicializar() deve solicitar ao usuário os valores de todos os atributos através do método
showInputDialog() de JOptionPane.
c) O método calcularIMC() deve calcular e retornar o Índice de Massa Corporal de um cliente (peso/altura2
). Os
dados devem ser exibidos na tela usando o método showMessageDialog de JOptionPane.
d) A classe GuiCliente deve conter um método main() que deve simular a criação de um objeto Cliente e fazer
chamada às suas operações inicializar() e calcularMedia(). Ao chamar a operação calcularMedia(), deve-se
exibir o valor do IMC retornado e mostrar na tela a categoria em que o cliente se encontra conforme tabela
abaixo. Todos os dados devem ser exibidos na tela usando o método showMessageDialog de JOptionPane
*/



package revisao.ex14;

import javax.swing.JOptionPane;

public class Cliente2 {
	
	//Atributos
	public String nome;
	public float peso, altura;
	
	
	//Metodos de acesso
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	//metodos concretos
	
	public void incializar(){
		nome = JOptionPane.showInputDialog("INFORME SEU NOME");
		peso = Float.parseFloat(JOptionPane.showInputDialog("INFORME SEU PESO"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("INFORME SUA ALTURA"));
	}
	public double calcularIMC(){
		double imc = peso/(Math.pow(altura, 2));
	return imc;
	}
	
	

}
