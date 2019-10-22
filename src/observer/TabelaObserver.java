package observer;

public class TabelaObserver extends DadosObserver 
{	 
    public TabelaObserver(DadosSubject dadosSubject) 
    {
        super(dadosSubject);
    }
 
    @Override
    public void update() 
    {
        System.out.println("Tabela: Valor A: " + dadosSubject.getState().valorA + " Valor B: " + dadosSubject.getState().valorB + " Valor C: " + dadosSubject.getState().valorC);
    }
}