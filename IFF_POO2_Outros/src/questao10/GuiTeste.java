package questao10;

import javax.swing.JOptionPane;

public class GuiTeste
{
	public static void main(String[] args)
	{
		Quadrado objQ = new Quadrado();
		JOptionPane.showMessageDialog(null,"�rea do Quadrado = "+objQ.calcularArea());
		JOptionPane.showMessageDialog(null,"Per�metro do Quadrado = "+objQ.calcularPerimetro());
		
		Retangulo objR = new Retangulo();
		JOptionPane.showMessageDialog(null,"�rea do Ret�ngulo = "+objR.calcularArea());
		JOptionPane.showMessageDialog(null,"Per�metro do Ret�ngulo = "+objR.calcularPerimetro());
		JOptionPane.showMessageDialog(null,"Diagonal do Ret�ngulo = "+objR.calcularDiagonal());

		Triangulo objT = new Triangulo();
		JOptionPane.showMessageDialog(null,"�rea do Tri�ngulo = "+objT.calcularArea());		
		JOptionPane.showMessageDialog(null,"Per�metro do Tri�ngulo = "+objT.calcularPerimetro());
		
	}

}
