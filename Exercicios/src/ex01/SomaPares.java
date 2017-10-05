/* Escreva um programa em Java que calcule a
soma dos números pares entre 2 e 200.
• (resultado=10100)
*/


package ex01;

import javax.swing.JOptionPane;

public class SomaPares {
	
	public static void main (String[] args){
		int soma = 0;
		for (int i = 1; i <= 200; i++){
			if (i%2 == 0){
				soma = soma+i;
			}
		}
		JOptionPane.showMessageDialog(null, soma);
	}

}
