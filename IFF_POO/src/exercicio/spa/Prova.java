	package exercicio.spa;

import javax.swing.JOptionPane;

public class Prova {

	public static void main(String[] args) {
		
		String resposta = JOptionPane.showInputDialog("Paciente ou Clínica? ");
		if (resposta.equalsIgnoreCase("paciente"))
		{	@SuppressWarnings("unused")
		TelaPaciente objTP = new TelaPaciente();
			//Paciente objP = new Paciente();
			//objP.imprimirDados();
		}
		else
		{	@SuppressWarnings("unused")
		TelaClinica objC = new TelaClinica();
			
			//Clinica objC = new Clinica();
			//objC.imprimirDados();
		}		
		/*
		Paciente objP = new Paciente();
		objP.imprimirDados();
		
		Clinica objC = new Clinica();
		objC.imprimirDados();
		*/
	}

}

