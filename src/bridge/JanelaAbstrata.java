package bridge;
public abstract class JanelaAbstrata {
	
	protected JanelaImplementada janela;
	
	public JanelaAbstrata(JanelaImplementada janela)
	{
		this.janela = janela;
	}
	
	public void desenharJanela(String titulo)
	{
		this.janela.desenharJanela(titulo);
	}
	
	public void desenharBotao(String titulo)
	{
		this.janela.desenharBotao(titulo);
	}
	
	public abstract void desenhar();
}
