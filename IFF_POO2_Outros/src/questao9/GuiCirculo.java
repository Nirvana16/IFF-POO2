package questao9;

import javax.swing.JOptionPane;

public class GuiCirculo
{
	public static void main(String[] args)
	{
		Circulo objC = new Circulo();
		objC.setRaio(Float.parseFloat(JOptionPane.showInputDialog("Informe o raio: ")));
		JOptionPane.showMessageDialog(null,"�rea do c�rculo = "+objC.calcularArea());
		JOptionPane.showMessageDialog(null,"Per�metro do c�rculo = "+objC.calcularPerimetro());
		JOptionPane.showMessageDialog(null,"Di�metro do c�rculo = "+objC.calcularDiametro());
	}
}
