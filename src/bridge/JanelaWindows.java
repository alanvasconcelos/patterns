package bridge;
public class JanelaWindows implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println("Desenhando janela - windows - " + titulo);
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println("Desenhando botao - windows - " + titulo);
	}
	
}
