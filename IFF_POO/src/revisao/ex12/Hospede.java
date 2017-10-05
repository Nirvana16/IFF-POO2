/*12. Implemente as classes conforme o diagrama UML abaixo, atendendo as seguintes recomendações:
 * 
a) A Classe HOSPEDE, além dos seus atributos, deve conter os métodos de acesso SET e GET para cada um deles.
Além disso, todos os membros desta classe devem ter sua visibilidade definida.

b) A operação inicializar() da Classe HOSPEDE deve solicitar ao usuário que informe os valores de todos os seus
atributos através do método showInputDialog de JOptionPane.

c) A operação calcularDespesa() da Classe HOSPEDE deve calcular e retornar o valor (em reais) da despesa de
um determinado hóspede no hotel. Para isto considere que o hotel cobra R$ 300,00 por diária mais uma taxa
adicional de serviços por dia. Se o número de diárias por pessoa for menor que 5, a taxa de serviços é de R$
30,00. Se o número de diárias por pessoa for igual a 5, a taxa de serviço é de R$ 20,00. E se o número de diárias
por pessoa for maior que 5, a taxa de serviço é de R$ 10,00.

d) A operação imprimirConta() da Classe HOSPEDE deve listar na tela todos os dados do hóspede e fazer
chamada à operação calcularDespesa(), mostrando na tela o valor da despesa do hóspede. Todos os dados do
hóspede devem ser exibidos na tela usando o método showMessageDialog de JOptionPane.
e) A Classe HOTEL deve conter o método main() dentro do qual deve-se criar 
uma instância da Classe ALUNO,
fazendo chamada às suas operações inicializar() e imprimirConta().
*/


package revisao.ex12;

import javax.swing.JOptionPane;

public class Hospede {
	//Atributos comuns
	
	private String cpf;
	private String nome;
	private int numeroDiarias;
	
	
	//metodos de acesso
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroDiarias() {
		return numeroDiarias;
	}
	public void setNumeroDiarias(int numeroDiarias) {
		this.numeroDiarias = numeroDiarias;
	}
	
	//operações ou metodos concretos da classe.
	
	public void incializar(){
		cpf = JOptionPane.showInputDialog("Insira seu CPF: ");
		nome = JOptionPane.showInputDialog("Insira seu nome: ");
		numeroDiarias = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de diarias: "));
	}
	public float calcularDespesa(){
		float taxa;
		if (numeroDiarias < 5)
			taxa = 30;
		else
			if (numeroDiarias == 5)
				taxa = 20;
			else
				taxa = 10;
		return (numeroDiarias*(300+taxa));
	}
	public void imprimirConta(){
		JOptionPane.showMessageDialog(null, "CPF = "+cpf);
		JOptionPane.showMessageDialog(null, "NOME = "+nome);
		JOptionPane.showMessageDialog(null, "Numero de Diarias = "+numeroDiarias);
		JOptionPane.showMessageDialog(null, "DESPESAS  = R$"+calcularDespesa());
	}

	
	
	
	
	
}
