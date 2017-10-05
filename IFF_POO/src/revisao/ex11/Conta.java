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
|_depositar(double v)_|					|main()				|
|_sacar(double v)_____|					|					|
|_____________________|					|___________________|
 */


package revisao.ex11;

import javax.swing.JOptionPane;

public class Conta {
	//atributos comuns de conta
	private double saldo;
	private String nome;
	
	//Metodos de Acessos
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//metodos construtores
	public Conta(String n){
		nome = n;
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta"));
	}
	public Conta(String n, double v){
		nome = n;
		saldo = v;
	}
	//metodos concretos
	public void depositar(double v){
		saldo = saldo+v;
		JOptionPane.showMessageDialog(null, "Novo saldo atual = R$: "+saldo);
	}
	public void sacar(double v){
		if (v>saldo){
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar essa operação saque nao realizado");
		}
		else {
			saldo = saldo-v;
		}
		JOptionPane.showMessageDialog(null, "Saldo atual" + saldo);
	}
}
