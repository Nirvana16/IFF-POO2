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

public class Circulo {
	double raio;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	public double calcularArea(){
		return Math.PI*(raio*raio);
	}
	public double calcularPerimetro(){
		return 2*Math.PI*raio;
	}
	public double calcularDiametro(){
		return 2*raio;
	}
	

}
