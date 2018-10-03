package bridge;
public class JanelaAviso extends JanelaAbstrata {

	public JanelaAviso(JanelaImplementada janela) 
	{
		super(janela);
	}

	@Override
	public void desenhar() 
	{
		this.desenharJanela("Janela de aviso");
		this.desenharBotao("Ok");
	}

	
}
