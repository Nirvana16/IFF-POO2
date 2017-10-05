package questao14;

import javax.swing.JOptionPane;

public class GuiCliente
{
	public static void main(String args[])
	{
		Cliente objC = new Cliente();
		objC.inicializar();
		double imc = objC.calcularIMC();
		JOptionPane.showMessageDialog(null,"IMC = "+imc);
		if (imc<18.5)
			JOptionPane.showMessageDialog(null,"Abaixo do peso!");
		else
			if (imc>=18.5 && imc<=24.9)
				JOptionPane.showMessageDialog(null,"Peso normal!");
			else
				if (imc>=25 && imc<=29.9)
					JOptionPane.showMessageDialog(null,"Sobrepeso!");
				else
					JOptionPane.showMessageDialog(null,"Obesidade!");	
	}
}