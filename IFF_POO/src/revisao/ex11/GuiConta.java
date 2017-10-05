/*
11. Implemente em Java as classes de acordo com o diagrama UML abaixo. A classe Conta deve conter dois métodos
construtores Conta (String n) e Conta (String n, double v), além das seguintes operações:

a) depositar(): que deve receber um valor a ser acrescentado ao atributo saldo e informar o novo saldo atual.

b) sacar(): que deve verificar se o saque pode ser feito ou não. Se o valor solicitado para saque existir na conta,
deve-se decrementar o atributo saldo e informar o novo saldo atual. Caso contrário, deve-se informar “Saque
não realizado! Saldo insuficiente!”.

c) Obs.: implemente os métodos de acesso e defina a visibilidade de todos os membros desta classe. A classe
GuiConta deve conter um método main() que deve simular a criação de um objeto Conta e o uso dos métodos
depositar e sacar.
______________________					____________________
|________conta________|					|______GuiConta_____|
|_saldo:double________|					|__objConta:COnta___|
|_nome:String_________|_________________|___________________|
|_____________________|					|					|
|_depositar(double,v)_|					|main()				|
|_sacar(double,v)_____|					|					|
|_____________________|					|___________________|
 */



package revisao.ex11;

public class GuiConta {

	public static void main(String[] args) {
		/*
		 * Conta objC1 = new Conta("Asdrubal");
		objC1.depositar(100);
		objC1.sacar(1000);
		
		Conta objC2 = new Conta("Jailson Mendes", 5000);
		objC2.depositar(1000);
		objC2.sacar(9000);
		 */
		
		Conta objC1 = new Conta("Asdrubal");
		objC1.depositar(100);
		objC1.sacar(1000);
		
		Conta objC2 = new Conta("Jailson Mendes", 5000);
		objC2.depositar(1000);
		objC2.sacar(9000);

	}

}
