package revisao.ex09.correto;
import javax.swing.JOptionPane;
public class GuiCirculo {

	
	public static void main(String[] args) {
		circulo objC = new circulo();
		
		objC.setRaio(Float.parseFloat(JOptionPane.showInputDialog("Informe o Raio: ")));
		JOptionPane.showMessageDialog(null, "Area do Circulo = "+ objC.calcularArea() + 
										"\nPerimetro: " + objC.calcularPerimetro() + 
										"\nDiametro: " + objC.calcularDiametro());
		
	}

}
