package exercicio.spaV2S;

import javax.swing.JOptionPane;

public class Prova
{
	public static void main(String[] args)
	{
		String resposta = JOptionPane.showInputDialog("Paciente ou Clínica? ");
		if (resposta.equalsIgnoreCase("paciente"))
		{	@SuppressWarnings("unused")
		TelaPaciente objTP = new TelaPaciente();
			//Paciente objP = new Paciente();
			//objP.imprimirDados();
		}
		else
		{	Clinica objC = new Clinica();
			objC.imprimirDados();
		}
	}
}