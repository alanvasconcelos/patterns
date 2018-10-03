package bridge;
public class JanelaLinux implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println("Desenhando janela - linux - " + titulo);
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println("Desenhando botao - linux - " + titulo);
	}

}
