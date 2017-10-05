/*Modele e implemente a classe Círculo com seu(s) respectivo(s) atributo(s), os métodos de acesso e os métodos
calcularArea(), calcularPerimetro() e calcularDiametro(). Defina a visibilidade de todos os membros da classe.

Crie a classe GuiCirculo e dentro do seu método main(), instancie a classe Círculo, solicitando ao usuário que
informe o(s) valor(es) do(s) respectivo(s) atributo(s) através do método showInputDialog() de JOptionPane.

Depois faça chamada a todos os métodos da classe Círculo, mostrando os resultados produzidos por cada um deles na tela
através do método showMessageDialog( ) de JOptionPane. Modele o objeto Círculo criado.

*Area = pi*raio²
*perimetro = 2*pi*raio
*diametro = 2*raio
*
*/

package revisao.ex09.circulo;
import javax.swing.JOptionPane;

public class GuiCirculo {

	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do Raio"));
		Circulo circ = new Circulo(valor);
		
		/*
		 * Se quiser fazer direto
		 * 		Circulo circ = new Circulo(Double.parseDouble
									(JOptionPane.showInputDialog
											(null, "Informe o valor do Raio")));
		 */
		
		JOptionPane.showMessageDialog(null,"Area: "+ circ.calcularArea() 
										+ "\nPerimetro: " +circ.calcularPerimetro() 
										+"\nDiametro: " + circ.calcularDiametro());

	}

}
