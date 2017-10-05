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

public class GuiCliente {

	public static void main(String[] args) {
		Cliente objC = new Cliente();
		objC.incializar();
		double valorIMC = objC.calcularIMC();
		if (valorIMC >= 29.9)
			JOptionPane.showMessageDialog(null,"Obesidade");
		else 
			if (valorIMC > 25.0 && valorIMC < 29.8)
				JOptionPane.showMessageDialog(null,"Sobrepeso");
			else
				if (valorIMC > 18.5 && valorIMC < 24.9)
					JOptionPane.showMessageDialog(null,"Normal");
				else
					if (valorIMC <= 18.5)
						JOptionPane.showMessageDialog(null,"Abaixo do Peso");	
		
	}

}
