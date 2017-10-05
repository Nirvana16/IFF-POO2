package questao11;

public class GuiConta
{
	public static void main(String[] args)
	{	Conta objC1 = new Conta("Giselle");
		objC1.depositar(100);
		objC1.sacar(1000);
		
		Conta objC2 = new Conta("João",5000);
		objC2.depositar(1000);
		objC2.sacar(9000);

	}

}
