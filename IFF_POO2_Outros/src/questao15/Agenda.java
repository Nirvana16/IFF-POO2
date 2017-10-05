package questao15;

public class Agenda 
{
	public static void main(String[] args)
	{
		PessoaFisica objPF = new PessoaFisica();
		objPF.inicializar();
		objPF.imprimir();
		
		PessoaJuridica objPJ = new PessoaJuridica();
		objPJ.inicializar();
		objPJ.imprimir();
	}
}