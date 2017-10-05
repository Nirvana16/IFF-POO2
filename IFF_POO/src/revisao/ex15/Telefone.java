package revisao.ex15;

import javax.swing.JOptionPane;

public class Telefone {
	
	private String ddi, ddd, numero, tipo, operadora;

	public String getDdi() {
		return ddi;
	}

	public void setDdi(String ddi) {
		this.ddi = ddi;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public Telefone(){
		ddi = JOptionPane.showInputDialog("Informe o ddi");
		ddd = JOptionPane.showInputDialog("Informe o DDD");
		numero = JOptionPane.showInputDialog("Informe o NUmero");
		tipo = JOptionPane.showInputDialog("Informe o tipo");
		operadora = JOptionPane.showInputDialog("Informe a Operadora");
	}
}
