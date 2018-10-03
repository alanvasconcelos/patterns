package bridge;
public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada janela) 
	{
		super(janela);
	}

	@Override
	public void desenhar() 
	{
		this.desenharJanela("Janela de dialogo");
		this.desenharBotao("Sim");
		this.desenharBotao("Nao");
		this.desenharBotao("Cancelar");
	}

}
