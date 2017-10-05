package exemplo2;

public class Professor extends Funcionario{
	private String titulacao;

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}	
	
	public Professor(String titulacao){
		this.titulacao = titulacao;
	}
	
	@Override
	public double salarioBruto(){
		double sal = 0;
		if (titulacao.equalsIgnoreCase("Mestre")){
			sal = getSalario()+(getSalario()*0.10);
		}else if (titulacao.equalsIgnoreCase("Doutorado")){
			sal = getSalario()+(getSalario()*0.20);
		}else{
			sal = getSalario();
		}
		return sal;
	}
	

}
