
package estudoCaso1;

import javax.swing.JOptionPane;

public class Prova
{
	public static void main(String[] args)
	{
		String resposta = JOptionPane.showInputDialog("Paciente ou Clinica? ");
		if (resposta.equalsIgnoreCase("paciente"))
		{	TelaPaciente objTP = new TelaPaciente();	}
		else
		{	TelaClinica objTC = new TelaClinica();		}
	}
}