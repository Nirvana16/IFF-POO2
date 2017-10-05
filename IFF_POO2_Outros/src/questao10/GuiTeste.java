package questao10;

import javax.swing.JOptionPane;

public class GuiTeste
{
	public static void main(String[] args)
	{
		Quadrado objQ = new Quadrado();
		JOptionPane.showMessageDialog(null,"Área do Quadrado = "+objQ.calcularArea());
		JOptionPane.showMessageDialog(null,"Perímetro do Quadrado = "+objQ.calcularPerimetro());
		
		Retangulo objR = new Retangulo();
		JOptionPane.showMessageDialog(null,"Área do Retângulo = "+objR.calcularArea());
		JOptionPane.showMessageDialog(null,"Perímetro do Retângulo = "+objR.calcularPerimetro());
		JOptionPane.showMessageDialog(null,"Diagonal do Retângulo = "+objR.calcularDiagonal());

		Triangulo objT = new Triangulo();
		JOptionPane.showMessageDialog(null,"Área do Triângulo = "+objT.calcularArea());		
		JOptionPane.showMessageDialog(null,"Perímetro do Triângulo = "+objT.calcularPerimetro());
		
	}

}
