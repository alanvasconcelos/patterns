package observer;

public abstract class DadosObserver 
{
	protected DadosSubject dadosSubject;
	
	public DadosObserver(DadosSubject dadosSubject)
	{
		this.dadosSubject = dadosSubject;
	}
	
	public abstract void update();
}
