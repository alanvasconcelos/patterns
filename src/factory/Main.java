package factory;

public class Main {

	public static void main(String[] args)
	{
		FabricaDeCarro fabrica = new FabricaFiat();
		Carro carro = fabrica.criarCarro();
		
		carro.exibirInfo();
	}
}
