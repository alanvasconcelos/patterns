package observer;

public class Main 
{
	public static void main(String[] args) 
	{
		DadosSubject subject = new DadosSubject();
		
		TabelaObserver tabela = new TabelaObserver(subject);
		PorcentoObserver porcento = new PorcentoObserver(subject);
		
		subject.attach(tabela);
		subject.attach(porcento);
		
		subject.setState(new Dados(1, 2, 3));
		System.out.println("------------");
		subject.setState(new Dados(5, 5, 5));
	}	
}
