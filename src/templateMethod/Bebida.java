package templateMethod;
public abstract class Bebida {

	final void prepareRecipe()
	{
		ferverAgua();
		preparar();
		despejarXicara();
		adicionarCondimentos();
	}
	
	abstract void preparar();
	abstract void adicionarCondimentos();
	
	private void ferverAgua() 
	{
		System.out.println("Fervendo agua");
	}
	
	private void despejarXicara()
	{
		System.out.println("Despejando na xicara");
	}

}
