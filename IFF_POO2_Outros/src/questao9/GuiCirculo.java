package questao9;

import javax.swing.JOptionPane;

public class GuiCirculo
{
	public static void main(String[] args)
	{
		Circulo objC = new Circulo();
		objC.setRaio(Float.parseFloat(JOptionPane.showInputDialog("Informe o raio: ")));
		JOptionPane.showMessageDialog(null,"Área do círculo = "+objC.calcularArea());
		JOptionPane.showMessageDialog(null,"Perímetro do círculo = "+objC.calcularPerimetro());
		JOptionPane.showMessageDialog(null,"Diâmetro do círculo = "+objC.calcularDiametro());
	}
}
